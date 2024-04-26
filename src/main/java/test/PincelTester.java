package test;

import clases.Pincel;
import clases.Punto;
import clases.TipoPincel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PincelTester extends Application {
    public static final TipoPincel TIPO_PINCEL = TipoPincel.PINCEL_CONTINUO;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        Canvas canvas = new Canvas(400,400);
        StackPane stackPane = new StackPane(canvas);
        Scene scene = new Scene(stackPane);
        GraphicsContext g= canvas.getGraphicsContext2D();
        g.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
        Pincel p = TIPO_PINCEL.getPincel();
        LineaDiagonal lineaDiagonal = new LineaDiagonal(p);
        lineaDiagonal.dibujarLinea(g);
    }
}
