package banco;

/**
 * Esta clase es para arrancar el programa. Necesita de
 * la clase llamada banco.Cuenta.
 * @author Abdel Martinez
 * @version 1.0
 * @see Cuenta
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("banco.Cuenta Bancaria");
        Cuenta c = new Cuenta();

        /**
         * Son los llamados a los metodos de la clase
         */
        c.depositar(5000);
        c.depositar(5000);
        c.retirar(3000);
        System.out.println("Tu saldo es " + c.getSaldo());
    }
}
