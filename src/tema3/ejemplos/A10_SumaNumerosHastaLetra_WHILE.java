
package tema3.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A10_SumaNumerosHastaLetra_WHILE {
    
  
    public static boolean esPar (int num){
        return num%2==0;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numPares = 0;
        int numImpares = 0;
        String entrada;

        while (true) {
            System.out.println("Introduce números (escribe 's' o 'S' para salir):");
            entrada = teclado.nextLine();
            
            
            // Verificar si el primer carácter es 's' o 'S'
            if (entrada.charAt(0) == 's' || entrada.charAt(0) == 'S') {
                break;
            }
     
            // Convertir el primer carácter a un número entero y sumarlo
            suma += (int)entrada.charAt(0) - '0';
            
            //Contabilizar si es par
            if(esPar((int)entrada.charAt(0))){
                numPares++;
            }else{
                numImpares++;
            }
        }

        System.out.println("La suma total es: " + suma);
        System.out.println("La suma total de numeros pares es: " + numPares);
        System.out.println("La suma total de numeros impares es: " + numImpares);
    }
}