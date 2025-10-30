public abstract class cuenta_bancaria {
    protected String titular;
    protected double saldo;

    public cuenta_bancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarsaldo() {
        System.out.println("Titular: " + titular + " | Saldo actual: $" + saldo);
    }

    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad);
}
