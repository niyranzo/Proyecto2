package controlador;

import clases.Pincel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

import javafx.scene.image.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

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
        this.imgPinceles=new ImageView(new Image(ClassLoader.getSystemResourceAsStream("Pencil-icon.png")))
    }
    public void inicializarComboBox(){
        List<Pincel> pinceles= new ArrayList<>();
        this.cmbPinceles.getItems().setAll(pinceles);
        this.cmbPinceles.setValue(pinceles.get(0));
        this.cmbPinceles.setOnAction(event -> {
            this.cmbPinceles.getValue();
        });
    }
    //te quedaste aca
    public void empezarDibujar(){

    }
    public void nuevaImagen(){
        GraphicsContext grafico=this.cnvLienzo.getGraphicsContext2D();
        Paint paint=grafico.getFill();
        grafico.setFill(Color.WHITE);
        grafico.fillRect(0,0,this.cnvLienzo.getWidth(), this.cnvLienzo.getHeight());
        grafico.setFill(paint);
    }


    @FXML
    void abrirImagen(ActionEvent event) {

    }

    @FXML
    void cambiarColor(ActionEvent event) {

    }

    @FXML
    void dibujarPunto(MouseEvent event) {

    }

    @FXML
    void empezarDibujar(MouseEvent event) {

    }

    @FXML
    void guardarImagen(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.inicializarIconos();
        this.inicializarComboBox();
        this.nuevaImagen();
    }
}
