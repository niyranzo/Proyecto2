package clases;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public interface Pincel {
    public void dibujar(GraphicsContext g, Punto p);
}
