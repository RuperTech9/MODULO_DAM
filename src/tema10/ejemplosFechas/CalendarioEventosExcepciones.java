
package tema10.ejemplosFechas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class CalendarioEventosExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> eventos = new ArrayList<>();
        ArrayList<Calendar> fechas = new ArrayList<>();

        // Solicitar al usuario que ingrese eventos y fechas
        boolean continuar = true;
        do {
            try {
                System.out.print("Ingrese un evento (o escriba 'fin' para terminar): ");
                String evento = scanner.nextLine();
                if (evento.equalsIgnoreCase("fin")) {
                    continuar = false;
                    break;
                }
                eventos.add(evento);

                System.out.println("Ingrese la fecha del evento en el formato YYYY-MM-DD:");
                System.out.print("Año: ");
                int year = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del Scanner
                System.out.print("Mes: ");
                int month = scanner.nextInt() - 1; // Calendar usa meses del 0 al 11
                scanner.nextLine(); // Limpiar el buffer del Scanner
                System.out.print("Día: ");
                int day = scanner.nextInt();

                Calendar fecha = Calendar.getInstance();
                fecha.set(year, month, day);
                fechas.add(fecha);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Limpiar el buffer del Scanner
            }
        } while (continuar);

        // Mostrar los eventos y fechas registradas
        System.out.println("\nEventos registrados:");
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(eventos.get(i) + " - " + fechas.get(i).getTime());
        }
    }
}