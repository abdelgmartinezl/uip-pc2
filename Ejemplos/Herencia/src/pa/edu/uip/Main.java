package pa.edu.uip;

public class Main {

    public static void main(String[] args) {
        Esfera e = new Esfera(5);
        Cubo c = new Cubo(3);

        e.calcularArea();
        e.calcularVolumen();
        System.out.println("Area = " + e.area);
        System.out.println("Volumen = " + e.volumen);

        c.calcularArea();
        c.calcularVolumen();
        System.out.println("Area = " + c.area);
        System.out.println("Volumen = " + c.volumen);

        Vector1 x = new Vector1();
        System.out.println("El producto punto es "+  x.productoPunto());
    }
}
