package clases;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public class PincelSpray extends PincelCirculoDinamico{
    private Pincel pincel;
    private int densidad;
    PincelSpray(Pincel p, int r, int d) {
        super(r);
        this.pincel=p;
        this.densidad=d;
    }

    @Override
    public String toString(){
        return "Pincel Spray";
    }
    @Override
    public void dibujar(Lapiz g, Punto p) {
        Random random =new Random();
        double r=0;
        double gr=0;
        for(int i=0; i<this.densidad;i++){
            r=random.nextInt(1, this.radio);
            gr=random.nextDouble(0, 360);
            double a= Math.toRadians(gr);
            this.pincel.dibujar(g, new Punto(p.x()+r*Math.cos(a),p.y()+r*Math.sin(a)));
        }
    }
}
