
package tema3.ejercicios;

/**
 *
 * @author Ruper
 */
public class E13_Bucle_FOR {
    public static void main(String[] args) {
        //Utilizamos ahora el bucle for
        for (int k =1, j=10; k<j;k++, j--){        

            System.out.println(k + " x " + j );
        }
        for (int k =1, j=10; k<=10 && j>0;k++, j--){        

            System.out.println(k + " x " + j );
        }
        
    }
}