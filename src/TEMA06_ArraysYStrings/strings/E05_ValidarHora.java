
package TEMA06_ArraysYStrings.strings;

/**
 *
 * @author Ruper
 */
public class E05_ValidarHora {
    public static void main(String[] args) {
        // Ejemplo de hora a validar
        String hora = "23:59";

        // Llamada al método que valida la hora
        boolean esValida = validarHora(hora);

        // Imprimir resultado
        if (esValida) {
            System.out.println(hora + " es una hora válida.");
        } else {
            System.out.println(hora + " NO es una hora válida.");
        }
    }
    
    public static boolean validarHora(String h) {
        // Verificar la longitud de la cadena
        if (h.length() != 5) return false;
        
        // Verificar que el tercer carácter es ':'
        if (h.charAt(2) != ':') return false;
        
        // Extraer horas y minutos como subcadenas
        String horasStr = h.substring(0, 2);
        String minutosStr = h.substring(3);
        
        // Verificar que horas y minutos son numéricos
        if (!horasStr.matches("\\d\\d") || !minutosStr.matches("\\d\\d")) return false;
        
        // Convertir horas y minutos a enteros
        int horas = Integer.parseInt(horasStr);
        int minutos = Integer.parseInt(minutosStr);
        
        // Verificar que las horas y minutos están en el rango correcto
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) return false;
        
        // Si todas las verificaciones son exitosas
        return true;
    }
}