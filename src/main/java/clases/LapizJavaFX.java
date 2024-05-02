package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class LapizJavaFX implements Lapiz{
    private GraphicsContext graphics;
    public LapizJavaFX(GraphicsContext g){
        this.graphics=g;
    }

    @Override
    public void setColor(Color c) {
        this.graphics.setFill(c);
    }

    @Override
    public void dibujarLinea(double x0, double y0, double x1, double y1) {
        this.graphics.strokeLine(x0,y0,x1,y1);
    }

    @Override
    public void dibujarRectangulo(double x, double y, double ancho, double alto) {
        this.graphics.fillRect(x,y,ancho,alto);
    }

    @Override
    public void dibujarCirculo(double x, double y, double r) {
        this.graphics.fillOval(x,y,r,r);
    }

    @Override
    public void dibujarImagen(Image imagen, double x, double y) {
        this.graphics.drawImage(imagen, x, y);
    }
}
