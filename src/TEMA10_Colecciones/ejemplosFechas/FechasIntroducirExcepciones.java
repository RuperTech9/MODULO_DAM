
package TEMA10_Colecciones.ejemplosFechas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class FechasIntroducirExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar hoy = Calendar.getInstance();
        
        boolean fechaActualValida = false;
        do {
            System.out.println("Ingrese la fecha actual en el formato YYYY-MM-DD:");
            String fechaActualString = scanner.nextLine();
            try {
                LocalDate fechaActual = LocalDate.parse(fechaActualString);
                System.out.println("Fecha actual ingresada: " + fechaActual);
                if (fechaActual.isEqual(LocalDate.now())) {
                    System.out.println("La fecha actual es correcta.");
                    fechaActualValida = true;
                } else {
                    System.out.println("La fecha actual no es correcta.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("La fecha actual ingresada no es válida. Por favor, inténtelo de nuevo.");
            }
        } while (!fechaActualValida);
        
        boolean fechaNacimientoValida = false;
        do {
            System.out.println("\nIngrese su fecha de nacimiento en el formato YYYY-MM-DD:");
            String fechaNacimientoString = scanner.nextLine();
            try {
                LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);
                System.out.println("Fecha de nacimiento ingresada: " + fechaNacimiento);
                System.out.println("Formato Java.Time: " + fechaNacimiento);
                fechaNacimientoValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("La fecha de nacimiento ingresada no es válida. Por favor, inténtelo de nuevo.");
            }
        } while (!fechaNacimientoValida);

    }
}