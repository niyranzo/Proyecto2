package clases;

public record Punto(double x, double y) {

    public Punto{
        if (x<=0){
           throw new IllegalArgumentException("Debe ser mayor o igual que cero");
        }

        if (y<=0){
            throw new IllegalArgumentException("Debe ser mayor o igual que cero");
        }
    }
}
