
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AlturasAlumnos {
    // OBJETO Scanner
    static Scanner sc = new Scanner(System.in);
    
    /*
    Método numeroAlumnos(): este método pide por teclado el número de
    alumnos de la clase y devuelve dicho número al programa principal.
    */
    // Método para pedir el número de alumnos
    public static int numeroAlumnos() {
        System.out.print("Ingrese el número de alumnos: ");
        int numero = sc.nextInt();
        return numero;
    }
    
    /*
    Método leerAlturas(): pide por teclado las alturas de los N alumnos y las
    almacena en el ArrayList. Este método recibe como parámetros el ArrayList
    inicialmente vacío y el número de alumnos a leer.
    */
    // Método para leer las alturas de los alumnos
    public static ArrayList<Double> leerAlturas(int numAlumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la altura del alumno " + (i + 1) + ": ");
            double altura = sc.nextDouble();
            alturas.add(altura);
        }
        return alturas;
    }
    
    /*
    Método calcularMedias(): calcula y devuelve la media de los alumnos de la
    clase. Este método recibe como parámetro el ArrayList con las alturas de todos
    los alumnos.
    */
    // Método para calcular la media de las alturas
    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.size();
    }
    
    /*
    Método mostrarResultados(): muestra por pantalla todas las alturas y
    calcula y muestra el número de alumnos con altura superior e inferior a la
    media. Recibe como parámetros el ArrayList con las alturas de todos los
    alumnos y la media calculada anteriormente.
    */
    
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
    
    public static void main(String[] args) {
        // Pedir el número de alumnos
        int numAlumnos = numeroAlumnos();
        // Leer las alturas de los alumnos
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        // Calcular la media de las alturas
        double media = calcularMedia(alturas);
        // Mostrar las alturas y los resultados
        mostrarResultados(alturas, media);
    }
}
/*
Este programa solicita al usuario el número de alumnos, luego lee las alturas de los alumnos y las almacena en un ArrayList. 
Después calcula la media de las alturas y muestra cuántos alumnos tienen una altura superior e inferior a la media.
*/