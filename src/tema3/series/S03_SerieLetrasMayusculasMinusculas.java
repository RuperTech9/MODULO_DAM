
package tema3.series;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S03_SerieLetrasMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer del escáner

        System.out.print("Indica si prefieres mayúsculas (M) o minúsculas (m): ");
        char opcion = teclado.nextLine().charAt(0);

        for (int i = 1; i <= numero; i++) {
            char letra = (opcion == 'M' || opcion == 'm') ? (char) ('A' + i - 1) : (char) ('a' + i - 1);
            if (opcion == 'm') {
                letra = Character.toLowerCase(letra);
            }

            for (int j = 0; j < i; j++) {
                System.out.print(letra);
                if (j < i - 1) {
                    System.out.print(",");
                }
            }
            if (i < numero) {
                System.out.print(";");
            }
        }
    }
}
