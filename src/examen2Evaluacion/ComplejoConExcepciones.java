
package examen2Evaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ComplejoConExcepciones {
    private double real; // Parte real del número complejo
    private double imag; // Parte imaginaria del número complejo

    // Constructor que inicializa a cero
    public ComplejoConExcepciones() {
        this.real = 0;
        this.imag = 0;
    }
    
    // Constructor con parámetros
    public ComplejoConExcepciones(double real, double imag) {
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
    public ComplejoConExcepciones sumar(ComplejoConExcepciones b) {
        ComplejoConExcepciones resultado = new ComplejoConExcepciones(
            this.real + b.real,
            this.imag + b.imag
        );
        return resultado;
    }

    // Método para introducir los datos
    public void introducirValores(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce la parte real de c1:");
            double real1 = sc.nextDouble();
            System.out.println("Introduce la parte imaginaria de c1:");
            double imag1 = sc.nextDouble();

            Complejo c1 = new Complejo(real1, imag1);

            System.out.println("Introduce la parte real de c2:");
            double real2 = sc.nextDouble();
            System.out.println("Introduce la parte imaginaria de c2:");
            double imag2 = sc.nextDouble();

            Complejo c2 = new Complejo(real2, imag2);

            Complejo suma = c1.sumar(c2);

            System.out.println("Número complejo c1: " + c1);
            System.out.println("Número complejo c2: " + c2);
            System.out.println("Suma de c1 y c2: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un número válido.");
        } finally {
        }
    }
}