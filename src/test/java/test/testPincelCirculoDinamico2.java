package test;

import org.junit.Test;
import static org.junit.Assert.fail;

public class testPincelCirculoDinamico2 {
    @Test
    public void test1(){
        //PincelCirculoDinamico p = new PincelCirculoDinamico(8);
        //assertEquals(8, p.getRadio());
    }
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        //PincelCirculoDinamico p = new PincelCirculoDinamico(-5);
        fail();
    }
}
