
package tema3.series;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class S04_SerieParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de elementos: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            if(i % 2 == 0){
                System.out.print(-1);
            }else{
                System.out.print(1);
            }
            
            if (i < numero - 1) {
                System.out.print(",");
            }
        }
    }
}
