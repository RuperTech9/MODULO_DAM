
package examen3Evaluacion;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Ruper
 */
public class RepuestosAutomoviles {
    private static final String RUTA_FICHERO = ".\\src\\examen3Evaluacion\\ficheros\\repuestos.txt";

    public static void main(String[] args) {
        /* Implementamos un mapa con un TreeSet que mantiene un orden basado en los códigos */
        Map<String, Integer> existencias = new TreeMap<>();
        leerExistenciasDesdeFichero(existencias);

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("1. Alta producto");
                System.out.println("2. Baja producto");
                System.out.println("3. Cambio stock de producto");
                System.out.println("4. Listar existencias");
                System.out.println("5. Salir");
                System.out.print("\nIntroducir opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();  // Consumir el salto de línea

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Código producto: ");
                        String codigo = scanner.nextLine();
                        /* Antes de dar de alta un código debemos asegurarnos de que no existe, ya que machacaría su valor: */
                        if (!existencias.containsKey(codigo)) {
                            existencias.put(codigo, 0);
                        } else {
                            System.out.println("El producto ya existe");
                        }
                    }
                    case 2 -> {
                        System.out.print("Código producto: ");
                        String codigo = scanner.nextLine();
                        existencias.remove(codigo);
                    }
                    case 3 -> {
                        System.out.print("Código producto: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Nuevo stock: ");
                        int stock = scanner.nextInt();
                        existencias.put(codigo, stock);
                    }
                    case 4 -> {
                        System.out.println(existencias);
                    }
                    case 5 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Opción no válida. Introduce un número entre 1 y 5.");
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("ERROR. Entrada no válida, inténtalo de nuevo.");
                scanner.nextLine(); // Consumir el salto de línea
            }
        } while (opcion != 5);

        guardarExistenciasEnFichero(existencias);
    }

    private static void leerExistenciasDesdeFichero(Map<String, Integer> existencias) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("::");
                String codigo = partes[0];
                int stock = Integer.parseInt(partes[1]);
                existencias.put(codigo, stock);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado. Se creará uno nuevo al guardar.");
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            System.err.println("Error al procesar el archivo: " + ex.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }

    private static void guardarExistenciasEnFichero(Map<String, Integer> existencias) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(RUTA_FICHERO));
            for (Entry<String, Integer> entry : existencias.entrySet()) {
                bw.write(entry.getKey() + "::" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException ex) {
            System.err.println("Error al escribir el archivo: " + ex.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.err.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
