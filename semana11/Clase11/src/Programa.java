import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Programa {

	public static void main(String[] args) {
		
		List<Persona> lp = new ArrayList<Persona>();
		Random r = new Random();
		Persona temp = null;
		int sumaaltura = 0;
		//Persona juan = new Persona(1, "Juan", 170);
		//System.out.println(juan);
		
		for (int i = 0; i < 10; i++) {
			lp.add(new Persona(i, "Per"+i, r.nextInt(100)+100));
		}
		
		Iterator<Persona> it = lp.iterator();
		while(it.hasNext()) {
			temp = it.next();
			System.out.println(temp);
			sumaaltura += temp.getAltura();
		}
		
		System.out.println("La altura promedio de las personas es: " + sumaaltura/lp.size());

	}

}


