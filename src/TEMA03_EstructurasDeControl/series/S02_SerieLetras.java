
package TEMA03_EstructurasDeControl.series;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
/*
Se utiliza un bucle anidado para imprimir cada letra el número de veces que corresponde 
a su posición en el alfabeto (por ejemplo, 'a' 1 vez, 'b' 2 veces, etc.).
Dentro del bucle interno, se añade una coma después de cada letra, 
excepto después de la última letra de cada grupo.
*/


public class S02_SerieLetras {
    public static void NumVeces(int numero){
    for (int i = 1; i <= numero; i++) {//posición actual 
            char letra = (char) (96 + i);// transforma el número en la letra 
            
            //Bucle Anidado para Repetición de Letras
            for (int j = 0; j < i; j++) {
                System.out.print(letra);//En cada iteración, imprime la letra actual.
                if (j < i - 1) {
                    System.out.print(",");//si no es la última letra de la serie actual, imprime una coma.
                }
            }
            if (i < numero) {
                System.out.print(";");
            }
        }
    }   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        System.out.println("");
        NumVeces(numero);
        
    }
}