
package TEMA03_EstructurasDeControl.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A07_CalificacionLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String calificacion;
        System.out.println("Ingrese las calificaciones con las letras I, F, B, N, S (en mayúsculas o minúsculas):");
        
        while(true){//CUIDADO: bucle infinito sin salida
        calificacion  = teclado.nextLine();
        int notaNumerica = convertirCalificacion(calificacion);
            if (notaNumerica != -1) {
                System.out.println("La calificación numérica para " + calificacion.toUpperCase() + " es: " + notaNumerica);
                break;//el break se ejecuta cuando el usuario introduce una calificación válida, lo que permite salir del bucle infinito.
            } else {
                System.out.println("La calificación '" + calificacion + "' no es válida. Ingrese una calificación válida.");
            }
        }
    }

    private static int convertirCalificacion(String calificacion) {
        switch (calificacion.toUpperCase()) {
            case "I":
                return 4;
            case "F":
                return 5;
            case "B":
                return 6;
            case "N":
                return 8;
            case "S":
                return 9;
            default:
                return -1;
        }
    }
    
}
