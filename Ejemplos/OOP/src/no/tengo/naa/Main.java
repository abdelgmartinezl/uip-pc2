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
            } catch (IOException e) {
                System.out.println("NO FUNCIONA EL TECLADO");
            } catch (NumberFormatException e) {
                System.out.println("DATA BASURA");
            }
        }

        System.out.println("Vamos pa lante!");
    }
}
