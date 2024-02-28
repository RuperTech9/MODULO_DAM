
package tema3.ordenacion;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Ruper
 */
public class Quicksort {

    public static void main(String[] args) {
        // Declaración de variables
        int[] numeros = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};

        String[] nombres = {"Juan", "Pepe", "Sara", "Elena", "Ana", "Felipe"};
        Integer[] numeros2 = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};


        Arrays.sort(numeros); // forma ascendente
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros2, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros2));
    }
}