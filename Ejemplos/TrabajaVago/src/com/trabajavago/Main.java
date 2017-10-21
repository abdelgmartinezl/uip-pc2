package com.trabajavago;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int opcion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("APP: TRABAJAVAGO");
        System.out.println("1. Agregar\n2. Ver\n3. Completar\n4. Salir");
        System.out.print("Opcion: ");
        opcion = Integer.parseInt(br.readLine());
    }
}
