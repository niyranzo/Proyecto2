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
    public void dibujar(Lapiz g, Punto p) {
        super.dibujar(g, p);
        g.dibujarLinea(p.x(), p.y(), p.x(), p.y());
        //Comprobar que funcione

        if (this.puntoPrevio == null){
            super.dibujar(g,p);
        }else {
            g.dibujarLinea(puntoPrevio.x(),puntoPrevio.y(),p.x(),p.y());
        }
        this.puntoPrevio = p;
    }
}
