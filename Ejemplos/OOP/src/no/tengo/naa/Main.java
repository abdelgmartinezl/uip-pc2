// https://github.com/ampotty/uip-pc2/Ejemplos/OOP

package no.tengo.naa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Articulo> inventario = new ArrayList<>();

        while (opcion != 4) {
            System.out.println("¡Bienvenido a No Tengo Naa!");
            System.out.println("SISTEMA DE INVENTARIO - MENÚ");
            System.out.println("1. Consultar\n2. Añadir\n3. Borrar\n4. Salir");
            System.out.print("OPCION: ");
            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("DATA BASURA");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    Articulo a = new Articulo();
                    inventario.add();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("¡Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR :: Opción inválida.");
                    break;
            }
        }

        System.out.println("Vamos pa lante!");
    }
}











