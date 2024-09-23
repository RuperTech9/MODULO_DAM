
package TEMA06_ArraysYStrings.arraysBidimensionales;

/**
 *
 * @author Ruper
 */
public class Ejemplo {
    public static void main(String[] args) {
        // Ejemplo 1: Declaración y inicialización
        // Este ejemplo crea una matriz 3x3 de enteros, donde cada sub-array representa una fila de la matriz.
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
        // Ejemplo 2: Acceder a elementos
        System.out.println(matriz[0][2]); // Imprime el valor 3, que está en la primera fila y tercera columna.
    
        // Ejemplo 3: Modificar elementos
        matriz[1][1] = 10; // Cambia el valor en la segunda fila y segunda columna a 10.

    
        // Ejemplo 4: Iterar sobre un array bidimensional
        // Este ejemplo recorre todos los elementos de la matriz, fila por fila y columna por columna, 
        // imprimiendo cada valor con un espacio entre ellos y un salto de línea al final de cada fila.
        for(int i = 0; i < matriz.length; i++) { // Itera sobre las filas.
            for(int j = 0; j < matriz[i].length; j++) { // Itera sobre las columnas de la fila actual.
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de imprimir cada fila.
        }
    }
}
