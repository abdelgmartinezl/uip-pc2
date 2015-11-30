import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba {

	public static void main(String[] args) {
		// Programa que lee un archivo de texto plano
		
		// El nombre del archivo que vamos a abrir.
		String nombreArchivo = "/Users/potty/Desktop/temp.txt";
		
		// Va a ser referencia de una linea en un momento determinado.
		String linea = null;
		
		try {
			
			// FileReader lee un archivo de texto en el encoding por defecto.
			FileReader fileReader = new FileReader(nombreArchivo);
			
			// Siempre se debe enlazar FileReader en BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
			}
			
			// Importante: cerrar el archivo
			bufferedReader.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println("No se encontro el archivo.");
		} catch (IOException ex) {
			System.out.println("Error leyendo el archivo " + nombreArchivo);
		}
	}

}
