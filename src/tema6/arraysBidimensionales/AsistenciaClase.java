
package tema6.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class AsistenciaClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeAlumnos = 0;
        String[] nombresDeAlumnos;

        // 1ª Verificación: Número de alumnos debe ser no negativo
        do {
            System.out.print("¿Cuántos alumnos hay en clase? ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next(); // descartar la entrada incorrecta
                System.out.print("¿Cuántos alumnos hay en clase? ");
            }
            numeroDeAlumnos = scanner.nextInt();
        } while (numeroDeAlumnos < 0);

        nombresDeAlumnos = new String[numeroDeAlumnos];
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Introducir nombres de alumnos
        System.out.println("Introduce los nombres de los alumnos (CTRL+Z, CTRL+espacio o ENTER para cancelar):");
        for (int i = 0; i < nombresDeAlumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            String entrada = scanner.nextLine();
            // Cancelar la introducción de nombres con las combinaciones de teclas indicadas (simulado con entrada vacía)
            if (entrada.isEmpty()) {
                break;
            }
            nombresDeAlumnos[i] = entrada;
        }

        // Preguntar si desea ver los nombres introducidos
        char respuesta;
        do {
            System.out.print("¿Desea ver los nombres introducidos? (s/n): ");
            respuesta = scanner.next().charAt(0);
            scanner.nextLine(); // Limpiar el buffer del scanner
        } while (respuesta != 's' && respuesta != 'n');

        // Mostrar los nombres si la respuesta es 's'
        if (respuesta == 's') {
            System.out.println("Nombres de los alumnos que han asistido a clase:");
            for (String nombre : nombresDeAlumnos) {
                if (nombre != null) { // Verificar que el nombre no sea nulo (por si se canceló la entrada)
                    System.out.println("- " + nombre);
                }
            }
        }

        scanner.close();
    }
}
