
package tema11.apuntes_LECTURA_Y_ESCRITURA;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Ruper
 */
public class escribirFichero_FileWriter {
    public static void main(String[] args){
        String frase = "linea";
        try {
            FileWriter escritura = new FileWriter(".//src//tema11//apuntes_LECTURA_Y_ESCRITURA//ejemplo1.txt", true);
            
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));                
            }
            escritura.close(); // Cerrar el FileWriter después de escribir en el archivo.
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
