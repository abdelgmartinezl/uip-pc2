package banco;

/**
 * <h1>banco.Cuenta</h1>
 * La clase banco.Cuenta implementa una cuenta bancaria
 * donde se puede depositar y retirar efectivo.
 *
 * @author Abdel Martinez
 * @version 1.0
 */
public class Cuenta {
    /**
     * Este es el atributo que representa el saldo de una cuenta.
     */
    protected double saldo;

    /**
     * Este metodo se utiliza para retirar efectivo de la cuenta.
     * @param valor El valor a retirar de la cuenta.
     */
    public void retirar(double valor) {
        this.saldo -= valor;
    }

    /**
     * Este metodo se utiliza para depositar efectivo en la cuenta.
     * @param valor El valor a depositar en la cuenta.
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Este metodo funciona para obtener el valor del atributo saldo.
     * @return double Retorna el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
}
