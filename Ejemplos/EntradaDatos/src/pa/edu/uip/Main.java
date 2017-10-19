package pa.edu.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String nombre;
        int edad;
        double salario;
        String trabaja;

        // Impresion en pantalla
        System.out.println("Lectura de Datos");

        // Lectura por teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nombre: ");
        nombre = br.readLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(br.readLine());

        // INT Integer.parseInt()
        // DOU Double.parseDouble()
        // FLO Float.parseFloat()

        if (edad < 18) {
            System.out.println("Larga de aqui lapecillo!");
        } else if (edad == 18) {
            System.out.println("Ya no eres tan lapecillo!");
        } else {
            System.out.println("Larga a estudiar! O a trabajar (?)");
            System.out.print("Trabajas? (S/N): ");
            trabaja = br.readLine();
            if (trabaja.toUpperCase().equals("S")) {
                System.out.print("Salario: ");
                salario = Double.parseDouble(br.readLine());
                System.out.printf("Te llamas %s y ganas $%.2f", nombre, salario);
            } else {
                System.out.println("Larga a estudiar! O a buscar trabajo!");
            }
        }

    }
}
