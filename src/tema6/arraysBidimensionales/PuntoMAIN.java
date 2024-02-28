
package tema6.arraysBidimensionales;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class PuntoMAIN {
    public static void main(String[] args){
        // dos dimensiones
        Punto [][] array1 = { // ARRAY irregular de 2 dimensiones de objetos
            {new Punto(1,2), new Punto(4,5), new Punto(0,3)},
            {new Punto(8,4)},
            {new Punto(3,2)}
        };
        
        // Una dimension
        Punto[] linea1 = {new Punto(1,1),new Punto(2,2), new Punto(3,3)};
        Punto[] linea2 = {new Punto(0,0)};
        Punto[] linea3 = {new Punto(-1,-1),new Punto(-2,-2)};
        
        // 3 dimensiones
        Punto[][] lineas = {linea1, linea2, linea3};
        
        
        // Para imprimir Array Bidimensional
        System.out.println("Fase: "+Arrays.deepToString(array1));
        // Saca la referencia con bidimensionales se utiliza para 1 dimensión.
        System.out.println(Arrays.toString(array1));
        
        System.out.println(Arrays.toString(linea1));
        System.out.println(Arrays.toString(linea2));
        System.out.println(Arrays.toString(linea3));
        
        System.out.println("Fase: "+Arrays.deepToString(lineas)); 
    }
}
