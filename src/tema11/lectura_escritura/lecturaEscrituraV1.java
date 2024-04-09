
package tema11.lectura_escritura;

import java.io.*;
import java.util.Scanner;
/**
 * Lee un fichero de datos y lo muestra por pantalla
 * pregunta al usuario que dato quiere escribir
 * y lo añade al final del fichero en una nueva linea.
 * 
 * @author alumno
 */
public class lecturaEscrituraV1 {
    public static void main(String[] args) {
        // Ruta del fichero
        String rutaFichero = ".\\src\\tema11\\escribir\\prueba.txt";
        
        BufferedReader br = null;
        PrintWriter pw = null;

        // Primero, leemos y mostramos el contenido del fichero
        System.out.println("\nContenido del fichero:");
        File fichero = new File(rutaFichero);
        try {
            br = new BufferedReader(new FileReader(fichero));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Luego, preguntamos al usuario qué dato quiere escribir
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce un nuevo dato:");
        String dato = sc.nextLine();
        sc.close();

        // Finalmente, escribimos el dato al final del fichero
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(rutaFichero, true)));
            pw.println(dato);
            System.out.println("\nSe ha añadido el dato al fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

        // Mostramos el contenido actualizado del fichero
        System.out.println("\nContenido actualizado del fichero:");
        try {
            br = new BufferedReader(new FileReader(fichero));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}