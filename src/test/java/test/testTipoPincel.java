package test;

import clases.Pincel;
import clases.PincelContinuo;
import clases.Punto;
import clases.TipoPincel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class testTipoPincel {
    @Test
    public void test1(){
        assertEquals(6, TipoPincel.getPinceles().size());
        assertEquals("Pincel continuo", TipoPincel.PINCEL_CONTINUO.getPincel().toString());
        assertEquals("Pincel estrella", TipoPincel.PINCEL_ESTRELLA.getPincel().toString());
        assertEquals("Pincel gordo", TipoPincel.PINCEL_GORDO.getPincel().toString());
        assertEquals("Pincel básico", TipoPincel.PINCEL_BASICO.getPincel().toString());
        assertEquals("Pincel Rectangular", TipoPincel.PINCEL_RECTANGULO.getPincel().toString());
        assertEquals("Pincel de grosor variable", TipoPincel.PINCEL_GROSOR_VARIABLE.getPincel().toString());


    }
}
