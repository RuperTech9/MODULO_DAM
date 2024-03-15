
package tema10.ejercicios;

/**
 *
 * @author Ruper
 * @param <T>
 */
public class Util <T> {
    T t1;
    public void invertir(T[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            t1 = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t1;
        }
    }
    
    Integer[] numeros={0,1,2,3,4,5,6,7,8,9};
        
        
    public void main(String [] args){
        Util<Integer> u= new Util<Integer>(); // Instancia de Util
        
        // Método invertir de Util
        u.invertir(numeros);
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
}
