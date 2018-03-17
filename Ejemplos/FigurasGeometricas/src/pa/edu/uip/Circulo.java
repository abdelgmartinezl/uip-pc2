package pa.edu.uip;

public class Circulo extends Figura {
    private double radio;

    @Override
    public double calcular_area() {
        this.area = 3.14159 * radio * radio;
        return this.area;
    }

    @Override
    public double calcular_perimetro() {
        this.perimetro = 2 * 3.14159 * radio;
        return this.perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
