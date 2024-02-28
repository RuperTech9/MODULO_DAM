
package tema3.ejemplos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class A13_Factorial {
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        int factorial=1;
        int num;
        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();
        
        for (int i = num;i>0;i--){
            factorial = factorial*i;
        }
        System.out.println("El factorial de "+num+" es: "+factorial);
        
    }
}
