import java.util.Scanner;

public class AgenciaRentaUI {
	private AgenciaRenta agencia;
	Scanner teclado = new Scanner(System.in);
	
	public AgenciaRentaUI(AgenciaRenta a) {
		agencia = a;
	}
	
	public void iniciar() {
		int seleccion;
		
		System.out.println("\n\nBievenido a Programacion 2 Car Rental");
		System.out.println("=====================================");
		
		do {
			mostrarMenu();
			seleccion =  teclado.nextInt();
			if (seleccion >= 1 && seleccion <= 6)
				ejecutar(seleccion);
			else
				System.out.println("** Seleccion invalida :: Por favor reingrese **");
		} while (seleccion != 6);
	}
	
	public void mostrarMenu() {
		System.out.println("\nSelecciona una de las siguientes opciones:");
		System.out.println("-----------------------------------------");
		System.out.println("1) Mostrar tipos de vehiculos");
		System.out.println("2) Mostrar costos de renta para un tipo de vehiculo");
		System.out.println("3) Mostrar vehiculos disponibles");
		System.out.println("4) Reservar un vehiculo particular");
		System.out.println("5) Cancelar una reserva");
		System.out.println("6) Salir");
		System.out.print("\nSeleccion: ");
	}
	
	public void ejecutar(int opc) {
		int tipo;
		String VIN;
		
		switch(opc) {
			case 1: 
				mostrarTipoVehiculos();
				break;
			case 2:
				do {
					System.out.print("Introduzca el tipo de vehiculo: ");
					tipo = teclado.nextInt();
				} while(tipo < 1 || tipo > 2);
				
				mostrarCostoVehiculo(tipo);
				break;
			case 3:
				do {
					System.out.print("Introduzca el tipo de vehiculo: ");
					tipo = teclado.nextInt();
				} while(tipo < 1 || tipo > 2);
				
				mostrarVehiculoDisponible(tipo);
				break;
			case 4:
				System.out.print("Introduzca el VIN: ");
				VIN = teclado.next();
				try {
					agencia.reservarVehiculo(VIN);
				} catch (VehiculoNoEncontrado e) {
					System.out.println("VIN no encontrado");
					break;
				}
				System.out.println("** Modo Reserva **");
				break;
			case 5:
				System.out.print("Introduzca el VIN: ");
				VIN = teclado.next();
				try {
					agencia.anularReserva(VIN);
				} catch (VehiculoNoEncontrado e) {
					System.out.println("VIN no encontrado");
					break;
				}
				System.out.println("** Reserva Cancelada Exitosamente **");
				break;
		}
	}
	
	private void mostrarTipoVehiculos() {
		System.out.println("\nTipos de Vehiculos");
		System.out.println("------------------");
		System.out.println("1. Carro");
		System.out.println("2. SUV");
	}
	
	private void mostrarCostoVehiculo(int tipo) {
		System.out.println();
		System.out.println("El costo de vehiculo para " + vehiculoTipoNombre(tipo));
		System.out.println("---------------------------------------------------");
		System.out.println(agencia.getCostoVehiculo(tipo));
		System.out.println();
	}
	
	private void mostrarVehiculoDisponible(int tipo) {
		StringBuffer vehiculos;
		System.out.println("\n" + vehiculoTipoNombre(tipo) + " Disponible");
		vehiculos = agencia.getVehiculosDisponibles(tipo);
		System.out.println(vehiculos);
	}
	
	private String vehiculoTipoNombre(int tipo) {
		switch(tipo) {
		case 1: return "Carro";
		case 2: return "SUV";
		}
		return " ";
	}


}
