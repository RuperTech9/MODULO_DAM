
package tema6.cadenas;

/**
 *
 * @author Ruper
 */
public class Cadena {
    private String cadena;
    private int tamaño;

    // Constructor que pide al usuario introducir una cadena de caracteres
    public Cadena(String cadena) {
        this.cadena = cadena;
        this.tamaño = cadena.length();
    }

    // Método para enviar el contenido de la cadena al monitor
    public void escribirCadena() {
        System.out.println(cadena);
    }

    // Método para retornar el número de caracteres que contiene la cadena
    public int longitud() {
        return tamaño;
    }

    // Método para copiar la cadena en otra cadena
    public String copiar() {
        return new String(cadena);
    }

    // Método para indicar el número de vocales que contiene la cadena
    public int numeroVocales() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char ch = cadena.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
               || ch == 'á' || ch == 'é' || ch == 'í' || ch == 'ó' || ch == 'ú') {
                contador++;
            }
        }
        return contador;
    }

    // Método para indicar si la cadena contiene una vocal específica
    public boolean contieneVocal(char vocal) {
        return cadena.toLowerCase().indexOf(Character.toLowerCase(vocal)) != -1;
    }

    // Método para indicar si la cadena contiene otra cadena
    public boolean contieneCadena(String otraCadena) {
        return cadena.contains(otraCadena);
    }

    // Método para convertir la cadena a mayúsculas
    public void convertirMayusculas() {
        cadena = cadena.toUpperCase();
    }

    // Método para eliminar las vocales de la cadena
    public void eliminarVocales() {
        cadena = cadena.replaceAll("[aeiouAEIOUáéíóúÁÉÍÓÚ]", "");
    }

    // Método para indicar si una palabra o frase se lee igual de derecha a izquierda y viceversa
    public boolean esPalindromo() {
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
        int n = cadenaSinEspacios.length();
        for (int i = 0; i < n / 2; i++) {
            if (cadenaSinEspacios.charAt(i) != cadenaSinEspacios.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
