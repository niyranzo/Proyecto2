package clases;

import java.util.ArrayList;
import java.util.List;

public enum TipoPincel{
    PINCEL_BASICO(new PincelBasico()),PINCEL_GORDO(new PincelGordo()),PINCEL_GROSOR_VARIABLE(new PincelGrosorVariable(2,20)),PINCEL_CONTINUO(new PincelContinuo()),PINCEL_RECTANGULO(new PincelRectangulo()),PINCEL_ESTRELLA(new PincelEstrella()),PINCEL_SPRAY(new PincelSpray(new PincelGrosorVariable(2,15),70,15)),PINCEL_CONSTELACION(new PincelSpray(new PincelEstrella(),70,15)),PINCEL_GALLETA(new PincelGalletas(new PincelEstrella(),10,200)),PINCEL_SORPRESA(new PincelSorpresa()),PINCEL_PSICODELICO(new PincelPsicodelico());

    private Pincel pincel;

    private TipoPincel(Pincel p){
        this.pincel = p;
    }

    public Pincel getPincel(){
        return this.pincel;
    }

    public static List<Pincel> getPinceles(){

        List<Pincel> pinceles = new ArrayList<>();
        for (TipoPincel pincel1:TipoPincel.values()){

            pinceles.add(pincel1.getPincel());
        }
        return pinceles;
    }




}
