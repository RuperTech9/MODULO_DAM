
package tema11.escribir;

import java.io.*;
import java.util.Scanner;
/**
 * Lee un fichero de datos y lo muestra por pantalla
 * pregunta al usuario que dato quiere escribir
 * y lo añade al final del fichero en una nueva linea
 * 
 * @author alumno
 */
public class lecturaEscritura {
    public static void main(String[] args) {
        // Ruta del fichero
        String rutaFichero = ".\\src\\tema11\\escribir\\prueba.txt";

        // Primero, leemos y mostramos el contenido del fichero
        System.out.println("\nContenido del fichero:");
        File fichero = new File(rutaFichero);
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Luego, preguntamos al usuario qué dato quiere escribir
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce un nuevo dato:");
        String dato = sc.nextLine();
        sc.close();

        // Finalmente, escribimos el dato al final del fichero
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(rutaFichero, true)))) {
            pw.println(dato);
            System.out.println("\nSe ha añadido el dato al fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mostramos el contenido actualizado del fichero
        System.out.println("\nContenido actualizado del fichero:");
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}