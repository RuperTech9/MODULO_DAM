
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E16_PalabraMasLarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+"); // "\\s+" es una expresión regular que representa uno o más espacios
        
        // Inicializar variables para almacenar la palabra más larga y su longitud
        String palabraMasLarga = "";
        int longitudPalabraMasLarga = 0;
        
        // Recorrer las palabras para encontrar la más larga
        for (String palabra : palabras) {
            if (palabra.length() > longitudPalabraMasLarga) {
                palabraMasLarga = palabra;
                longitudPalabraMasLarga = palabra.length();
            }
        }
        
        // Mostrar la palabra más larga encontrada
        System.out.println("La palabra más larga es: \"" + palabraMasLarga + "\" con " + longitudPalabraMasLarga + " caracteres.");
    }
}