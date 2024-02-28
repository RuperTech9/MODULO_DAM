
package tema3.ejemplos;

/**
 * Crear un programa que asigna a los elementos pares el valor de su índice, y a los elementos impares el valor 1.
 * @author Ruper
 */
public class A18_Pares_ARRAY {
    public static void main(String [] args){
        int [] array = {3, 5, 7, 1, 9, 8, 0, 6, 2};
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                array[i]=1;
            }
            
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
    }
}
