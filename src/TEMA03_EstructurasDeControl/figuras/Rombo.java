
package TEMA03_EstructurasDeControl.figuras;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Rombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el diámetro del rombo: ");
        int diametro = teclado.nextInt();
        System.out.print("Introduce el símbolo para el rombo: ");
        String simbolo = teclado.next();
        
        int mitad = diametro / 2;
        for (int i = 0; i < diametro; i++) {
            int espacios = Math.abs(mitad - i);
            int simbolos = diametro - 2 * espacios;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < simbolos; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }


    }
}