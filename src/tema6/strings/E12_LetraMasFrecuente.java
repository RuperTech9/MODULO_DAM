
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E12_LetraMasFrecuente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una frase
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        
        // Convertir la frase a minúsculas para simplificar la comparación
        frase = frase.toLowerCase();
        
        // Array para contar las apariciones de cada letra (alfabeto inglés)
        int[] contadorLetras = new int[26]; // 26 letras en el alfabeto inglés
        
        // Recorrer la frase y contar las apariciones de cada letra
        for (int i = 0; i < frase.length(); i++) {
            char caracterActual = frase.charAt(i);
            if (caracterActual >= 'a' && caracterActual <= 'z') {
                contadorLetras[caracterActual - 'a']++;
            }
        }
        
        // Encontrar la letra con mayor frecuencia
        int maxFrecuencia = 0;
        char letraMasFrecuente = ' ';
        for (int i = 0; i < contadorLetras.length; i++) {
            if (contadorLetras[i] > maxFrecuencia) {
                maxFrecuencia = contadorLetras[i];
                letraMasFrecuente = (char) (i + 'a');
            }
        }
        
        // Mostrar la letra que aparece con más frecuencia y las veces que ha aparecido
        System.out.println("La letra que aparece con más frecuencia es la letra '" + letraMasFrecuente + "' y aparece " + maxFrecuencia + " veces.");
    }
}