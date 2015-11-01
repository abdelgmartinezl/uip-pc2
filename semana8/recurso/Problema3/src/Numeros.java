import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a;
		String b = null;
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ingresar su numero: ");
		a = Integer.parseInt(k.readLine());
		
		switch(a){
		case 1:
			b = "I";
			break;
		case 2:
			b = "II";
			break;
		case 3:
			b = "III";
			break;
		case 4:
			b = "IV";
			break;
		case 5:
			b = "V";
			break;
		case 6:
			b = "VI";
			break;
		case 7:
			b = "VII";
			break;
		case 8:
			b = "VIII";
			break;
		case 9:
			b = "IX";
			break;
		case 10:
			b = "X";
			break;
		default:
			System.out.println("Numero fuera del rango.");
			break;
		}
		
		if (a>0 && a<=10) {
			System.out.println("Tu numero en romanos es " + b);
		}

	}

}
