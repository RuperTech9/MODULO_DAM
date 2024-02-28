
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Diptongo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = teclado.nextLine().toLowerCase();

        int contadorDiptongos = contarDiptongos(palabra);
        System.out.println("Número de diptongos en la palabra: " + contadorDiptongos);
    }

    public static int contarDiptongos(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length() - 1; i++) {//-1 para que el bucle se pare antes del último carácter, ya que siempre se verifica un par de caracteres
            if (esDiptongo(palabra.charAt(i), palabra.charAt(i + 1))) {
                contador++;
            //llamo a la función esDiptongo, si devuelve true, incremento el contador.
            }
        }
        return contador;
    }

    public static boolean esDiptongo(char c1, char c2) {
        String[] diptongos = {"ai", "au", "ei", "eu", "oi", "ou", "ia", "ie", "io", "iu", "ua", "ue", "uo", "ui"}; //Todos los diptongos
        String par = "" + c1 + c2;//combinación de dos caracteres
         for (int i = 0; i < diptongos.length; i++) {// si i es 0, diptongos[i] sería "ai"
            if (diptongos[i].equals(par)) {
                return true;//c1 y c2 juntos forman uno de los diptongos
            }
        }
        return false;
    }
}
