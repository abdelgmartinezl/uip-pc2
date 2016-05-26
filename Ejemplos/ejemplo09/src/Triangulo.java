
public class Triangulo extends Figura {
	private double base, altura;

	public double calcularArea() {
		double area;
		area = (this.base * this.altura)/2;
		return area;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
