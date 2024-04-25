package controlador;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

import javafx.scene.image.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javafx.scene.control.Button;
import java.net.URL;
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
    private ComboBox<?> cmbPinceles;

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

    }
}
