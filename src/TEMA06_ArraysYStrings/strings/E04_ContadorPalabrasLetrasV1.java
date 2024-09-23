
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */


public class E04_ContadorPalabrasLetrasV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una cadena de texto
        System.out.println("Introduce una cadena de texto:");
        String texto = scanner.nextLine().trim(); // Eliminar espacios al inicio y al final
        
        int contadorPalabras = 0;
        int contadorLetras = 0;
        boolean esPalabra = false;
        
        // Recorrer cada carácter de la cadena
        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);
            
            // Verificar si el carácter actual es una letra
            if (Character.isLetter(caracterActual)) {
                contadorLetras++;
                if (!esPalabra) {
                    esPalabra = true;
                    contadorPalabras++;
                }
            } else {
                esPalabra = false; // Restablecer para la próxima palabra
            }
        }
        
        // Mostrar la cantidad de palabras y letras
        System.out.println("Cantidad de palabras: " + contadorPalabras);
        System.out.println("Cantidad de letras: " + contadorLetras);
    }
}
