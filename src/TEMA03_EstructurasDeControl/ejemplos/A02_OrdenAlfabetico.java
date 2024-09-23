
package TEMA03_EstructurasDeControl.ejemplos;

import java.util.Scanner;

/**
 * Crear una pequeña aplicación Java que lea dos caracteres y nos diga si están en orden alfabético.
 * @author Ruper
 */
public class A02_OrdenAlfabetico {
    
    

    // Función para imprimir los caracteres en orden
    public static void enOrden (char letra1, char letra2){ 
        if (letra1 +1 == letra2 || letra2 +1 == letra1) {
            System.out.println("Están en orden alfabético"); 
        } else if (letra1 == letra2){
            System.out.println("Las letras son iguales");
        } else{
            System.out.println("No están en orden alfabético");
        }
    }
    
    public static void main(String args[]){
        char letra1;
        char letra2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una letra: ");
        letra1 = teclado.nextLine().toUpperCase().charAt(0);
        System.out.println("Introduzca otra letra: ");
        letra2 = teclado.nextLine().toUpperCase().charAt(0);
        
        
        enOrden(letra1, letra2);
        
        
    }
    
}