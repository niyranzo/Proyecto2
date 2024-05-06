package clases;

import javafx.scene.canvas.GraphicsContext;

import java.util.List;
import java.util.Random;

public class PincelSorpresa implements Pincel{
    PincelSorpresa(){
    }

    @Override
    public String toString() {
        return "Pincel Sorpresa";
    }
    private Pincel getPincelAleatorio(){
        List<Pincel> pinceles= TipoPincel.getPinceles();
        int num=new Random().nextInt(0, pinceles.size());
        Pincel randomP=null;
        boolean b=true;
        do{
            if ((pinceles.get(num) instanceof PincelSorpresa p) || (pinceles.get(num) instanceof PincelContinuo c) || (pinceles.get(num) instanceof PincelPsicodelico l)) {
                num = new Random().nextInt(0, pinceles.size());
            } else {
                randomP = pinceles.get(num);
                b = false;
            }
        }while(b);
        return randomP;
    }
    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        this.getPincelAleatorio().dibujar(g,p);
    }
}
