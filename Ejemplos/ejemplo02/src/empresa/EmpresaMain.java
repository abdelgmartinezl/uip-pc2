package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal donde simularemos el organigrama de una PYME.
 * @author Abdel G. Martinez L.
 * @version 1.0
 */

public class EmpresaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * - Mi empresa se llama ABC
		 * - Cuenta con 6 empleados: 1 director, 5 subordinados.
		 * - Manejamos 3 clientes.
		 */

		System.out.println("PLANILLA");
		
		Empleado juan = new Empleado();
		juan.setNombre("Juan Sanchez");
		juan.setEdad(35);
		juan.setSueldoBruto(850.00);
		
		Empleado jose = new Empleado();
		jose.setNombre("Jose Acevedo");
		jose.setEdad(27);
		jose.setSueldoBruto(1050.00);
		
		Empleado luis = new Empleado();
		luis.setNombre("Luis Perez");
		luis.setEdad(21);
		luis.setSueldoBruto(1200.00);
		
		Directivo ana = new Directivo();
		ana.setNombre("Ana Luzcando");
		ana.setEdad(45);
		ana.setSueldoBruto(4500.00);
		ana.setCategoria("Tecnologia");
		List<String> subordinados = new ArrayList<String>();
		subordinados.add(juan.getNombre());
		subordinados.add(jose.getNombre());
		ana.setSubordinados(subordinados);
		
		Cliente jorge = new Cliente();
		jorge.setNombre("Jorge Guzman");
		jorge.setEdad(56);
		jorge.setTelefonoContacto("239-5067");
		
		Cliente julio = new Cliente();
		julio.setNombre("Julio Vergara");
		julio.setEdad(28);
		julio.setTelefonoContacto("578-3456");
		
		System.out.println("\nEmpleado \t Salario Neto");
		System.out.println("-------- \t ------------");
		System.out.println(juan.getNombre() + " \t " + juan.calcularSalarioNeto());
		System.out.println(jose.getNombre() + " \t " + jose.calcularSalarioNeto());
		System.out.println(luis.getNombre() + " \t " + luis.calcularSalarioNeto());
		System.out.println(ana.getNombre() + " \t " + ana.calcularSalarioNeto());
		
		System.out.println("\nDirectivos");
		System.out.println("----------");
		ana.mostrar();
		System.out.println("\nEquipo de Trabajo:");
		for (String temp: ana.getSubordinados()) {
			System.out.println("\t" + temp);
		}
		
	}

}
