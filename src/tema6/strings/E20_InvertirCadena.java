
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E20_InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        // Utilizar StringBuilder para invertir la cadena
        StringBuilder cadenaInvertida = new StringBuilder();
        
        // Recorrer la cadena de atrás hacia adelante y añadir cada carácter al StringBuilder
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        // Mostrar la cadena invertida
        System.out.println("Cadena invertida: " + cadenaInvertida.toString());
    }
}