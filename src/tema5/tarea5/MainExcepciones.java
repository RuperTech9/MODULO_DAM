
package tema5.tarea5;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class MainExcepciones {
    public static void main(String[] args) {
        Profesor profesor = null;
        Alumno alumno = null;
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            try {
                System.out.println("1) Introducir Profesor.");
                System.out.println("2) Introducir Alumno.");
                System.out.println("3) Imprimir profesor.");
                System.out.println("4) Imprimir alumno.");
                System.out.println("5) Salir.");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); // consumir el salto de línea

                switch (opcion) {
                    case 1:
                        // Introducir datos del profesor
                        profesor = introducirProfesor(scanner);
                        break;
                    case 2:
                        // Introducir datos del alumno
                        alumno = introducirAlumno(scanner);
                        break;
                    case 3:
                        // Imprimir datos del profesor
                        if (profesor != null) {
                            System.out.println(profesor);
                        } else {
                            System.out.println("No hay ningún profesor introducido.");
                        }
                        break;
                    case 4:
                        // Imprimir datos del alumno
                        if (alumno != null) {
                            System.out.println(alumno);
                        } else {
                            System.out.println("No hay ningún alumno introducido.");
                        }
                    break;
                    case 5:
                        // Salir
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: Debe introducir un número para seleccionar una opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            } catch (Exception e) {
                System.err.println("Error inesperado: " + e.getMessage());
            }
        } while (opcion != 5);
    }

    public static Profesor introducirProfesor(Scanner scanner) {
        Profesor profesor = null;
        boolean datosValidos = false;
        do {
            try {
                System.out.print("Introduce el nombre completo del profesor: ");
                String nombre = scanner.nextLine();
                System.out.print("Introduce el DNI del profesor: ");
                String dni = scanner.nextLine();
                System.out.print("Introduce la fecha de nacimiento (dd mm aaaa): ");
                String fechaStr = scanner.nextLine(); // Lee la fecha como una cadena

                // Divide la cadena en partes y convierte a enteros
                String[] partesFecha = fechaStr.split(" ");
                int dia = Integer.parseInt(partesFecha[0]);
                int mes = Integer.parseInt(partesFecha[1]);
                int año = Integer.parseInt(partesFecha[2]);

                System.out.print("Introduce la cuenta bancaria del profesor: ");
                String cuentaBancaria = scanner.nextLine();
                System.out.print("Introduce la nómina del profesor: ");
                double nomina = Double.parseDouble(scanner.nextLine());

                Fecha fechaNacimiento = new Fecha(dia, mes, año);
                profesor = new Profesor(nombre, fechaNacimiento, dni, cuentaBancaria, nomina);
                datosValidos = true;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: Formato de fecha incorrecto o entrada inválida.");
            } catch (Exception e) {
                System.err.println("Error al introducir el profesor: " + e.getMessage());
            }
        } while (!datosValidos);
        return profesor;
    }


    public static Alumno introducirAlumno(Scanner scanner) {
        Alumno alumno = null;
        boolean datosValidos = false;
        do {
            try {
                System.out.print("Introduce el nombre completo del alumno: ");
                String nombre = scanner.nextLine();
                System.out.print("Introduce el DNI del alumno: ");
                String dni = scanner.nextLine();
                System.out.print("Introduce la fecha de nacimiento (dd mm aaaa): ");
                String fechaStr = scanner.nextLine(); // Lee la fecha como una cadena

                // Divide la cadena en partes y convierte a enteros
                String[] partesFecha = fechaStr.split(" ");
                int dia = Integer.parseInt(partesFecha[0]);
                int mes = Integer.parseInt(partesFecha[1]);
                int año = Integer.parseInt(partesFecha[2]);

                Fecha fechaNacimiento = new Fecha(dia, mes, año);
                alumno = new Alumno(nombre, fechaNacimiento, dni);
                datosValidos = true;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: Formato de fecha incorrecto o entrada inválida.");
            } catch (Exception e) {
                System.err.println("Error al introducir el alumno: " + e.getMessage());
            }
        } while (!datosValidos);
        return alumno;
    }
}
