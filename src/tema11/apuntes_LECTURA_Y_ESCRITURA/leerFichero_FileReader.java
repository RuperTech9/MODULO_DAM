
package tema11.apuntes_LECTURA_Y_ESCRITURA;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Ruper
 */
public class leerFichero_FileReader {
    public static void main(String[] args){
        FileReader entrada = null;
        
        try {
            entrada = new FileReader(".//src//tema11//apuntes_LECTURA_Y_ESCRITURA//ejemplo1.txt");
            
            int c; // Declaración de la variable dentro del bloque try
            
            while((c = entrada.read()) != -1){ // Lectura y comprobación dentro del bucle, -1 cuando llega al final
                char letra = (char) c;
                
                System.out.print(letra);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        } finally {
            try {
                if (entrada != null) {
                    entrada.close(); // Cerrar el FileReader si no es nulo
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
