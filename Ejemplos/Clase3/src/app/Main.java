package app;

/*
Este es un comentario de
varias lineas sobre mi
programa que no hace nada
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int edad;
        String nombre;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese su nombre: ");
        nombre = teclado.readLine();

        System.out.print("Ingrese la edad: ");
        edad = Integer.parseInt(teclado.readLine());

        if (edad > 18) {
            System.out.println("Eres mayor de edad, " + nombre);
        }  else if (edad == 18) {
            System.out.println("Recien eres mayor de edad, " + nombre);
        } else {
            System.out.println("Eres menor de edad, " + nombre);
        }

        switch (edad) {
            case 1:
                System.out.println("Empiezas a caminar");
                break;
            case 5:
                System.out.println("Estas en Kinder");
                break;
            case 18:
                System.out.println("Todavia vives en mi casa");
                break;
            case 40:
                System.out.println("Ya lárgate de la casa");
                break;
            default:
                System.out.println("Viviendo");
                break;
        }

        System.out.println(nombre + " tiene " + edad + " años.");


//        // Ejemplo de variable de tipo cadena
//        String mensaje = "Bienvenidos al mundo de Java!";
//        System.out.println(mensaje);
//
//        // Ejemplo de variable de tipo entero
//        byte estado;
//        short codigo;
//        int edad = 45;
//        long validador = 100000L;
//        System.out.println(validador);
//
//        // Ejemplo de variable de tipo decimal
//        float precio = 32.50f;
//        double ancho = 1.76356;
//        System.out.printf("El ancho es de %.2fcm con un precio de $%.2f \n", ancho, precio);
//        System.out.println("El ancho es de " + ancho + "cm con un precio de $" + precio);
//
//        // Ejemplo de variable de tipo booleano
//        boolean bandera = true;
//        bandera = false;
//
//        // Ejemplo de una variable de tipo caracter
//        char sexo = 'F';
    }
}
