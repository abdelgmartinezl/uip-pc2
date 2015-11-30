import java.io.FileOutputStream;
import java.io.IOException;

public class Prueba4 {
	public static void main(String[] args) { 
		String nombreArchivo = "/Users/potty/Desktop/archivo.txt";
		
		try {
			String bytes = "Hola mundo!";
			byte[] buffer = bytes.getBytes();
			
			FileOutputStream outputStream = new FileOutputStream(nombreArchivo);
			outputStream.write(buffer);
			
			outputStream.close();
			
			System.out.println("Se escribio " + buffer.length + " bytes.");
		} catch (IOException ex) { 
			System.out.println("Error al escribir el archivo.");
		}
	}

}
