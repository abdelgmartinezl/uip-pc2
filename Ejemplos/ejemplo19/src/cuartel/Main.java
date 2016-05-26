package cuartel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0, idDelito;
        String nombre, cedula, policia;
        ArrayList<Criminal> celda = new ArrayList<>();
        ArrayList<Policia> escuadron = new ArrayList<>();
        Policia p1 = new Policia();
        Policia p2 = new Policia();
        Policia p3 = new Policia();
        p1.setNombre("Juan Perez");
        p2.setNombre("Pedro Cruz");
        p3.setNombre("Jose Jose");
        p1.setRango("Sargento");
        p2.setRango("Cabo");
        p3.setRango("Capitan");
        escuadron.add(p1);
        escuadron.add(p2);
        escuadron.add(p3);

        while (opcion != 3) {
            System.out.println("===========");
            System.out.println("| LA JOYA |");
            System.out.println("===========");
            System.out.println("1. Ingresar Criminal");
            System.out.println("2. Ver Criminales");
            System.out.println("3. Salir");
            System.out.print("\nOpcion: ");
            opcion = Integer.parseInt(s.readLine());
            switch(opcion) {
                case 1:
                    Criminal ctemp = new Criminal();
                    System.out.println("-----------");
                    System.out.println("| OPCION 1: Ingresar Criminal");
                    System.out.println("-----------");
                    System.out.println("\nDatos del Criminal");
                    System.out.print("Nombre: ");
                    nombre = s.readLine();
                    System.out.print("Cedula: ");
                    cedula = s.readLine();
                    System.out.println("Que hizo?");
                    System.out.println("\t1. Robo\n\t2.Violacion\n\t3.Homicidio\n\t4.Desconocido");
                    System.out.print("Delito: ");
                    idDelito = Integer.parseInt(s.readLine());
                    System.out.println("Quien te capturo?");
                    Iterator<Policia> listaPolicia = escuadron.iterator();
                    while (listaPolicia.hasNext()) {
                        Policia elemento = listaPolicia.next();
                        System.out.println("\t" + elemento.getNombre());
                    }
                    System.out.print("Policia: ");
                    policia = s.readLine();
                    while (listaPolicia.hasNext()) {
                        Policia elemento = listaPolicia.next();
                        if (elemento.getNombre().equals(policia)) {
                            ctemp.setPolicia(elemento);
                        }
                    }
                    ctemp.setNombre(nombre);
                    ctemp.setCedula(cedula);
                    ctemp.setDelito(idDelito);
                    celda.add(ctemp);
                    System.out.println("Guardado con exito!");
                    break;
                case 2:
                    System.out.println("-----------");
                    System.out.println("| OPCION 2: Ver Criminales");
                    System.out.println("-----------");
                    System.out.println("\nCriminales de La Joya");
                    for (Criminal elemento : celda) {
                        System.out.println("\t" + elemento.getNombre() + ", detenido por " + elemento.getDelito() + ".");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
}
