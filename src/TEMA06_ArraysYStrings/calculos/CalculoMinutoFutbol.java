
package TEMA06_ArraysYStrings.calculos;

import java.util.Scanner;

/**
 * Supón que un partido de fútbol tiene una duración de 90 minutos. 
 * El minuto 1 se considera que abarca desde los 0 segundos hasta los 59 segundos. 
 * El minuto 2 abarca desde los 60 segundos hasta los 119 segundos. 
 * Así sucesivamente hasta el último minuto, que es el minuto 90 y abarca desde los 5340 segundos hasta los 5400 segundos. 
 * Crea un programa que pida al usuario el número de segundos transcurridos y 
 * mediante el uso de alguna función de redondeo (floor, ceil ó round) de la clase Math 
 * muestre el minuto en que nos encontramos. 
 * El programa debe pedir valores de segundos hasta que el usuario decida terminar.
 * @author Ruper
 */
public class CalculoMinutoFutbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Pedir al usuario que introduzca el número de segundos transcurridos
            System.out.print("Introduzca valor de segundos: ");
            int segundos = scanner.nextInt();

            // Calcular el minuto actual usando Math.ceil()
            int minuto = (int) Math.ceil(segundos / 60.0);

            // Mostrar el minuto
            System.out.println("El minuto es el " + minuto);

            // Preguntar al usuario si desea continuar
            System.out.print("¿Otro valor (s/n)? ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false; // Terminar el bucle si la respuesta no es "s"
            }
        }
    }
}
