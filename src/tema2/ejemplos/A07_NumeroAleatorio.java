
package tema2.ejemplos;

import java.util.Scanner;

/**
 * Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre que números queremos que los genere, podemos pedirlas por teclado antes de generar los números.
 * Este método devolverá un número entero aleatorio. Muestra estos números por pantalla.
 * @author Ruper
 */
public class A07_NumeroAleatorio {
    public static int aleatorio(int num1, int num2){        
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }
    
    public static void main(String[] args) {
        //Introducimos los datos necesarios
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que quieres mostrar");
        int cantidad=teclado.nextInt();
        System.out.println("Introduce el primer numero del rango");
        int num1=teclado.nextInt();
        System.out.println("Introduce el segundo numero del rango");
        int num2=teclado.nextInt();
        //generamos los numeros
        for(int i=0;i<cantidad;i++){
            System.out.println(aleatorio(num1, num2));
        }
    
    }
}
