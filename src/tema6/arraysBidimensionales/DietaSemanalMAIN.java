
package tema6.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class DietaSemanalMAIN {
    public static void main(String[] args) {
        
        DietaSemanal d1 = new DietaSemanal();
        d1.inicializarComidas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de la Dieta Semanal:");
            System.out.println("1- Saber lo que he desayunado, comido y cenado un día de la semana.");
            System.out.println("2- Buscar qué días se ha realizado una comida concreta.");
            System.out.println("3- Número de días que no ha realizado cena y cuáles.");
            System.out.println("4- Resumen comida semana.");
            System.out.println("5- Salir.");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea nueva después del número

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el día de la semana: ");
                    String dia = scanner.nextLine();
                    d1.imprimirComidasDia(dia);
                    break;
                case 2:
                    System.out.print("Introduce la comida a buscar: ");
                    String comida = scanner.nextLine();
                    d1.buscarDiasPorComida(comida);
                    break;
                case 3:
                    d1.diasSinCena();
                    break;
                case 4:
                    d1.resumenComidaSemana();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
                    break;
            }
        }
    }
}
