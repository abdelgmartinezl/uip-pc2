import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String nombre;
        double peso;
        boolean esVIP;
        double tarifa;

        BufferedReader t1 = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Tarifa - TeTrajePaquete");

        System.out.print("Nombre del Cliente: ");
        nombre = t1.readLine();

        System.out.print("Peso del Paquete: ");
        peso = Double.parseDouble(t1.readLine());

        System.out.print("Eres VIP? (S/N)");
        String opcion = t1.readLine();
        if ( opcion.equals("S") || opcion.equals("s") ) {
            esVIP = true;
        } else {
            esVIP = false;
        }

        tarifa = peso * 3.50;
        if (esVIP) {
            tarifa *= 0.85;
        }

        System.out.println("Estimado, " + nombre + 
        " deberia pagar $" + tarifa);

    }
}