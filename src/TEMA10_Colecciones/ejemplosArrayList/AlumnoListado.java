
package TEMA10_Colecciones.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class AlumnoListado {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    private static void añadirAlumno() {
        if (alumnos.size() < 30) {
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            alumnos.add(new Alumno(nombre));
            System.out.println(nombre + " ha sido añadido a la lista.");
        } else {
            System.out.println("La lista está llena. No se pueden añadir más alumnos.");
        }
    }

    private static void añadirNotaAlumno() {
        System.out.print("Introduce el número del alumno a quien quieres añadir una nota: ");
        int indice = sc.nextInt() - 1;
        if (indice >= 0 && indice < alumnos.size()) {
            System.out.print("Introduce la nota: ");
            double nota = sc.nextDouble();
            alumnos.get(indice).añadirNota(nota);
            System.out.println("Nota añadida a " + alumnos.get(indice).getNombre());
        } else {
            System.out.println("Número de alumno no válido.");
        }
    }

    private static void eliminarAlumno() {
        System.out.print("Introduce el número del alumno a eliminar: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consume el salto de línea
        if (numero > 0 && numero <= alumnos.size()) {
            Alumno alumnoEliminado = alumnos.remove(numero - 1);
            System.out.println(alumnoEliminado.getNombre() + " ha sido eliminado de la lista.");
        } else {
            System.out.println("Número de alumno no válido.");
        }
    }

    private static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
        } else {
            System.out.println("Listado de alumnos DAM1:");
            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println((i + 1) + "- " + alumnos.get(i).getNombre() + ", Notas: " + alumnos.get(i).mostrarNotas());
            }
        }
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nGestión de Alumnos DAM1");
            System.out.println("1- Añadir Alumno");
            System.out.println("2- Añadir Nota a Alumno");
            System.out.println("3- Eliminar Alumno");
            System.out.println("4- Mostrar Alumnos");
            System.out.println("5- Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1:
                    añadirAlumno();
                    break;
                case 2:
                    añadirNotaAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarAlumnos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}