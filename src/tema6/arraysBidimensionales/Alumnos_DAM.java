
package tema6.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumnos_DAM {  
        
    static String[] asignaturas = {"Programación", "Base de Datos", "FOL", "Sistemas Informáticos", "Entornos de Desarrollo"};
    static String[][] alumnos = {
        asignaturas, // Primer alumno tiene todas las asignaturas
        {"Programación", "Base de Datos", "Sistemas Informáticos", "Entornos de Desarrollo"}, // Segundo alumno tiene FOL convalidado
        {"Programación", "Base de Datos"} // Tercer alumno solamente tiene Programación y Base de Datos
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Alumnos:");
            System.out.println("1- Mostrar todas las asignaturas de cada alumno.");
            System.out.println("2- Mostrar las asignaturas de un alumno concreto.");
            System.out.println("3- Mostrar las asignaturas de los alumnos repetidores.");
            System.out.println("4- Salir.");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarTodasLasAsignaturas();
                    break;
                case 2:
                    System.out.print("Introduce el número del alumno (1-3): ");
                    int numAlumno = scanner.nextInt();
                    mostrarAsignaturasAlumno(numAlumno);
                    break;
                case 3:
                    mostrarAsignaturasRepetidores();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void mostrarTodasLasAsignaturas() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (String asignatura : alumnos[i]) {
                System.out.println(" - " + asignatura);
            }
        }
    }

    private static void mostrarAsignaturasAlumno(int numAlumno) {
        if (numAlumno >= 1 && numAlumno <= alumnos.length) {
            System.out.println("Asignaturas del Alumno " + numAlumno + ":");
            for (String asignatura : alumnos[numAlumno - 1]) {
                System.out.println(" - " + asignatura);
            }
        } else {
            System.out.println("Número de alumno no válido.");
        }
    }
    
    private static void mostrarAsignaturasRepetidores() {
        System.out.println("Asignaturas de los alumnos repetidores:");
        for (int i = 0; i < alumnos.length; i++) {
            // Si el alumno tiene menos de 5 asignaturas, es repetidor.
            // Si el alumno tiene 5 asignaturas, pero no tiene "FOL", también es repetidor.
            if (alumnos[i].length < 5 || (alumnos[i].length == 5 && !tieneFOLConvalidado(alumnos[i]))) {
                System.out.println("Alumno " + (i + 1) + ":");
                for (String asignatura : alumnos[i]) {
                    System.out.println(" - " + asignatura);
                }
            }
        }
    }

    // Método auxiliar para verificar si el array de asignaturas de un alumno contiene "FOL"
    private static boolean tieneFOLConvalidado(String[] asignaturasAlumno) {
        for (String asignatura : asignaturasAlumno) {
            if (asignatura.equals("FOL")) {
                return true;
            }
        }
        return false;
    }

    
}
