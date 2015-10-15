package empresa;

/**
 * Clase que mantiene información de la persona.
 * @author Abdel G. Martinez L.
 * @version 1.0
 */
public abstract class Persona {
	private String nombre;
	private int edad;
	
	/**
	 * Imprime la informacion de la persona.
	 */
	public void mostrar(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}

	/**
	 * @return la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad la edad por asignar
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre por asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
