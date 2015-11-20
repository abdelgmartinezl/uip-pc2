public class Persona {
	
	private int id;
	private String nombre;
	private int altura;
	
	public Persona(int id, String nombre, int altura) {
		this.id = id;
		this.nombre = nombre;
		this.altura = altura;
	}
	
	public int getAltura(){
		return this.altura;
	}
	
	@Override
	public String toString()  {
		return "Persona :: ID = " + this.id + " Nombre = " + this.nombre + " Altura = " + this.altura;
	}

}
