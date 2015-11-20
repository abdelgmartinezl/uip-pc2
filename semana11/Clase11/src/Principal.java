import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Principal {
	public static void main(String args[]) {
		// Definicion de un arreglo
		int[] edad = new int[7];
		
		// Definicion alternativa de un arreglo
		String[] nombre;
		nombre = new String[7];
		
		// Arreglos de tipo char y boolean
		char[] sexo = new char[2];
		boolean[] estado = new boolean[5];
		
		// Inicializacion
		int[] loteria = {1010, 4035, 1720, 0611};
		double[] peso = {56.20, 48.9, 60.77};
		String[] apellido = {"Pedro", "Maria"};
		
		// Ejemplo del uso de arreglos
		try {
			String[] estudiante = new String[4];
			estudiante[0] = "Ana";
			estudiante[1] = "Carlos";
			estudiante[2] = "Jose";
			estudiante[3] = "Petra";
			// estudiante[4] = "Matias"; //Codigo problematico
			System.out.println(estudiante[2]);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Tratastes de ingresar algo invalido...");
		} finally {
			System.out.println("Yo siempre me ejecuto...");
		}		
		
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("Elemento 1");
		listA.add("Elemento 2");
		listA.add("Elemento 3");
		listA.add(0, "Elemento 0");
		
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()) {
			String elemento = (String) iterator.next();
			System.out.println(elemento);
		}
		
		for(Object objeto : listA) {
			String elemento = (String) objeto;
			System.out.println(elemento);
		}
		
		listA.remove("Elemento 0");
		listA.remove(1);
		
		listA.clear();
		
		int tam = listA.size();
		System.out.println(tam);
		
		// Map
		Map mapA = new HashMap();
		mapA.put("Llave 1", "Valor 1");
		mapA.put("Llave 2", "Valor 2");
		mapA.put("Llave 3", "Valor 3");
		
		String e1 = (String) mapA.get("Llave 1");
		System.out.println(e1);
		
		Iterator it_llave = mapA.keySet().iterator();
		// Iterador por valor -> Iterator it_valor = (Iterator) mapA.values();
		while (it_llave.hasNext()) {
			Object llave = it_llave.next();
			Object valor = mapA.get(llave);
			System.out.println(llave + "  " + valor);
		}
		
		for(Object llave : mapA.keySet()) { 
			Object valor = mapA.get(llave);
			System.out.println(llave + "  " + valor);
		}
		
		mapA.remove("Llave 2");
		
	}

}






