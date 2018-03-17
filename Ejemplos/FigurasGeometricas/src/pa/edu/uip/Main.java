package pa.edu.uip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        double radio, lado;

            while (true) {
                try {
                    System.out.print("\n\nFIGURAS\n1. Circulo\n2. Cuadrado\n3. Salir\nOpcion: ");
                    opcion = Integer.parseInt(br.readLine());
                    switch (opcion) {
                        case 1:
                            System.out.print("Radio: ");
                            radio = Double.parseDouble(br.readLine());
                            Circulo c1 = new Circulo();
                            c1.setRadio(radio);
                            System.out.println("El area es: " + c1.calcular_area());
                            System.out.println("El perimetro es: " + c1.calcular_perimetro());
                            c1.identificar();
                            break;
                        case 2:
                            System.out.print("Lado: ");
                            lado = Double.parseDouble(br.readLine());
                            Cuadrado c2 = new Cuadrado();
                            c2.setLado(lado);
                            System.out.println("El area es: " + c2.calcular_area());
                            System.out.println("El perimetro es: " + c2.calcular_perimetro());
                            c2.identificar();
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            throw new Exception("Loquera");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("\nError: " + e.getMessage());
                }
            }
    }
}
