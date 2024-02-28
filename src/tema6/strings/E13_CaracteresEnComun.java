
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E13_CaracteresEnComun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca dos cadenas
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();
        
        // Crear un StringBuilder para almacenar los caracteres en común
        StringBuilder caracteresEnComun = new StringBuilder();
        
        // Recorrer cada carácter de la primera cadena
        for (int i = 0; i < cadena1.length(); i++) {
            char caracterCadena1 = cadena1.charAt(i);
            
            // Verificar si el carácter ya está en la cadena de caracteres en común
            if (caracteresEnComun.toString().indexOf(caracterCadena1) != -1) {
                continue; // Si ya está, continuar con el siguiente carácter
            }
            
            // Recorrer cada carácter de la segunda cadena
            for (int j = 0; j < cadena2.length(); j++) {
                char caracterCadena2 = cadena2.charAt(j);
                
                // Si se encuentra un carácter en común, añadirlo a la cadena de resultado
                if (caracterCadena1 == caracterCadena2) {
                    caracteresEnComun.append(caracterCadena1);
                    break; // Romper el bucle interno para evitar repeticiones
                }
            }
        }
        
        // Mostrar los caracteres en común
        System.out.println("Caracteres en común: " + caracteresEnComun.toString());
    }
}