
package TEMA06_ArraysYStrings.tarea6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruper
 */
public class Cadena {
    // ATRIBUTOS
    private char[] cadena; // mejor control que con String así no tengo que estar convirtiendo
    private int tamaño;
    public static final String VOCALES = "AEIOUaeiouÁÉÍÓÚáéíóú"; // constante

    // CONSTRUCTOR
    public Cadena(String cadena) {
        this.cadena = cadena.toCharArray(); // lo convierto en char xa trabajar con la cadena a nivel de carácter
        this.tamaño = cadena.length();
    } // FIN CONSTRUCTOR

    // METODO que muestra la cadena
    public void escribirCadena() {
        JOptionPane.showMessageDialog(null, new String(cadena));
    } // FIN METODO

    // METODO que muestra la longitud de la cadena
    public int longitud() {
        return tamaño;
    } // FIN METODO

    // METDODO para copiar la cadena
    public char[] copiar() {
        return cadena.clone();
    }
     // FIN METODO
    
    // METDODO para verificar si es vocal
    private static boolean esVocal(char letra) {
        return VOCALES.indexOf(letra) != -1;
    } // FIN METODO
    
    // METODO para contar el número de vocales
    public int numeroVocales() {
        int contador = 0;
        for (char c : cadena) {
            if (esVocal(c)) {
                contador++;
            } // FIN IF
        } // FIN FOR
        return contador;
    } // FIN METODO
    
    // METODO para contar el número de vocales
    public int numeroConsonantes() {
        int contador = 0;
        for (char c : cadena) {
            if (Character.isLetter(c) && !esVocal(c)) { // Si el carácter se encuentra, devuelve el índice de la primera aparición. Si no se encuentra, devuelve -1.
                contador++;
            } // FIN IF
        } // FIN FOR
        return contador;
    } // FIN METODO
    
    // METODO para verificar si contiene una vocal 
    public boolean contieneVocal(char vocal) {
        char letraMinuscula = Character.toLowerCase(vocal); // Convertir el carácter para la comparación,
        char letraMayuscula = Character.toUpperCase(vocal);
        
        for (int i = 0; i < tamaño; i++) { // Recorro la cadena para verificar si contiene la vocal.
            if (cadena[i] == letraMinuscula || cadena[i] == letraMayuscula) { // Compruebo si el carácter es igual a la vocal en mayúscula o minúscula.
                return true;
            } // FIN IF
        } // FIN FOR
        return false; // Si se termina el bucle y no encuentra la vocal.
    } // FIN METODO

    // METODO para verificar si contiene una cadena
    public boolean contieneCadena(String subcadena) {
        return new String(cadena, 0, tamaño).contains(subcadena); // Si subcadena está presente en la cadena, contains devuelve true
    } // FIN METODO

    // METODO para convertir a mayúsculas
    public void convertirMayusculas() {
        for (int i = 0; i < this.tamaño; i++) {
            cadena[i] = Character.toUpperCase(cadena[i]);
        } // FIN FOR
    } // FIN METODO
    
    // METODO para eliminar vocales
    public void eliminarVocales() {
        int j = 0; // índice para el nuevo arreglo de caracteres que se está construyendo, el cual contendrá la cadena original pero sin las vocales.
        char[] sinVocales = new char[cadena.length];
        for (int i = 0; i < tamaño; i++) {
            if (!esVocal(cadena[i])) { // llama al método contieneVocal(cadena[i]) para cada carácter cadena[i].
                sinVocales[j++] = cadena[i];
            } // FIN IF
        } // FIN FOR
        tamaño = j; // nueva longitud de la cadena después de eliminar todas las vocales
        cadena = new char[j]; // Ajusta el tamaño del arreglo 'cadena' para que coincida con el nuevo tamaño
        System.arraycopy(sinVocales, 0, cadena, 0, j); // (j) número de elementos a copiar.
    } // FIN METODO
    
    // METODO para representar la cadena
    @Override
    public String toString() {
        return new String(cadena, 0, tamaño);
    } // FIN METODO
    
    //METODO para mostrar el menu y sus opciones
    public void mostrarMenu() {
        String menu = "Menu de opciones:\n"
                + "1. Mostrar cadena\n"
                + "2. Ver longitud de la cadena\n"
                + "3. Copiar cadena\n"
                + "4. Contar número de vocales\n"
                + "5. Contar número de consonantes\n"
                + "6. Verificar si contiene una vocal específica\n"
                + "7. Verificar si contiene una cadena específica\n"
                + "8. Convertir a mayúsculas\n"
                + "9. Eliminar vocales\n"
                + "0. Salir\n"
                + "\nElige una opción:";
                
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    escribirCadena();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La longitud de la cadena es: " + longitud());
                    break;
                case 3:
                    // Copiar la cadena y mostrar el resultado.
                    copiar();
                    JOptionPane.showMessageDialog(null, "Copia de la cadena: " + toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Número de vocales: " + numeroVocales());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Número de consonantes: " + numeroConsonantes());
                    break;
                case 6:
                    char vocal = JOptionPane.showInputDialog(null, "Introduce una vocal para buscar:").charAt(0);
                    if (Cadena.VOCALES.indexOf(vocal) == -1) {
                        // La entrada no es una vocal.
                        JOptionPane.showMessageDialog(null, "La letra " + vocal + " no es una vocal.");
                    } else {
                        JOptionPane.showMessageDialog(null, "La cadena " + (contieneVocal(vocal) ? "contiene" : "no contiene") + " la vocal " + vocal);
                    }
                    break;
                case 7:
                    String cadenaBusqueda = JOptionPane.showInputDialog(null, "Introduce una cadena para buscar:");
                    JOptionPane.showMessageDialog(null, "La cadena original " + (contieneCadena(cadenaBusqueda) ? "contiene" : "no contiene") + " la cadena " + cadenaBusqueda);
                    break;
                case 8:
                    convertirMayusculas();
                    JOptionPane.showMessageDialog(null, "La cadena en mayúsculas: " + toString());
                    break;
                case 9:
                    eliminarVocales();
                    JOptionPane.showMessageDialog(null, "La cadena sin vocales: " + toString());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Has salido...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción del menú.");
                    break;
            } // FIN SWITCH
        } while (opcion != 0); // FIN DO-WHILE
    } // FIN METODO
}
