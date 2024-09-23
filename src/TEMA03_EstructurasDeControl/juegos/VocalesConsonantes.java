
package TEMA03_EstructurasDeControl.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class VocalesConsonantes {
    public static boolean esVocal(char letra){
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || 
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            return true;
	} else {
            return false;
	}
    }
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        String frase;
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        
        
        System.out.println("Introduce una palabra: ");
        frase = teclado.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if(esVocal(letra)){
                contadorVocales++;  
            }else{
                contadorConsonantes++;
            }
        }
        System.out.println("Vocales: "+contadorVocales);
        System.out.println("Consonantes: "+contadorConsonantes);
    }
}
