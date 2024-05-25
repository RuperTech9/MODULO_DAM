
package tema3.juegos;

import java.util.Scanner;

/**
 * Modificar el ejercicio C14 para que el programa indique al jugador 2 cuántas letras coinciden 
 * (son iguales y están en la misma posición) entre el texto introducido por él y el original.
 * 
 * @author Ruper
 */
public class JuegoAnagramaPistas {
    public static void main(String[] args) {
	String original;	//texto original que introduce el jugador 1
	String intento;		//intento de acertar la palabra original del jugador 2
	Scanner sc = new Scanner(System.in);
	do {
			System.out.println("Jugador 1. Introduzca una palabra: ");
			original = sc.next();
	}while (original.isEmpty());
		
	String anagrama = creaAnagrama(original);
	System.out.println("A qué palabra corresponde el anagrama: " +anagrama);
	do {
			System.out.println("Jugador 2. ¿Cuál es el original? ");
			intento = sc.next();
			System.out.println("Letras correctas: " +letrasCorrectas(original, intento));
	}while (!original.equals(intento));	//mientras no acierte el texto original
	System.out.println("Muy bien..."); 	//si salimos del bucle es que he acertado
    }
	
    //Comprueba cuantas letras coinciden (son iguales y ocupan la misma posición)entre las dos cadenas pasadas como parámetros.
    static int letrasCorrectas(String a, String b) {
	int longitudMinima = Math.min(a.length(), b.length());
	//usamos la longitud mínima de ambas cadenas para evitar extraer caracteres de más
	int contadorLetrasCorrectas = 0;
	for (int i=0; i < longitudMinima; i++) {	
            if (a.charAt(i) == b.charAt(i)){
		contadorLetrasCorrectas++;	
            }
	}
	return contadorLetrasCorrectas;
		
    }
	
    static String creaAnagrama(String original) {
	char anagrama[] = original.toCharArray();
	for (int numCambios=0; numCambios<anagrama.length; numCambios++) {
            //realizamos un intercambio al azar por cada carácter que forma el texto
            int i = (int) (Math.random() * anagrama.length); //índice al azar
            int j = (int) (Math.random() * anagrama.length); //índice al azar
            char aux = anagrama[i];	//intercambiamos anagrama [i] y anagram [j]
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
	}
	return String.valueOf(anagrama);	//devolvemos un String a partir de la tabla	
    }
}
