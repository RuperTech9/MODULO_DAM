
package TEMA06_ArraysYStrings.arraysBidimensionales;

/**
 *
 * @author Ruper
 */
public class ArraysIrregulares {

    public static void main(String[] args) {
        // Parte I: Creación y Visualización de la Estructura
        int[][] datosIrregulares = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Inicializar los valores ya se hizo en la declaración

        // Mostrar la longitud de cada fila e imprimir todo su contenido
        for (int i = 0; i < datosIrregulares.length; i++) {
            System.out.println("Longitud de la fila " + i + ": " + datosIrregulares[i].length);
            for (int j = 0; j < datosIrregulares[i].length; j++) {
                System.out.print(datosIrregulares[i][j] + " ");
            }
            System.out.println(); // Salto de línea para separar las filas
        }

        // Parte II: Inserción Correlativa de Datos
        // Este paso ya se encuentra implícito en la inicialización del array.

        // Parte III: Impresión de Datos Usando For-Each
        imprimirDatosConForEach(datosIrregulares);
    }

    // Método para imprimir datos usando for-each
    static void imprimirDatosConForEach(int[][] array) {
        System.out.println("\nImpresión de datos con for-each:");
        for (int[] fila : array) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println(); // Salto de línea para separar las filas
        }
    }
}
