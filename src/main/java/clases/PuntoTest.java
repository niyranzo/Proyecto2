package clases;

imp
public class PuntoTest {

        @Test (expected = IllegalArgumentException.class)
        public void test1() {
        /* 1. Crea un punto con coordenadas (-3,25) y comprueba que se lanza la
            IllegalArgumentException */
            Punto punto = new Punto(-3, 25);

        }

        @Test (expected = IllegalArgumentException.class)
        public void test2() {
        /* 2. Crea un punto con coordenadas (3,-25) y comprueba que se lanza la
            IllegalArgumentException   */
            Punto punto = new Punto(3,-25);
        }

        @Test (expected = IllegalArgumentException.class)
        public void test3() {
        /* 3. Crea un punto con coordenadas (-3,-25) y comprueba que se lanza la
            IllegalArgumentException  */
            Punto punto = new Punto(-3,-25);
        }

        @Test
        public void test4() {
         /* 4. Crea un punto con coordenadas (3,25) y comprueba que la coordenada
            x es 3 y la coordenada y es 25  */
            Punto punto = new Punto(3,25);
            assertEquals(3, punto.x);
            assertEquals(25, punto.y);

        }




}