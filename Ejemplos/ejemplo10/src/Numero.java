import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num1, num2, num3;
		
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Ingrese primer numero: ");
		num1 = Integer.parseInt(k.readLine());
		System.out.print("\nIngrese segundo numero: ");
		num2 = Integer.parseInt(k.readLine());
		System.out.print("\nIngrese tercer numero: ");
		num3 = Integer.parseInt(k.readLine());

		if ((num1 < num2)&&(num1 > num3) || (num1 > num2)&&(num1 < num3)){
			System.out.println("El numero del medio es " + num1);
		} else if ((num2 < num1)&&(num2 > num3) || (num2 > num1)&&(num2 < num3)){
			System.out.println("El numero del medio es " + num2);
		} else if ((num3 < num1)&&(num3 > num2) || (num3 > num1)&&(num3 < num2)){
			System.out.println("El numero del medio es " + num3);
		} else {
			System.out.println("No hay numero intermedio");
		}
		
	}

}
























