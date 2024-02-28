
package tema3.ejemplos;

import java.util.Scanner;

/**
 * Crear una pequeña aplicación Java que lea un carácter y nos diga si está o no comprendido entre las letras I y M.
 * 
 * @author Ruper
 */
public class A03_RangoLetras {
    public static void rangoLetras(char caracter){
        if(caracter >= 'I' && caracter <= 'M') {
            System.out.println("El carácter '" + caracter + "' SI está comprendido entre las letras I y M.");
        } else {
            System.out.println("El carácter '" + caracter + "' NO está comprendido entre las letras I y M.");
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().toUpperCase().charAt(0); // Convertir a mayúscula para simplificar la comparación
        
        rangoLetras(caracter);
    }
}