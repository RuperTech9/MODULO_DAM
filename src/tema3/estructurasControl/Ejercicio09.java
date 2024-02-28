
package tema3.estructurasControl;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario tres números y muestre cuál es el mayor de los tres.
 * @author Ruper
 */
public class Ejercicio09 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        
        System.out.println("Introduce un numero");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num2 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        num3 = teclado.nextInt();
        
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1+" es el mayor");
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2+" es el mayor");
        }else{
            System.out.println(num3+" es el mayor");
        }
        
    }
}
