package bnkui;

import bnkcore.Cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
    public static void main (String ... args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        String no = "", nu = "", dest = "";
        double va = 0;
        Cuenta c = null, c_actual = null, posible_destino = null;
        boolean x = true;
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

        while (x) {
            System.out.println("BANCO NO COMPILA");
            System.out.println("> Menu Principal");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Transferir");
            System.out.println("5. Salir");
            System.out.print("\nOpcion: ");
            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Opcion no valida");
            }

            if (opcion == 1) {
                System.out.println("Crear Cuenta");
                System.out.print("Nombre: ");
                try {
                    no = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("Numero: ");
                try {
                    nu = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                c = new Cuenta(no, nu, 0.0);
                c_actual = c;
                cuentas.add(c);
            } else if (opcion == 2) {
                System.out.println("Depositar");
                System.out.print("Valor a depositar: ");
                try {
                    va = Double.parseDouble(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                c_actual.depositar(va);
                System.out.println("Saldo: " + c.getSaldo());
            } else if (opcion == 3) {
                System.out.println("Retirar");
                System.out.print("Valor a retirar: ");
                try {
                    va = Double.parseDouble(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                c_actual.retirar(va);
                System.out.println("Saldo: " + c.getSaldo());
            } else if (opcion == 4) {
                System.out.println("Transferir");
                System.out.print("Cuenta a transferir: ");
                try {
                    dest = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.print("Valor a transferir: ");
                try {
                    va = Double.parseDouble(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Iterator iterator = cuentas.iterator();
                while(iterator.hasNext()) {
                    posible_destino = (Cuenta) iterator.next();
                }
                c_actual.transferir(va, posible_destino);
                System.out.println("Saldo: " + c.getSaldo());
            } else if (opcion == 5) {
                System.out.println("Adios.");
                x = false;
            } else {
                System.out.println("Opcion no valida.");
            }
        }

}
}
