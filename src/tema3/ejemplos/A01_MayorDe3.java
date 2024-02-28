
package tema3.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A01_MayorDe3 {
    
    public static int esMayor (int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3) {
            return num1;
        } else if(num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
        
    }
    public static void main(String args[]){
        int num1;
        int num2;
        int num3;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Introduzca el segundo numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        num3 = teclado.nextInt();
        
        int mayor = esMayor(num1, num2, num3);
        System.out.println("El numero mayor es: " + mayor);
    }
    
}