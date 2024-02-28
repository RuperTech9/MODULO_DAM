
package tema3.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario un número entero y responda si es múltiplo de 2 o de 5.
 * 
 * @author Ruper
 */
public class Ejercicio01 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        
        if (num % 2 == 0){
            System.out.println(num +" es multiplo de 2");
        }else if (num % 5 == 0){
            System.out.println(num +" es multiplo de 5");
        }else{
            System.out.println("No es  multiplo de 2 ni de 5");
        }
 
    }
    
}
