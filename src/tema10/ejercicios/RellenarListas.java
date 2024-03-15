
package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ruper
 */
public class RellenarListas {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        for(int i = 0; i < 10; i++)
            lista.add("");
        Collections.fill(lista, "Hola");
        System.out.println(lista.toString());
    }
}
