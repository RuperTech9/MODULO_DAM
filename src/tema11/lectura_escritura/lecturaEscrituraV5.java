
package tema11.lectura_escritura;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class lecturaEscrituraV5 {
    public static void main(String[] args) {
        // Ruta del fichero
        String rutaFichero = ".\\src\\tema11\\lectura_escritura\\prueba.txt";
        
        // ArrayList para almacenar el contenido del fichero
        ArrayList<String> lista = new ArrayList<>();
        
        // Primero, leemos y mostramos el contenido del fichero
        System.out.println("\nContenido del fichero:");
        File fichero = new File(rutaFichero);
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                lista.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Mostramos el contenido del ArrayList por pantalla
        System.out.println("\nContenido del ArrayList:");
        for (String linea : lista) {
            System.out.println(linea);
        }

        // Pedir datos
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce un nuevo dato:");
        String dato = sc.nextLine();
        sc.close();
        
        // Añadir Dato
        lista.add(dato);
       
        
        // Ordenar la lista en orden descendente
        Collections.sort(lista, Collections.reverseOrder());
        
        // ESCRIBIR 2 el dato al final del fichero sin sobreescribir
        FileWriter fw = null;
        try {
            fw = new FileWriter(rutaFichero);
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Imprimir ArrayList con Iterator
            Iterator<String> imprimir = lista.iterator();
            System.out.println("\nArrayList ordenado de forma descendente:");
            while(imprimir.hasNext()){
                bw.newLine();
                bw.write(imprimir.next());
            }
            bw.close();
            
            System.out.println("La cadena se ha escrito en el archivo.");
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        } finally {
            try {
                if (fw != null) {
                    fw.close(); // Cerrar el BufferedWriter
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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