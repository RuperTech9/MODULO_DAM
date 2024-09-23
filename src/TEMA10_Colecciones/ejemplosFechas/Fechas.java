
package TEMA10_Colecciones.ejemplosFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

// Period: para calcular edad

/**
 *
 * @author Ruper
 */
public class Fechas {
    public static void main(String[] args) {
        Calendar hoy = Calendar.getInstance();
        // Devuelve la fecha actual
        System.out.println("Hoy es: "+hoy.getTime());
        
        // Time
        LocalDate fechaNacimiento  = LocalDate.parse("2009-03-01");
        System.out.println("Formato Java.Time: "+fechaNacimiento);
        
        LocalTime ahora = LocalTime.now();
        System.out.println("La Hora actual es: " + ahora);
        
        LocalDateTime fecha1 = LocalDateTime.parse("2000-02-21T11:54:01.185");
        System.out.println("La fecha actual es: " + fecha1);
                  
    }//Fin main         
}//Fin class