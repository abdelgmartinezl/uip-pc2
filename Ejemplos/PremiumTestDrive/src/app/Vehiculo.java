package app;

public class Vehiculo {
    private String modelo;
    private int cilindro;
    private double rendimiento;
    private String dimensiones;
    private double precio;
    private double tanque;

    public void setModelo(int m) {
        if (m == 1) {
            this.modelo = "Audi Q7";
            this.cilindro = 6;
            this.rendimiento = 50;
            this.dimensiones = "8.5x11";
            this.precio = 75000.0;
            this.tanque = 100.0;
        } else {
            this.modelo = "BMW X6";
            this.cilindro = 6;
            this.rendimiento = 55;
            this.dimensiones = "8.5x14";
            this.precio = 80000.0;
            this.tanque = 120.0;
        }
    }

    public void conocerEspecificaciones() {
        System.out.println(this.modelo);
        System.out.println("- Cilindros: " + this.cilindro + " cilindros");
        System.out.println("- Rendimiento: " + this.rendimiento + "Km/galon");
        System.out.println("- Dimensiones: " + this.dimensiones);
        System.out.println("- Precio: $" + this.precio);
        System.out.println("- Capacidad de Tanque: " + this.tanque + " galones");
    }

    public void manejar() {
        System.out.println("Manejando un " + this.modelo);
    }

    public String getModelo() {
        return modelo;
    }
}
