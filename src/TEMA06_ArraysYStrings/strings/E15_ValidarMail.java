
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E15_ValidarMail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca un correo electrónico
        System.out.print("Por favor, introduce un correo electrónico para validar: ");
        String email = scanner.nextLine();
        
        // Llamar al método que verifica si el correo es válido
        boolean esValido = validarEmail(email);
        
        // Mostrar el resultado
        if (esValido) {
            System.out.println("El correo electrónico introducido es válido.");
        } else {
            System.out.println("El correo electrónico introducido NO es válido.");
        }
    }
    
    public static boolean validarEmail(String email) {
        // Verificar si el correo contiene "@" y "."
        int indiceArroba = email.indexOf("@");
        int indicePunto = email.lastIndexOf(".");
        
        // Verificar que "@" aparece antes del último "."
        if (indiceArroba < indicePunto && indiceArroba > 0 && indicePunto > indiceArroba + 1 && indicePunto < email.length() - 1) {
            return true;
        } else {
            return false;
        }
    }
}