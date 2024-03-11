package tema3.examen;

/*
Crear un procedimiento en java donde se le pase como argumentos el n de elementos que desae visualizar de la serie Fibonacci. 
La serie comenzara con los 2 ultimos numeros de tu DNI que seran definidos como constantes.

Ejemplo 1, 1
1,1,2,3,5,8,13,21,34,55,89,144....

Coeficientes a, b, c de una ecuacion de segundo grado, mostrando sus soluciones reales. Si no tiene soluciones reales(numeros complejos del determinante), se indicara mediante un texto abusivo a tal circustancia.
ax"2 + bx + c=0

Imprime por pantalla el abecedario español.
QAcabara con un punto(.)
Tendra las opciones M mayusculas m minusculas y S o s para salir
*/
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Abecedario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;

        System.out.print("Elige una opción ('M' Mayúsculas, 'm' minúsculas, 'S' para salir): ");
        opcion = teclado.nextLine();

        if (opcion.equalsIgnoreCase("M")) {
            // Abecedario en mayúsculas
            for (int i = 65; i <= 90; i++) { // Códigos ASCII de A-Z
                char letra = (char) i;
                System.out.print(letra);
                if (letra == 'N') {
                    System.out.print('Ñ'); // Añade la Ñ después de la N
                }
            }
            System.out.println("."); // Finalizar con un punto
        } else if (opcion.equalsIgnoreCase("m")) {
            // Abecedario en minúsculas
            for (int i = 97; i <= 122; i++) { // Códigos ASCII de a-z
                char letra = (char) i;
                System.out.print(letra);
                if (letra == 'n') {
                    System.out.print('ñ'); // Añade la ñ después de la n
                }
            }
            System.out.println("."); // Finalizar con un punto
        } else if (opcion.equalsIgnoreCase("S")) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}