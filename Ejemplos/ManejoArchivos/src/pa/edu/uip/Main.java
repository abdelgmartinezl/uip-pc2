package pa.edu.uip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //String archivo = "nombres.txt";
        String archivo = "notas.txt";
        String linea = null;
        double nota = 0;
        int i = 0;

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                /*if (linea.substring(0,3).equals("Ped")) {
                if (linea.equals("Petra")) {
                    System.out.println(linea);
                }
                */
                nota += Double.parseDouble(linea);
                i++;
            }

            System.out.println("Tu promedio es: " + nota/i);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error leyendo el archivo...");
        } catch (IOException e) {
            System.out.println("Error con el archivo...");
        }
    }
}
