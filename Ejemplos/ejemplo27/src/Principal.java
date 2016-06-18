import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Tamaño: " + a1.size());

        a1.add("Elemento 1");
        a1.add("Elemento 2");
        System.out.println("Tamaño: " + a1.size());

        Iterator<String> ite = a1.iterator();
        while(ite.hasNext()) {
            String e1 = ite.next();
            System.out.print(e1 + " ");
        }
        System.out.println();

        System.out.println("Posicion 2: " + a1.get(1));

        System.out.println("Indice: " + a1.indexOf("Elemento 1"));

        if (a1.contains("Elemento 3")) {
            System.out.println("Esta el elemento 3");
        } else {
            System.out.println("No hay dicho elemento");
        }

        a1.add("Elemento 2");
        System.out.println(a1.lastIndexOf("Elemento 2"));
        ite = a1.iterator();
        while(ite.hasNext()) {
            String e2 = ite.next();
            System.out.print(e2 + " ");
        }
        System.out.println();

        System.out.println("Tamaño: " + a1.size());
        a1.remove(a1.lastIndexOf("Elemento 2"));
        System.out.println("Tamaño: " + a1.size());
        ite = a1.iterator();
        while(ite.hasNext()) {
            String e3 = ite.next();
            System.out.print(e3 + " ");
        }
        System.out.println();

        System.out.println("Tamaño: " + a1.size());
        a1.add(0,"Elemento 3");
        a1.add("Elemento 2");
        System.out.println("Tamaño: " + a1.size());
        ite = a1.iterator();
        while(ite.hasNext()) {
            String e4 = ite.next();
            System.out.print(e4 + " ");
        }
        System.out.println();

        System.out.println("Posicion de Elemento 3: " + a1.get(2));
        a1.remove("Elemento 2");
         System.out.println("Tamaño: " + a1.size());
        System.out.println("Posicion de Elemento 3: " + a1.get(2));

        ite = a1.iterator();
        while(ite.hasNext()) {
            String elemento = ite.next();
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
