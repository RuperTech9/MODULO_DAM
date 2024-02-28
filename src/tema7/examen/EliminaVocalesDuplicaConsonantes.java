
package tema7.examen;

import java.util.Arrays;

/**
 * Escribe un método en Java que acepte una cadena de caracteres y 
 * devuelva una nueva cadena donde se hayan eliminado todas las vocales. 
 * Además, cada consonante debe duplicarse.
 * @author Ruper
 */
public class EliminaVocalesDuplicaConsonantes {
    public static String transformarCadena(String cadena) {
        StringBuilder nuevaCadena = new StringBuilder();
        for (char c : cadena.toCharArray()) {
            if ("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) == -1) { // Si no es vocal
                nuevaCadena.append(c).append(c); // Duplicar consonante
            }
        }
        return nuevaCadena.toString();
    }
    

    public static void main(String[] args) {
        String [] ejemplo1 = {"hola mundo"};
        String [] ejemplo2 = {"ADIOS MUNDO"};
        String [] ejemplo3 = {"BYE BYE"};
        
        // FORMA 1
        System.out.println("Original: " + (Arrays.toString(ejemplo1)));
        System.out.println("Transformada: " + transformarCadena(Arrays.toString(ejemplo1)));
        
        // FORMA 2
        for(String ejemplo : ejemplo2) {
            System.out.println("\nOriginal: " + ejemplo);
            System.out.println("Transformada: " + transformarCadena(ejemplo));
        }
        
        // FORMA 3
        for(int i = 0; i < ejemplo3.length; i++) {
            System.out.println("\nOriginal: " + ejemplo3[i]);
            System.out.println("Transformada: " + transformarCadena(ejemplo3[i]));
        }
    }
}