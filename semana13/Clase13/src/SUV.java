
public class SUV extends Vehiculo {
	private String modelo;
	private int numAsientos;
	private int numValAsientos;
	
	public SUV(String modelo, int mpg, int numAsientos, int numValAsientos, String VIN) {
		super(mpg, VIN);
		this.modelo = modelo;
		this.numAsientos = numAsientos;
		this.numValAsientos = numValAsientos;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public int getNumValAsientos() {
		return numValAsientos;
	}

	public String getModelo() {
		return modelo;
	}
}
