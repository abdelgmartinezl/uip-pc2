package bmw;

public class Carro extends VehiculoMotor {
    private int cantidadPuertas;

    public void encenderAC() {
        System.out.println("Encendimos el A/C");
    }

    public int getCantidadPuertas() {
        return this.cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

}











