
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ListadoDAM {
    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<ArrayList<String>> listaDAM1 = new ArrayList<>();
    
    
    //Me creo el array en 2 dimensiones
        

    private static void añadirAlumno(Scanner sc) {
        if (listaDAM1.size() < 30) {
            System.out.print("Introduce el nombre del alumno: ");
            String nombre = sc.nextLine();
            ArrayList<String> nuevoAlumno = new ArrayList<>();
            nuevoAlumno.add(nombre);
            listaDAM1.add(nuevoAlumno);
            sc.next();
            System.out.println(nombre + " ha sido añadido a la lista.");
        } else {
            System.out.println("La lista está llena. No se pueden añadir más alumnos.");
        }
    }
    
    
    public void eliminarAlumno(Scanner sc) {
        System.out.print("Introduce el número del alumno a eliminar: ");
        int numero = sc.nextInt();
        if (numero > 0 && numero <= listaDAM1.size()) {
            String alumnoEliminado = listaDAM1.remove(numero - 1).get(0);
            System.out.println(alumnoEliminado + " ha sido eliminado de la lista.");
        } else {
            System.out.println("Número de alumno no válido.");
        }
       
    }

    private static void mostrarAlumnos() {
        if (listaDAM1.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
        } else {
            System.out.println("Listado de alumnos DAM1:");
            for (int i = 0; i < listaDAM1.size(); i++) {
                System.out.println((i + 1) + "- " + listaDAM1.get(i).get(0));
            }
        }
    }
    
    // Método para mostrar el menú
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
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entero");
                sc.next(); // Descartar entrada incorrecta
                continue;
            }
            switch (opcion) {
                case 1:
                    añadirAlumno(sc);
                    break;
                case 2:
                    eliminarAlumno(sc);
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
    
    public static void main(String[] args){
        ListadoDAM app = new ListadoDAM();
        app.mostrarMenu();
    }
}
