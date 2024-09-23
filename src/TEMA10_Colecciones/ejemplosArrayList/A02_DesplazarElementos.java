
package TEMA10_Colecciones.ejemplosArrayList;

import java.util.ArrayList;

/**
 * Tengo un ArrayList de tipo Integer
 * 13 22 4 50 12
 * Quiero desplazar elementos
 * Pasar el último a la primera posición y quedaría así:
 * 12 13 22 4 56

 * Devolver el mismo ArrayList con con los elementos desplazados
 * 
 * @author alumno
 */
public class A02_DesplazarElementos {
    public static void main(String[] args) {
        // Crear el ArrayList inicial
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(13);
        numeros.add(22);
        numeros.add(4);
        numeros.add(50);
        numeros.add(12);

        // Desplazar elementos
        int ultimo = numeros.remove(numeros.size() - 1); // Remover el último elemento
        numeros.add(0, ultimo); // Añadir el último elemento en la primera posición

        // Imprimir el ArrayList con los elementos desplazados
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
    }
    
    public static void desplazar(ArrayList<Integer> n){
        n.add(0,n.remove(n.size()- 1));
    }
}
/*
 * Primero creamos un ArrayList de tipo Integer con los números dados. 
 * Luego, eliminamos el último elemento del ArrayList utilizando el método remove() y lo almacenamos en una variable llamada ultimo. 
 * Después, agregamos este elemento ultimo en la primera posición del ArrayList utilizando el método add() con el índice 0. 
 * Finalmente, imprimimos el ArrayList resultante.
 */