
package tema11.apuntes_LECTURA_Y_ESCRITURA;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Ruper
 */
public class leerFichero_BufferedReader {
    public static void main(String[] args){
        BufferedReader entrada = null;
        
        try {
            entrada = new BufferedReader(new FileReader(".//src//tema11//apuntes_LECTURA_Y_ESCRITURA//ejemplo1.txt"));
            String linea;
            while ((linea = entrada.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
