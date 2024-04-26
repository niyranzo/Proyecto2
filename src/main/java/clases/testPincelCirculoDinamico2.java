package clases;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.security.PublicKey;

public class testPincelCirculoDinamico2 {
    @Test
    public void test1(){
        PincelCirculoDinamico p = new PincelCirculoDinamico(8);
        assertEquals(8, p.getRadio());
    }
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        PincelCirculoDinamico p = new PincelCirculoDinamico(-5);
        fail();
    }
}
