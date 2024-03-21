
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AlturasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de alumnos
        int numAlumnos = numeroAlumnos(scanner);

        // Leer las alturas de los alumnos
        ArrayList<Double> alturas = leerAlturas(scanner, numAlumnos);

        // Calcular la media de las alturas
        double media = calcularMedia(alturas);

        // Mostrar las alturas y los resultados
        mostrarResultados(alturas, media);
    }

    // Método para pedir el número de alumnos
    public static int numeroAlumnos(Scanner scanner) {
        System.out.print("Ingrese el número de alumnos: ");
        return scanner.nextInt();
    }

    // Método para leer las alturas de los alumnos
    public static ArrayList<Double> leerAlturas(Scanner scanner, int numAlumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la altura del alumno " + (i + 1) + ": ");
            double altura = scanner.nextDouble();
            alturas.add(altura);
        }
        return alturas;
    }

    // Método para calcular la media de las alturas
    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.size();
    }

    // Método para mostrar las alturas y los resultados
    public static void mostrarResultados(ArrayList<Double> alturas, double media) {
        System.out.println("\nAlturas de los alumnos:");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i));
        }

        int masAltos = 0;
        int masBajos = 0;

        for (double altura : alturas) {
            if (altura > media) {
                masAltos++;
            } else if (altura < media) {
                masBajos++;
            }
        }
        System.out.println("\nNúmero de alumnos más altos que la media: " + masAltos);
        System.out.println("Número de alumnos más bajos que la media: " + masBajos);
    }
}

/*
Este programa solicita al usuario el número de alumnos, luego lee las alturas de los alumnos y las almacena en un ArrayList. 
Después calcula la media de las alturas y muestra cuántos alumnos tienen una altura superior e inferior a la media.
*/