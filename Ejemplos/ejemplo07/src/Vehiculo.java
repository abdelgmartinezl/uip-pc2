
public abstract class Vehiculo {
	private int mpg;
	private String VIN;
	private boolean reserved;
	
	public Vehiculo(int mpg, String VIN) {
		this.mpg = mpg;
		this.VIN = VIN;
	}
	
	public String getModelo() {
		return "";
	}
	
	public abstract int getNumAsientos();
	public abstract int getNumValAsientos();
	
	public String getInfoVehiculo() {
		return getModelo() + " " + getMpg() + "mpg " + getNumAsientos() + " asientos " +
				getNumValAsientos() + " asientos validos" + " # de VIN " + getVIN(); 
	}
	
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void reservar() {
		this.reserved = true;
	}
	public void anular() {
		this.reserved = false;
	}
}
