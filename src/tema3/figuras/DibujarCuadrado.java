
package tema3.figuras;

/**
 *
 * @author alumno
 */
public class DibujarCuadrado {
    public static void main(String[] args) {
        int altura = 5;
        int base = 10;
        
        //CUADRADO1
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        //CUADRADO2
        for(int i = altura; i > 0; i--){
            for(int j = base; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
