
package tema3.juegos;

/**
 *
 * @author Ruper
 */
import java.util.Scanner;

public class RuletaRusa {

    private static String jugador1;
    private static String jugador2;
    private static Scanner teclado = new Scanner(System.in);
    private static int parti = 1;
    private static int resPerdi = 1;
    private static int resTotal = 0;

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("|             RULETA RUSA            |");
        System.out.println("======================================");
        System.out.println("");

        System.out.print("Ingrese el nombre del jugador 1: ");
        jugador1 = teclado.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        jugador2 = teclado.nextLine();

        int opc;
        do {
            System.out.println("           Orden del Juego");
            System.out.println("1. inicia primer partida del jugador 1");
            System.out.println("2. inicia primer partida del segundo 2");
            System.out.println("3. inicio segunda partida del jugador 1");
            System.out.println("4. inicio segunda partida del jugador 2");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("***********************************************");
                    System.out.println("        PRIMER JUEGO DEL PRIMER JUGADOR");
                    System.out.println("***********************************************");
                    System.out.println("");

                    System.out.println("   ************************");
                    System.out.println("   |   Jugador   " + jugador1 + "  |");
                    System.out.println("   ************************");
                    System.out.println("");
                    disparo();
                    break;
                // Aquí puedes agregar los casos para 2, 3, 4 si lo necesitas
            }
        } while (resPerdi != 0);
    }

    private static void disparo() {
        System.out.println("Partida número # " + parti);
        parti++;

        for (int part = 1; part <= 8; part++) {
            System.out.println("");
            System.out.println("Intento # " + part);
            System.out.println("");
            int num = (int) (Math.random() * 8) + 1;
            int numVerificar = (int) (Math.random() * 4) + 1;
            System.out.println("Posición " + num);

            if (num != numVerificar) {
                int nAzar = (int) (Math.random() * 10) + 1;
                System.out.println("Puntos obtenidos: " + nAzar);
                resTotal += nAzar;
            }

            if (num == numVerificar) {
                resPerdi = 0;
                System.out.println(" ========================================");
                System.out.println(" |              Perdiste                |");
                System.out.println(" |         Posición de la bala: " + numVerificar + " |");
                System.out.println(" ========================================");

                System.out.println("Puntos: " + resPerdi);
                System.out.println("");
                teclado.nextLine(); // Espera a que el usuario presione una tecla
                break;
            }
        }

        System.out.println("");
    }
}
