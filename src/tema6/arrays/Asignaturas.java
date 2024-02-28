
package tema6.arrays;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Asignaturas {        
    public static void main(String[] args) {
        // Declarar el array de asignaturas y de notas
        String[] asignaturas = {"Programacion", "FOL", "Bases de Datos", "Lenguaje de Marcas", "Entornos de Desarrollo", "Sistemas Informaticos"};
        double[] notas = new double[asignaturas.length];
        
        // Entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las notas del primer trimestre:");
        for (int i = 0; i < asignaturas.length; i++) {
            // Pedir la nota hasta que esté entre 0 y 10
            do {
                System.out.println("Introduce la nota de " + asignaturas[i] + ": ");
                notas[i] = teclado.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);
            teclado.nextLine(); // Limpiar buffer del scanner
        }

        // Menú de opciones
        int opcion;
        do {
            System.out.println("""
                *******************************************************************************************************************
                ****  1- Media Obtenida. 
                ****  2- Numero de suspensos.                          
                ****  3- Mostrar suspensos.                               
                ****  4- Revisar suspensos                                                         
                ****  5- Salir.                                                                                                             
                ********************************************************************************************************************
                """);
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer del scanner

            switch (opcion) {
                case 1:
                    double media = mediaObtenida(notas);
                    System.out.println(String.format("La media obtenida es %.2f", media));
                    break;
                case 2:
                    System.out.println("Ha suspendido: " + numeroSuspensos(notas) + " asignaturas");
                    break;
                case 3:
                    mostrarSuspensos(asignaturas, notas);
                    break;
                case 4:
                    revisionSuspensos(asignaturas, notas);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0); // Salir del programa
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 5);
    }

    // Métodos auxiliares para realizar las operaciones solicitadas en el menú
    static double sumaNotas(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma;
    }

    static double mediaObtenida(double[] notas) {
        double suma = sumaNotas(notas);
        return suma / notas.length;
    }

    static int numeroSuspensos(double[] notas) {
        int suspensos = 0;
        for (double nota : notas) {
            if (nota < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    static void mostrarSuspensos(String[] asignaturas, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                System.out.println("Ha suspendido: " + asignaturas[i] + " nota: " + notas[i]);
            }
        }
    }

    static void revisionSuspensos(String[] asignaturas, double[] notas) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5 && notas[i] >= 4.5) {
                System.out.println("Ha realizado todas las tareas de " + asignaturas[i] + " ? (S/N)");
                String respuesta = teclado.nextLine();

                if (respuesta.equalsIgnoreCase("s")) {
                    notas[i] = 5.0;
                    System.out.println("Su nota ahora es: " + notas[i]);
                } else {
                    System.out.println("No se realizaron modificaciones en las notas.");
                }
            }
        }
    }
}
