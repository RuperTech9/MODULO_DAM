
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E19_VerificarSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca la cadena principal
        System.out.print("Introduce la cadena principal: ");
        String cadenaPrincipal = scanner.nextLine();
        
        // Solicitar al usuario que introduzca la subcadena
        System.out.print("Introduce la subcadena: ");
        String subcadena = scanner.nextLine();
        
        // Verificar si la cadena principal contiene la subcadena
        boolean contieneSubcadena = cadenaPrincipal.contains(subcadena);
        
        // Mostrar el resultado
        if (contieneSubcadena) {
            System.out.println("La cadena principal contiene la subcadena.");
        } else {
            System.out.println("La cadena principal NO contiene la subcadena.");
        }
    }
}