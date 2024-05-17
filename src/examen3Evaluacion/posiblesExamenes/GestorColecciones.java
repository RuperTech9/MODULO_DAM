
package examen3Evaluacion.posiblesExamenes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class GestorColecciones {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1: Agregar nombre");
            System.out.println("2: Eliminar nombre");
            System.out.println("3: Mostrar todos los nombres");
            System.out.println("4: Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre a agregar: ");
                    String nombre = scanner.nextLine();
                    nombres.add(nombre);
                    break;
                case 2:
                    System.out.print("Introduce el nombre a eliminar: ");
                    String nombreAEliminar = scanner.nextLine();
                    if (nombres.remove(nombreAEliminar)) {
                        System.out.println("Nombre eliminado.");
                    } else {
                        System.out.println("Nombre no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Nombres en la lista:");
                    for (String n : nombres) {
                        System.out.println(n);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}
