
package tema2.ejercicios;

import java.util.Scanner;

/**
 * Aplicación que permite calcular el área de un rectángulo. Incorporar, para mejorar la experiencia de usuario, 
 * la concatenación de texto y números para describir los valores manejados (printf).
 * @author Ruper
 */
public class E07_AreaRectangulo {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        double ancho;
        double largo;
        double area;
        
        System.out.println("Introduzca el ancho: ");
        ancho = teclado.nextDouble();
        
        System.out.println("Introduzca el largo: ");
        largo = teclado.nextDouble();
        
        area = largo * ancho;
        
        System.out.printf("El área del rectángulo es: %.2f",area);
    }
}
