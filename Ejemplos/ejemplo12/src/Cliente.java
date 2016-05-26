
public class Cliente {
	private String nombre;
	private double compra;
	private String posicion;
	private double salario;
	
	public double calcularDescuento() {
		if (this.compra > 1000) {
			return this.compra * 0.80;
		} else {
			return this.compra;
		}
	}
	
	public void calcularSalario() {
		if (this.posicion == "Gerente") {
			this.salario = 5000;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getCompra() {
		return compra;
	}
	
	public void setCompra(double compra) {
		this.compra = compra;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
