import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Prueba2 {

	public static void main(String[] args) {
		// Programa que lee un archivo de texto binario
		
		// El nombre del archivo que vamos a abrir.
		String nombreArchivo = "/Users/potty/Desktop/temp.txt";
		
		try {
			byte[] buffer = new byte[1000];
			
			FileInputStream inputStream = new FileInputStream(nombreArchivo);
			
			int total = 0;
			int nLectura = 0;
			
			while((nLectura = inputStream.read(buffer)) != -1) { 
				System.out.println(new String(buffer));
				total += nLectura;
			}
			
			// Cerrar el archivo
			inputStream.close();
			System.out.println("Se leyo un total de " + total + " bytes.");
		} catch (FileNotFoundException ex) {
			System.out.println("No se encontro el archivo.");
		} catch (IOException ex) {
			System.out.println("Error leyendo el archivo " + nombreArchivo);
		}
	}

}
