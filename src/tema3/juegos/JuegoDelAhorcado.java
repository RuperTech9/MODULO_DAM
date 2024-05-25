
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class JuegoDelAhorcado {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra o frase: ");

        String palabra = sc.nextLine();
        char[] palabraGuiones = guionesFromPalabra(palabra);
        boolean juegoTerminado = false;
        int intentos = 7;

        do {
            impresion(intentos);
            System.out.println("\nTe quedan " + intentos + " intentos");
            System.out.println(String.valueOf(palabraGuiones));
            System.out.println("\nIntroduce una letra: ");
            char letra = sc.next().charAt(0);
            boolean letraAcertada = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    letraAcertada = true;
                }
            }

            if (!letraAcertada) {
                System.out.println("No has acertado ninguna letra");
                --intentos;
                if (intentos <= 0) {
                    System.out.println("\nGAME OVER has perdido, ya no tienes más intentos");
                    System.out.println("    -----   ");
                    System.out.println("    |   |   ");
                    System.out.println("    |   |   ");
                    System.out.println("    |   0   ");
                    System.out.println("    |  /|\\ ");
                    System.out.println("    |   |   ");
                    System.out.println("    |  / \\ ");
                    System.out.println("    |       ");
                    System.out.println("    |       ");
                    System.out.println("    |       ");
                    System.out.println("    |       ");
                    System.out.println("------------");
                    juegoTerminado = true;
                }
            } else {
                boolean juegoGanado = !hayGuiones(palabraGuiones);
                if (juegoGanado) {
                    System.out.println("Enhorabuena!! Has ganado el juego");
                    juegoTerminado = true;
                }
            }
        } while (!juegoTerminado);
    }

    static char[] guionesFromPalabra(String palabra) {
        int letrasPalabra = palabra.length();
        char[] palabraGuiones = new char[letrasPalabra];

        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_';
        }
        return palabraGuiones;
    }


    static boolean hayGuiones(char[] array) {
        for (char l : array) {
            if (l == '_') {
                return true;
            }
        }
        return false;
    }

    static void impresion(int intentos) {
        switch (intentos) {
            case 7:
                System.out.println("");
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 6:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 5:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |  /    ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 4:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |  /|   ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 3:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |  /|\\ ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 2:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |  /|\\ ");
                System.out.println("    |   |   ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 1:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |  /|\\ ");
                System.out.println("    |   |   ");
                System.out.println("    |  /    ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
            case 0:
                System.out.println("    -----   ");
                System.out.println("    |   |   ");
                System.out.println("    |   |   ");
                System.out.println("    |   0   ");
                System.out.println("    |  /|\\ ");
                System.out.println("    |   |   ");
                System.out.println("    |  / \\ ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("    |       ");
                System.out.println("------------");
                break;
        }
    }
}