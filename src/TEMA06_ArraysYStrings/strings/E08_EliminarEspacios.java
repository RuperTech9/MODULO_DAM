
package TEMA06_ArraysYStrings.strings;

/**
 *
 * @author Ruper
 */
public class E08_EliminarEspacios {
   public static void main(String[] args) {
        // Cadena de ejemplo. Puedes modificarla para probar con diferentes entradas.
        String cadenaOriginal = "Esta es una cadena con espacios";
        
        // Eliminar los espacios en blanco de la cadena
        String cadenaSinEspacios = cadenaOriginal.replace(" ", "");
        
        // Mostrar la cadena original y la cadena sin espacios en blanco
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena sin espacios en blanco: " + cadenaSinEspacios);
    }
}