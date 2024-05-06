package clases;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PincelEstrella implements Pincel{



    private static final javafx.scene.image.Image ESTRELLA = new javafx.scene.image.Image(ClassLoader.getSystemResourceAsStream("estrella.png"));
    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        g.drawImage(ESTRELLA,p.x(),p.y());

    }

    @Override
    public String toString() {
        return "Pincel estrella";
    }
}
