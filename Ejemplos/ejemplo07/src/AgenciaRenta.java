
public class AgenciaRenta {
	private CostoVehiculo costoVehiculos[] = new CostoVehiculo[2];
	private Vehiculo vehiculos[] = new Vehiculo[10];
	
	public AgenciaRenta() {
		popularCostoVehiculos();
		popularVehiculos();
	}
	
	private void popularCostoVehiculos() {
		costoVehiculos[0] = new CostoVehiculo(24.95, 149.95, 44.95); // Sedan
		costoVehiculos[1] = new CostoVehiculo(29.95, 189.95, 54.95); // SUV
	}
	
	private void popularVehiculos() {
		vehiculos[0] = new Carro("Toyota Prius", 20, "A5T8GG");
		vehiculos[1] = new Carro("Nissan Sentra", 35, "FFJ9K8");
		vehiculos[2] = new Carro("BMW X1", 40, "OP9099");
		vehiculos[3] = new Carro("Suzuki Ciaz", 25, "QW3ER4");
		vehiculos[4] = new Carro("Kia Rio", 36, "ZX99X9");
		vehiculos[5] = new Carro("Audi R8", 50, "TT3TT4");
		vehiculos[6] = new SUV("BMW X6", 10, 8, 3, "A1234A");
		vehiculos[7] = new SUV("Toyota Prado", 15, 7, 2, "MNLKOI");
		vehiculos[8] = new SUV("Honda Pilot", 5, 7, 2, "000001");
		vehiculos[9] = new SUV("Hyundai Tucson", 30, 5, 1, "909090");
	}
	
	public void reservarVehiculo(String VIN) throws VehiculoNoEncontrado {
		int loc;
		loc = buscarVehiculo(VIN);
		if (loc != -1) 
			vehiculos[loc].reservar();
	}
	
	public void anularReserva(String VIN) throws VehiculoNoEncontrado {
		int loc;
		loc = buscarVehiculo(VIN);
		if (loc != -1)
			vehiculos[loc].anular();
	}
	
	public String getCostoVehiculo(int tipo) {
		return costoVehiculos[tipo-1].getCostoVehiculo();
	}
	
	public StringBuffer getVehiculosDisponibles(int tipo) { 
		StringBuffer vehiculoDisponible = new StringBuffer();
		Class c;
		String nombreClase;
		
		for (int i=0; i < 10; i++) {
			if (vehiculos[i] == null)
				break;
			
			c = vehiculos[i].getClass();
			nombreClase = c.getName();
			
			if (busquedaTipoVehiculo(tipo, nombreClase))
				vehiculoDisponible.append(vehiculos[i].getInfoVehiculo() + Character.toString('\n'));
		}
		return vehiculoDisponible;
	}
	
	public boolean busquedaTipoVehiculo(int tipo, String nombreClase) {
		switch(tipo) {
		case 1: return (nombreClase.equals("Carro"));
		case 2: return (nombreClase.equals("SUV"));
		}
		return false;
	}
	
	public int buscarVehiculo(String VIN) throws VehiculoNoEncontrado {
		for (int i = 0; i < 14; i++)
			if (vehiculos[i].getVIN().equals(VIN))
				return i;
		
		throw new VehiculoNoEncontrado();
	}

}
