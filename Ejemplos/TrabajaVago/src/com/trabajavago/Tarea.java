package com.trabajavago;

public class Tarea {
    private String nombre;
    private String fecha_tope;
    private String estado;
    private String criticidad;

    public Tarea(String nombre, String fecha_tope, String criticidad) {
        this.nombre = nombre;
        this.fecha_tope = fecha_tope;
        this.estado = "EnProgreso";
        this.criticidad = criticidad;
    }

    public void completar() {
        this.estado = "Completado";
    }
}
