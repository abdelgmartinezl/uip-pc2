package pa.edu.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int edad;
        BufferedReader xx = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Edad: ");
            edad = Integer.parseInt(xx.readLine());
            if (edad > 0 && edad <= 100) {
                break;
            }
        }

        System.out.println(edad);
    }
}
