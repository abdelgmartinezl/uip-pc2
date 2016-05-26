package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {

	private static Scanner keyboard;

	public static void main(String[] args) throws Exception {
		// Imprimir en pantalla
		System.out.println("Muestra texto en pantalla");
		
		// Uso de Enums
		Categoria cat1 = new Categoria();
		cat1.tipo = Categoria.CategoriaTipo.GRANDE;
		System.out.println("\nEnum: " + cat1.tipo);

		// Tipos de datos primitivos
		byte a = 100; //8-bit
		short c = 10000; //16-bits
		int m = 1500; //32-bits
		long l = 1500L; //64-bits
		
		float f1 = 234.5f; //single-precision 32-bits
		double d1 = 123.4; //double-precision 64-bits
		
		boolean one = true;
		boolean two = false;
		
		char letraA = 'A';
		
		// Literales
		int decimal = 100;
		int octal = 0144;
		int hexa = 0x64;
		String mensaje = "Hola Mundo\nSegunda linea\nNombre\tEdad";
		
		// Declaracion de variables
		int x,y,z;
		int x1 = 10, y1 = 10;
		byte B = 22;
		double pi = 3.1416;
		char a1 = 'a';
		
		// Constantes
		final String DEPARTAMENTO = "Finanzas";
		System.out.println("\nConstante: " + DEPARTAMENTO + "\n");
		
		// Operadores Aritmeticos
		System.out.println("\nSuma: " + (a + m));
		System.out.println("Resta: " + (a - m));
		System.out.println("Multiplicacion: " + (a * m));
		System.out.println("Division: " + (a / m));
		System.out.println("Residuo: " + (a % m));
		System.out.println("Incremento: " + (a++));
		System.out.println("Decremento: " + (a--));
		
		// Operadores Relacionales
		System.out.println("\nIgualdad: " + (a == m));
		System.out.println("Desigualdad: " + (a != m));
		System.out.println("Mayor que: " + (a > m));
		System.out.println("Menor que: " + (a < m));
		System.out.println("Mayor o igual: " + (a >= m));
		System.out.println("Menor o igual: " + (a <= m));
		
		// Operadores Lógicos
		System.out.println("\nAND: " + (true && false));
		System.out.println("OR: " + (true || false));
		System.out.println("NOT: " + (true && !false));
		
		// Operadores de Asignación
		int resp1 = a + m;
		resp1 *= m; //Suma y asigna
		resp1 += m; //Resta y asigna
		resp1 -= m; //Multiplica y asigna
		resp1 /= m; //Divide y asigna
		resp1 %= m; //Residuo y asigna

		// Operador Condicional
		int w1 = 10;
		int o1 = (a == 1) ? 20: 30;
		System.out.println("\nOperador Condicional: " + o1);
		
		// Operadora Validador
		String nombre = "Abdel";
		boolean resultado = nombre instanceof String;
		System.out.println("Resultado de Instanceof: " + resultado);

        // Lectura de teclado (v1)
		keyboard = new Scanner (System.in);
        System.out.print("Ingresa tu nombre: ");
        String nn = keyboard.next();
        System.out.println("\nTu nombre es " + nn);
        
        // Lectura de teclado (v2)
        BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa tu nombre: ");
        String nn2 = keyboard2.readLine();
        System.out.println("\nTu nombre es " + nn2);		
	}

}
