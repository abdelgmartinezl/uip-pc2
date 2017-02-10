package app;

public class Pescado {
    private double peso;
    private String tipo;

    public Pescado() {
        this.peso = Math.random() * 15 + 1;
        int ptipo = (int)(Math.random() * 5 + 1);
        switch (ptipo) {
            case 1:
                this.tipo = "Sierra";
                break;
            case 2:
                this.tipo = "Pargo";
                break;
            case 3:
                this.tipo = "Salmon";
                break;
            case 4:
                this.tipo = "Corvina";
                break;
            case 5:
                this.tipo = "Sardina";
                break;
        }
    }

    public double getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public int capturar() {
        System.out.println("Vamos al mar");
        System.out.println("Tratando de capturar.........");
        double probabilidad_captura = Math.random();
        if (probabilidad_captura > 0.85) {
            System.out.println("Va pa'l cooler");
            return 0;
        } else {
            System.out.println("Se fue!");
            return -1;
        }
    }

    public void cocinar() {
        System.out.println("Cocino el pescado");
    }
}
