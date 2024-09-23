
package TEMA03_EstructurasDeControl.ejemplos;

/**
 * Crea un programa en java que cambie cada elemento de un array de 0 a 1.
 * 
 * @author Ruper
 */
public class A19_ConvertirDe0a1_ARRAY {
    public static void main(String[] args){
        int [] array = new int[5];
        array[0] = 0;
        array[1] = 3;
        array[2] = 0;
        array[3] = 0;
        array[4] = 0;
        
        for(int i = 0; i<array.length; i++){
            if(array[i]==0){
                array[i]=1;
            }
            System.out.println(array[i]);
        }
    }
    
}
