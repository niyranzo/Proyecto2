package clases;

public record Punto() {
    public void Punto(double x, double y){

        if (x<0 && y<0){
            throw new IllegalArgumentException();
        }
    }
}
