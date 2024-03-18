
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ListadoDAM_V4 {
     static Scanner sc = new Scanner(System.in);

    // ATRIBUTOS
    static ArrayList<ArrayList<String>> alumnos = new ArrayList<>(); // Array en 2 dimensiones

    // METODO para añadir alumno
    private static void añadirAlumno() {
        if (alumnos.size() < 30) {
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            
            System.out.print("Introduce los apellidos del alumno: ");
            String apellidos = sc.nextLine();
            
            ArrayList<String> nuevoAlumno = new ArrayList<>();
            nuevoAlumno.add(nombre); // Añade el nombre del alumno al ArrayList interno
            nuevoAlumno.add(apellidos); // Añade los apellidos del alumno al ArrayList interno
            alumnos.add(nuevoAlumno); // Añade el ArrayList del alumno a la lista principal
            System.out.println(nombre + " " + apellidos + " ha sido añadido a la lista.");
        } else {
            System.out.println("La lista está llena. No se pueden añadir más alumnos.");
        }
    }

    // METODO para eliminar alumno
    public static void eliminarAlumno() {
        System.out.print("Introduce el número del alumno a eliminar: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consume el salto de línea
        if (numero > 0 && numero <= alumnos.size()) {
            ArrayList<String> alumnoEliminado = alumnos.remove(numero - 1);
            System.out.println(alumnoEliminado.get(0) + " " + alumnoEliminado.get(1) + " ha sido eliminado de la lista.");
        } else {
            System.out.println("Número de alumno no válido.");
        }
    }

    // METODO para mostrar alumnos
    private static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("\nLa lista de alumnos está vacía.");
        } else {
            System.out.println("\nListado de alumnos DAM1:");
            for (int i = 0; i < alumnos.size(); i++) {
                // Se muestra tanto el nombre como los apellidos del alumno
                System.out.println((i + 1) + "- " + alumnos.get(i).get(0) + " " + alumnos.get(i).get(1));
            }
        }
    }

    // METODO para mostrar el menú
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n1- Añadir Alumno.");
            System.out.println("2- Eliminar Alumno.");
            System.out.println("3- Mostrar Alumnos DAM1.");
            System.out.println("4- Salir.");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Salto de línea después de leer un número.
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entero");
                sc.nextLine(); // Salto de línea
                continue;
            }
            switch (opcion) {
                case 1:
                    añadirAlumno();
                    break;
                case 2:
                    eliminarAlumno();
                    break;
                case 3:
                    mostrarAlumnos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número entre 1 y 4.");
                    break;
            }
        } while (opcion != 4);
    }

    // METODO MAIN
    public static void main(String[] args) {
        ListadoDAM_V4 app = new ListadoDAM_V4();
        app.mostrarMenu();
    }
}