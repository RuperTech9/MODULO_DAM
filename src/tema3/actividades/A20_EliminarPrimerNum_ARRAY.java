
package tema3.actividades;

/**
 * Crear un programa en java que elimine el primer resultado de un número que encuentre en un array de enteros.
 * 
 * @author Ruper
 */
public class A20_EliminarPrimerNum_ARRAY {
    public static void main(String[] args){
        int [] array = {3, 5, 7, 1, 9, 8, 0, 6, 2};
        int numBorrar=9;
        for(int i=0;i<array.length;i++){
            if(array[i]==numBorrar){
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                
            }
            System.out.print(array[i]+" ");
        }
    }
    
}
