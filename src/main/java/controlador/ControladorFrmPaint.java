package controlador;

import clases.Pincel;
import clases.Punto;
import clases.Reseteable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

import javafx.scene.image.ImageView;

import java.awt.*;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorFrmPaint implements Initializable{
    @FXML
    private BorderPane Panel;

    @FXML
    private Button btnAbrir;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnNuevo;

    @FXML
    private ComboBox<Pincel> cmbPinceles;

    @FXML
    private Canvas cnvLienzo;

    @FXML
    private ColorPicker cpkColor;

    @FXML
    private ImageView imgPinceles;
    public void inicializarIconos(){
        this.btnAbrir.setGraphic(new ImageView(new Image(ClassLoader.getSystemResourceAsStream("open-file-icon.png"))));
        this.btnGuardar.setGraphic(new ImageView(new Image(ClassLoader.getSystemResourceAsStream("Save-icon.png"))));
        this.btnNuevo.setGraphic(new ImageView(new Image(ClassLoader.getSystemResourceAsStream("Action-file-new-icon.png"))));
        this.imgPinceles.setImage(new Image(ClassLoader.getSystemResourceAsStream("Pencil-icon.png")));
    }
    public void inicializarComboBox(){
        List<Pincel> pinceles= new ArrayList<>();
        this.cmbPinceles.getItems().setAll(pinceles);
        this.cmbPinceles.setOnAction(event -> {
            this.cmbPinceles.getValue();
        });
    }
    public void nuevaImagen(){
        GraphicsContext grafico=this.cnvLienzo.getGraphicsContext2D();
        Paint paint=grafico.getFill();
        grafico.setFill(Color.WHITE);
        grafico.fillRect(0,0,this.cnvLienzo.getWidth(), this.cnvLienzo.getHeight());
        grafico.setFill(paint);
    }


    @FXML
    public void abrirImagen(ActionEvent event) {
        JFileChooser j= new JFileChooser();
        j.showOpenDialog(null);
        File file= j.getSelectedFile();
        try {
            URL url= file.toURL();
            Image image= new Image(url.toString());
            this.cnvLienzo.getGraphicsContext2D().drawImage(image, image.getHeight(), image.getWidth());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void cambiarColor(ActionEvent event) {
        if (this.cpkColor.getValue() != null) {
            this.cnvLienzo.getGraphicsContext2D().setFill(this.cpkColor.getValue());
        }
    }
    @FXML
    public void dibujarPunto(MouseEvent event) {
        this.cmbPinceles.getValue().dibujar(this.cnvLienzo.getGraphicsContext2D(), new Punto(event.getX(), event.getY()));
    }

    @FXML
    public void empezarDibujar(MouseEvent event) {
        if (this.cmbPinceles.getValue() instanceof Reseteable reseteable){
            reseteable.resetear();
        }
        this.dibujarPunto(event);
    }

    @FXML
    public void guardarImagen(ActionEvent event) {
        Bounds b= this.cnvLienzo.localToScreen(this.cnvLienzo.getBoundsInLocal());
        try {
            Robot r= new Robot();
            Rectangle rec= new Rectangle();
            rec.setBounds((int)b.getCenterX(), (int)b.getCenterY(), (int)b.getWidth(), (int)b.getHeight());
            BufferedImage image=r.createScreenCapture(rec);
            JFileChooser j= new JFileChooser();
            j.showOpenDialog(null);
            File file= j.getSelectedFile();
            ImageIO.write(image, "png", file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.inicializarIconos();
        this.inicializarComboBox();
        this.nuevaImagen();
    }
}
