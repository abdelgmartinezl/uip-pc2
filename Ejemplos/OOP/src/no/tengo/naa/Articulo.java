package no.tengo.naa;

public class Articulo {
    private String id;
    private String nombre;
    private double peso;
    private double precioUnitario;
    private int cantidad;

    public Articulo(String id, String nombre, double peso, double precioUnitario, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

}
