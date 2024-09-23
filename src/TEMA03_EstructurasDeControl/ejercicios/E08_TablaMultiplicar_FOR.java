
package TEMA03_EstructurasDeControl.ejercicios;

/**
 *
 * @author Ruper
 */
public class E08_TablaMultiplicar_FOR {
    public static void main(String[] args) {
        int numero = 7;
        int resultado;

        //Salida de información
        System.out.println ("Tabla de multiplicar del " + numero);
        System.out.println (".............................. ");

        //Utilizamos ahora el bucle for
        for (int contador=1; contador<=10;contador++){        
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
    }
}