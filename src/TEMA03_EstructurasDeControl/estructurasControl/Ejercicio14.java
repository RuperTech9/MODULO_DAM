
package TEMA03_EstructurasDeControl.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que multiplique dos números enteros de la siguiente forma:
 * pedirá al usuario un primer número entero. Si el número que se que teclee es 0, escribirá en pantalla "El
 * producto de 0 por cualquier número es 0". Si se ha tecleado un número distinto de cero, se pedirá al usuario
 * un segundo número y se mostrará el producto de ambos.
 * 
 * @author Ruper
 */
public class Ejercicio14 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        
        if (num1 == 0){
            System.out.println("El producto de 0 por cualquier número es 0");    
        }else{
            System.out.println("Introduce otro numero");
            num2 = teclado.nextInt();
            resultado = num1 * num2;
            System.out.println("El resultado es: "+resultado);
        }
        
    }
}
