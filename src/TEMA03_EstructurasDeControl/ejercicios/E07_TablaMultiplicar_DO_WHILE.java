
package TEMA03_EstructurasDeControl.ejercicios;

/**
 *
 * @author alumno
 */
public class E07_TablaMultiplicar_DO_WHILE {
    public static void main(String[] args) {
    // Declaración e inicialización de variables
    int numero = 7;
    int contador;
    int resultado;

    //Salida de información
    System.out.println ("Tabla de multiplicar del " + numero);
    System.out.println (".............................. ");

    //Utilizamos ahora el bucle while
    contador = 1; //inicializamos la variable contador
        
    do
       { //Establecemos la condición del bucle
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
            //Modificamos el valor de la variable contadora, para hacer que el
            //bucle pueda seguir iterando hasta llegar a finalizar
            contador++;
        } while (contador <= 10);
    }
}

