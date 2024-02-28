
package tema3.ejemplos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class A14_NumeroPrimo {
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            //Si el número es divisible por 2 (o cualquier otro número hasta la mitad de su valor), entonces tiene más de dos divisores y no es primo. 
            //Si el número no es divisible por ningún número en ese rango, entonces es primo.
            }
        }
        return true;
    }
    
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un numero: ");
        num = teclado.nextInt();
            if (esPrimo(num)) {
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
    }
    
}
