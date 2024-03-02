
package tema6.tarea6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CadenaV2 {
    // ATRIBUTOS
    private char[] cadena; // mejor control que con String así no tengo que estar convirtiendo
    private int tamaño;
    public static final String VOCALES = "AEIOUaeiouÁÉÍÓÚáéíóú"; // constante

    // CONSTRUCTOR
    public CadenaV2(String cadena) {
        this.cadena = cadena.toCharArray(); // lo convierto en char xa trabajar con la cadena a nivel de carácter
        this.tamaño = cadena.length();
    } // FIN CONSTRUCTOR

    // METODO que muestra la cadena
    public void escribirCadena() {
        System.out.println(cadena);
    } // FIN METODO

    // METODO que muestra la longitud de la cadena
    public int longitud() {
        return tamaño;
    } // FIN METODO

    // METDODO para copiar la cadena
    public void copiar() {
        char[] copiaCadena = cadena.clone();
        System.out.println("Copia de la cadena: " + new String(copiaCadena));
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
    
    // METODO para verificar si la cadena es un palíndromo
    public boolean esPalindromo() {
        int izquierda = 0; // Inicio de la cadena
        int derecha = tamaño - 1; // Final de la cadena
        
        while (izquierda < derecha) {
            // Convertir caracteres a minúsculas antes de comparar
            char charIzquierda = Character.toLowerCase(cadena[izquierda]);
            char charDerecha = Character.toLowerCase(cadena[derecha]);
        
            // Comparar caracteres desde ambos extremos hacia el centro
            if (charIzquierda != charDerecha) {
                return false; // No es un palíndromo si algún par de caracteres no coincide
            }
            izquierda++; // Mover hacia el centro desde la izquierda
            derecha--; // Mover hacia el centro desde la derecha
        }
        return true; // Es un palíndromo si se cumple el bucle completo sin retornar false
    }
    
    // METODO para representar la cadena
    @Override
    public String toString() {
        return new String(cadena, 0, tamaño);
    } // FIN METODO
    
    // Método ajustado para usar System.out.println y Scanner
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in); // Inicializar Scanner para leer entrada del usuario
        
        String menu = "\nMenu de opciones:\n"
                + "1. Mostrar cadena\n"
                + "2. Ver longitud de la cadena\n"
                + "3. Copiar cadena\n"
                + "4. Contar número de vocales\n"
                + "5. Contar número de consonantes\n"
                + "6. Verificar si contiene una vocal específica\n"
                + "7. Verificar si contiene una cadena específica\n"
                + "8. Convertir a mayúsculas\n"
                + "9. Eliminar vocales\n"
                + "10. Verificar si es un palíndromo\n"
                + "0. Salir\n"
                + "\nElige una opción:";
                
        int opcion = -1; // Inicializar con un valor que no corresponda a ninguna opción válida.
        do {
            try{
                System.out.println(menu);
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea restante

                switch (opcion) {
                    case 1:
                        System.out.println(new String(cadena));
                        break;
                    case 2:
                        System.out.println("La longitud de la cadena es: " + longitud());
                        break;
                    case 3:
                        // Copiar la cadena y mostrar el resultado.
                        copiar();
                        break;
                    case 4:
                        System.out.println("Número de vocales: " + numeroVocales());
                        break;
                    case 5:
                        System.out.println("Número de consonantes: " + numeroConsonantes());
                        break;
                    case 6:
                        System.out.print("Introduce una vocal para buscar:");
                        char vocal = scanner.nextLine().charAt(0);
                        System.out.println("La cadena " + (contieneVocal(vocal) ? "contiene" : "no contiene") + " la vocal " + vocal);
                        break;
                    case 7:
                        System.out.print("Introduce una cadena para buscar:");
                        String cadenaBusqueda = scanner.nextLine();
                        System.out.println("La cadena original " + (contieneCadena(cadenaBusqueda) ? "contiene" : "no contiene") + " la cadena " + cadenaBusqueda);
                        break;
                    case 8:
                        convertirMayusculas();
                        System.out.println("La cadena en mayúsculas: " + toString());
                        break;
                    case 9:
                        eliminarVocales();
                        System.out.println("La cadena sin vocales: " + toString());
                        break;
                    case 10:
                        System.out.println("La cadena " + (esPalindromo() ? "es" : "no es") + " un palíndromo.");
                        break;
                    case 0:
                        System.out.println("Has salido...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                        break;
                } // FIN SWITCH
                
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número para seleccionar una opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito.
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                // Opcional: reiniciar o terminar el programa según el caso.
            }  
        } while (opcion != 0); // FIN DO-WHILE
    } // FIN METODO
}