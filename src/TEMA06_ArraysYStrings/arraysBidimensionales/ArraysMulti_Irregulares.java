package TEMA06_ArraysYStrings.arraysBidimensionales;

/**
 * Matrriz Irregular 
 * @author david
 */
public class ArraysMulti_Irregulares {
         
         public static void main(String[] args){
                  int [][] tabla2Di = new int [4] [] ;
                  
                  tabla2Di [0] = new int [4];
                  tabla2Di [1] = new int [5];
                  tabla2Di [2] = new int [3];
                  tabla2Di [3] = new int [4];
                  
                  int suma = 0, elementos = 0;
                  double promedio = 0;
                  int tmp = 0;
                  
                  for (int i = 0; i < tabla2Di.length; i++) {
                           for (int j = 0; j < tabla2Di[i].length ; j++) {
                           tabla2Di [i][j] = elementos;
                           elementos++;
                           }
                  }

                  //Calculos de la tabla
                  System.out.println("Valores de la Matriz: ");
                  for (int i = 0; i < tabla2Di.length; i++) {
                           for (int j = 0; j <tabla2Di[i].length; j++){
                                    System.out.print(tabla2Di[i][j]+", ");
                                    suma += tabla2Di[i][j];
                           }//Fin 2 for
                           System.out.println("");
                  }//Fin 1 for
                  
                  System.out.println("Suma de la matriz: "+suma+" Elementos de la matriz: "+elementos);
                  promedio = (double)suma/elementos;
                  System.out.println("El promedio de la matriz es: "+promedio);
                  
                  
                  //Variable Temporal que hace el promedio de cada fila
                  tmp = tabla2Di[1] [1];
                  for (int i = 0; i < tabla2Di.length; i++) {
                           tmp = 0;
                           System.out.print("Promedio de la fila " + (i + 1) + " es ");
                           for (int j = 0; j < tabla2Di[i].length; j++) {
                                    tmp = tabla2Di[i][j];
                           }//Fin 2 for
                           System.out.print(" y su promedio es: "+ ( (double)tmp/tabla2Di[i].length) );
                           System.out.println("");
                  }//Fin 1 for
                  
                  
         }
         
}
