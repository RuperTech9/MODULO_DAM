
package tema6.calculos;

import java.util.Random;

/**
 *
 * @author Ruper
 */
public class Aleatorios {
    public static void main(String arg[]) {
        int a, b, c;
        Random rnd = new Random();
        a = (rnd.nextInt(26) + 65);
        b = (rnd.nextInt(26) + 65);
        c = (rnd.nextInt(26) + 65);
        System.out.println(a);        
        System.out.println(b);        
        System.out.println(c);        
    }
}
// Al sumar 65 a este número aleatorio (+ 65), el rango se desplaza para empezar desde 65 hasta 90. 
// Esto se debe a que 65 + 0 = 65 (el valor mínimo posible después de sumar 65), 
// y 65 + 25 = 90 (el valor máximo posible después de sumar 65).