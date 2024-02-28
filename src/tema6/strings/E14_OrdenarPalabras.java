
package tema6.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E14_OrdenarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca varias palabras separadas por espacios
        System.out.println("Introduce varias palabras separadas por espacios:");
        String entrada = scanner.nextLine();
        
        // Dividir la entrada en palabras usando el espacio como delimitador
        String[] palabras = entrada.split(" ");
        
        // Ordenar el array de palabras
        Arrays.sort(palabras);
        
        // Mostrar las palabras ordenadas
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}