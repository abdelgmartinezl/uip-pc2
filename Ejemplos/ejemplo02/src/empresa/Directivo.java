package empresa;

import java.util.List;

/**
 * Clase que mantiene información del directivo de una empresa.
 * @author Abdel G. Martinez L.
 * @version 1.0
 */

public class Directivo extends Empleado {
	private String categoria;
	private List<String> subordinados; 
	
	/**
	 * @return la categoria del directivo
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria la categoria por asignar al directivo
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return la lista de subordinados que maneja el directivo
	 */
	public List<String> getSubordinados() {
		return subordinados;
	}

	/**
	 * @param subordinados los subordinados por asignar al directivo
	 */
	public void setSubordinados(List<String> subordinados) {
		this.subordinados = subordinados;
	}

}
