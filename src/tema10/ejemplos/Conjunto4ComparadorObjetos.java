
package tema10.ejemplos;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Ruper
 */
public class Conjunto4ComparadorObjetos implements Comparator<Objeto> {
    @Override
    public int compare(Objeto o1, Objeto o2) {
        int sumao1=o1.a+o1.b; int sumao2=o2.a+o2.b;
        if (sumao1<sumao2) {
            return 1;
        }else if (sumao1>sumao2) {
            return -1;
        }else {
            return 0;
        }
    }
    TreeSet<Objeto> ts=new TreeSet<Objeto>(new Conjunto4ComparadorObjetos());
}