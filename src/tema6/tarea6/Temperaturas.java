
package tema6.tarea6;

/**
 *
 * @author Ruper
 */
public class Temperaturas {
    private int maxima;
    private int minima;

    // Constructor
    public Temperaturas(int maxima, int minima) {
        this.maxima = maxima;
        this.minima = minima;
    }

    // Getters
    public int getMaxima() {
        return maxima;
    }

    public int getMinima() {
        return minima;
    }

    // Método para representar el objeto como String
    @Override
    public String toString() {
        return "(" + maxima + "º," + minima + "º)";
    }
}
