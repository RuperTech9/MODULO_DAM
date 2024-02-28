
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class DistanciaDosPuntos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las coordenadas del primer punto (x1 y y1): ");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        
        System.out.println("Introduce las coordenadas del segundo punto (x2 y y2): ");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.printf("La distancia entre los puntos es: %.2f\n", distancia);

    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    /*
     public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return raizCuadrada(cuadrado(deltaX) + cuadrado(deltaY));
    }

    // Método para calcular el cuadrado de un número
    public static double cuadrado(double valor) {
        return valor * valor;
    }

    // Método para calcular la raíz cuadrada utilizando el método de Babilonia (método de Herón)
    public static double raizCuadrada(double valor) {
        double t;
        double raizCuadrada = valor / 2;
        do {
            t = raizCuadrada;
            raizCuadrada = (t + (valor / t)) / 2;
        } while ((t - raizCuadrada) != 0);
        return raizCuadrada;
    }
    */
}