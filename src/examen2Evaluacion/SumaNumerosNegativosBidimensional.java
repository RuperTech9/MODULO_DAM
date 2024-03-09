
package examen2Evaluacion;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class SumaNumerosNegativosBidimensional {
    int[][] numeros = new int[2][5];
    Scanner sc = new Scanner(System.in);
    boolean valoresIntroducidos = false;
    
    // METODO para introducir valores
    public void introducirValores() {
        for (int i = 0; i < numeros[0].length; i++) {
            try {
                System.out.print("Introduce un número negativo: ");
                int negativo = sc.nextInt();
                if (negativo >= 0) {
                    throw new NumeroNoNegativoException("El número debe ser negativo.");
                }
                System.out.print("Introduce un número positivo: ");
                int positivo = sc.nextInt();
                if (positivo <= 0) {
                    throw new NumeroNoPositivoException("El número debe ser positivo.");
                }
                numeros[0][i] = negativo; // Almacenar negativo en la primera fila
                numeros[1][i] = positivo; // Almacenar positivo en la segunda fila
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Descartar entrada incorrecta
            } catch (NumeroNoNegativoException | NumeroNoPositivoException e) {
                System.out.println(e.getMessage());
            }
        }
        valoresIntroducidos = true;
    }
    
    // METODO para calcular la suma
    public int calcularSuma() {
        if (!valoresIntroducidos) {
            System.out.println("Primero debes introducir los valores.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < numeros[0].length; i++) {
            suma += numeros[0][i] + numeros[1][i];
        }
        return suma;
    }
    
    // METODO para calcular la media
    public double calcularMedia() {
        if (!valoresIntroducidos) {
            System.out.println("Primero debes introducir los valores.");
            return 0;
        }
        int suma = calcularSuma(); // Reutilizar el método calcularSuma
        return (double) suma / (numeros[0].length + numeros[1].length);
    }

    
    // METODO para mostrar el array ordenado
    public void mostrarArrayOrdenado() {
        int[] todosLosNumeros = new int[numeros[0].length + numeros[1].length];
        System.arraycopy(numeros[0], 0, todosLosNumeros, 0, numeros[0].length);
        System.arraycopy(numeros[1], 0, todosLosNumeros, numeros[0].length, numeros[1].length);
        Arrays.sort(todosLosNumeros);
        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(todosLosNumeros));
    }
    
    // METODO para mostrar el menu
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n1- Introducir valores Array.");
            System.out.println("2- Calcular la media.");
            System.out.println("3- Calcular la suma.");
            System.out.println("4- Mostrar el Array ordenado de menor a mayor.");
            System.out.println("5- Salir.");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entre 1 y 5.");
                sc.next(); // Descartar entrada incorrecta
                continue;
            }
            switch (opcion) {
                case 1:
                    introducirValores();
                    break;
                case 2:
                    calcularMedia();
                    System.out.println("La media es: " + calcularMedia());
                    break;
                case 3:
                    calcularSuma();
                    System.out.println("La suma es: " + calcularSuma());
                    break;
                case 4:
                    mostrarArrayOrdenado();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número entre 1 y 5.");
                    break;
            }
        } while (opcion != 5);
    }
}