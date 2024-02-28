
package tema3.actividades;

import java.util.Scanner;

/**
 * Actividad 12: Cálculo año bisiesto.
 * Estamos acostumbrados a considerar como años bisiestos, aquellos que son múltiplos de 4. La realidad es que aunque es una buena aproximación, no es
 * del todo precisa, ya que años como 1900 y como 2100 no fueron, ni serán, bisiesto respectivamente. Existe una explicación física que tiene que ver con
 * que el año del calendario no coincide exactamente, en duración, con el año solar. Así, un cálculo más exacto indica que la duración real de un año es de
 * 365,2425 días. Para corregir este desfase, se utiliza el criterio de que se considerará año bisiesto aquel que sea divisible por 4 pero no por 100 salvo
 * que sea divisible por 400. Por esto 1900 no es bisiesto, 1904 sí y 2000 también.
 * Se pide: crear un programa que pida por teclado un año y me indique si es bisiesto o no.
 * @author Ruper
 */
public class A12_AnioBisiesto {
    public static boolean esBisiesto(int num){
        return (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un año para verificar si es bisiesto:");

        int anio = teclado.nextInt();

        if (esBisiesto(anio)) {
            //Si el año es divisible por 4 y no por 100, o si es divisible por 400, entonces es un año bisiesto.
            System.out.println(anio + " SI es un año bisiesto.");
        } else {
            System.out.println(anio + " NO es un año bisiesto.");
        }
    }
}
