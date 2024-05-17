package examen2Evaluzacion_EXCEPCIONES;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class NumeroComplejo {
    private double real; // Parte real del número complejo
    private double imag; // Parte imaginaria del número complejo

    // CONSTRUCTOR vacio inicializo a cero
    public NumeroComplejo() {
        this.real = 0;
        this.imag = 0;
    }
    
    // CONSTRUCTOR con parámetros
    public NumeroComplejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    // METODO para consultar la parte real
    public double consultaReal() {
        return this.real;
    }
    
    // METODO para consultar la parte imaginaria
    public double consultaImaginaria() {
        return this.imag;
    }
    
    // METODO para cambiar la parte real
    public void cambiaReal(double real) {
        this.real = real;
    }
    
    // METODO para cambiar la parte imaginaria
    public void cambiaImaginaria(double imag) {
        this.imag = imag;
    }
    
    
    // METODO convierto el número complejo a String
    @Override
    public String toString() {
        if (consultaImaginaria() < 0){
            return "Num complejo: " + consultaReal() + " - " + consultaImaginaria()*-1 + "i";
        }else {
            return "Num complejo: " + consultaReal() + " + " + consultaImaginaria() + "i";
        }
    }
    
    // METODO para sumar dos números complejos
    public NumeroComplejo sumar(NumeroComplejo b) {
        NumeroComplejo resultado = new NumeroComplejo(
            this.real + b.real,
            this.imag + b.imag
        );
        return resultado;
    }
    
    
    
    // Método main para probar la clase
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // C1
        System.out.println("Introduce la parte real de c1:");
        double real1 = sc.nextDouble();
        System.out.println("Introduce la parte imaginaria de c1:");
        double imag1 = sc.nextDouble();

        // C2
        System.out.println("Introduce la parte real de c2:");
        double real2 = sc.nextDouble();
        System.out.println("Introduce la parte imaginaria de c2:");
        double imag2 = sc.nextDouble();
        
        NumeroComplejo c1 = new NumeroComplejo(real1, imag1);
        NumeroComplejo c2 = new NumeroComplejo(real2, imag2);

        NumeroComplejo suma = c1.sumar(c2);

        System.out.println( c1);
        System.out.println(c2);
        System.out.println("Suma de c1 y c2: " + suma);
    }
}
