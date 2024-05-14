
package tema10.ejemplosFechas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class FechaExamenesOrdenadas {
    public static void main(String[] args){
        ArrayList<LocalDate> examenesDAM = new ArrayList<LocalDate>();
        LocalDate programacion = LocalDate.parse("2024-05-20");
        examenesDAM.add(programacion);
        examenesDAM.add(LocalDate.parse("2024-05-21"));
        examenesDAM.add(LocalDate.parse("2024-05-19"));
        
        System.out.println("EXAMENES DAM");
        System.out.println(examenesDAM);
        
        // Copiar un array para DAW también
        ArrayList<LocalDate> examenesDAW = new ArrayList<LocalDate>(examenesDAM); // En el () la lista a copiar
        examenesDAW.add(LocalDate.parse("2024-05-18"));
        
        // Ordenar con Collections porque no es un Objeto
        Collections.sort(examenesDAW);
        System.out.println("EXAMENES DAW ordenados");
        System.out.println(examenesDAW);
        
        // Ordenar Inverso
        Comparator<LocalDate> comparador = Collections.reverseOrder();
        Collections.sort(examenesDAW, comparador);
        System.out.println("EXAMENES DAW ordenados");
        System.out.println(examenesDAW);
    }
    
}
