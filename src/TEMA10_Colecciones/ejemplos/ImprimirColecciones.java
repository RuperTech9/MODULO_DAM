
package TEMA10_Colecciones.ejemplos;
// COLECCIONES (LIST - SET - QUEUE(cola)


// LIBRERIAS IMPORTADAS
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class ImprimirColecciones {
    // COLECCIONES
    static Collection rellenar(Collection c){ 
        c.add("perro");
        c.add("gato");
        c.add("perro");
        System.out.println("Numero de Elementos: " + c.size()); // Numero de elementos
        return c;
    }
    
    // MAPAS
    static Map rellenar(Map m){ 
        m.put("perro", "San Bernardo");
        m.put("gato", "Montes");
        m.put("perro", "Presa Canario");
        System.out.println("Elementos Mapas: " + m.size());
        return m;
    }
    
    
    public static void main(String [] args){
        System.out.println("ArrayList: " + rellenar(new ArrayList())); // Devuelve todos los valores x orden de inserción (cola)
        System.out.println("HashSet: " + rellenar(new HashSet())); // Devuelve elementos no repetidos (cola)
        System.out.println("Mapa: " + rellenar(new HashMap())); // pila con elementos no repetidos
        
        // TAMAÑOS
        
        // CONCLUSIONES
        // HashSet. Contiene un conjunto de objetos, que le permite determinar más fácil y rápidamente si un objeto está en el conjunto o no.
        // HashMap. Se imprimen entre llaves con el signo = (clave=valor)
        // Listas. Se pueden crear elementos duplicados

    } // FIN MAIN
} // FIN CLASE