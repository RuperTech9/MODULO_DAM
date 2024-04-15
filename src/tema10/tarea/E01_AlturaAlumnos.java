
package tema10.tarea;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E01_AlturaAlumnos {
    static Scanner sc = new Scanner(System.in);
    
    // Método para pedir el número de alumnos
    public static int numeroAlumnos() {
        int numero;
        do{
            try {
                System.out.print("Ingrese el número de alumnos: ");
                numero = sc.nextInt();
                if (numero > 0){
                    break;
                } else {
                    System.err.println("Introduce un número mayor que 0");
                }
                
            } catch (Exception e) {
                System.err.println("ERROR: Introduce un número válido.");
                sc.next(); // Salto de línea
            }
        } while (true);
        return numero;
    }

    // Método para leer las alturas de los alumnos
    public static ArrayList<Double> leerAlturas(int numAlumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        for (int i = 0; i < numAlumnos; i++) {
            double altura;
            do {
                try {
                    System.out.print("Ingrese la altura del alumno " + (i + 1) + ": ");
                    altura = sc.nextDouble();
                    if (altura > 0){
                        break;
                    } else {
                        System.err.println("Introduce una altura mayor que 0");
                }
                    
                } catch (Exception e){
                    System.err.println("ERROR: Introduce una altura válida.");
                    sc.next(); // Salto de línea
                }
            } while(true);
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
    
    public static void datos() {
        int numAlumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        double media = calcularMedia(alturas);
        mostrarResultados(alturas, media);
    }
    
    
    public static void main(String[] args) {
        datos();
    }
}

