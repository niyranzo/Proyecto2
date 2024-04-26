package clases.test;

import clases.Punto;
import org.junit.Test;

import static org.junit.Assert.*;

public class PuntoTest {

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test1(){
        Punto punto = new Punto(-3,25);
        assertEquals(-3,punto.x());
        fail();
    }

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        Punto punto = new Punto(-3,25);
        assertEquals(25,punto.y());
        fail();
    }

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test3(){
        Punto punto = new Punto(3,-25);
        assertEquals(3,punto.x());
        fail();
    }

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test4(){
        Punto punto = new Punto(3,-25);
        assertEquals(-25,punto.x());
        fail();
    }

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test5(){
        Punto punto = new Punto(-3,-25);
        assertEquals(-3,punto.x());
        fail();
    }

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test6(){
        Punto punto = new Punto(-3,-25);
        assertEquals(-25,punto.x());
        fail();
    }

    @Test
    public void test7(){
        Punto punto = new Punto(3,25);
        assertEquals(3,punto.x(),1);
        assertEquals(25,punto.y(),1);
    }


}