
package tema5.tarea5;

/**
 *
 * @author alumno
 */
public class DNI {
    // ATRIBUTOS estáticos
    static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";// Cadena con las letras posibles del DNI ordenados para el cálculo de DNI
    // ATRIBUTOS de objeto
    private int numDNI;
    
    
    // METODOS PUBLICOS
    public void establecer (String nif) throws Exception {
        if (DNI.validarNIF (nif)) { // Valor válido: lo almacenamos
        this.numDNI= DNI.extraerNumeroNIF(nif);
        } else { // Valor inválido: lanzamos una excepción
            throw new Exception ("NIF inválido: " + nif);
        }
    }// fin método
    
    public void establecer (int dni) throws Exception { // Comprobación de rangos
        //Comprobar rango
        if (dni>9999999 && dni<99999999) {
            this.numDNI= dni; // Valor válido: lo almacenamos
        } else { // Valor inválido: lanzamos una excepción
            throw new Exception ("DNI inválido: " + String.valueOf(dni));
        }
    }// fin método
    
    public String obtenerNIF () {
        // Variables locales
        String cadenaNIF; // NIF con letra para devolver
        char letraNIF; // Letra del número de NIF calculado
        // Cálculo de la letra del NIF
        letraNIF= calcularLetraNIF (numDNI);
        // Construcción de la cadena del DNI: número + letra
        cadenaNIF= Integer.toString(numDNI) + String.valueOf(letraNIF);//Char no es una cadena de caracteres
        // Devolución del resultado
        return cadenaNIF;
    }// fin método
    
    public int obtenerDNI () {
        return numDNI;
    }// fin método

    
    // METODOS PRIVADOS
    private static char extraerLetraNIF (String nif) {
        char letra = nif.charAt(nif.length()-1);
        return letra;
    }// fin método
    
    private static int extraerNumeroNIF (String nif) {
        int numero= Integer.parseInt(nif.substring(0, nif.length()-1));
        return numero;
    }// fin método
    
    private static char calcularLetraNIF (int numeroDNI) {
        char letra;
        // Cálculo de la letra NIF
        letra = LETRAS_DNI.charAt(numeroDNI % 23);
        // Devolución de la letra NIF
        return letra;
    }// fin método

    private static boolean validarNIF (String nif) {
        boolean valido= true; // Suponemos el NIF válido mientras no se encuentre algún fallo
        int numeroDNI;
        char letra_calculada;
        char letra_leida;
        if (nif == null) { // El parámetro debe ser un objeto no vacío
            valido= false;
        } else if (nif.length()<8 || nif.length()>9) { // La cadena debe estar entre 8(7+1) y 9(8+1) caracteres
            valido= false;
        } else {
            numeroDNI= DNI.extraerNumeroNIF (nif); //Extraemos el número de DNI (int)
            letra_leida= DNI.extraerLetraNIF (nif); //Extraemos la letra de NIF (letra)
            letra_calculada= DNI.calcularLetraNIF(numeroDNI);
            // Calculamos la letra de NIF a partir del número extraído
            if (letra_leida == letra_calculada) { //Comparamos la letra extraída con la calculada
            // Todas las comprobaciones han resultado válidas. El NIF es válido.
                valido= true;
            } else {
                valido= false;
            }// fin if
            
        }// fin if
        return valido;
    }// fin método     
}
