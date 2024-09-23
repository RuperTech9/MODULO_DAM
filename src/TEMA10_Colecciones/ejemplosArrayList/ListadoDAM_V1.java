
package TEMA10_Colecciones.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ListadoDAM_V1 {
    // Inicializo Objeto Scanner
    static Scanner sc = new Scanner(System.in);

    // ATRIBUTOS
    static ArrayList<String> alumnos = new ArrayList<>(); // ArrayList para almacenar los nombres de los alumnos.
    
    // METODO para añadir alumno
    private static void añadirAlumno() {
        if (alumnos.size() < 30) {
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            alumnos.add(nombre);
            System.out.println(nombre + " ha sido añadido a la lista.");
        } else {
            System.out.println("La lista está llena. No se pueden añadir más alumnos.");
        }
    }

    // METODO para eliminar alumno
    private static void eliminarAlumno() {
        System.out.print("Introduce el número del alumno a eliminar: ");
        int numero = sc.nextInt();
        if (numero > 0 && numero <= alumnos.size()) {
            String alumnoEliminado = alumnos.remove(numero - 1);
            System.out.println(alumnoEliminado + " ha sido eliminado de la lista.");
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
                System.out.println((i + 1) + "- " + alumnos.get(i));
            }
        }
    }
    
    /*
    private static void añadirNotaAlumno() {
        System.out.print("Introduce el número del alumno a quien quieres añadir una nota: ");
        int indice = sc.nextInt() - 1;
        sc.nextLine(); // Consume el salto de línea
        if (indice >= 0 && indice < alumnos.size()) {
            System.out.print("Introduce la nota: ");
            String nota = sc.nextLine();
            String alumnoConNota = alumnos.get(indice) + ", Nota: " + nota;
            alumnos.set(indice, alumnoConNota); // Actualiza el alumno con su nota
            System.out.println("Nota añadida.");
        } else {
            System.out.println("Número de alumno no válido.");
        }
    }
    */
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nGestión de Alumnos DAM1");
            System.out.println("1- Añadir Alumno");
            System.out.println("2- Eliminar Alumno");
            System.out.println("3- Mostrar Alumnos");
            System.out.println("4- Salir");
            System.out.print("Elige una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea después de leer un número.

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
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            } // FIN SWITCH
        } while (opcion != 4); // FIN DO-WHILE
    } // FIN METODO
    
    // METODO MAIN
    public static void main(String[] args) {
        ListadoDAM_V1 app = new ListadoDAM_V1();
        app.mostrarMenu();      
    } // FIN MAIN
} // FIN CLASE