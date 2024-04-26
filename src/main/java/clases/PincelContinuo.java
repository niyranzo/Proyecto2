package clases;

import javafx.scene.canvas.GraphicsContext;

public class PincelContinuo extends PincelBasico implements Reseteable{
    private Punto puntoPrevio;

    PincelContinuo(){
        this.puntoPrevio=null;
    }

    @Override
    public void resetear() {
        this.puntoPrevio = null;
    }

    @Override
    public String toString() {
        return "Pincel continuo";
    }

    @Override
    public void dibujar(GraphicsContext g, Punto p) {
        super.dibujar(g, p);
        g.setStroke(g.getFill());

        if (this.puntoPrevio == null){
            super.dibujar(g,p);
        }else {
            g.strokeLine(puntoPrevio.x(),puntoPrevio.y(),p.x(),p.y());
        }
        this.puntoPrevio = p;
    }
}
