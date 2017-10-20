package no.tengo.naa;

public class Articulo {
    private String id;
    private String nombre;
    private float dimensiones;
    private float precioUnitario;
    private int cantidad;

    public Articulo(String id, String nombre, float dimensiones, float precioUnitario, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.dimensiones = dimensiones;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public void consultar() {
    }

    public void anadir() {
    }

    public void borrar() {
    }
}
