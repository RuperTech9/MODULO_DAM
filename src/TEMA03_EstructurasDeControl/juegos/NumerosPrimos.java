
package TEMA03_EstructurasDeControl.juegos;

/**
 *
 * @author Ruper
 */
public class NumerosPrimos {
     public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            //Si el número es divisible por 2 (o cualquier otro número hasta la mitad de su valor), 
            //entonces tiene más de dos divisores y no es primo. 
            //Si el número no es divisible por ningún número en ese rango, entonces es primo.
            }
        }
        return true;
    }
}
