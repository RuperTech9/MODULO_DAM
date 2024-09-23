
package TEMA02_Elementos.ejercicios;

import java.util.Scanner;

/**
 * Una aplicación que permita pasar una cantidad de euros a las antiguas pesetas. 
 * Debemos considerar que el cambio es de: 1€ equivale a 166,386 ptas.
 * Intenta que concatene al resultado, texto para que sea más fácil de comprender por el usuario. Ejemplo: resultado: 589.26 pesetas
 * @author Ruper
 */
public class E04_ConvertirEurosPesetas {
    
    public static double conversor (double num1){
        double resultado = num1 * 166.386;
        return resultado;
    }
    
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        double euros;
        
        System.out.println("Introduzca cantidad en euros: ");
        euros = teclado.nextDouble();
        
        double pesetas = conversor(euros);
        System.out.println("Equivalen a: "+(double)Math.round(pesetas*1000d)/1000d+" pesetas");
        
        System.out.printf("\n&f es igual a %f pesetas", euros,pesetas);
        
        
        
        
    }
}