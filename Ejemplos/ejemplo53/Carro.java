import java.io.BufferedReader;
import java.io.InputStreamReader;

class Carro {
    private String marca;
    private String modelo;
    private int tanque_gasolina;

    public void arrancar() {
        System.out.println("Arranco el carro");
    }

    public int avanzar() {
        if ( this.tanque_gasolina > 0 ) {
            System.out.println("Avanzo el carro");
            double tiempo, velocidad, distancia;
            BufferedReader x = new BufferedReader(
                new InputStreamReader(System.in));
            tiempo = Double.parseDouble(x.readLine());
            velocidad = Double.parseDouble(x.readLine());
            distancia = tiempo * velocidad;
        }
        return 0;
    }

}