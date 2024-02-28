
package tema3.actividades;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A09_PersonasMayoresDe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menorQue18 = 0;
        int mayorQue65 = 0;
        int entre18Y65 = 0;
        int numero;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i + ":");
            numero = teclado.nextInt();

            // Contar los números en cada rango
            if (numero < 18) {
                menorQue18++;
            } else if (numero > 65) {
                mayorQue65++;
            } else {
                entre18Y65++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de personas menores que 18: " + menorQue18);
        System.out.println("Cantidad de personas mayores que 65: " + mayorQue65);
        System.out.println("Cantidad de personas entre 18 y 65: " + entre18Y65);

    }
    
}
