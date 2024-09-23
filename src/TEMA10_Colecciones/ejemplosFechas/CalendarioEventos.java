
package TEMA10_Colecciones.ejemplosFechas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class CalendarioEventos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> eventos = new ArrayList<>();
        ArrayList<Calendar> fechas = new ArrayList<>();

        // Solicitar al usuario que ingrese eventos y fechas
        while (true) {
            System.out.print("Ingrese un evento (o escriba 'fin' para terminar): ");
            String evento = sc.nextLine();
            if (evento.equalsIgnoreCase("fin")) {
                break;
            }
            eventos.add(evento);

            System.out.println("Ingrese la fecha del evento en el formato YYYY-MM-DD:");
            System.out.print("Año: ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.print("Mes: ");
            int month = Integer.parseInt(sc.nextLine()) - 1; // Calendar usa meses del 0 al 11
            System.out.print("Día: ");
            int day = Integer.parseInt(sc.nextLine());

            Calendar fecha = Calendar.getInstance();
            fecha.set(year, month, day);
            fechas.add(fecha);
        }

        // Mostrar los eventos y fechas registradas
        System.out.println("\nEventos registrados:");
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(eventos.get(i) + " - " + fechas.get(i).getTime());
        }
    }
}