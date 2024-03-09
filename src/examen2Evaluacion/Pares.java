
package examen2Evaluacion;

/**
 *
 * @author Ruper
 */
class NumeroNoNegativoException extends Exception {
    public NumeroNoNegativoException(String message) {
        super(message);
    }
}

class NumeroNoPositivoException extends Exception {
    public NumeroNoPositivoException(String message) {
        super(message);
    }
}

public class Pares {
    int negativo;
    int positivo;
    
    // CONSTRUCTOR
    public Pares(int negativo, int positivo) throws NumeroNoNegativoException, NumeroNoPositivoException {
        if (negativo >= 0) {
            throw new NumeroNoNegativoException("El número debe ser negativo.");
        }
        if (positivo <= 0) {
            throw new NumeroNoPositivoException("El número debe ser positivo.");
        }
        this.negativo = negativo;
        this.positivo = positivo;
    }
    
    // GETTERS
    public int getNegativo() {
        return negativo;
    }

    public int getPositivo() {
        return positivo;
    }
    
    // METODO sumar
    public int sumar() {
        return negativo + positivo;
    }
}
