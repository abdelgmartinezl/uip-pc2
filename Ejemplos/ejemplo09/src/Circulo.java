
public class Circulo extends Figura {
	private double radio;

	public double calcularArea() {
		double area;
		area = 3.1416 * this.radio * this.radio;
		return area;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
