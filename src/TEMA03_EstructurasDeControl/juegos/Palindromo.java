
package TEMA03_EstructurasDeControl.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = teclado.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase(); // Convierte a minúsculas
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            // Asegúrate de que ambos caracteres son letras
            if (!Character.isLetter(palabra.charAt(izquierda))) {
                izquierda++;
            } else if (!Character.isLetter(palabra.charAt(derecha))) {
                derecha--;
            } else {
                if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                    return false; // No es un palíndromo
                }
                izquierda++;
                derecha--;
            }
        }
        return true; // Es un palíndromo
    }
}