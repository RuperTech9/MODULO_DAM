
package tema10.ejemplosMapas;
// COLECCIONES (LIST - SET - QUEUE(cola)

import java.util.Map;

/**
 *
 * @author alumno
 */
public class Mapas01 {
    public static void main(String[] args){
        Map<Integer,String> mapaDAM1 = Map.of(1, "Teclado", 2, "Monitor", 3, "CPU");
        mapaDAM1.forEach((clave, valor) -> System.out.println((clave + ":" + valor))); 
    }   
}
