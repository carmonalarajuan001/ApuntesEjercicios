package EntornosDeDesarrollo.TRIMESTRE2.Unidad4.ApuntesExamenEjercicios.nivel1.ejercicio2;

public class CuentaBancaria {

    private final Usuario titular;
    private double saldo;

    /**
     * Constructor de la clase CuentaBancaria que inicializa el titular y el saldo inicial.
     * @param titular El titular de la cuenta bancaria, no puede ser null.
     * @param saldoInicial El saldo inicial de la cuenta bancaria, no puede ser negativo.
     * @throws IllegalArgumentException Si el titular es null o si el saldo inicial es negativo.
     */

    public CuentaBancaria(Usuario titular, double saldoInicial) {
        if (titular == null) {
            throw new IllegalArgumentException("El titular no puede ser null");
        }

        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }

        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Método para obtener el titular de la cuenta bancaria.
     * @return El titular de la cuenta bancaria.
     */
    public Usuario getTitular() {
        return titular;
    }

    /**
     * Método para obtener el saldo actual de la cuenta bancaria.
     * @return El saldo actual de la cuenta bancaria.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad de dinero en la cuenta bancaria. La cantidad debe ser positiva.
     * @param cantidad La cantidad de dinero a ingresar, debe ser positiva.
     * @throws IllegalArgumentException Si la cantidad es negativa o cero.
     */
    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        saldo += cantidad;
    }

    /**
     * Método para retirar una cantidad de dinero de la cuenta bancaria. La cantidad debe ser positiva y no puede exceder el saldo disponible.
     * @param cantidad La cantidad de dinero a retirar, debe ser positiva y no puede exceder el saldo disponible.
     * @throws IllegalArgumentException Si la cantidad es negativa, cero o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        saldo -= cantidad;
    }
}
