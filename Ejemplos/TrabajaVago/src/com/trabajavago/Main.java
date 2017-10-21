package com.trabajavago;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        byte opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("APP: TRABAJAVAGO");
            System.out.println("1. Agregar\n2. Ver\n3. Completar\n4. Salir");
            System.out.print("Opcion: ");
            try {
                opcion = Byte.parseByte(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Dato invalido.");
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            }

            switch (opcion) {
                case 1:
                    //AQUI
                    break;
                case 2:
                    //ACA
                    break;
                case 3:
                    //ACULLA
                    break;
                case 4:
                    //AHI
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
                    break;
            }
        } while(opcion != 4);
    }
}
