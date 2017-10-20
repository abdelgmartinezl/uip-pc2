// https://github.com/ampotty/uip-pc2/Ejemplos/OOP

package no.tengo.naa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (opcion != 9) {
            System.out.println("¡Bienvenido a No Tengo Naa!");
            System.out.println("SISTEMA DE INVENTARIO - MENÚ");
            System.out.println("1. Cotizar producto\n2. Solicitar producto");
            System.out.println("3. Crear nuevo articulo\n4. Clasificar");
            System.out.println("5. Eliminar\n6. Compra-Venta");
            System.out.println("7. Crear pedido\n8. Costo de producto");
            System.out.println("9. Salir");
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
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











