
package tema6.strings;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E11_CambioMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca una línea de texto
        System.out.println("Introduce una línea de texto:");
        String texto = scanner.nextLine();
        
        // Variables para almacenar el texto convertido y el conteo de cambios
        StringBuilder textoConvertido = new StringBuilder();
        int conteoCambios = 0;
        
        // Recorrer cada carácter del texto original
        for (char caracter : texto.toCharArray()) {
            // Verificar si el carácter es una letra mayúscula
            if (Character.isUpperCase(caracter)) {
                textoConvertido.append(Character.toLowerCase(caracter));
                conteoCambios++;
            }
            // Verificar si el carácter es una letra minúscula
            else if (Character.isLowerCase(caracter)) {
                textoConvertido.append(Character.toUpperCase(caracter));
                conteoCambios++;
            }
            // Si no es una letra, añadir el carácter sin cambios
            else {
                textoConvertido.append(caracter);
            }
        }
        
        // Mostrar el texto convertido y el número de cambios realizados
        System.out.println("Texto convertido: " + textoConvertido.toString());
        System.out.println("Número de cambios realizados: " + conteoCambios);
    }
}