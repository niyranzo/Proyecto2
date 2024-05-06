package clases;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PincelEstrella implements Pincel{



    private static final javafx.scene.image.Image ESTRELLA = new javafx.scene.image.Image(ClassLoader.getSystemResourceAsStream("estrella.png"));
    //Poner la ruta para cargar la imagen desde la carpeta de resources


    @Override
    public String toString() {
        return "Pincel estrella";
    }


    @Override
    public void dibujar(Lapiz g, Punto p) {
        g.dibujarImagen(ESTRELLA, p.x(), p.y());
    }
}
