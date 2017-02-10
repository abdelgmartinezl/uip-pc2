package uip;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Definicion e inicializacion de HashMap
        HashMap<Integer, String> contactos = new HashMap<Integer, String>();

        // Agregar elementos al HashMap
        contactos.put(25, "Montenegro");
        contactos.put(17, "Martinez");
        contactos.put(3, "Garcia");

        // Mostrar contenido usando Iterator
        Set var = contactos.entrySet();
        Iterator iterator = var.iterator();
        while(iterator.hasNext()) {
            Map.Entry entrada = (Map.Entry)iterator.next();
            System.out.println("Llave es: " + entrada.getKey() +
                    " y Valor es: " + entrada.getValue());
        }

        contactos.remove(3);

        // Buscar valores basado en su llave
        if (contactos.containsKey(3)) {
            String nombre = contactos.get(3);
            System.out.println("El valor en la llave 3 es " + nombre);
        } else {
            System.out.println("Esa llave no existe.");
        }
    }
}
