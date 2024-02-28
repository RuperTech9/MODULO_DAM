
package tema7.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Ej_06_DivisionV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador, denominador;
        double resultado;

        try {
            System.out.print("Introduce el numerador (entero natural): ");
            numerador = scanner.nextInt();
            
            // Verifica si el numerador es negativo
            if (numerador < 0) {
                throw new IllegalArgumentException("La división no corresponde con números enteros");
            }

            System.out.print("Introduce el denominador (entero natural): ");
            denominador = scanner.nextInt();
            
            // Verifica si el denominador es cero
            if (denominador == 0) {
                throw new IllegalArgumentException("Divisor por cero es incorrecto");
            }
            // Verifica si el denominador es negativo
            if (denominador < 0) {
                throw new IllegalArgumentException("La división no corresponde con números enteros");
            }
            // Verifica si el numerador es impar y el denominador es 2
            if (numerador % 2 != 0 && denominador == 2) {
                throw new IllegalArgumentException("La división de un número impar entre 2 no es exacta");
            }

            resultado = numerador / (double) denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException ime) {
            System.err.println("Dato erróneo (formato incorrecto del parámetro)");
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        } finally {
            scanner.close();
        }
    }
}