
package TEMA03_EstructurasDeControl.figuras;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo: ");
        int altura = teclado.nextInt();
        System.out.print("Introduce el símbolo para el triángulo: ");
        String simbolo = teclado.next();

        for (int i = 0; i < altura; i++) {
            // Imprimo espacios en blanco para alinear el símbolo
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimo el símbolo
            for(int j=0;j<2*i+1;j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}