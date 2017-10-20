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
                    String i = "", n = "";
                    double p = 0.0, pu = 0.0;
                    int c = 0;
                    try {
                        System.out.print("ID: ");
                        i = br.readLine();
                    } catch (Exception e) {
                        System.out.println("ID inválido. Intente nuevamente");
                    }
                    try {
                        System.out.print("Nombre: ");
                        n = br.readLine();
                    } catch (Exception e) {
                        System.out.println("Nombre inválido. Intente nuevamente");
                    }
                    try {
                        System.out.print("Peso: ");
                        p = Double.parseDouble(br.readLine());
                    } catch (Exception e) {
                        System.out.println("Peso inválido. Intente nuevamente");
                    }
                    try {
                        System.out.print("Precio Unitario: ");
                        pu = Double.parseDouble(br.readLine());
                    } catch (Exception e) {
                        System.out.println("Precio unitario inválido. Intente nuevamente");
                    }
                    try {
                        System.out.print("Cantidad: ");
                        c = Integer.parseInt(br.readLine());
                    } catch (Exception e) {
                        System.out.println("Cantidad inválida. Intente nuevamente");
                    }
                    Articulo a = new Articulo(i, n, p, pu, c);
                    inventario.add(a);
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











