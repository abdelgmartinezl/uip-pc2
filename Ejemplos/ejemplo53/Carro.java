import java.io.BufferedReader;
import java.io.InputStreamReader;

class Carro {
    private String marca;
    private String modelo;
    private int tanque_gasolina;

    public void arrancar() {
        System.out.println("Arranco el carro");
    }

    public double avanzar(double t, double v) {
        if ( this.tanque_gasolina > 0 ) {
            this.tanque_gasolina -= t*v/10;
            return t*v;
        } else {
            // Se detiene y se apago
            return 0.0;
        }
    }

}