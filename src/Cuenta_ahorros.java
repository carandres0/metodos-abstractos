public class Cuenta_ahorros extends cuenta_bancaria {

    public Cuenta_ahorros(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Has depositado $" + cantidad);
        System.out.println("Saldo actual: $" + saldo);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No puede retirar más del saldo disponible.");
        } else {
            saldo -= cantidad;
            System.out.println("Has retirado $" + cantidad);
            System.out.println("Saldo actual: $" + saldo);
        }
    }
}
