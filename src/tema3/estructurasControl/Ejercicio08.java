
package tema3.estructurasControl;

import java.util.Scanner;

/**
 *  Crea un programa que pida al usuario dos números enteros y diga "Uno de los números es positivo", 
 * "Los dos números son positivos" o bien "Ninguno de los números es positivo", según corresponda.
 * 
 * @author Ruper
 */
public class Ejercicio08 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        
        if ((num1 > 0 && num2 < 0)||(num2 > 0 && num1 < 0)){
            System.out.println("Uno de los números es positivo");
        } else if (num1 > 0 && num2 > 0){
            System.out.println("Los dos números son positivos");
        }else{
            System.out.println("Ninguno de los números es positivo");
        }
        
    }
}
