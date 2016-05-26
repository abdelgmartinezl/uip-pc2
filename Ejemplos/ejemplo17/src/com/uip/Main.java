package com.uip;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        mapa.put("Elridge", new Double(95.65));
        mapa.put("Rolando", new Double(99.99));

        Set conjunto = mapa.entrySet();
        Iterator i = conjunto.iterator();
        while(i.hasNext()) {
            Map.Entry e = (Map.Entry)i.next();
            System.out.print(e.getKey() + " ganó ");
            System.out.println(e.getValue());
        }


        /*Map mapa = new HashMap();
        mapa.put("Elridge", "95");
        mapa.put("Juan", "30");
        mapa.put("Rolando", "71");
        System.out.println("Los elementos del mapa son: ");
        System.out.println(mapa);*/
    }
}












    /*SortedSet conjunto = new TreeSet();
conjunto.add(5);
        conjunto.add(7);
        conjunto.add(1);
        conjunto.add(7);

        Iterator it = conjunto.iterator();
        while (it.hasNext()) {
        Object elemento = it.next();
        System.out.println(elemento.toString());
        }*/





        /* List a1 = new ArrayList();
        try {
            a1.add("Juan");
            a1.add(1, "Maria");
            a1.add(1, "Mario");
            a1.add("Josefina");
            a1.remove(3);
            System.out.println("El indice de Mario es " + a1.indexOf("Mario"));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Te pasate del rango de la lita");
        } finally {
            System.out.println("Elementos de mi Lista");
            System.out.print("\t" + a1);
        }*/

/*int contador[] = {17, 20, 06, 29, 16};
        Set<Integer> conjunto = new HashSet<Integer>();
        try {
            for (int i = 0; i < 5; i++) {
                conjunto.add(contador[i]);
            }
            System.out.println(conjunto);
        } finally {
        }*/