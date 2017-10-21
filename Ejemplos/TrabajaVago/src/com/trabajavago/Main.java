// https://github.com/ampotty/uip-pc2/Ejemplos/TrabajaVago

package com.trabajavago;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        byte opcion = 0;
        ArrayList<Tarea> lista_tareas = new ArrayList<>();
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
                    String nombre, fecha_tope, criticidad;
                    System.out.print("Nombre: ");
                    nombre = br.readLine();
                    System.out.print("Fecha Tope: ");
                    fecha_tope = br.readLine();
                    do {
                        System.out.print("Criticidad (Alta/Media/Baja): ");
                        criticidad = br.readLine();
                        if (criticidad.toLowerCase().equals("alta") || criticidad.toLowerCase().equals("media")
                                || criticidad.toLowerCase().equals("baja"))
                            break;
                        else
                            System.out.println("¡Criticidad invalida!");
                    } while(true);

                    Tarea t = new Tarea(nombre, fecha_tope, criticidad);
                    lista_tareas.add(t);
                    System.out.println("La lista tiene " + lista_tareas.size());// NO VA
                    break;
                case 2:
                    //ACA
                    break;
                case 3:
                    //ACULLA
                    break;
                case 4:
                    System.out.println("Hasta el viernes!");
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
                    break;
            }
        } while(opcion != 4);
    }
}
