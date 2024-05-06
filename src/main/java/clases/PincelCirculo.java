package clases;

import clases.Punto;
import javafx.scene.canvas.GraphicsContext;

public interface PincelCirculo extends Pincel{
    public int getRadio();
    public default void dibujar(Lapiz g, Punto p){
        g.dibujarCirculo(p.x(), p.y(), this.getRadio());
    }
}
