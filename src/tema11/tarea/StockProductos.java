
package tema11.tarea;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.io.*;
import java.time.LocalDate;


/**
 *
 * @author Ruper
 */
public class StockProductos {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Integer> existencias = new TreeMap<>();
    static String rutaStock = ".\\src\\tema11\\tarea\\stock.txt";
    static String rutaStockAntiguos = ".\\src\\tema11\\tarea\\stockAntiguos.txt";
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        leerExistenciasDesdeFichero(existencias);
        int opcion = 0;
        do {     
            try {
            String menu = "\n               STOCK PRODUCTOS" +
                          "\n---------------------------------------------------------" +
                          "\n1- Alta Producto" +
                          "\n2- Baja Producto" +
                          "\n3- Cambio stock de producto" +
                          "\n4- Listar existencias" +
                          "\n5- Salir" +
                          "\n---------------------------------------------------------" +
                          "\nSelecciona una opción: ";
            
            System.out.print(menu);
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea
            
                switch (opcion) {
                    case 1:
                        System.out.println("Código producto: ");
                        String codigo = sc.next();
                        if (!existencias.containsKey(codigo)){
                            existencias.put(codigo, 0);
                        } else {
                            System.out.println("El producto ya existe");
                        }
                        break;
                    case 2:
                        System.out.println("Código producto: ");
                        codigo = sc.next();
                        if (existencias.containsKey(codigo)) {
                            int stock = existencias.remove(codigo);
                            guardarProductoEnAntiguos(codigo, stock);
                        } else {
                            System.out.println("El producto no existe");
                        }
                        break;
                    case 3:
                        System.out.println("Código producto: ");
                        codigo = sc.next();
                        System.out.println("Nuevo stock: ");
                        int stock = sc.nextInt();
                        existencias.put(codigo, stock);
                        break;
                    case 4:
                        System.out.println(existencias);
                        break;
                    case 5:
                        System.out.println("\nSaliendo...");
                        break;
                    default:
                        System.err.println("\nOpción no válida. Introduce un número entre 1 y 5.");
                        break;
                } // FIN SWITCH
            } catch (InputMismatchException e) {
                System.err.println("ERROR. Entrada no válida, inténtalo de nuevo.");
                sc.nextLine(); // Salto de línea
            } // FIN TRY-CATCH
        } while (opcion != 5); // FIN DO-WHILE
        
        guardarExistenciasEnFichero(existencias);
    } // FIN METODO
    
    // Método para leer los datos de stock.txt
    private static void leerExistenciasDesdeFichero(Map<String, Integer> existencias) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rutaStock));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("::");
                String codigo = datos[0];
                int stock = Integer.parseInt(datos[1]);
                existencias.put(codigo, stock);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + rutaStock + " no se encontró.");
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close(); // Cerrar BufferedReader
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    // Método para guardar los datos de existencias en stock.txt
    private static void guardarExistenciasEnFichero(Map<String, Integer> existencias) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(rutaStock);
            pw = new PrintWriter(fw);
            // Escribir los datos de existencias en el archivo
            for (Map.Entry<String, Integer> entry : existencias.entrySet()) {
                pw.println(entry.getKey() + "::" + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + rutaStock + " no se encontró.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null)
                    pw.close(); // Cerrar PrintWriter
                if (fw != null)
                    fw.close(); // Cerrar FileWriter
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    // Método para guardar los productos eliminados en stockAntiguos.txt
    private static void guardarProductoEnAntiguos(String codigo, int stock) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(rutaStockAntiguos, true); // agregar nuevos productos al final del archivo sin eliminar la información existente
            pw = new PrintWriter(fw);
            // Escribir los datos del producto en el archivo stockAntiguos.txt
            pw.println(codigo + "::" + stock + "::" + LocalDate.now());
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + rutaStock + " no se encontró.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null)
                    pw.close(); // Cerrar PrintWriter
                if (fw != null)
                    fw.close(); // Cerrar FileWriter
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
