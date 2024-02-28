
package tema3.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario un número entero y diga si es par 
 * (pista: habrá que comprobar si el resto que se obtiene al dividir entre dos es cero: if (x % 2 == 0) ...).
 * 
 * @author Ruper
 */
public class Ejercicio10 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        
        if (num % 2 == 0){
            System.out.println(num +" es PAR.");
        }else{
            System.out.println(num +" es IMPAR.");
        }
 
    }
    
}
