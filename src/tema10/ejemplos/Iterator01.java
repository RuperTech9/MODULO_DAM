
package tema10.ejemplos;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// COLECCIONES (LIST - SET - QUEUE(cola)

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
        // Iterator es como un puntero para ir recorriendo
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
        
        // METODO CONTAINS
        boolean contiene = false;
        contiene = listaDAM3.contains("Sara Gonzalez");
        System.out.println("Valor booleano de contiene: " + contiene);
        
        // ORDENAR COLECCIONES hay que importar Collections, el sort de ArrayList no funciona
        Collections.sort(listaDAM3);
        System.out.println("Lista 3 ordenada: "+ listaDAM3);
        
        ArrayList<Integer> listaDAM4 = new ArrayList <Integer>();
        listaDAM4.add(5);
        listaDAM4.add(7);
        listaDAM4.add(3);
        Collections.sort(listaDAM4, Integer::compareTo); // Integer::compareTo = que Datos :: metodo
        System.out.println("Lista 4 ordenada: "+ listaDAM4);
        
        // ORDENAR COLECCIONES AL REVES
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(listaDAM4, comparador);
        System.out.println("Lista 4 invertida: "+ listaDAM4);
        
        // EJEMPLO ORDENAR
        ArrayList<Integer> listaDAM4b = new ArrayList <>(List.of(5, 7, 3, -1, -5));
        Collections.sort(listaDAM4b, Integer::compareTo); // Integer::compareTo = que Datos :: metodo
        System.out.println("Lista 4b ordenada: "+ listaDAM4b);
        Collections.sort(listaDAM4b, comparador);
        System.out.println("Lista 4b invertida: "+ listaDAM4b);
        
        // Diferencia entre ArrayList y List
        // Copiar valores en una lista
        List<String> ejemplo1 = Collections.nCopies(5, "Hola");
        System.out.println("Lista repetida" + ejemplo1);

        
        
        
        
        
        
        // BORRAR ELEMENTO DE LA LISTA por indice
        listaDAM3.remove(1);
        System.out.println(listaDAM3);
        // BORRAR ELEMENTO DE LA LISTA por valor en vez de indice
        listaDAM3.remove("David Meca");
        System.out.println(listaDAM3);
        
        // BORRAR TODOS LOS ELEMENTOS DE LA LISTA
        listaDAM3.clear(); // Es mucho más rápido que removeAll
        System.out.println(listaDAM3);
        
        // BORRAR TODOS LOS ELEMENTOS DE LA LISTA
        listaDAM3.removeAll(listaDAM3);
        System.out.println(listaDAM3);
        
        // TAMAÑO
        System.out.println("Tamaño actual: " + listaDAM3.size());
        
        
        
    }
}
