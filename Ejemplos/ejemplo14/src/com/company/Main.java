package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int calificacion;
        char nota;
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "s";

        while (opcion.equals("S") || opcion.equals("s")) {
            System.out.print("Ingrese la calificacion: ");
            calificacion = Integer.parseInt(n.readLine());

            while (calificacion < 0 || calificacion > 100) {
                System.out.println("La nota es invalida.");
                System.out.print("\nIngrese nuevamente la calificacion: ");
                calificacion = Integer.parseInt(n.readLine());
            }

            if (calificacion > 90) {
                nota = 'A';
            } else if (calificacion > 80) {
                nota = 'B';
            } else if (calificacion > 70) {
                nota = 'C';
            } else {
                nota = 'F';
                if (calificacion == 70) {
                    System.out.println("Casi lo logras!");
                } else {
                    System.out.println("Te falto!");
                }
            }

            System.out.println("Tu nota final es " + nota);

            System.out.print("Desea continuar (S/N): ");
            opcion = n.readLine();
        }
    }
}
