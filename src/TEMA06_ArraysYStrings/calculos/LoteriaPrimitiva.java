
package TEMA06_ArraysYStrings.calculos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class LoteriaPrimitiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;

        while (continuar) {
            int[] numerosElegidos = new int[6];
            int[] combinacionGanadora = new int[6];
            int aciertos = 0;

            for (int i = 0; i < 6; i++) {
                System.out.print("Elige el numero " + (i + 1) + " : ");
                int numero = scanner.nextInt();

                // Comprobar que el número está en el rango y no está repetido
                while (numero < 1 || numero > 49 || contiene(numerosElegidos, numero)) {
                    System.out.println("Número no válido o repetido, elige otro.");
                    numero = scanner.nextInt();
                }
                numerosElegidos[i] = numero;
            }

            // Generar combinación ganadora sin repetidos
            for (int i = 0; i < 6; i++) {
                int numero;
                do {
                    numero = random.nextInt(49) + 1;
                } while (contiene(combinacionGanadora, numero));
                combinacionGanadora[i] = numero;
            }

            Arrays.sort(numerosElegidos);
            Arrays.sort(combinacionGanadora);

            System.out.println("Numeros Elegidos    : " + Arrays.toString(numerosElegidos));
            System.out.println("Combinación ganadora : " + Arrays.toString(combinacionGanadora));

            // Contar aciertos
            for (int i = 0; i < 6; i++) {
                if (contiene(combinacionGanadora, numerosElegidos[i])) {
                    aciertos++;
                }
            }

            System.out.println("Has acertado : " + aciertos + " números");

            System.out.print("Quieres probar otra vez ? (S/N) : ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false; // Terminar el juego si la respuesta no es "S"
            }
        }

        System.out.println("Adiós");
    }

    private static boolean contiene(int[] array, int valor) {
        for (int i : array) {
            if (i == valor) {
                return true;
            }
        }
        return false;
    }
}