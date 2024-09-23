
package EXAMEN_2Evaluacion.ConExcepciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SumaNumerosNegativosV1 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int [] [] inicializarArray(){
        int [][] numeros;
        numeros = new int [2][];
        numeros [0] = new int [5];
        numeros [1] = new int [5];
        return numeros;
    }
    
    static int [] introducirPositivos (int[] positivos){
        for (int i = 0; i < positivos.length; i++) {
            System.out.println("Introduzca un numero positivo: ");
            positivos[i]= sc.nextInt();
            sc.nextLine();
        }
        return positivos;
    }
    
    static int [] introducirNegativos (int[] negativos){
        int contador = 0;
        int longitud = negativos.length;
        for (int i = 0; i < negativos.length; i++) {
            
            System.out.println("Introduzca un numero negativo: ");
            negativos[i]= sc.nextInt();
            sc.nextLine();
            contador++;
            System.out.println(contador);
            System.out.println(longitud);
        }
        return negativos;
    }
    
    static int sumarArray(int[] sumandos){
        int suma  = 0;
        for (int i = 0; i < sumandos.length; i++) {
            suma = sumandos[i]; 
        }
        return suma;
    }
    
    static void menu(int[][] numeros){
        int opcion  = 1;
        System.out.println("Opciones:\n1. Introducir valores.\n2.Media del array de positivos, el array de negativos y ambos arrays.\n3.Suma del array de positivos, el array de negativos y ambos arrays.\n4.Ordenar el Array.\0.Salir");
        while (opcion!= 0){
            System.out.println("Introduzca su eleccion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    introducirNegativos(numeros[0]);
                    introducirPositivos(numeros[1]);
                    break;
                
                case 2:
                    System.out.println("Media del array de negativos: " + (double) sumarArray(numeros[0]) / numeros[0].length);
                    System.out.println("Media del array de positivos: "+ (double) sumarArray(numeros[1]) / numeros[1].length);
                    System.out.println("Media de ambos arrays: " + (double) sumarArray(numeros[0]) + (double) sumarArray(numeros[1]));
                    break;
                case 3:
                    System.out.println("Suma del array de negativos: " + sumarArray(numeros[0]));
                    System.out.println("Suma del array de positivos: "+ sumarArray(numeros[1]));
                    System.out.println("Suma de ambos arrays: " + (sumarArray(numeros[0]) + sumarArray(numeros[1])));
                case 4:
                    Arrays.sort(numeros[0]);
                    Arrays.sort(numeros[1]);
                    System.out.println("Array bidimensional de num positivos y negativos" + Arrays.deepToString(numeros));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduzca un numero valido");
            }
        }
    }
}
