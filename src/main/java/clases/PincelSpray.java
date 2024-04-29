package clases;

import javafx.scene.canvas.GraphicsContext;

public class PincelSpray extends PincelCirculoDinamico{
    private Pincel pincel;
    private int densidad;
    PincelSpray(Pincel p, int r, int d) {
        super(r);
        this.pincel=p;
        this.densidad=d;
    }

    @Override
    public String toString() {
        return "Pincel Spray";
    }
    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        //sinhacer
        g.fillRect(p.x(),p.y(),10,10);
    }

}
