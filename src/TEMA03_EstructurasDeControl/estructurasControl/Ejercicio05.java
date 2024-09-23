
package TEMA03_EstructurasDeControl.estructurasControl;

import java.util.Scanner;

/**
 *  Crea un programa que pida al usuario dos números enteros y diga si ambos son pares.
 * 
 * @author Ruper
 */
public class Ejercicio05 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        
        if (num1 %2 == 0 && num2 %2 == 0){
            System.out.println("Los 2 numeros son pares");    
        }else{
            System.out.println("Al menos un numero es impar");
        }
        
    }
}
