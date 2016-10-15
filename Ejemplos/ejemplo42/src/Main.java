import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    int edad = 0;
        String nombre = "";
        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Nombre: ");
            try {
                nombre = t1.readLine();
            } catch (Exception e) {
                System.out.println("Hubo excepcion...");
            }

            if (nombre.matches(".*\\d+.*")) {
                System.out.println("Tiene un numero en algun lugar");
            }
        } while (nombre.matches(".*\\d+.*"));



        System.out.print("Edad: ");
        try {
            edad = Integer.parseInt(t1.readLine());
        } catch (IOException e) {
            System.out.println("Error en lectura...");
            edad = -2;
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido...");
            edad = -1;
        }

        if (edad < 0 || edad > 150) {
            System.out.println("No sigue instrucciones.");
        } else {
            System.out.println("Tienes " + edad + " años.");
        }

    }
}
