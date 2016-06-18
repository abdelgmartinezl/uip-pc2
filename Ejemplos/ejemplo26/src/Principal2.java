import java.util.Arrays;

public class Principal2 {
    public static void imprimirArreglo(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args){
        int[] a1 = {1, 2, 3, 4};
        imprimirArreglo(a1);
        System.out.println(Arrays.toString(a1));
    }
}
