
package tema10.ejemplos;
import java.util.ArrayList;
import java.util.List;

/**
 * add -> añade
 * set -> modificar
 * get -> devolver valor de la lista
 * remove(i) -> borrar
 * 
 * @author alumno
 */
public class Iterator01 {
    public static void main(String[] args){
        // Iterador en una LISTA
        // Se aplica POLIMORFISMO
        Iterable<String> listaDAM1 = List.of("Alejandro", "David", "Yassin", "Marcos");
        listaDAM1.forEach(System.out::println);
        System.out.println("Tipo de lista: " + listaDAM1.getClass());
        
        // Crear el objeto a partir de la clase concreta (ArrayList)
        // A la izquierda el tipo de lista ArrayList
        ArrayList<Integer> listaDAM2 = new ArrayList<>();
        System.out.println(listaDAM2.toString());
        System.out.println("Tipo de lista: " + listaDAM2.getClass());
        
        // Definir el tamaño inicial del ArrayList
        ArrayList<String> listaDAM3 = new ArrayList<>(2);
        // AÑADIR ELEMENTOS DE LA LISTA
        listaDAM3.add("Sara");
        listaDAM3.add("Jarvis");
        System.out.println(listaDAM3); // Seria toString pero en esta clase ya viene definido.
        listaDAM3.add("Fernando");
        System.out.println(listaDAM3);
        System.out.println("Tamaño actual: " + listaDAM3.size());
        
        // MODIFICAR ELEMENTOS DE LA LISTA
        listaDAM3.set(0, "Sara Gonzalez"); // SET: Modificar (nombre + apellidos)
        listaDAM3.set(1, "Jarvis Ruiz"); // SET: Modificar (nombre + apellidos)
        listaDAM3.set(2, "Fernando Trueba"); // SET: Modificar (nombre + apellidos)
        listaDAM3.add("David");
        listaDAM3.set(3, "David Meca");
        System.out.println(listaDAM3);
        
        // DEVOLVER ELEMENTO DE LA LISTA
        System.out.println("Elemento 2 de la lista DAM3: " + listaDAM3.get(1));
        
        // BORRAR ELEMENTO DE LA LISTA por indice
        listaDAM3.remove(1);
        System.out.println(listaDAM3);
        // BORRAR ELEMENTO DE LA LISTA por valor en vez de indice
        listaDAM3.remove("David Meca");
        System.out.println(listaDAM3);
        
        // BORRAR TODOS LOS ELEMENTOS DE LA LISTA
        listaDAM3.removeAll(listaDAM3);
        System.out.println(listaDAM3);
        
        System.out.println("Tamaño actual: " + listaDAM3.size());
        
        
        
    }
}
