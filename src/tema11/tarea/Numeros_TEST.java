
package tema11.tarea;

/**
 *
 * @author Ruper
 */
public class Numeros_TEST {
    public static void main(String[] args) {
        NumerosManager manager = new NumerosManager();
        manager.leerNumerosDesdeFichero();
        manager.distribuirNumeros();
        System.out.println("Los números se han distribuido correctamente en pares.txt e impares.txt.");
    }
}
