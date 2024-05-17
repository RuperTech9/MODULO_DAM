
package examen3Evaluacion.posiblesExamenes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ArchivoTexto {
    public static void main(String[] args) {
        ArrayList<String> lineas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce líneas de texto (escribe 'fin' para terminar):");
        String linea;
        while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
            lineas.add(linea);
        }

        // Escritura en archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\src\\examen3Evaluacion\\posiblesExamenes\\datos.txt"))) {
            for (String l : lineas) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Lectura del archivo
        System.out.println("Contenido del archivo 'datos.txt':");
        try (BufferedReader reader = new BufferedReader(new FileReader(".\\src\\examen3Evaluacion\\posiblesExamenes\\datos.txt"))) {
            String lineaLeida;
            while ((lineaLeida = reader.readLine()) != null) {
                System.out.println(lineaLeida);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}