
package tema3.series;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S06_SerieNumerica_ARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique cuántos números de la serie quiere ver: ");
        int numero = scanner.nextInt();
        
        int[] serie = new int[numero];
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                // Para las posiciones pares, la serie comienza en 1 y aumenta en 2 cada vez
                serie[i] = 1 + (i / 2) * 2;
            } else {
                // Para las posiciones impares, la serie comienza en 5 y aumenta en 2 cada vez
                serie[i] = 5 + (i / 2) * 2;
            }
            System.out.print(serie[i]);
            if (i < numero - 1) {
                System.out.print("  ");
            }
        }
    }
}