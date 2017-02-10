package edu.uip;

import edu.pty.Cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        double saldo = 0.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Saldo Inicial: " );
        try {
            saldo = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Dato invalido");
        }

        //edu.pty.Cuenta c1 = new edu.pty.Cuenta();
        Cuenta c1 = new Cuenta(saldo);
        //c1.setBalance(saldo);
        System.out.println("El saldo inicial es de " + c1.getBalance());
        c1.depositar(50);
        System.out.println("Usted depositó. Tiene " + c1.getBalance());
        c1.retirar(75);
        System.out.println("Usted retiró. Tiene " + c1.getBalance());
        c1.depositar(150);
        System.out.println("El saldo final es de " + c1.getBalance());
    }
}
