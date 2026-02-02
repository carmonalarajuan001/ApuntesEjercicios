
    public class e2 {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 100);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 50);

        cuenta1.depositar(50);
        cuenta1.retirar(30);

        cuenta2.retirar(100);

        System.out.println("Titular: " + cuenta1.titular + 
                           " Saldo: " + cuenta1.saldo);

        System.out.println("Titular: " + cuenta2.titular + 
                           " Saldo: " + cuenta2.saldo);
    }
}

class CuentaBancaria {

    String titular;
    double saldo;

    CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo = this.saldo - cantidad;
        }
    }
}

