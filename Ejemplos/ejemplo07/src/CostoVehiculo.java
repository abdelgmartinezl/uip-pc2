
public class CostoVehiculo {
	private double costoDiario;
	private double costoSemanal;
	private double costoFinSemana;
	
	public CostoVehiculo(double costoDiario, double costoSemanal, double costoFinSemana) {
		this.costoDiario = costoDiario;
		this.costoSemanal = costoSemanal;
		this.costoFinSemana = costoFinSemana;
	}
	
	public String getCostoVehiculo() {
		return "Diario: $" + Double.toString(costoDiario) + " Semanal: $" +
				costoSemanal + " Fin de Semana: $" + costoFinSemana;
	}

}
