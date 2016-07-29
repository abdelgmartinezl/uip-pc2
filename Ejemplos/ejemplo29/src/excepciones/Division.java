package excepciones;

import java.io.IOException;

public class Division {
    public static void main(String args[]) {
        int a = 5, b = 0, c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Hubo un error.");
        } finally {
             System.out.println(c);
        }

    }
}
