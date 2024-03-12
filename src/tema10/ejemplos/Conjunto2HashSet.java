
package tema10.ejemplos;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Conjunto2HashSet {
    public static void main(String [] args){
        // CONJUNTO: Los conjuntos son un tipo de colección que no admite duplicados
        // CLASE GENERICA <Tipo> puede trabajar con cualquier tipo de dato 
        HashSet<Integer> conjunto=new HashSet<Integer>(); // Para crear un conjunto, simplemente creamos el HashSet indicando el tipo de objeto que va a almacenar
        Scanner sc = new Scanner(System.in);
        String str;
        
        do{
            System.out.println("Introduce un número " + (conjunto.size() + 1) + ":");
            str = sc.nextLine();
            try{
                Integer n = Integer.parseInt(str);
                if (!conjunto.add(n)){
                    System.out.println("Número ya está en la lista. Debes introducir otro.");
                }
            }catch (NumberFormatException e){
                System.out.println("Numero erroneo");
            }   
        } while (conjunto.size()<5);
        
        // Calcular la suma
        Integer suma = 0;
        for (Integer i : conjunto) {
            suma = suma+i;
            
        }
        System.out.println("La suma es: " + suma);
    }  
}
