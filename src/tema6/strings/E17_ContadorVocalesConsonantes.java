
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E17_ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar
        
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        
        // Recorrer cada carácter de la cadena
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            // Verificar si el carácter es una vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
            // Verificar si el carácter es una consonante (letra que no es vocal y está en el alfabeto)
            else if ((c >= 'a' && c <= 'z')) {
                contadorConsonantes++;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Vocales: " + contadorVocales);
        System.out.println("Consonantes: " + contadorConsonantes);
    }
}