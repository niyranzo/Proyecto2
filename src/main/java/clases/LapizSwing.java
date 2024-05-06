package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class LapizSwing implements Lapiz{
    private GraphicsContext graphics;
    public LapizSwing(GraphicsContext g){
        this.graphics=g;
    }

    @Override
    public void setColor(Color c) {

    }

    @Override
    public void dibujarLinea(double x0, double y0, double x1, double y1) {

    }

    @Override
    public void dibujarRectangulo(double x, double y, double ancho, double alto) {

    }

    @Override
    public void dibujarCirculo(double x, double y, double r) {

    }

    @Override
    public void dibujarImagen(Image imagen, double x, double y) {

    }
}
