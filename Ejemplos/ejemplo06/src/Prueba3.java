import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba3 {

	public static void main(String[] args) {
		// Programa para escribir un archivo plano
		
		// El nombre del archivo que vamos a abrir.
		String nombreArchivo = "/Users/potty/Desktop/prueba.txt";
		
		try {
			FileWriter fileWriter = new FileWriter(nombreArchivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("Hola mundo!");
			bufferedWriter.write(" Estamos con un ejemplo.");
			bufferedWriter.newLine();
			bufferedWriter.write("Otra linea de texto.");
			bufferedWriter.close();
		} catch (IOException ex) { 
			System.out.println("Error mientras escribiamos el archivo.");
		}

	}

}
