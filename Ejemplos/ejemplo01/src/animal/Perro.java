package animal;

/**
 * @author Abdel G. Martinez L. 
 * @version 1.0
 * Descripcion: Clase sencilla para un perro
 */
public class Perro {
	private String raza;
	private int edad;
	private String color;
	
	/**
	 * @return la raza del perro
	 */
	public String getRaza() {
		return raza;
	}
	
	/**
	 * @param raza: Raza del perro
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	/**
	 * @return la edad del perro
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * @param edad: Edad del perro
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * @return el color del perro
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @param color: Color del perro
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	// Metodo que simula la accion ladrar
	public void ladrar() {
		System.out.println("Estoy ladrando");
	}
	
	// Metodo que simula la accion comer
	public void comer() {
		System.out.println("Estoy comiendo");
	}
	
	// Metodo que simula la accion dormir
	public void dormir() {
		System.out.println("Estoy durmiendo");
	}
}