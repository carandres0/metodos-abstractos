public class cuentadigital extends cuenta_bancaria implements Transacciones {
    public cuentadigital(String titular, double saldo) {
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
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Has retirado $" + cantidad);
            System.out.println("Saldo actual: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar.");
        }
    }

    @Override
    public void transferir(double monto, String destinatario) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Has transferido $" + monto + " a " + destinatario);
            System.out.println("Saldo actual: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    @Override
    public void pagar_servicio(String servicio, double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Has pagado $" + monto + " al servicio: " + servicio);
            System.out.println("Saldo actual: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para pagar el servicio: " + servicio);
        }
    }
}
