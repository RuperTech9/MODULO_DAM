
package tema3.juegos;


/**
 *
 * @author Ruper
 */
public class Dados {
    public static void main(String[] args) {
        int resultadoDado = (int) (Math.random() * 6) + 1; 
        System.out.println("El dado ha caído en: " + resultadoDado);
    }
}