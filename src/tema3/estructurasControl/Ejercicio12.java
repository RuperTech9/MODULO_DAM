
package tema3.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario dos números enteros 
 * y diga si el primero es múltiplo del segundo
 * 
 * @author Ruper
 */
public class Ejercicio12 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        
        if (num1 % num2 == 0){
            System.out.println(num1 +" es multiplo de "+num2);
        }else{
            System.out.println("No son  multiplos");
        } 
    }
    
}
