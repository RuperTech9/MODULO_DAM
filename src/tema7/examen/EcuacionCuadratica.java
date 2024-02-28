
package tema7.examen;

/**
 *
 * @author Ruper
 */
public class EcuacionCuadratica {
    public static void resolverEcuacion(double a, double b, double c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Soluciones: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        resolverEcuacion(1, -3, 2); // Soluciones reales
        resolverEcuacion(1, 2, 5); // Sin soluciones reales
    }
}