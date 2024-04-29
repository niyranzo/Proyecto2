package clases;

import java.util.ArrayList;
import java.util.List;

public enum TipoPincel{
    PINCEL_BASICO(new PincelBasico()),PINCEL_GORDO(new PincelGordo()),PINCEL_GROSOR_VARIABLE(new PincelGrosorVariable(2,20)),PINCEL_CONTINUO(new PincelContinuo()),PINCEL_RECTANGULO(new PincelRectangulo()),PINCEL_ESTRELLA(new PincelEstrella());

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
