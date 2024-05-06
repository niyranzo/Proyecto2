package clases;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public interface Lapiz {
    public void setColor(Color c);
    public void dibujarLinea(double x0,double y0,double x1,double y1);
    public void dibujarRectangulo(double x, double y, double ancho, double alto);
    public void dibujarCirculo(double x, double y, double r);
    public void dibujarImagen(Image imagen,double x, double y);
}
