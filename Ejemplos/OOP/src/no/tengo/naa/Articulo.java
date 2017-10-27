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

    public void consultar() {
    }

    public void anadir() {
    }

    public void borrar() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
