
package TEMA06_ArraysYStrings.calculos;

import java.util.Random;

/**
 *
 * @author Ruper
 */
public class AleatoriosLetras {
    public static void main(String arg[]) {
        char a, b, c;
        Random rnd = new Random();
        a = (char)(rnd.nextInt(26) + 65); // Convertir el número aleatorio a char
        b = (char)(rnd.nextInt(26) + 65); // Convertir el número aleatorio a char
        c = (char)(rnd.nextInt(26) + 65); // Convertir el número aleatorio a char
        System.out.println(a);        
        System.out.println(b);        
        System.out.println(c);        
    }
}
