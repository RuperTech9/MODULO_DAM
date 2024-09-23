
package TEMA03_EstructurasDeControl.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario dos números enteros. Si el segundo no es cero, 
 * mostrará el resultado de dividir el primero entre el segundo. Por el contrario, 
 * si el segundo número es cero, escribirá "Error: No se puede dividir entre cero".
 * 
 * @author Ruper
 */
public class Ejercicio15 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;
        double resultado;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        
        if (num2 != 0){
            resultado = num1 / num2;
            System.out.println("El resultado es: "+resultado);    
        }else{
            System.out.println("Error: No se puede dividir entre cero");
        }
        
    }
    
}
