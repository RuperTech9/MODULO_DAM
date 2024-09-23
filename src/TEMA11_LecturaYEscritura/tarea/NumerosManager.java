
package TEMA11_LecturaYEscritura.tarea;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class NumerosManager {
    private static final String RUTA_NUMEROS = ".\\src\\tema11\\tarea\\numeros.txt";
    private static final String RUTA_PARES = ".\\src\\tema11\\tarea\\numerosPares.txt";
    private static final String RUTA_IMPARES = ".\\src\\tema11\\tarea\\numerosImpares.txt";
    private List<Numero> numeros = new ArrayList<>();

    public void leerNumerosDesdeFichero() {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_NUMEROS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int valor = Integer.parseInt(linea.trim());
                numeros.add(new Numero(valor));
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + RUTA_NUMEROS + " no se encontró.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void introducirNuevosNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nuevos números (escribe 'fin' para terminar):");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int valor = Integer.parseInt(entrada.trim());
                numeros.add(new Numero(valor));
            } catch (NumberFormatException e) {
                System.err.println("Entrada no válida. Por favor, introduce un número entero.");
            }
        }
    }

    public void guardarNumerosEnFichero() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(RUTA_NUMEROS))) {
            for (Numero numero : numeros) {
                pw.println(numero);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void distribuirNumeros() {
        try (PrintWriter pwPares = new PrintWriter(new FileWriter(RUTA_PARES));
             PrintWriter pwImpares = new PrintWriter(new FileWriter(RUTA_IMPARES))) {

            for (Numero numero : numeros) {
                if (numero.esPar()) {
                    pwPares.println(numero);
                } else {
                    pwImpares.println(numero);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
