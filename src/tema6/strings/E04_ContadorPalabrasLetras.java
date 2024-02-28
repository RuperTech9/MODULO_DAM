
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E04_ContadorPalabrasLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una cadena de texto
        System.out.println("Por favor, introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        // Dividir el texto en palabras
        String[] palabras = texto.split("\\s+"); // "\\s+" es una expresión regular que representa uno o más espacios
        
        // Contar la cantidad de letras
        int cantidadLetras = 0;
        for (String palabra : palabras) {
            cantidadLetras += palabra.length(); // Sumar la longitud de cada palabra
        }
        
        // Mostrar la cantidad de palabras y letras
        System.out.println("Cantidad de palabras: " + palabras.length);
        System.out.println("Cantidad de letras: " + cantidadLetras);
    }
}