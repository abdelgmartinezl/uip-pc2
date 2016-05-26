package bmw;

public class Vehiculo {
    private int velocidadMax;
    private String color;

    public void girarIzq() {
        System.out.println("Giras a la izquierda");
    }

    public void girarDer() {
        System.out.println("Giras a la derecha");
    }

    public int getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
