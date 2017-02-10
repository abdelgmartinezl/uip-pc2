package uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String n;
        BufferedReader azucar = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Petra");
        nombres.add("Sofia");
        System.out.println("La gente en la lista son: " + nombres);
        nombres.remove(0);
        System.out.println("El primer nombre de la lista es " + nombres.get(0));
        nombres.add("Ana");
        nombres.add(1, "Carla");
        System.out.println("La gente en la lista son: " + nombres);

        System.out.print("Nombre de quien quieras sacar: ");
=        if (nombres.contains(n)) {
            nombres.remove(n);
            System.out.println("Se fue la que estaba estorbando" );
        } else {
            System.out.println("No esta la que te estorba");
        }

        nombres.set(0, "Cristina");
        System.out.println("La gente en la lista son: " + nombres);

        System.out.println("La lista tiene " + nombres.size() + " elementos");

//        double n, notas = 0;
//        //int limite;
//        String resp;
//        BufferedReader k1 = new BufferedReader(new InputStreamReader(System.in));
//
//        //System.out.print("Cantidad de notas: ");
//        //limite = Integer.parseInt(k1.readLine());
//
//        int i = 1;
//        while(true) {
//            System.out.print("Nota No." + i + ": ");
//            n = Double.parseDouble(k1.readLine());
//            notas = notas + n;
//            System.out.print("Desea continuar (S/N): ");
//            resp = k1.readLine();
//            if (resp.equals("N") || resp.equals("n"))
//                break;
//            i++;
//        }
//
//        System.out.printf("El promedio es %.2f", notas/i);

//        int i = 1;
//        while (i <= 3) {
//            System.out.print("Nota No." + i + ": ");
//            n = Double.parseDouble(k1.readLine());
//            notas = notas + n;
//            if (i == 3) {
//                System.out.printf("El promedio es %.2f", notas/i);
//            }
//            i++;
//        }

//        for (int i = 1; i <= 3; i++) {
//            System.out.print("Nota No." + i + ": ");
//            n = Double.parseDouble(k1.readLine());
//            notas = notas + n;
//            if (i == 3) {
//                System.out.printf("El promedio es %.2f", notas/i);
//            }
//        }

//        int mes, ano, numero_dias = 0;
//        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.print("Introduzca el numero del mes: ");
//        mes = Integer.parseInt(t1.readLine());
//
//        System.out.print("En que año estamos: ");
//        ano = Integer.parseInt(t1.readLine());
//
//        switch (mes) {
//            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
//                numero_dias = 31;
//                break;
//            case 4:case 6:case 9:case 11:
//                numero_dias = 30;
//                break;
//            case 2:
//                if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0))  {
//                    numero_dias = 29;
//                } else {
//                    numero_dias = 28;
//                }
//                break;
//            default:
//                System.out.println("Mes invalido");
//                System.exit(1);
//                break;
//        }
//
//        System.out.println(numero_dias + " dias");
    }
}
