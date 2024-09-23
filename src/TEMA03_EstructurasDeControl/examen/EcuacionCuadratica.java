package TEMA03_EstructurasDeControl.examen;


import java.util.Scanner;



/**
 *
 * @author Ruper
 */
public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el coeficiente a: ");
        double a = teclado.nextDouble();
        System.out.print("Introduce el coeficiente b: ");
        double b = teclado.nextDouble();
        System.out.print("Introduce el coeficiente c: ");
        double c = teclado.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;
        double raizDiscriminante = Math.sqrt(discriminante);

        if (discriminante > 0) {
            double x1 = (-b + raizDiscriminante) / (2 * a);
            double x2 = (-b - raizDiscriminante) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones reales: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única solución real: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}