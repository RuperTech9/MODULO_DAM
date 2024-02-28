
package tema2.ejercicios;

import java.util.Scanner;

/**
 * Implementar una aplicación en Java que pase los grados Centigrados a grados Farenheit (multiplicar por 9 y dividir el resultado por 5, y por último paso sumarle 32).
 * ºF = ºC * (9/5) + 32
 * @author Ruper
 */
public class E08_ConvertirCentigradosFarenheit {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        double grados;
        double cambio;
        
        System.out.println("Introduzca los grados centigrados: ");
        grados = teclado.nextDouble();
        
        cambio = grados * (9/5) + 32;
        
        System.out.printf("\nLos %.2fº centigrados, al hacer la conversión son: %.2fº Farenheit",grados,cambio);
    }
}
