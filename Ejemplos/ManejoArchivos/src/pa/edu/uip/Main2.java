package pa.edu.uip;

import java.io.*;

public class Main2 {

    public static void main(String[] args) {
        String archivo = "notas.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter fw = new FileWriter(archivo,true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Nota: ");
            String nota = br.readLine();

            bw.write(nota);
            bw.write("\n");

            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error leyendo el archivo...");
        } catch (IOException e) {
            System.out.println("Error con el archivo...");
        }
    }
}
