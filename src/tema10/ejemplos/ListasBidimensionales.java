
package tema10.ejemplos;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author alumno
 */
public class ListasBidimensionales {
    public static void main(String[] args){
        //Me creo el array en 2 dimensiones
        ArrayList<ArrayList<Integer>> lista01 = new ArrayList<>();
        System.out.println("Lista 2D: " + lista01);
        
        // Inicializar la lista
        int numberOfLists = 3;
        for (int i = 0; i < numberOfLists; i++) {
            lista01.add(new ArrayList<>());     
        }
        System.out.println("Lista 2D inicializada: " + lista01);
        
        // Añado elementos a la lista.
        // El primero obviamente a la primera lista
        lista01.get(0).add(5);
        lista01.get(1).add(2);
        lista01.get(2).add(4);
        lista01.get(2).add(8);
        lista01.get(2).add(0, 3); // Asi me lo añade en la posicion 0 delante del 4 y el 8
        System.out.println("Lista 2D inicializada con datos: " + lista01);
        
        // Para imprimir sin corchetes
        for (ArrayList<Integer> list : lista01) {
            for (Integer i1 : list) {
                System.out.printf("%s ",i1);
            }
        }
    }
}
