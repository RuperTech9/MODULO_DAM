
package tema6.strings;

/**
 *
 * @author Ruper
 */
public class E07_SoloLetras {
    public static void main(String[] args) {
        // Cadena de ejemplo. Puedes modificarla para probar con diferentes entradas.
        String cadena = "Prueba Con Letras";
        
        // Llamar al método que verifica si la cadena solo contiene letras.
        boolean soloLetras = contieneSoloLetras(cadena);
        boolean soloLetras2 = contieneSoloLetrasSinEspacios(cadena);
        
        // Mostrar el resultado.
        if (soloLetras) {
            System.out.println("La cadena \"" + cadena + "\" solo contiene letras.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" contiene caracteres que no son letras.");
        }
        // Mostrar el resultado.
        if (soloLetras2) {
            System.out.println("La cadena \"" + cadena + "\" solo contiene letras.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" contiene caracteres que no son letras.");
        }
    }
    
    public static boolean contieneSoloLetras(String cadena) {
        // Recorrer cada carácter de la cadena.
        for (int i = 0; i < cadena.length(); i++) {
            // Si el carácter actual no es una letra, retornar false.
            if (!Character.isLetter(cadena.charAt(i))) {
                return false;
            }
        }
        // Si todos los caracteres son letras, retornar true.
        return true;
    }
    
    public static boolean contieneSoloLetrasSinEspacios(String cadena) {
        // Recorrer cada carácter de la cadena.
        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);
            // Si el carácter actual no es una letra y tampoco es un espacio, retornar false.
            if (!Character.isLetter(caracterActual) && caracterActual != ' ') {
                return false;
            }
        }
        // Si todos los caracteres son letras o espacios, retornar true.
        return true;
    }
}