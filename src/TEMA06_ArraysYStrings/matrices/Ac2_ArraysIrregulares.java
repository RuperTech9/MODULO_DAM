package TEMA06_ArraysYStrings.matrices;

/**
 * REVISAR
 * @author david
 */
public class Ac2_ArraysIrregulares {
          
          public static void main(String[] args){
                    //Crear la estructura de Array Bidimensional Irregular y mostrar su longitud
                    int[][] arrayBidimensionalIrregular = {
                              {1, 2, 3},
                              {4, 5, 6, 7},
                              {8}
                    };

                    for (int i = 0; i < arrayBidimensionalIrregular.length; i++) {
                              System.out.println("Longitud de la fila " + i + ": " + arrayBidimensionalIrregular[i].length);
                    }

                    // Parte II: M�todo para insertar datos correlativamente en la matriz
                    insertarDatosCorrelativamente(arrayBidimensionalIrregular);

                    // Parte III: Usar for-each para imprimir los datos
                    System.out.println("Contenido del array:");
                    for (int[] fila : arrayBidimensionalIrregular) {
                              for (int dato : fila) {
                                        System.out.print(dato + " ");
                              }
                              System.out.println();
                    }
          }

          // M�todo para insertar datos correlativamente en la matriz
          static void insertarDatosCorrelativamente(int[][] array) {
                    int contador = 1;
                    for (int i = 0; i < array.length; i++) {
                              for (int j = 0; j < array[i].length; j++) {
                                        array[i][j] = contador++;
                              }
                    }
          }//Fin main
          
}//Fin class
