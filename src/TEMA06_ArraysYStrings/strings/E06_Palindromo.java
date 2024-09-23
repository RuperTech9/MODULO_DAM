
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E06_Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        
        // Opcional: eliminar espacios y convertir a minúsculas para una comparación más flexible
        String palabraLimpia = palabra.replace(" ", "").toLowerCase();
        
        // Invertir la palabra limpia
        String palabraInvertida = new StringBuilder(palabraLimpia).reverse().toString();
        
        // Comparar la palabra original (limpia) con la invertida
        if (palabraLimpia.equals(palabraInvertida)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }
}