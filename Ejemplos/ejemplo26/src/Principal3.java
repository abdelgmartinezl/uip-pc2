import java.util.Arrays;

public class Principal3 {
    public static void main(String args[]) {
        double[] a1 = new double[3];
        double[] a2 = a1;

        a1[0] = 50.25;
        System.out.println("a1[0] = " + a1[0]);
        System.out.println("a2[0] = " + a2[0]);

        double[] b1 = new double[3];
        for (int i = 0; i < a1.length; i++) {
            b1[i] = a1[i];
        }

        for (double valor : b1) {
            System.out.println(valor);
        }

        double[] b2 = Arrays.copyOf(a1, a1.length-1);

        a1[0] = 20.20;
        a2[1] = 15.0;

        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        System.out.println("b1 = " + Arrays.toString(b1));
        System.out.println("b2 = " + Arrays.toString(b2));
    }
}
