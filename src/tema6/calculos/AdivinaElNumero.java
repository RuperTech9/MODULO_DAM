
package tema6.calculos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce el numero inicial del rango: ");
            int inicio = scanner.nextInt();
            System.out.print("Introduce el numero final del rango: ");
            int fin = scanner.nextInt();
            System.out.print("Introduce el numero de intentos: ");
            int intentos = scanner.nextInt();

            int aciertos = 0;
            int fallos = 0;
            int[] soluciones = new int[intentos]; // Almacenar los números solución

            for (int i = 0; i < intentos; i++) {
                int numeroAleatorio = inicio + random.nextInt(fin - inicio + 1);
                soluciones[i] = numeroAleatorio; // Guardar la solución actual
                System.out.print("¿Qué numero estoy pensando? : ");
                int respuesta = scanner.nextInt();

                if (respuesta == numeroAleatorio) {
                    System.out.println("Has acertado!!");
                    aciertos++;
                } else {
                    System.out.println("No has acertado");
                    fallos++;
                }
            }

            // Mostrar resultados
            System.out.print("Has acertado " + aciertos + " veces y has fallado " + fallos + " veces. Eran solución: ");
            for (int solucion : soluciones) {
                System.out.print(solucion + " ");
            }
            System.out.println();

            // Preguntar si quiere jugar de nuevo
            System.out.print("Quieres probar otra vez ? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false; // Terminar el juego
            }
        }

        System.out.println("Adiós");
    }
}