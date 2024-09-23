
package TEMA02_Elementos.ejemplos;

import java.util.Scanner;

/**
 * Diseña un programa Java que calcule la suma, resta, multiplicación 
 * y división de dos números introducidos por teclado. 
 * Incorpora también las funciones que permitan realizar la potencia 
 * de un número y la raíz cuadrada del otro.
 * @author Ruper
 */
public class A04_Operaciones {
    public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    float x,y;
    System.out.print( "Introduzca un número: " );
    x = teclado.nextFloat();
    System.out.print( "Introduzca otro número: " );
    y = teclado.nextFloat();
    System.out.printf("\n%d + %d = %.1f",(x+y));
    System.out.printf("\nx - y = %.1f",(x-y));
    System.out.printf("\nx * y = %.1f",(x*y));
    System.out.printf("\nx / y = %.1f",(x/y));
    System.out.printf("\nx ^ 2 = %.1f",Math.pow(x, 2));
    System.out.printf("\n√x = %.1f",Math.pow(x,0.5));
  }
}
