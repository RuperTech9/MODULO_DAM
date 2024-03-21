
package tema10.ejemplosFechas;

import java.time.LocalDate;
import java.util.Calendar;

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
        LocalDate fechaNacimiento  = LocalDate.parse("2009/03-01");
        System.out.println("Formato Java.Time: "+fechaNacimiento);
                  
    }//Fin main         
}//Fin class