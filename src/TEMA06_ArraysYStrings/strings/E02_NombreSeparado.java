
package TEMA06_ArraysYStrings.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E02_NombreSeparado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un nombre
        System.out.print("Por favor, introduce un nombre: ");
        String nombre = scanner.nextLine();
        
        // Inicializar una variable para almacenar el nombre con espacios
        StringBuilder nombreConEspacios = new StringBuilder();
        
        // Recorrer cada carácter del nombre
        for (int i = 0; i < nombre.length(); i++) {
            // Añadir el carácter actual y un espacio al StringBuilder
            nombreConEspacios.append(nombre.charAt(i)).append(" ");
        }
        
        // Mostrar el nombre con las letras separadas por espacios
        System.out.println("Nombre con letras separadas: " + nombreConEspacios.toString());
    }
}