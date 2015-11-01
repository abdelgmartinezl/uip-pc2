import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws IOException {
		String nombre;
		double compra;
		
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ingrese el nombre: ");
		nombre = k.readLine();
		
		System.out.print("Ingrese la compra: ");
		compra = Double.parseDouble(k.readLine());
		
		Cliente jose = new Cliente();
		jose.setNombre(nombre);
		jose.setCompra(compra);
		
		System.out.println("El valor total de la compra es $" + jose.calcularDescuento());

		System.out.print("Ingrese la compra: ");
		compra = Double.parseDouble(k.readLine());
		
		Cliente juan = new Cliente();
		juan.setCompra(compra);
		
		System.out.println("El valor total de la compra es $" + juan.calcularDescuento());

		
	}

}
