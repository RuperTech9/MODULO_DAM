
package TEMA10_Colecciones.ejercicios;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Ruper
 */
public class Conjunto3TreeSet_LinkedHashSet {
    public static void main(String [] args){
        TreeSet<Integer> A= new TreeSet<Integer>(); // Los elementos del conjunto se almacenan de menor a mayor.
        A.add(9); 
        A.add(19); 
        A.add(5); 
        A.add(7); 

        
        LinkedHashSet<Integer> B= new LinkedHashSet<Integer>(); // Los elementos del conjunto se encuentran en el orden que se insertan, similar a una lista pero sin dejar ingresar valores repetido.
        B.add(10); 
        B.add(20); 
        B.add(5); 
        B.add(7); 
        
        System.out.println("Conjunto A: " + A); // Conjunto A: [5, 7, 9, 19]
        System.out.println("Conjunto B: " + B); // Conjunto B: [10, 20, 5, 7]
        
        // UNION
        System.out.println("\nAñadir todos los elementos del conjunto B en el conjunto A.");
        A.addAll(B);
        System.out.println("Conjunto A: " + A); // Conjunto A: [5, 7, 9, 10, 19, 20]
        System.out.println("Conjunto B: " + B); // Conjunto B: [10, 20, 5, 7]
        
        // INTERSECCION
        System.out.println("\nRetiene los elementos comunes a ambos conjuntos.");
        A.retainAll(B);
        System.out.println("Conjunto A: " + A); // Conjunto A: [9, 19]
        System.out.println("Conjunto B: " + B); // Conjunto B: [10, 20, 5, 7]
        
        // DIFERENCIA
        System.out.println("\nEliminar los elementos del conjunto A que puedan estar en el conjunto B.");
        A.removeAll(B);
        System.out.println("Conjunto A: " + A); // Conjunto A: [9, 19]
        System.out.println("Conjunto B: " + B); // Conjunto B: [10, 20, 5, 7] 
    }
    
}
