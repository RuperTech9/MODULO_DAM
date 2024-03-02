
package tema7.examen;

import java.util.Arrays;
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
    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
    
    // Método para encontrar la palabra más larga
    public void encontrarPalabraMasLarga() { // + "X. Encontrar la palabra más larga\n"        
        String texto = new String(this.cadena); // Convertir la cadena de caracteres a String para trabajar con ella
        String[] palabras = texto.split("\\s+"); // Dividir el texto en palabras usando espacio como delimitador
        
        String palabraMasLarga = "";
        int longitudMasLarga = 0;

        for (String palabraActual : palabras) { // Recorrer el array de palabras para encontrar la más larga
            if (palabraActual.length() > longitudMasLarga) {
                palabraMasLarga = palabraActual;
                longitudMasLarga = palabraActual.length();
            }
        }
        System.out.println("La palabra más larga en la cadena es: \"" + palabraMasLarga + "\" con " + longitudMasLarga + " caracteres."); // Mostrar la palabra más larga y su longitud
    }
    
    // METODO para comparar longitud de dos frases
    public static void compararLongitudFrases() { // + "X. Comparar longitud de dos frases\n"
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Segunda frase: ");
        String frase2 = sc.nextLine();

        int longFrase1 = frase1.length();
        int longFrase2 = frase2.length();

        if (longFrase1 == longFrase2) {
            System.out.println("Ambas frases son de la misma longitud.");
        } else if (longFrase1 < longFrase2) {
            System.out.println("\"" + frase1 + "\" es más corta que \"" + frase2 + "\".");
        } else {
            System.out.println("\"" + frase2 + "\" es más corta que \"" + frase1 + "\".");
        }
    }
    
    // Método para encontrar la letra más frecuente en la cadena
    public void letraMasFrecuente() { //+ "X. Encontrar la letra más frecuente\n"
        String frase = new String(this.cadena).toLowerCase(); // Utilizar la cadena de la instancia
        
        int[] contadorLetras = new int[26]; // 26 letras en el alfabeto inglés

        for (int i = 0; i < frase.length(); i++) {
            char caracterActual = frase.charAt(i);
            if (caracterActual >= 'a' && caracterActual <= 'z') {
                contadorLetras[caracterActual - 'a']++;
            }
        }
        int maxFrecuencia = 0;
        char letraMasFrecuente = ' ';
        for (int i = 0; i < contadorLetras.length; i++) {
            if (contadorLetras[i] > maxFrecuencia) {
                maxFrecuencia = contadorLetras[i];
                letraMasFrecuente = (char) (i + 'a');
            }
        }
        System.out.println("La letra que aparece con más frecuencia es la letra '" + letraMasFrecuente + "' y aparece " + maxFrecuencia + " veces.");
    }
    
    // Método para contar palabras y letras en la cadena
    public void contarPalabrasLetras() { // + "X. Contar palabras y letras\n"
        String texto = new String(this.cadena); // Convertir el array de char a String para trabajar con él
        
        // Dividir el texto en palabras usando "\\s+" como delimitador para uno o más espacios
        String[] palabras = texto.split("\\s+");
        
        int cantidadLetras = 0;
        for (String palabra : palabras) {
            // Aquí, se asume que una "palabra" solo contiene letras y se cuentan todas.
            // Si se deseara ignorar números o caracteres especiales dentro de las palabras, se necesitaría filtrarlos.
            cantidadLetras += palabra.length();
        }
        
        System.out.println("Cantidad de palabras: " + palabras.length);
        System.out.println("Cantidad de letras: " + cantidadLetras);
    }
    
    // Método para eliminar espacios en blanco de la cadena
    public void eliminarEspacios() { // + "X. Eliminar espacios en blanco\n"
        String textoSinEspacios = new String(this.cadena).replace(" ", "");
        
        // Actualizar la cadena y el tamaño de CadenaV2 para reflejar la eliminación de espacios
        this.cadena = textoSinEspacios.toCharArray();
        this.tamaño = textoSinEspacios.length();
        
        // Mostrar la cadena sin espacios
        System.out.println("Cadena sin espacios en blanco: " + new String(this.cadena));
    }
    
    // Método para ordenar palabras alfabéticamente
    public void ordenarPalabras() { // + "X. Ordenar palabras alfabéticamente\n" 
        String texto = new String(this.cadena);
        String[] palabras = texto.split("\\s+"); // Dividir la entrada en palabras usando el espacio como delimitador
        
        Arrays.sort(palabras); // Ordenar el array de palabras
        StringBuilder cadenaOrdenada = new StringBuilder(); // Reconstruir la cadena con las palabras ordenadas
        for (String palabra : palabras) {
            cadenaOrdenada.append(palabra).append(" ");
        }
        this.cadena = cadenaOrdenada.toString().trim().toCharArray(); // Actualizar la cadena de la instancia
        this.tamaño = cadenaOrdenada.length();

        System.out.println("Palabras ordenadas alfabéticamente: " + new String(this.cadena)); // Mostrar las palabras ordenadas
    }
    
    // Método para verificar si la cadena contiene una subcadena dada
    public void verificarContieneSubcadena() { // + "X. Verificar si contiene una subcadena\n"
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca la subcadena
        System.out.print("Introduce la subcadena: ");
        String subcadena = scanner.nextLine();
        
        // Verificar si la cadena principal contiene la subcadena
        boolean contieneSubcadena = new String(this.cadena).contains(subcadena);
        
        // Mostrar el resultado
        if (contieneSubcadena) {
            System.out.println("La cadena contiene la subcadena.");
        } else {
            System.out.println("La cadena NO contiene la subcadena.");
        }
    }
    
    // Método para buscar una palabra dentro de la cadena y contar cuántas veces aparece
    public void buscarPalabraYContarVeces(String palabraBuscada) { // + "X. Buscar palabra y contar veces\n"
        String texto = new String(this.cadena).toLowerCase();
        String palabra = palabraBuscada.toLowerCase();
        int veces = 0, pos = 0;

        pos = texto.indexOf(palabra); // Buscar la primera ocurrencia de la palabra

        while (pos != -1) { // Mientras se encuentre la palabra en el texto
            veces++; // Incrementar el contador de veces que se encuentra la palabra
            pos = texto.indexOf(palabra, pos + 1); // Buscar la próxima ocurrencia a partir de la posición siguiente
        }
        if (veces == 0) { // Mostrar cuántas veces se encontró la palabra
            System.out.println("\"" + palabraBuscada + "\" no se encuentra en la cadena.");
        } else {
            System.out.println("\"" + palabraBuscada + "\" está " + veces + " veces en la cadena.");
        }
    }
    /* En el caso X:
    System.out.print("Introduce la palabra a buscar: ");
    String palabraABuscar = scanner.nextLine();
    buscarPalabraYContarVeces(palabraABuscar);
    break: */
    // Método para invertir la cadena
    public void invertirCadena() { // + "X. Invertir cadena\n"
        String texto = new String(this.cadena);
        StringBuilder cadenaInvertida = new StringBuilder(); // Utilizar StringBuilder para invertir la cadena
        for (int i = texto.length() - 1; i >= 0; i--) { // Recorrer la cadena de atrás hacia adelante y añadir cada carácter al StringBuilder
            cadenaInvertida.append(texto.charAt(i));
        }
        /*
        StringBuilder cadenaInvertida = new StringBuilder(new String(this.cadena));
        
        // Utilizar el método reverse() de StringBuilder para invertir la cadena
        cadenaInvertida.reverse();
        
        // Actualizar la cadena de la instancia con la cadena invertida
        this.cadena = cadenaInvertida.toString().toCharArray();
        */
        // Mostrar la cadena invertida
        System.out.println("Cadena invertida: " + cadenaInvertida.toString());
    }
    
    // Método para transformar la cadena duplicando cada consonante y excluyendo las vocales
    public void transformarCadena() { // + "X. Transformar cadena duplicando consonantes\n"
        StringBuilder nuevaCadena = new StringBuilder();
        for (char c : this.cadena) {
            if ("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) == -1) { // Si no es vocal
                nuevaCadena.append(c).append(c); // Duplicar consonante
            }
        }
        
        // Actualizar la cadena de la instancia con la nueva cadena transformada
        this.cadena = nuevaCadena.toString().toCharArray();
        this.tamaño = nuevaCadena.length();
        
        // Mostrar la cadena transformada
        System.out.println("Cadena transformada: " + nuevaCadena.toString());
    }
    
    // Método para verificar si la cadena contiene solo letras y espacios
    public boolean contieneSoloLetrasYEspacios() { // + "X. Verificar si la cadena contiene solo letras y espacios\n"
        for (char c : this.cadena) {
            if (!Character.isLetter(c) && c != ' ') {
                return false; // Si el carácter no es una letra y tampoco es un espacio, retornar false
            }
        }
        return true; // Si todos los caracteres son letras o espacios, retornar true
    }
    
    // Método para verificar anagramas dentro de la cadena
    public void verificarAnagramas() { // + "X. Verificar anagramas en la cadena\n"
        String texto = new String(this.cadena).toLowerCase();
        String[] palabras = texto.split("\\s+"); // Dividir la cadena en palabras

        boolean anagramaEncontrado = false;

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (sonAnagramas(palabras[i], palabras[j])) {
                    System.out.println("\"" + palabras[i] + "\" y \"" + palabras[j] + "\" son anagramas.");
                    anagramaEncontrado = true;
                }
            }
        }
        if (!anagramaEncontrado) {
            System.out.println("No se encontraron anagramas en la cadena.");
        }
    }

    // Método auxiliar para determinar si dos palabras son anagramas
    private boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] arrPalabra1 = palabra1.toCharArray();
        char[] arrPalabra2 = palabra2.toCharArray();

        Arrays.sort(arrPalabra1);
        Arrays.sort(arrPalabra2);

        return Arrays.equals(arrPalabra1, arrPalabra2);
    }
    
    // Método para reemplazar una palabra dentro de la cadena
    public void reemplazarPalabra(String palabraAntigua, String palabraNueva) { // + "X. Reemplazar palabra\n"
        String texto = new String(this.cadena);
        String textoModificado = texto.replaceAll(palabraAntigua, palabraNueva);
        
        // Actualizar la cadena y el tamaño de la instancia con el texto modificado
        this.cadena = textoModificado.toCharArray();
        this.tamaño = textoModificado.length();
        
        // Mostrar el texto modificado
        System.out.println("Texto modificado:");
        System.out.println(textoModificado);
    }
    /*
    case 2:
                    System.out.println("Palabra a reemplazar:");
                    String palabraAntigua = scanner.nextLine();
                    System.out.println("Nueva palabra:");
                    String palabraNueva = scanner.nextLine();
                    reemplazarPalabra(palabraAntigua, palabraNueva);
                    break;
    */
    
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


/*
    System.out.println("\nMenu de opciones:\n"
                    + "1. Verificar si la cadena es un palíndromo\n"
                    + "2. Encontrar la palabra más larga\n"
                    + "3. Comparar longitud de dos frases\n"
                    + "4. Encontrar la letra más frecuente\n"
                    + "5. Contar palabras y letras\n"
                    + "6. Eliminar espacios en blanco\n"
                    + "7. Ordenar palabras alfabéticamente\n"
                    + "8. Verificar si contiene una subcadena\n"
                    + "9. Buscar palabra y contar veces\n"
                    + "10. Invertir cadena\n"
                    + "11. Transformar cadena duplicando consonantes\n"
                    + "12. Verificar si la cadena contiene solo letras y espacios\n"
                    + "13. Verificar anagramas en la cadena\n"
                    + "0. Salir\n"
                    + "\nElige una opción:");
*/