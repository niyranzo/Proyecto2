package clases;

public class PincelCirculoDinamico implements PincelCirculo{
    public int radio;
   PincelCirculoDinamico(int radio){

        if (radio<0){
            throw new IllegalArgumentException("El radio debe ser positivo");
        }
        this.radio=radio;
    }
    public void setRadio(int radio){
        if (radio<0){
            throw new IllegalArgumentException("El radio debe ser positivo");
        }
        this.radio=radio;
    }

    @Override
    public int getRadio() {
        return this.radio;
    }


    @Override
    public void dibujar(Lapiz g, Punto p) {
    }
}
