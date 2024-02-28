
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E10_PalabraMasLarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar variables para almacenar la palabra más larga y su longitud
        String palabraMasLarga = "";
        int longitudMasLarga = 0;
        
        // Solicitar al usuario que introduzca 10 palabras
        System.out.println("Introduce 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabraActual = scanner.nextLine();
            
            // Comparar la longitud de la palabra actual con la de la palabra más larga encontrada
            if (palabraActual.length() > longitudMasLarga) {
                palabraMasLarga = palabraActual;
                longitudMasLarga = palabraActual.length();
            }
        }
        
        // Mostrar la palabra más larga
        System.out.println("La palabra más larga es: \"" + palabraMasLarga + "\" con " + longitudMasLarga + " caracteres.");
    }
}