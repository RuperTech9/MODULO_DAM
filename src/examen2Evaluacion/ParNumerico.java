
package examen2Evaluacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ParNumerico {
    int negativo;
    int positivo;

    public ParNumerico(int negativo, int positivo) {
        this.negativo = negativo;
        this.positivo = positivo;
    }

    public int getNegativo() {
        return negativo;
    }

    public int getPositivo() {
        return positivo;
    }
}

class SumaNumerosNegativos {
    private ParNumerico[] pares = new ParNumerico[5];
    private Scanner scanner = new Scanner(System.in);

    public void introducirValoresArray() {
        System.out.println("Introduce 5 números negativos:");
        for (int i = 0; i < pares.length; i++) {
            int negativo = leerNumero(true);
            int positivo = leerNumero(false);
            pares[i] = new ParNumerico(negativo, positivo);
        }
    }

    private int leerNumero(boolean esNegativo) {
        while (true) {
            int numero = scanner.nextInt();
            if (esNegativo && numero < 0) return numero;
            if (!esNegativo && numero >= 0) return numero;
            System.out.println(esNegativo ? "Por favor, introduce un número negativo." : "Por favor, introduce un número positivo.");
        }
    }

    public void calcularMedia() {
        double suma = 0;
        for (ParNumerico par : pares) {
            suma += par.getNegativo() + par.getPositivo();
        }
        double media = suma / (pares.length * 2);
        System.out.printf("La media de los números es: %.2f%n", media);
    }

    public void calcularSuma() {
        int sumaNegativos = 0;
        int sumaPositivos = 0;
        for (ParNumerico par : pares) {
            sumaNegativos += par.getNegativo();
            sumaPositivos += par.getPositivo();
        }
        System.out.println("Suma de negativos: " + sumaNegativos);
        System.out.println("Suma de positivos: " + sumaPositivos);
        System.out.println("Suma total: " + (sumaNegativos + sumaPositivos));
    }

    public void mostrarArrayOrdenado() {
        int[] numeros = new int[pares.length * 2];
        for (int i = 0, j = 0; i < pares.length; i++) {
            numeros[j++] = pares[i].getNegativo();
            numeros[j++] = pares[i].getPositivo();
        }
        Arrays.sort(numeros);
        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(numeros));
    }

    public void ejecutarMenu() {
        System.out.println("""
                1- Introducir valores Array.
                2- Calcular la media.
                3- Calcular la suma.
                4- Mostrar el Array ordenado de menor a mayor.
                5- Salir.""");
        int opcion;
        do {
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> introducirValoresArray();
                case 2 -> calcularMedia();
                case 3 -> calcularSuma();
                case 4 -> mostrarArrayOrdenado();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        SumaNumerosNegativos programa = new SumaNumerosNegativos();
        programa.ejecutarMenu();
    }
}