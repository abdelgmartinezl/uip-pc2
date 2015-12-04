
public class Carro extends Vehiculo {
	private String modelo;
	
	public Carro (String modelo, int mpg, String VIN) {
		super(mpg, VIN);
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getNumAsientos() {
		return 5;
	}
	
	public int getNumValAsientos() { 
		return 1;
	}

}
