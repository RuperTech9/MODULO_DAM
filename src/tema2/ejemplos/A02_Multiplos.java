
package tema2.ejemplos;

import java.util.Scanner;

/**
 * Diseña un programa Java que pida dos números por teclado, 
 * determine si el primero es múltiplo del segundo y muestre el resultado.
 * @author Ruper
 */
public class A02_Multiplos {
    public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    int num1, num2;
    double resultado;
    
    System.out.print("Introduzca un número: ");
    num1 = teclado.nextInt();
    System.out.print("Introduzca otro número: ");
    num2 = teclado.nextInt();
    resultado = (num1/num2);
    
    System.out.printf("\nLa división de %d entre %d es: %.2f",num1, num2,resultado);
    
    // Calculamos el resto de la división para saber si son múltiplos
    if ((num1%num2)>0){
        System.out.printf("\n%d no es múltiplo de %d ",num1,num2);
    }else{
        System.out.printf("\n%d es múltiplo de %d ",num1,num2);
    }
      
    
    
    
    }
}
