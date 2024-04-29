package clases;

public class PincelBasico implements PincelCirculo{
    public static final int RADIO = 1;

    @Override
    public int getRadio() {
        return RADIO;
    }

    @Override
    public String toString() {
        return "Pincel basico";
    }
}
