
package TEMA11_LecturaYEscritura.apuntes;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Ruper
 */
public class escribirFichero_BufferedWriter {
    public static void main(String[] args){
        String frase = "Hola";
        BufferedWriter escritura = null;
        
        try {
            escritura = new BufferedWriter(new FileWriter(".//src//TEMA11_LecturaYEscritura//apuntes//ejemplo1.txt", true));
            
            escritura.write(frase); // Escribir la cadena en el archivo
            
            System.out.println("La cadena se ha escrito en el archivo.");
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        } finally {
            try {
                if (escritura != null) {
                    escritura.close(); // Cerrar el BufferedWriter
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
