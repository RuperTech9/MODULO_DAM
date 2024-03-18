package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ListadoDAM_V2 {
    // Inicializo objeto Scanner
    static Scanner sc = new Scanner(System.in);

    // ArrayList bidimensional para almacenar los nombres de los alumnos.
    static ArrayList<ArrayList<String>> alumnos = new ArrayList<>();

    // Método para añadir un alumno a la lista.
    private static void añadirAlumno() {
        if (alumnos.size() < 30) {
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            ArrayList<String> nuevoAlumno = new ArrayList<>();
            nuevoAlumno.add(nombre); // Añade el nombre del alumno al ArrayList.
            alumnos.add(nuevoAlumno); // Añade el ArrayList del alumno a la lista principal.
            System.out.println(nombre + " ha sido añadido a la lista.");
        } else {
            System.out.println("La lista está llena. No se pueden añadir más alumnos.");
        }
    }

    // Método para eliminar un alumno de la lista.
    // Solicita el número (índice + 1) del alumno a eliminar.
    private static void eliminarAlumno() {
        System.out.print("Introduce el número del alumno a eliminar: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consume el salto de línea después de leer un número.
        if (numero > 0 && numero <= alumnos.size()) { // Verifica si el número es válido.
            String alumnoEliminado = alumnos.remove(numero - 1).get(0); // Elimina el alumno y obtiene su nombre.
            System.out.println(alumnoEliminado + " ha sido eliminado de la lista.");
        } else {
            System.out.println("Número de alumno no válido.");
        }
    }

    // Método para mostrar todos los alumnos en la lista.
    // Recorre la lista de alumnos y muestra cada uno con su índice.
    private static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("\nLa lista de alumnos está vacía.");
        } else {
            System.out.println("\nListado de alumnos DAM1:");
            for (int i = 0; i < alumnos.size(); i++) { // Itera sobre la lista de alumnos.
                System.out.println((i + 1) + "- " + alumnos.get(i).get(0)); // Muestra el índice y el nombre del alumno.
            }
        }
    }

    // Método para mostrar el menú y gestionar las opciones del usuario.
    public void mostrarMenu() {
        int opcion;
        do {
            // Imprime las opciones del menú.
            System.out.println("\nGestión de Alumnos DAM1");
            System.out.println("1- Añadir Alumno");
            System.out.println("2- Eliminar Alumno");
            System.out.println("3- Mostrar Alumnos");
            System.out.println("4- Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Consume el salto de línea después de leer un número.

            // Ejecuta la acción según la opción elegida.
            switch (opcion) {
                case 1: // Añadir alumno
                    añadirAlumno();
                    break;
                case 2: // Eliminar alumno
                    eliminarAlumno();
                    break;
                case 3: // Mostrar alumnos
                    mostrarAlumnos();
                    break;
                case 4: // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                default: // Opción no válida
                    System.out.println("Opción no válida.");
                    break;
            } // Fin del switch
        } while (opcion != 4); // Repite el menú hasta que el usuario elija "Salir".
    } // Fin del método mostrarMenu

    // Método principal que inicia el programa.
    public static void main(String[] args) {
        ListadoDAM_V2 app = new ListadoDAM_V2();
        app.mostrarMenu(); // Muestra el menú de gestión de alumnos.     
    } // Fin del método main
} // Fin de la clase ListadoDAM_V1