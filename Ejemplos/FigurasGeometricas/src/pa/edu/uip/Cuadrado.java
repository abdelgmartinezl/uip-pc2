package pa.edu.uip;

public class Cuadrado extends Figura {
    private double lado;

    @Override
    public double calcular_area() {
        this.area = lado * lado;
        return this.area;
    }

    @Override
    public double calcular_perimetro() {
        this.perimetro = lado * 4;
        return this.perimetro;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void identificar() {
        System.out.println("Soy un cuadrado...");
    }
}
