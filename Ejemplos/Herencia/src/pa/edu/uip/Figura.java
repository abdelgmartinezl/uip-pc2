package pa.edu.uip;

public abstract class Figura {
    public int numeroLados;
    public double area;
    public double volumen;

    abstract public void calcularArea();
    abstract public void calcularVolumen();
}
