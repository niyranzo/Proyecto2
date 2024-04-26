package clases;

public class PincelGordo implements PincelCirculo {
    public static final int RADIO = 20;

    PincelGordo(){}

    @Override
    public String toString() {
        return "Pincel gordo";
    }

    @Override
    public int getRadio() {
        return RADIO;
    }
}
