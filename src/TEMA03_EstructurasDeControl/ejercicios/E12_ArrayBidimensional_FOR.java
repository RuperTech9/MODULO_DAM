
package TEMA03_EstructurasDeControl.ejercicios;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class E12_ArrayBidimensional_FOR {
    public static void main(String args[]) {
        String[][] calendario = {
            {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}, // Días de la semana
            {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"} // Meses del año
        };

        /*for (String[] arrayBidimensional : calendario) {
            for (String elemento : arrayBidimensional) {
            System.out.println(elemento);
            }
            System.out.println(""); // Separador entre los días de la semana y los meses del año
        }*/
        
        for (int i = 0; i<calendario.length;i++){
            System.out.println(Arrays.toString(calendario[i]));
        }
    }
    
}

/*
en Java, no puedes combinar dos bucles for-each en una sola declaración, 
ya que cada bucle for-each está diseñado para iterar a través de un solo conjunto de elementos a la vez.
*/

/*
En este ejemplo, el array calendario es un array de dos elementos, donde cada elemento es un array de String. 
El primer bucle for-each itera sobre los arrays internos, y el segundo bucle for-each itera sobre cada String en esos arrays internos.
*/