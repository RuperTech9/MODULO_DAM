
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E01_NombreFormato {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca su nombre
        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        // Verificar que el nombre no esté vacío
        if (!nombre.isEmpty()) {
            // Convertir la primera letra a mayúscula y el resto a minúsculas
            String nombreFormateado = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
            
            // Mostrar el nombre formateado
            System.out.println("Tu nombre formateado es: " + nombreFormateado);
        } else {
            System.out.println("No has introducido un nombre válido.");
        }
    }
}