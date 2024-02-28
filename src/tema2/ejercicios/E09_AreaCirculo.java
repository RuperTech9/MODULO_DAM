
package tema2.ejercicios;

import java.util.Scanner;

/**
 * Área de un círculo definiendo una constante.
 * Implementa un programa en Java que calcule el área de un círculo cuyo radio lo introduce el usuario. Recuerda que el Área = 𝜋𝑟2 y 𝜋 = 3.1415. Define una variable global para el valor de PI.
 * La constante deberá quedar definida fuera del programa principal.
 * @author Ruper
 */
public class E09_AreaCirculo {
    
   public static final double PI = 3.1415;
   
   public static double calcularArea (double radio) {
        return PI * radio * radio;
    }
   
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        double radio;
           
        System.out.println("Introduce el radio del círculo para hayar el área: ");
       
        radio = teclado.nextDouble();
        double area = calcularArea(radio);
        
        System.out.printf("El área del circulo con radio %.2f, es: %.2f", radio,area );
        
        
    }   
}
