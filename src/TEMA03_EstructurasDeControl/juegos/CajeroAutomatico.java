
package TEMA03_EstructurasDeControl.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class CajeroAutomatico {
    private static double saldo = 1000; // Saldo inicial

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nCajero Automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositarDinero(teclado);
                    break;
                case 3:
                    retirarDinero(teclado);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }

    public static void consultarSaldo() {
        System.out.printf("Tu saldo actual es: %.2f\n", saldo);
    }

    public static void depositarDinero(Scanner scanner) {
        System.out.print("Introduce la cantidad a depositar: ");
        double cantidad = scanner.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("Cantidad no válida.");
        }
    }

    public static void retirarDinero(Scanner scanner) {
        System.out.print("Introduce la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado correctamente.");
        } else {
            System.out.println("Cantidad no válida o saldo insuficiente.");
        }
    }
}
