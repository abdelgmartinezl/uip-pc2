package banco;

/**
 * <h1>banco.CuentaAhorro</h1>
 * Este es un tipo de banco.Cuenta que representa una
 * cuenta bancaria de ahorros.
 * @author Abdel Martinez
 * @version 1.0
 * @see banco.Cuenta
 */
public class CuentaAhorro extends Cuenta {
    /**
     * Es el constructor de una cuenta de ahorros
     * @param s Es el saldo inicial
     */
    public CuentaAhorro(double s){
        this.saldo = s;
    }


    /**
     * Este metodo envia dinero de una cuenta a otra.
     * @param c El objeto de tipo Cuenta donde se transferira dinero.
     */
    public void transferir(Cuenta c) {
        System.out.println("TRANSFERENCIA EXITOSA");
    }
}
