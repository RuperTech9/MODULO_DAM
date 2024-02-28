
package tema2.actividades;

import java.util.Scanner;

/**
 * Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), 
 * suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
 * @author Ruper
 */
public class A03_EcuacionGrado1 {
    public static void main (String[] args) {
    Scanner teclado = new Scanner( System.in );
    double C1,C2;
    
    System.out.print( "Introduzca un número: " );
    C1 = teclado.nextDouble();
    System.out.print( "Introduzca otro número: " );
    C2 = teclado.nextDouble();
    
    System.out.println("el resultado de la dividion es: "+(C2/C1));
    System.out.printf("La ecuación %.1fx + %.1f = 0 es: %f",C1,C2,(-(C2/C1)));
  }
    
}
