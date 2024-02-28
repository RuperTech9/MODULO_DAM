
package tema2.ejercicios;

import java.util.Scanner;

/**
 * Una aplicación inversa que cambie de pesetas a Euros.
 * @author Ruper
 */
public class E05_ConvertirPesetasEuros {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        double euros;
        double EURO;
        double pesetas;
        
        System.out.println("Introduzca cantidad en pesetas: ");
        pesetas = teclado.nextDouble();
        
        EURO = 166.386;
        euros = pesetas/EURO;
        System.out.println("Equivalen a: "+(double)Math.round(euros*1000d)/1000d+" euros");
       
    }
}