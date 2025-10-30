import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cuentadigital cuenta = new cuentadigital("Carlos", 1000);
        int opcion;

        do {
            System.out.println("=== Bienvenido al Banco Digital ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Transferir Dinero");
            System.out.println("5. Pagar Servicios");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    cuenta.mostrarsaldo();
                    break;
                case 2:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    break;
                case 3:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double ret = sc.nextDouble();
                    cuenta.retirar(ret);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Ingrese destinatario: ");
                    String dest = sc.nextLine();
                    System.out.print("Ingrese monto a transferir: ");
                    double montoT = sc.nextDouble();
                    cuenta.transferir(montoT, dest);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Ingrese nombre del servicio: ");
                    String serv = sc.nextLine();
                    System.out.print("Ingrese monto del servicio: ");
                    double montoS = sc.nextDouble();
                    cuenta.pagar_servicio(serv, montoS);
                    break;
                case 6:
                    System.out.println("¡Gracias por usar el Banco Digital!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
