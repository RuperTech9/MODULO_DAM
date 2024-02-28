
package tema6.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class CiudadesPorPais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] ciudades = new String[4][3];
        String[] paises = new String[4];

        // Solicitar al usuario los nombres de cuatro países
        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el nombre del país " + (i + 1) + ": ");
            paises[i] = scanner.nextLine();
        }

        // Solicitar al usuario los nombres de tres ciudades para cada país
        for (int i = 0; i < 4; i++) {
            System.out.println("Ahora introduce tres ciudades de " + paises[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Ciudad " + (j + 1) + ": ");
                ciudades[i][j] = scanner.nextLine();
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 4; i++) {
            System.out.print("País: " + paises[i] + "\t\tCiudades:");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + ciudades[i][j]);
            }
            System.out.println(); // Salto de línea después de listar las ciudades de cada país
        }
    }
}

