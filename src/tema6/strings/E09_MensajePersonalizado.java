
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E09_MensajePersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Por favor, introduce tus apellidos: ");
        String apellidos = scanner.nextLine();
        
        System.out.print("Por favor, introduce tu año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer después de leer un entero
        
        System.out.print("Por favor, introduce tu ciudad de residencia: ");
        String ciudadResidencia = scanner.nextLine();
        
        // Calcular la edad
        int edad = 2024 - anoNacimiento; // Considerando el año actual como 2023
        
        // Crear el mensaje personalizado
        String mensaje = "Hola, " + nombre + " " + apellidos + 
                         ". Tu edad es " + edad + " años y vives en " + ciudadResidencia + ".";
        
        // Mostrar el mensaje personalizado
        System.out.println(mensaje);
    }
}