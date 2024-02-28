
package tema6.calculos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ApuestaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;
        int ganadas = 0, perdidas = 0;

        while (continuar) {
            int A, B;
            do {
                A = random.nextInt(10) + 1; // Generar un número entre 1 y 10 para A
                B = random.nextInt(10) + 1; // Generar un número entre 1 y 10 para B
            } while (A == B); // Repetir si A y B son iguales

            System.out.print("Apuestas por A o por B ? : ");
            String apuesta = scanner.next();

            System.out.println("A saca un " + A + " y B saca un " + B);
            if ((apuesta.equalsIgnoreCase("A") && A > B) || (apuesta.equalsIgnoreCase("B") && B > A)) {
                System.out.println("HAS GANADO!!!");
                ganadas++;
            } else {
                System.out.println("HAS PERDIDO!!!");
                perdidas++;
            }
            System.out.println("Llevas " + ganadas + " partidas ganadas y " + perdidas + " partidas perdidas");

            System.out.print("Quieres probar otra vez ? (S/N) : ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false; // Terminar el bucle si la respuesta no es "S"
            }
        }

        System.out.println("Adiós");
    }
}