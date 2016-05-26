package excepciones;

public class Principal {

	public static void main(String[] args) {
		
		int numerador = 10;
		Integer denominador = null;
		float division = 0;
		
		System.out.println("ANTES DE LA DIVISION\n");
		
		try {
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			division = 0;
			System.out.println("Error: " + ex.getMessage());
		} catch (NullPointerException e) { 
			division = 1;
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Division: " + division);
			System.out.println("DESPUES DE LA DIVISION");
		}
		
	}

}

