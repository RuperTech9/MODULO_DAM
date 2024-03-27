
package examen2Evaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Descripción breve de la clase.
 * Detalles adicionales si es necesario.
 *
 * @author Ruper
 */
public class ESTRUCTURA_CODIGO_2 {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        ESTRUCTURA_CODIGO_2 programa = new ESTRUCTURA_CODIGO_2();
        programa.iniciar();
    }

    /**
     * Método para iniciar la ejecución del programa.
     */
    public void iniciar() {
        mostrarMenu();
    }

    /**
     * Muestra el menú y procesa las opciones elegidas por el usuario.
     */
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = "MENU\n" +
                            "---------------------------------------------------------------\n" +
                            "Opciones:\n" +
                            "1. -------\n" +
                            "2. -------\n" +
                            "3. -------\n" +
                            "4. -------\n" +
                            "5. Salir";
        
        int opcion = 0;
        
        do {
            System.out.println(MENU);
            System.out.print("Selecciona una opción: ");
            opcion = obtenerOpcion(sc);
            
            switch (opcion) {
                case 1:
                    // Lógica para la opción 1
                    break;
                case 2:
                    // Lógica para la opción 2
                    break;
                case 3:
                    // Lógica para la opción 3
                    break;
                case 4:
                    // Lógica para la opción 4
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
    }

    /**
     * Obtiene una opción válida del usuario.
     * 
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @return La opción seleccionada por el usuario.
     */
    private int obtenerOpcion(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Descarta la entrada incorrecta
            }
        }
    }
}