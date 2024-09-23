
package EXAMEN_2Evaluacion;

/**
 *
 * @author Ruper
 */
public class Complejo {
    private double real; // Parte real del número complejo
    private double imag; // Parte imaginaria del número complejo

    // Constructor que inicializa a cero
    public Complejo() {
        this.real = 0;
        this.imag = 0;
    }
    
    // Constructor con parámetros
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    // Método para consultar la parte real
    public double consultaReal() {
        return this.real;
    }
    
    // Método para consultar la parte imaginaria
    public double consultaImaginaria() {
        return this.imag;
    }
    
    // Método para cambiar la parte real
    public void cambiaReal(double real) {
        this.real = real;
    }
    
    // Método para cambiar la parte imaginaria
    public void cambiaImaginaria(double imag) {
        this.imag = imag;
    }
    
    // Método toString que convierte el número complejo a String
    @Override
    public String toString() {
        return this.real + " + " + this.imag + "i";
    }
    
    // Método para sumar dos números complejos
    public Complejo sumar(Complejo b) {
        Complejo resultado = new Complejo(
            this.real + b.real,
            this.imag + b.imag
        );
        return resultado;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Complejo c1 = new Complejo(5, 4);
        Complejo c2 = new Complejo(3, 5);
        Complejo suma = c1.sumar(c2);

        System.out.println("Número complejo c1: " + c1);
        System.out.println("Número complejo c2: " + c2);
        System.out.println("Suma de c1 y c2: " + suma);
    }
}