package clases;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Random;

public class PincelPsicodelico extends PincelSorpresa{
    PincelPsicodelico(){
    }

    @Override
    public String toString() {
        return "Pincel Psicodelico";
    }
    private Color getColorAleatorio(){
        Random random= new Random();
        return new Color(random.nextDouble(),random.nextDouble(),random.nextDouble(),1.0);
    }
    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        g.setFill(this.getColorAleatorio());
        PincelSorpresa sorpresa=new PincelSorpresa();
        sorpresa.dibujar(g,p);
    }
}
