package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {
    public static void main(String args[]) {
        BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "N/A";
        int edad = 0;
        boolean x = true;

        while (x) {
            try {
                System.out.print("Nombre: ");
                nombre = ent.readLine();
            } catch (IOException e) {
                System.err.println("Error desconocido.");
            }
            if (nombre.length() != 0) {
                x = false;
            } else {
                System.err.println("Nombre no valido.");
            }
        }

        x = true;
        while (x) {
            try {
                System.out.print("\nEdad: ");
                edad = Integer.parseInt(ent.readLine());
                x = false;
            } catch (Exception e) {
                System.err.println("Edad no valida");
            }
            if (edad < 0 || edad > 100) {
                System.err.println("Edad no valida");
                x = true;
            }
        }

        System.out.println("Hasta luego, " + nombre + " de " + edad + " años.");
    }
}
