
package examen2Evaluacion;

/**
 *
 * @author Ruper
 */
public class Pares {
    int negativo;
    int positivo;

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
    
    public int sumar() {
        return negativo + positivo;
    }
}