
package tema11.ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 *
 * @author alumno
 */
public class TokenContarPalabrasyNumeros {
    public void contarPalabrasyNumeros(String nombre_fichero) {
        StreamTokenizer sTokenizer = null;
        int contapal = 0, numNumeros = 0;
        
        try {
            sTokenizer = new StreamTokenizer(new FileReader(".\\src\\tema11\\ejemplos\\prueba.txt"));
            while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {//indica que se ha llegado al fin del flujo de entrada.
            if (sTokenizer.ttype == StreamTokenizer.TT_WORD)//indica que el token es una palabra.
                contapal++;
            else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER)//indica que el token es un número.
                numNumeros++;
            }
            System.out.println("Número de palabras en el fichero: " + contapal);
            System.out.println("Número de números en el fichero: " + numNumeros);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage()) ;
        } catch (IOException ex) {
            System.out.println(ex.getMessage()) ;
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        new TokenContarPalabrasyNumeros().contarPalabrasyNumeros("c:\\datos.txt");
    }
}
