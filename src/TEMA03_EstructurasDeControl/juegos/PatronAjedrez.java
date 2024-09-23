
package TEMA03_EstructurasDeControl.juegos;

/**
 *
 * @author Ruper
 */
public class PatronAjedrez {
    public static void main(String[] args) {
        char blanco = '■'; // Carácter para las casillas blancas
        char negro = '□'; // Carácter para las casillas negras
        int tamano = 8; // Tamaño del tablero de ajedrez

        for (int fila = 0; fila < tamano; fila++) {
            for (int columna = 0; columna < tamano; columna++) {
                // Alterna entre blanco y negro
                if ((fila + columna) % 2 == 0) {
                    System.out.print(blanco);
                } else {
                    System.out.print(negro);
                }
            }
            System.out.println();
        }
    }
}