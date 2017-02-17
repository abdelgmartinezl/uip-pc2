package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String nombre;
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Ingrese su nombre: ");
            try {
                nombre = br.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Nombre inválido");
            }
        }

        Vehiculo v = new Vehiculo();
        while (true) {
            System.out.println("\n\nPREMIUM TEST DRIVE");
            System.out.println("Bienvenido(a), " + nombre);
            try {
                System.out.println("Vehiculo: " + v.getModelo());
            } catch (NullPointerException e) {
                System.out.println("Vehiculo: Ninguno");
            }
            System.out.println("Menú:");
            System.out.println("1. Elegir vehiculo");
            System.out.println("2. Manejar vehiculo");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Opcion invalida");
            }
            switch (opcion) {
                case 1:
                    while (true) {
                        System.out.println("Lista de Vehiculos");
                        System.out.println("1. Audi Q7");
                        System.out.println("2. BMW X6");
                        System.out.println("3. Volver al menu anterior");
                        System.out.print("Opcion: ");
                        try {
                            opcion = Integer.parseInt(br.readLine());
                            break;
                        } catch (IOException e) {
                            System.out.println("Opcion invalida");
                        }
                        switch (opcion) {
                            case 1:
                                v.setModelo(1);
                                break;
                            case 2:
                                v.setModelo(2);
                                break;
                            default:
                                System.out.println("Vehiculo invalido");
                                break;
                        }
                    }
                    if (opcion == 1)
                        v.setModelo(1);
                    if (opcion == 2)
                        v.setModelo(2);
                    break;
                case 2:
                    v.manejar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

    }
}
