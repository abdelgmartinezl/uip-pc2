package edu.pty;

public class Cuenta {
    private double balance;

    public Cuenta(double balance) {
        this.balance = balance;
    }

    public Cuenta() {
        this.balance = 50.0;
    }

    public void depositar(double cantidad) {
        this.setBalance(this.getBalance() + cantidad);
    }

    public void retirar(double cantidad) {
        this.setBalance(this.getBalance() - cantidad);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
