package bmw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) {
        String nombre = "";
        String c = "";
        String p = "";
        int tm = 0;
        int opcion = 0;
        int vm = 0;
        int np = 0;
        Moto m1 = new Moto();
        Bicicleta b1 = new Bicicleta();
        Carro c1 = new Carro();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("BIENVENIDO A BMW");
        System.out.println("----------------");
        System.out.print("Su nombre es... ");
        try {
            nombre = br.readLine();
        } catch (IOException e) {
            System.out.println("¡Hubo un error!");
        }

        System.out.println("¡Hola " + nombre + "! Que quieres hoy?\n1. " +
                "Moto\n2.Bicicleta\n3.Carro");
        System.out.print("Opcion: ");
        try {
            opcion = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Hubo otro error!");
        }

        switch (opcion) {
            case 1:
                System.out.println("Elegistes una moto");
                System.out.println("Vamos a configurarla: ");
                System.out.print("Velocidad Maxima: ");
                try {
                    vm = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Color: ");
                try {
                    c = br.readLine();
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Tamaño Motor: ");
                try {
                    tm = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Placa: ");
                try {
                    p = br.readLine();
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }

                m1.setVelocidadMax(vm);
                m1.setColor(c);
                m1.setTamanoMotor(tm);
                m1.setPlaca(p);
                break;
            case 2:
                System.out.println("Elegistes una bicicleta");
                System.out.println("Vamos a configurarla: ");
                System.out.print("Velocidad Maxima: ");
                try {
                    vm = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Color: ");
                try {
                    c = br.readLine();
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }

                b1.setVelocidadMax(vm);
                b1.setColor(c);
                break;
            case 3:
                System.out.println("Elegistes un carro");
                System.out.println("Vamos a configurarlo: ");
                System.out.print("Velocidad Maxima: ");
                try {
                    vm = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Color: ");
                try {
                    c = br.readLine();
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Tamaño Motor: ");
                try {
                    tm = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Placa: ");
                try {
                    p = br.readLine();
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }
                System.out.print("Numero de Puertas: ");
                try {
                    np = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("Hubo otro error!");
                }

                c1.setVelocidadMax(vm);
                c1.setColor(c);
                c1.setTamanoMotor(tm);
                c1.setPlaca(p);
                c1.setCantidadPuertas(np);
                break;
            default:
                break;
        }

        System.out.println("Tu configuracion elegida fue: ");
        if (opcion == 1) {
            System.out.println("-- Moto --");
            System.out.println("Velocidad Maxima: " + m1.getVelocidadMax());
            System.out.println("Color: " + m1.getColor());
            System.out.println("Tamaño Motor: " + m1.getTamanoMotor());
            System.out.println("Placa: " + m1.getPlaca());
        } else if (opcion == 2) {
            System.out.println("-- Bicicleta --");
            System.out.println("Velocidad Maxima: " + b1.getVelocidadMax());
            System.out.println("Color: " + b1.getColor());
        } else {
            System.out.println("-- Carro --");
            System.out.println("Velocidad Maxima: " + c1.getVelocidadMax());
            System.out.println("Color: " + c1.getColor());
            System.out.println("Tamaño Motor: " + c1.getTamanoMotor());
            System.out.println("Placa: " + c1.getPlaca());
            System.out.println("Cantidad de Puertas: " + c1.getCantidadPuertas());
        }

    }
}
