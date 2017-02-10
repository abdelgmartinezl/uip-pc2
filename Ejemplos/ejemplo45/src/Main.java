import familia.Hijo;
import familia.Padre;

public class Main {



    public static void main(String[] args) {
        Padre p1 = new Padre();
        Hijo h1 = new Hijo();
        p1.mostrar();
        p1.setA("Abdel");
        System.out.println("PADRE\n" + p1.getA());
        h1.mostrar();
        h1.decir();
        h1.setA("Abdel");
        h1.setB("Abdelito");
        System.out.println("HIJO\n" + h1.getA() + " " + h1.getB());
    }
}
