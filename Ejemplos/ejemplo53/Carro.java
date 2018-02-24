class Carro {
    private String marca;
    private String modelo;
    private int tanque_gasolina;

    public void arrancar() {
        System.out.println("Arranco el carro");
    }

    public double mover(double t, double v) {
        if ( this.tanque_gasolina > 0 ) {
            this.tanque_gasolina -= t*v/10;
            return t*v;
        } else {
            apagar();
            return 0.0;
        }
    }

    public void apagar() {
        System.out.println("Apago el carro");
    }
}