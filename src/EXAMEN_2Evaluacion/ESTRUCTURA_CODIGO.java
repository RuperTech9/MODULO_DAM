
package EXAMEN_2Evaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ESTRUCTURA_CODIGO {
    // ATRIBUTOS

    // CONSTRUCTOR
    
    // METODOS PRIVADOS

    // METODOS PUBLICOS

    // METODO MENU TRATANDO LAS EXCEPCIONES
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        String menu = "MENU" +
                      "\n---------------------------------------------------------------" +
                      "\nOpciones:" +
                      "\n1. -------" +
                      "\n2. -------" +
                      "\n3. -------" +
                      "\n4. -------" +
                      "\n5. Salir";
        
        // MANEJO LAS EXCEPCIONES
        int opcion = 0;
        
        do {
            System.out.println(menu);
            System.out.print("Selecciona una opción: ");
            while (true) {
                try {
                    opcion = sc.nextInt();
                    break; // Sal del bucle si se recibe un entero
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número válido.");
                    sc.next(); // Descarta la entrada incorrecta
                    System.out.print("Selecciona una opción: ");
                }
            }
            try {
                switch (opcion) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, por favor intenta nuevamente.");
                sc.nextLine(); // Descarta la entrada incorrecta para evitar bucles infinitos
            }
        } while (opcion != 5);
    }
    
    public static void main(String[] args){
        // OBJETO
        // LLAMADA A METODO mostrarMenu
    } // FIN MAIN
} // FIN CLASE