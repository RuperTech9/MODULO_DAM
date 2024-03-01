
package tema6.tarea6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NotasAlumnosV3 {
    private static final int NUM_ALUMNOS = 10;
    private String[] nombres;
    private int[] notas;
    private int numAlumnos;

    public NotasAlumnosV3() {
        nombres = new String[NUM_ALUMNOS];
        notas = new int[NUM_ALUMNOS];
        numAlumnos = 0;
    }

    private void ordenarAlumnosPorNombre() {
        for (int i = 0; i < numAlumnos - 1; i++) {
            for (int j = 0; j < numAlumnos - i - 1; j++) {
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {
                    intercambiar(j, j + 1);
                }
            }
        }
    }

    private void ordenarAlumnosPorNota() {
        for (int i = 0; i < numAlumnos - 1; i++) {
            for (int j = 0; j < numAlumnos - i - 1; j++) {
                if (notas[j] < notas[j + 1]) {
                    intercambiar(j, j + 1);
                }
            }
        }
    }

    private void intercambiar(int i, int j) {
        String tempNombre = nombres[i];
        nombres[i] = nombres[j];
        nombres[j] = tempNombre;

        int tempNota = notas[i];
        notas[i] = notas[j];
        notas[j] = tempNota;
    }

    private int obtenerNotaValida(Scanner scanner) {
        int nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.print("Introduce la nota de programación del alumno nuevo (0-10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opción no válida. Introduce un número entero.");
                scanner.next(); // Descarta la entrada incorrecta
                System.out.print("Introduce la nota de programación del alumno nuevo (0-10): ");
            }
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("La nota debe estar entre 0 y 10.");
            }
        }
        return nota;
    }

    public void añadirAlumno(String nombre, int nota) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre del alumno no puede estar vacío.");
            return;
        }
        if (numAlumnos >= nombres.length) {
            String[] nombresTemp = new String[numAlumnos + 1];
            int[] notasTemp = new int[numAlumnos + 1];

            System.arraycopy(nombres, 0, nombresTemp, 0, nombres.length);
            System.arraycopy(notas, 0, notasTemp, 0, notas.length);

            nombres = nombresTemp;
            notas = notasTemp;
        }

        nombres[numAlumnos] = nombre;
        notas[numAlumnos] = nota;
        numAlumnos++;
        System.out.println("Alumno añadido: " + nombre + ", Nota: " + nota);
    }

    public void mostrarAlumnosOrdenNombre() {
        ordenarAlumnosPorNombre();
        System.out.println("Lista de alumnos ordenados alfabéticamente:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(nombres[i] + ": " + notas[i]);
        }
    }

    public void mostrarAlumnosOrdenNota() {
        ordenarAlumnosPorNota();
        System.out.println("Lista de alumnos ordenados por nota de programación (mayor a menor):");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(nombres[i] + ": " + notas[i]);
        }
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opciones:\n"
                + "1. Listado de alumnos ordenados alfabéticamente\n"
                + "2. Listado de alumnos por nota de programación\n"
                + "3. Añadir un nuevo alumno\n"
                + "4. Salir");
        int opcion;
        do {
            System.out.print("Elige una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opción no válida. Introduce un número.");
                scanner.next();
                System.out.print("Elige una opción: ");
            }
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mostrarAlumnosOrdenNombre();
                    break;
                case 2:
                    mostrarAlumnosOrdenNota();
                    break;
                case 3:
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Introduce el nombre del alumno nuevo: ");
                    String nombre = scanner.nextLine();
                    if (nombre == null || nombre.trim().isEmpty()) {
                        System.out.println("No se ha ingresado un nombre válido.");
                        break;
                    }
                    int nota = obtenerNotaValida(scanner);
                    añadirAlumno(nombre, nota);
                    break;
                case 4:
                    System.out.println("Has salido...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        NotasAlumnosV3 app = new NotasAlumnosV3();
        app.mostrarMenu();
    }  }