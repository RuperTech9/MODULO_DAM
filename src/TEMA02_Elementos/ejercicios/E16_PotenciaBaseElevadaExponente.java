
package TEMA02_Elementos.ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que visualice en pantalla la potencia de un una base elevada a un exponente. 
 * Ambos datos se pedirán a través de teclado. 
 * @author Ruper
 */
public class E16_PotenciaBaseElevadaExponente {
    
    public static double funcion(int base, int exponente){
        return Math.pow(base, exponente);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario la base y el exponente
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();

        // Calcular la potencia utilizando Math.pow
        double resultado = funcion(base,exponente);

        // Mostrar el resultado
        System.out.printf("El resultado de %d elevado a %d es: %.2f\n", base, exponente, resultado);

    }
}
