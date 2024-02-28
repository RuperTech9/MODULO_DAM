
package tema3.ejercicios;

/**
 *
 * @author alumno
 */
public class E09_TablaMultiplicar_WHILE {
    public static void main(String[] args) {
    // Declaración e inicialización de variables
    int numero = 7;
    int contador = 1;
    int resultado;

    //Salida de información
    System.out.println ("Tabla de multiplicar del " + numero);
    System.out.println (".............................. ");

    //Utilizamos ahora el bucle while

        while (contador <= 10){ //Establecemos la condición del bucle
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " +
            resultado);
            //Modificamos el valor de la variable contadora, para hacer que el
            //bucle pueda seguir iterando hasta llegar a finalizar
            contador++;
        }
    }
}

