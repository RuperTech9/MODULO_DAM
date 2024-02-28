
package tema3.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario que teclee un número que no sea cero.
 * Si teclea un cero, responderá "Es cero!" y lo volverá a pedir (una única vez más).
 * 
 * @author Ruper
 */
public class Ejercicio13 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        
        if (num == 0){
            System.out.println("Es cero");
            num = teclado.nextInt();
        }
 
    }
    
}
