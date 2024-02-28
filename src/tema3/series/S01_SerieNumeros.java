
package tema3.series;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class S01_SerieNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
