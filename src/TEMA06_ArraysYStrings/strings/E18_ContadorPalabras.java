
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E18_ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        // Solicitar al usuario que introduzca la palabra objetivo
        System.out.print("Introduce la palabra objetivo: ");
        String palabraObjetivo = scanner.nextLine();
        
        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+"); // "\\s+" es una expresión regular que representa uno o más espacios
        
        // Contar las apariciones de la palabra objetivo
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.equalsIgnoreCase(palabraObjetivo)) { // Ignorar mayúsculas y minúsculas
                contador++;
            }
        }
        
        // Mostrar el número de veces que aparece la palabra objetivo
        System.out.println("La palabra '" + palabraObjetivo + "' aparece " + contador + " veces en la frase.");
    }
}