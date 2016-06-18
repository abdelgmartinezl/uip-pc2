import java.util.Arrays;

public class Principal4 {
    public static void main(String args[]) {
        double[][] matriz = new double[5][5];
        matriz[0][3] = 25.0;

        for (int f = 0; f < 5; f++) {
            for (int c = 0; c <5; c++) {
                System.out.print(" " + matriz[f][c]);
            }
            System.out.println();
        }
    }
}
