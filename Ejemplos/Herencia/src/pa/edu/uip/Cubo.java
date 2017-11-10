package pa.edu.uip;

public class Cubo extends Figura {
    public Cubo(int nl) {
        this.numeroLados = nl;
    }

    @Override
    public void calcularArea() {
        this.area = Math.pow(numeroLados, 2);
    }

    @Override
    public void calcularVolumen() {
        this.volumen = Math.pow(numeroLados, 3);
    }
}
