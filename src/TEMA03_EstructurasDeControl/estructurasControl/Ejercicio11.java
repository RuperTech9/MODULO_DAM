
package TEMA03_EstructurasDeControl.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario dos números enteros y diga cual es el mayor de ellos
 * (pista, deberás usar dos "if", uno para ver si el primero es mayor que el segundo y otro para el caso contrario).
 * 
 * @author Ruper
 */
public class Ejercicio11 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        
        if (num1 > num2){
            System.out.println(num1 +" es Mayor.");
        }else if(num2>num1){
            System.out.println(num2 +" es Mayor.");
        }else{
            System.out.println("Los dos numeros son iguales");
        } 
    }
    
}
