
package TEMA03_EstructurasDeControl.ejemplos;

import java.util.Arrays;

/**
 * Crear un programa en java que divida un array de 10 elementos en dos arrays de 5 elementos.
 * @author Ruper
 */
public class A17_DividirArrayEn2 {
    public static void main(String [] args){
        int tabla [] = {12, 13, 4, 6, 9, 5, 1, 8, 9, 21};
        int [] array1 = new int[5];
        int [] array2 = new int[5];
    
        for (int i=0; i < 5; i++){
            array1[i]=tabla[i];
        }
        for (int i=0; i < 5; i++){
            array2[i]=tabla[i+5];
        }
        
        System.out.println("Array1: "+Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));
    }
    
}

