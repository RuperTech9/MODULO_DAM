
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */

public class DetectorPalabrasDuplicadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String texto = teclado.nextLine();

        if (tienePalabrasDuplicadas(texto)) {
            System.out.println("El texto tiene palabras duplicadas.");
        } else {
            System.out.println("No se encontraron palabras duplicadas en el texto.");
        }

        teclado.close();
    }

    public static boolean tienePalabrasDuplicadas(String texto) {
        String[] palabras = texto.toLowerCase().split("\\s+"); // Convierte a minúsculas y divide en palabras

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    return true; // Palabra duplicada encontrada
                }
            }
        }

        return false; // No se encontraron palabras duplicadas
    }
}