package pa.edu.uip;

public class Esfera extends Figura {
    private float radio;
    public static float PI = (float) 3.1416;

    public Esfera (float r) {
        this.radio = r;
        this.numeroLados = 0;
    }

    @Override
    public void calcularArea() {
        this.area = 4*PI*this.radio*this.radio;
    }

    @Override
    public void calcularVolumen() {
        this.volumen = (4/3)*PI*Math.pow(this.radio,3);
    }
}
