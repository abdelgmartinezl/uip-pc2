import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int opc;
		
		System.out.println("MENU");
		System.out.println("----");
		System.out.println("1. Calcular area cuadrado");
		System.out.println("2. Calcular area triangulo");
		System.out.println("3. Calcular area circulo");
		
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nIngresa opcion: ");
		opc = Integer.parseInt(k.readLine());
		
		switch (opc) {
		case 1:
			System.out.println("Eligio un cuadrado");
			Cuadrado c = new Cuadrado();
			System.out.print("\nIngresa el lado: ");
			double lado = Double.parseDouble(k.readLine());
			c.setLado(lado);
			System.out.println("El area del cuadrado es " + c.calcularArea());
			break;
		case 2:
			System.out.println("Eligio un triangulo");
			Triangulo t = new Triangulo();
			System.out.print("\nIngresa la base: ");
			double base = Double.parseDouble(k.readLine());
			t.setBase(base);
			System.out.print("\nIngresa la altura: ");
			double altura = Double.parseDouble(k.readLine());
			t.setAltura(altura);
			System.out.println("El area del triangulo es " + t.calcularArea());
			break;
		case 3:
			System.out.println("Eligio un circulo");
			Circulo o = new Circulo();
			System.out.print("\nIngresa el radio: ");
			double radio = Double.parseDouble(k.readLine());
			o.setRadio(radio);
			System.out.println("El area del circulo es " + o.calcularArea());
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}

	}
}














