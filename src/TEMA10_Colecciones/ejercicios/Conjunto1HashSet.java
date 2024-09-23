
package TEMA10_Colecciones.ejercicios;

import java.util.HashSet;

/**
 *
 * @author Ruper
 */
public class Conjunto1HashSet {
    public static void main(String [] args){
        // CLASE GENERICA <Tipo> puede trabajar con cualquier tipo de dato 
        HashSet<Integer> conjunto=new HashSet<Integer>();
        
        // Añadimos numeros al conjunto
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(9);
        conjunto.add(7);
        conjunto.add(6);
        conjunto.add(10);
        
        System.out.println("Conjunto: " + conjunto.toString());
        
        Integer n = 10;
        if (!conjunto.add(n)) {
            System.out.println("El número " + n + " ya en la lista.");
        }  
    }   
}
