
package tema3.figuras;

/**
 *
 * @author alumno
 */
public class DibujarTriangulo {
    public static void main(String[] args) {
        //TRIANGULO1
        System.out.println("Triangulo 1");
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //TRIANGULO2
        System.out.println("Triangulo 2");
        for(int i = 5; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        
        //TRIANGULO3
        System.out.println("Triangulo 3");
        for (int i = 0; i < 5; i++) {
            // Imprime espacios al principio de cada fila
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Imprime asteriscos después de los espacios
            for (int k = i; k < 5; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        //TRIANGULO4
        System.out.println("Triangulo 4");        
        for (int i = 5; i > 0; i--) {
            // Imprime espacios al principio de cada fila
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Imprime asteriscos después de los espacios
            for (int k = i; k <= 5; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}
