package pa.edu.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String nombre, mes;
        BufferedReader x1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nombre Completo: ");
        nombre = x1.readLine();
        System.out.print("Mes de Nacimiento: ");
        mes = x1.readLine();

        switch (mes.toLowerCase()) {
            case "enero":
                System.out.println("Naciste en el primer mes del año");
                break;
            case "febrero":
                System.out.println("Naciste en el segundo mes del año");
                break;
            case "marzo":
                System.out.println("Naciste en el tercer mes del año");
                break;
            case "abril":
                System.out.println("Naciste en el cuarto mes del año");
                break;
            default:
                System.out.println("Naciste del cuarto al doceavo mes del año");
                break;
        }
    }
}
