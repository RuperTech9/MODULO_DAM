
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E03_TrianguloDePalabra {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca una palabra
        System.out.print("Por favor, introduce una palabra: ");
        String palabra = scanner.nextLine();
        
        // Imprimir el triángulo de letras
        for (int i = 0; i < palabra.length(); i++) {
            // Imprimir las letras desde la primera hasta la i-ésima letra
            System.out.println(palabra.substring(0, i + 1));
        }
    }
}