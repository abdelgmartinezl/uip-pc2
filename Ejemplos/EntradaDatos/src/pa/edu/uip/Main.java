package pa.edu.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String nombre;
        int edad;

        // Impresion en pantalla
        System.out.println("Lectura de Datos");

        // Lectura por teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nombre: ");
        nombre = br.readLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(br.readLine());

        System.out.println(nombre + " tienes " + edad + " años.");
    }
}
