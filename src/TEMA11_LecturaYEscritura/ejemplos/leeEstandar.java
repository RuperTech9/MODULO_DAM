
package TEMA11_LecturaYEscritura.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alumno
 */
public class leeEstandar {
    public static void main(String[] args) {
        // Cadena donde iremos almacenando los caracteres que se escriban
        StringBuilder str = new StringBuilder();
        // Para leer la entrada estándar
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Por si ocurre una excepción ponemos el bloque try-cath
        try{
            // Mientras la entrada de terclado no sea Intro
             String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                // Añadir la línea leída a la cadena str
                str.append(line).append("\n");
            }
        }catch(IOException ex){
        System.out.println(ex.getMessage()); }
        // Escribir la cadena que se ha ido tecleando
        System.out.println("Cadena introducida: " + str);
    }
}