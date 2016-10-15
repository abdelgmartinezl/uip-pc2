import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(3,2,1,4,5,6,6);
        for (Integer entero : lista) {
            System.out.println(entero);
        }

        List<String> lista2 = new ArrayList<>();
        lista2.add("Juan");
        lista2.add("Pedro");
        lista2.add("Maria");
        lista2.add(0, "Josefa");
        for (String nombre : lista2) {
            System.out.println(nombre);
        }

        //List<String> lista3 = Arrays.asList("Zoraida", "Cristian", "Manuela");
        List<String> lista3 = new ArrayList<>();
        lista3.add("Zoraida");
        lista3.add("Cristian");
        lista3.add("Manuela");
        lista3.sort(null);
        System.out.println("LISTA ORDENADA");
        lista3.forEach(System.out::println);
        //lista3.forEach((n1)->System.out.println("Nombre: " + n1));
        System.out.println("QUITANDO A ZORAIDA");
        lista3.remove(2);
        lista3.forEach((n1)->System.out.println("Nombre: " + n1));
        System.out.println("QUITANDO A CRISTIAN");
        lista3.removeIf(n1->n1.toUpperCase().contains("C"));
        lista3.forEach((n1)->System.out.println("Nombre: " + n1));
    }
}
