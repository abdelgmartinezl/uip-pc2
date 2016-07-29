package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    private List<Integer> lista;
    private static final int TAM = 10;

    public ListaNumeros() {
        lista = new ArrayList<Integer>(TAM);
        for (int i = 0; i < TAM; i++) {
            lista.add(new Integer(i));
        }
    }

    public void escribirLista() {
        PrintWriter sal = null;

        try  {
            System.out.println("Entramos a la sentencia try");
            sal = new PrintWriter(new FileWriter("salida.txt"));
            for (int i = 0; i < TAM; i++) {
                sal.println("Valor en: " + i + " = " + lista.get(i));
            }
        }
        catch (IOException e) {
            System.err.println("Encontre IOException: " + e.getMessage());
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Encontre IndexOutOfBoundsException: " + e.getMessage());
        }
        finally {
            if (sal != null) {
                System.out.println("Cerrando PrintWriter.");
                sal.close();
            } else {
                    System.out.println("Fichero cerrado.");
            }
        }
    }
}
