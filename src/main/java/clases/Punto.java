package clases;

public record Punto(double x, double y) {

    public Punto{
        if (x>=0){
            System.out.println("Es mayor o igual que cero");
        }else{
            throw new IllegalArgumentException("Debe ser mayor o igual que cero");
        }

        if (y>=0){
            System.out.println("Es mayor o igual que cero");
        }else{
            throw new IllegalArgumentException("Debe ser mayor o igual que cero");
        }
    }
}
