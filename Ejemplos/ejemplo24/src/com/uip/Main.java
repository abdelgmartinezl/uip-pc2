package com.uip;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws Exception {
        double tempC, tempF; // Temperatura en Celsius y Farenheit
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Temperatura en Celsius: "); // Mensaje de ayuda
        tempC = Double.parseDouble(k.readLine()); // Lectura de dato

        //tempC = 25.0; // Asignacion de valor punto-flotante
        tempF = tempC * 9 / 5 + 32; // Expresion de la formula

        System.out.println("Temperatura: " + tempC + " C"); // Salida en Celsius
        System.out.println("Temperatura: " + tempF + " F"); // Salida en Farenheit
    }
}
