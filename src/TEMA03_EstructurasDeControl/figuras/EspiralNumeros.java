
package TEMA03_EstructurasDeControl.figuras;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class EspiralNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el tamaño del lado de la espiral: ");
        int n = teclado.nextInt();
        int[][] espiral = new int[n][n];
        int valor = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (valor <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                espiral[minRow][i] = valor;
                valor++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                espiral[i][maxCol] = valor;
                valor++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol; i--) {
                espiral[maxRow][i] = valor;
                valor++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                espiral[i][minCol] = valor;
                valor++;
            }
            minCol++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(espiral[i][j] + "\t");
            }
            System.out.println();
        }

    }
}