
package TEMA03_EstructurasDeControl.ejercicios;

/**
 *
 * @author alumno
 */
public class E06_CONTINUE {
    public static void main(String[] args) {
        int numero = 7;
        int contador;
        int resultado;

        //Salida de información
        System.out.println ("Tabla de multiplicar del " + numero);
        System.out.println (".............................. ");

        //Utilizamos ahora el bucle for
        for (contador=1; contador<=10;contador++){        
            if (contador==7)
                break;//Rompe el bucle
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
        
        //Utilizamos ahora el bucle for
        System.out.println ("Tabla de multiplicar del " + numero);
        System.out.println (".............................. ");
        for (contador=1; contador<=10;contador++){        
            if (contador==7)
                continue;//Pasa a la siguiente iteración
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
    } 
}
