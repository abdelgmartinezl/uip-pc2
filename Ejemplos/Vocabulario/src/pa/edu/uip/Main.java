// https://github.com/ampotty/uip-pc2/Ejemplos/OOP

package pa.edu.uip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // MI VOCABULARIO
        HashMap<String, String> vocabulario = new HashMap<>();
        vocabulario.put("hola", "hello");
        vocabulario.put("calculo", "calculus");
        vocabulario.put("fracaso", "failure");
        vocabulario.put("exito", "success");

        while (opcion != 4) {
            System.out.println("\n\nVOCABULARIO ESPAÑOL-INGLÉS");
            System.out.println("1. Ver palabras\n2. Traducir\n3. Agregar\n4. Salir");
            System.out.print("OPCION: ");
            try {
                opcion = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("DATA BASURA");
            } catch (Exception e) {
                System.out.println("ERROR DESCONOCIDO");
            }

            switch (opcion) {
                case 1:
                    for (HashMap.Entry<String, String> palabra : vocabulario.entrySet()) {
                        System.out.print(palabra.getKey() + ", ");
                    }
                    break;
                case 2:
                    String p = "";
                    boolean encontrado = false;
                    while (p.equals("") || p.equals(" ") || p.equals("-")) {
                        System.out.print("Palabra: ");
                        try {
                            p = br.readLine();
                        } catch (Exception e) {
                            System.out.println("Error. Dato inválido.");
                        }
                    }
                    for (HashMap.Entry<String, String> palabra : vocabulario.entrySet()) {
                        if (p.toLowerCase().equals(palabra.getKey())) {
                            encontrado = true;
                            System.out.println("En inglés: " + palabra.getValue());
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("Esa palabra no está en el vocabulario.");
                    }
                    break;
                case 3:
                    String pal = "", tra = "";
                    while (pal.equals("") || pal.equals(" ") || pal.equals("-")) {
                        System.out.print("Palabra: ");
                        try {
                            pal = br.readLine();
                        } catch (Exception e) {
                            System.out.println("Error. Dato inválido.");
                        }
                    }
                    while (tra.equals("") || tra.equals(" ") || tra.equals("-")) {
                        System.out.print("Traducción: ");
                        try {
                            tra = br.readLine();
                        } catch (Exception e) {
                            System.out.println("Error. Dato inválido.");
                        }
                    }
                    vocabulario.put(pal, tra);
                    break;
                case 4:
                    System.out.print("¡Hasta luego!");
                    break;
                default:
                    System.out.println("ERROR :: Opción inválida.");
                    break;
            }
        }

        System.out.println("\nVamos pa lante!");
    }
}











