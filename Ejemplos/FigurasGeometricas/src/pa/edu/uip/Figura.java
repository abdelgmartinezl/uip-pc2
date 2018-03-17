package pa.edu.uip;

public abstract class Figura {
    double area;
    double perimetro;

    public abstract double calcular_area();
    public abstract double calcular_perimetro();

    public void identificar() {
        System.out.println("Soy una figura...");
    }
}
