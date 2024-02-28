
package tema7.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Ruper
 */
public class Ej_06_DivisionV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador = 0, denominador = 0;
        double resultado;
        boolean entradaValida = false;

        // Solicitar el numerador
        do {
            try {
                System.out.print("Introduce el numerador (entero natural): ");
                numerador = scanner.nextInt();
                
                if (numerador < 0) {
                    throw new IllegalArgumentException("La división no corresponde con números enteros");
                }
                
                entradaValida = true;
            } catch (InputMismatchException ime) {
                System.err.println("Dato erróneo (formato incorrecto del parámetro). Introduce un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
            }
        } while (!entradaValida);

        // Reiniciar la bandera para el denominador
        entradaValida = false;

        // Solicitar el denominador
        do {
            try {
                System.out.print("Introduce el denominador (entero natural): ");
                denominador = scanner.nextInt();
                
                if (denominador == 0) {
                    throw new IllegalArgumentException("Divisor por cero es incorrecto");
                }
                
                if (denominador < 0) {
                    throw new IllegalArgumentException("La división no corresponde con números enteros");
                }
                
                if (numerador % 2 != 0 && denominador == 2) {
                    throw new IllegalArgumentException("La división de un número impar entre 2 no es exacta");
                }
                
                entradaValida = true;
            } catch (InputMismatchException ime) {
                System.err.println("Dato erróneo (formato incorrecto del parámetro). Introduce un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());
            }
        } while (!entradaValida);

        // Calcular y mostrar el resultado
        resultado = numerador / (double) denominador;
        System.out.printf("El resultado de la división es: %.2f\n", resultado);
    }
}
