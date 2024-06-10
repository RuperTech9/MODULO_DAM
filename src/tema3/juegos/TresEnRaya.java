
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class TresEnRaya {
    private static char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char jugadorActual = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            imprimirTablero();
            hacerMovimiento(scanner);
            juegoTerminado = verificarGanador() || tableroLleno();
            cambiarJugador();
        }
        scanner.close();
    }

    private static void imprimirTablero() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private static void hacerMovimiento(Scanner scanner) {
        int fila, columna;
        while (true) {
            System.out.println("Jugador " + jugadorActual + ", introduce fila y columna (separados por un espacio):");
            fila = scanner.nextInt();
            columna = scanner.nextInt();
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                break;
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }
    }

    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    private static boolean verificarGanador() {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                imprimirTablero();
                System.out.println("Jugador " + jugadorActual + " gana!");
                return true;
            }
        }
        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                imprimirTablero();
                System.out.println("Jugador " + jugadorActual + " gana!");
                return true;
            }
        }
        // Verificar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            imprimirTablero();
            System.out.println("Jugador " + jugadorActual + " gana!");
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            imprimirTablero();
            System.out.println("Jugador " + jugadorActual + " gana!");
            return true;
        }
        return false;
    }

    private static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        imprimirTablero();
        System.out.println("¡Es un empate!");
        return true;
    }
}