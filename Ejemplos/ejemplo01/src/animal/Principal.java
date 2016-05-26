package animal;

public class Principal {

	/* 
	 * Este es el metodo principal. 
	 * Desde aqui arranca nuestro proyecto Java.	
	 */
	public static void main(String[] args) {
		
		// Esto imprime un texto en pantalla
		System.out.println("¡Hola Panama!");
		
		// Creacion del objeto 'lassie', de tipo 'Perro'
		Perro lassie = new Perro();
		
		// Llamando a los metodos comer(), ladrar() y dormir()
		lassie.comer();
		lassie.ladrar();
		lassie.dormir();
	}

}
