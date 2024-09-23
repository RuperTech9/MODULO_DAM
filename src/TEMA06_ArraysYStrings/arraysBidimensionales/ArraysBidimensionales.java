package TEMA06_ArraysYStrings.arraysBidimensionales;

/**
 *
 * @author david
 */
public class ArraysBidimensionales {
         //Metodo para crear el Array

         static int[][] inicializarArray(int n, int m) {
                  int numero = 0;
                  int[][] ret = new int[n][m];
                  for (int i = 0; i < n; i++) {
                           for (int j = 0; j < m; j++) {
                                    ret[i][j] = numero;
                                    numero++;
                           }
                  }
                  return ret;
         }
         
         public static void main(String[] args){
                  int[][] tabla2D = { {0,1,2,3,4}, {5,6,7,8,9}, {10,11,12,13,14}, {15,16,17,18,19} };
                  
                  double promedio = 0;
                  int suma = 0;
                  int elementos = 0;
                  
                  //Valores de la matriz   
                  //Es una tabla REGULAR (=numero de filas para cada columna)
                  System.out.println("Valores de la matriz: ");
                  for (int i=0; i<tabla2D.length; i++) {
                           for (int j=0; j<tabla2D[0].length; j++) {
                                    System.out.print(""+tabla2D[i][j]+", "); //Muestra el array 
                                    suma += tabla2D[i][j];
                                    elementos ++;
                           }//fin 2For
                           System.out.println(" ");
                  }//fin 1For
                  
                  System.out.println("La suma de la matriz es: "+suma+" y contiene "+elementos+" elementos");
                  //Calculo el promedio, hay que pasarlo a double poniendo (double) delante
                  promedio=(double)suma/elementos;
                  System.out.println("El promedio de la matriz es: "+promedio);
                  
                  System.out.println("");
                  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 //Declaramos el array de otra forma
                 //Una tabla de Alumnos (30) y Asignaturas(6)                 
                 int [][] tabla2 = inicializarArray(30,6);
                 
                 //Pongo todo a 0.
                  promedio = 0;
                  suma = 0;
                  elementos = 0;
                 
                 System.out.println("Valores de la matriz: ");
                  for (int i=0; i<tabla2.length; i++) {
                           for (int j=0; j<tabla2[0].length; j++) {
                                    System.out.print(""+tabla2[i][j]+", "); //Muestra el array 
                                    suma += tabla2[i][j];
                                    elementos ++;
                           }//fin 2For
                           System.out.println(" ");
                  }//fin 1For
                  
                  System.out.println("La suma de la matriz es: "+suma+" y contiene "+elementos+" elementos");
                  //Calculo el promedio, hay que pasarlo a double poniendo (double) delante
                  promedio=(double)suma/elementos;
                  System.out.println("El promedio de la matriz es: "+promedio);
                 
                 
                           
                  }
        
         
}
