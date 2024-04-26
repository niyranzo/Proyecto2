package test;

import clases.Pincel;
import clases.Punto;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class LineaDiagonal {
    private Pincel pincel;

    public LineaDiagonal(Pincel p){
        this.pincel=p;
    }
    public void dibujarLinea(GraphicsContext g){
        double alto = Toolkit.getDefaultToolkit().getScreenSize().getHeight(); //(y)
        double ancho = Toolkit.getDefaultToolkit().getScreenSize().getWidth(); //(x)
        int x=0;
        int y=0;
        for (int i = 0; i<ancho; i++) {
            x +=20;
            y +=20;
            this.pincel.dibujar(g,new Punto(x,y));
        }
    }
}
