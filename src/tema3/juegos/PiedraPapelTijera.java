
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class PiedraPapelTijera {
    public static void main(String[] args) {
        String[] elecciones = {"piedra", "papel", "tijera"};
        Scanner teclado = new Scanner(System.in);

        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.print("Elige (piedra, papel, tijera): ");
        String eleccionUsuario = teclado.nextLine().toLowerCase();

        int indiceEleccionComputadora = (int) (Math.random() * 3);
        String eleccionComputadora = elecciones[indiceEleccionComputadora];

        System.out.println("Computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("Empate.");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                   (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                   (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }
    }
}