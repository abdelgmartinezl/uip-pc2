package bnkcore;

public class Cuenta {
    private String nombre;
    private String numero;
    private double saldo;

    public Cuenta(String no, String nu, double sa) {
        this.nombre = no;
        this.numero = nu;
        this.saldo = sa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void retirar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void transferir(double valor, Cuenta destino) {
        destino.setSaldo(destino.getSaldo() + valor);
        this.saldo = this.saldo - valor;
        System.out.println(destino.getSaldo());
    }
}
