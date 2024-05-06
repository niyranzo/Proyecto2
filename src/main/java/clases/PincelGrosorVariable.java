package clases;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public class PincelGrosorVariable extends PincelCirculoDinamico{
    int radioMinimo;
    int radioMaximo;
    PincelGrosorVariable(int min, int max){
        super(min);
        if (min<0 || max<0){
            throw new IllegalArgumentException("Los dos radios deben ser positivos");
        }
        this.radioMaximo=max;
        this.radioMinimo=min;
    }
    public int getRadioMinimo(){
        return this.radioMinimo;
    }
    public int getRadioMaximo(){
        return this.radioMaximo;
    }
    @Override
    public void setRadio(int radio) {
        if (radio>this.radioMinimo && radio<this.radioMaximo){
            throw new IllegalArgumentException("El radio debe estar comprendido entre "+this.radioMinimo+" y "+this.radioMaximo);
        }
        this.radio=radio;
    }
    @Override
    public void dibujar(Lapiz g, Punto p) {
        super.dibujar(g, p);
        Random random = new Random();
        this.radio=random.nextInt(this.radioMinimo, this.radioMaximo);
    }
    @Override
    public String toString() {
        return "Pincel de grosor variable";
    }
}
