package com.trabajavago;

public class Tarea {
    private String nombre;
    private String fecha_tope;
    private String estado;
    private String criticidad;

    /*public Tarea(String nombre, String fecha_tope, String criticidad) {
        this.nombre = nombre;
        this.fecha_tope = fecha_tope;
        this.estado = "EnProgreso";
        this.criticidad = criticidad;
    }*/

    public void completar() {
        this.estado = "Completado";
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_tope() {
        return fecha_tope;
    }

    public String getEstado() {
        return estado;
    }

    public String getCriticidad() {
        return criticidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_tope(String fecha_tope) {
        this.fecha_tope = fecha_tope;
    }

    public void setCriticidad(String criticidad) {
        this.criticidad = criticidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
