
public class Cuadrado extends Figura{
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}	
	
	public double calcularArea() {
		double area;
		area = this.lado * this.lado;
		return area;
	}
}
