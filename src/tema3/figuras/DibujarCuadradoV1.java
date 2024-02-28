
package tema3.figuras;

/**
 *
 * @author Ruper
 */
public class DibujarCuadradoV1 {
    public static void main(String[] args) {
        int base=10, altura=5;
        
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 2; i < altura; i++) {
            System.out.print("*");
            for (int j = 2; j < base; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        
    }
}
