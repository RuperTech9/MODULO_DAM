
package tema3.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario un número entero y responda si no es
 * múltiplo de 2 ni de 5.
 * 
 * @author Ruper
 */
public class Ejercicio04 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        
        if (num % 2 != 0 && num % 5 != 0){
            System.out.println(num +" no es multiplo de 2 ni de 5");
        }else{
            System.out.println("No cumple la condicion");
        }
 
    }
    
}
