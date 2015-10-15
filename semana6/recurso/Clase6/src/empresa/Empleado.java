package empresa;

/**
 * Clase que mantiene información de un empleado.
 * @author Abdel G. Martinez L.
 * @version 1.0
 */

public class Empleado extends Persona {
	private double sueldoBruto;
	
	/**
	 * @return el salario neto
	 */
	public double calcularSalarioNeto() {
		return this.sueldoBruto * 0.77; // 23% de impuestos
	}

	/**
	 * @return el sueldoBruto
	 */
	public double getSueldoBruto() {
		return sueldoBruto;
	}

	/**
	 * @param sueldoBruto el sueldoBruto por asignar
	 */
	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

}
