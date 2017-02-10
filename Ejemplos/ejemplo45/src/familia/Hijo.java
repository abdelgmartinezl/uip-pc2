package familia;

public class Hijo extends Padre {
    private String b;

    public void mostrar() {
        System.out.println("Soy el hijo.");
    }

    public void decir() {
        System.out.println("Digo algo.");
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
