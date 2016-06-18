import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static final double PI = 3.14159;

    public static void calcularArea(double r) {
        double area = PI * Math.pow(r,2.00);
        System.out.printf("Area = %.2f * %.2f * %.2f = %.2f", PI, r, r, area);
    }

    public static void main(String[] args) throws IOException {
            double radio;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Radio: ");
            radio = Double.parseDouble(br.readLine());

            calcularArea(radio);
    }
}
