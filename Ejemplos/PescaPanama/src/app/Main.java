package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Pescado> lista_pescado = new ArrayList<Pescado>();

        while(true) {
            int opcion = 0;

            System.out.println("\nPESCA PANAMA");
            System.out.println("1. Capturar un pescado");
            System.out.println("2. Ver la lista de pescados");
            System.out.println("3. Cocinar un pescado");
            System.out.println("4. Salir");

            try {
                System.out.print("OPCION: ");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("ERROR: Opción inválida.");
            }

            switch (opcion) {
                case 1:
                    Pescado p = new Pescado();
                    int estado = p.capturar();
                    if (estado == 0)
                        lista_pescado.add(p);
                    break;
                case 2:
                    if (lista_pescado.size() == 0)
                        System.out.println("No tienes pescados todavia");
                    for (Pescado pp : lista_pescado) {
                        System.out.println(pp.getTipo() + " con peso " + pp.getPeso() + "lb");
                    }
                    break;
                case 3:
                    System.out.println("Vamos a cocinar pescados");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR: Opción inválida");
            }
        }
    }
}
