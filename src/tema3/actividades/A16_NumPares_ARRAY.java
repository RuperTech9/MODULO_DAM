
package tema3.actividades;

/**
 * Crear un programa que cuente los números pares que hay en un array de enteros.
 * 
 * @author Ruper
 */
public class A16_NumPares_ARRAY {
    public static void main (String[] args){
        int array[] = {12, 13, 4, 6, 9, 5, 1};
        int contador = 0;
        for(int i=0; i < array.length; i++){
            if(array[i] %2 == 0){
                contador++;
            }
        }
        System.out.println(contador);
    }
}