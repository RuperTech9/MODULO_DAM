
package tema7.excepciones;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Ej_06_DivisionMejoradaV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador = 0, denominador = 0;
        double resultado;
        
        // Solicitar el numerador
        numerador = solicitarNumero(scanner, "Introduce el numerador (entero natural): ");
        
        // Solicitar el denominador
        denominador = solicitarNumero(scanner, "Introduce el denominador (entero natural, no cero): ");
        
        // Calcular y mostrar el resultado
        resultado = numerador / (double) denominador;
        System.out.printf("El resultado de la división es: %.2f\n", resultado);
    }
    
    private static int solicitarNumero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print(mensaje);
                String entrada = scanner.nextLine();
                
                // Verificar si la entrada es vacía
                if (entrada.isEmpty()) {
                    throw new Ej_06_NumeroNaturalException("Se esperaba un número, pero no se recibió ninguna entrada.");
                }
                
                numero = Integer.parseInt(entrada);
                
                // Verificar condiciones específicas para el denominador
                if (mensaje.contains("denominador") && numero == 0) {
                    throw new IllegalArgumentException("Divisor por cero es incorrecto.");
                }
                
                if (numero < 0) {
                    throw new Ej_06_NumeroNaturalException("La división no corresponde con números enteros.");
                }
                
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.err.println("Dato erróneo (formato incorrecto del parámetro). Introduce un número entero.");
            } catch (Ej_06_NumeroNaturalException | IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        } while (!entradaValida);
        
        return numero;
    }
}
