package examen2Evaluzacion_EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Complejo {
    private double real; // Parte real del número complejo
    private double imag; // Parte imaginaria del número complejo

    // CONSTRUCTOR vacio inicializo a cero
    public Complejo() {
        this.real = 0;
        this.imag = 0;
    }
    
    // CONSTRUCTOR con parámetros
    public Complejo(double real, double imag) {
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
    
    // METODO concierto el número complejo a String
    @Override
    public String toString() {
        return this.real + " + " + this.imag + "i";
    }
    
    // METODO para sumar dos números complejos
    public Complejo sumar(Complejo b) {
        Complejo resultado = new Complejo(
            this.real + b.real,
            this.imag + b.imag
        );
        return resultado;
    }
    
    
    // METODO que me permite múltiples intentos de introducción de datos
    public void introducirValores() {
        Scanner sc = new Scanner(System.in);
        double real1 = 0, imag1 = 0, real2 = 0, imag2 = 0;
        
        boolean datosCorrectos = false;
        // Solicito la parte real de a
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte real de a:");
                real1 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Salto de linea
            }
        }
        
        // ------------------------------------------------------------------------------------------------------------------------------------
        do{
            try{
                System.out.println("Introduce la parte real de a:");
                real1 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Salto de linea
                datosCorrectos = false;
            }
        }while(!datosCorrectos);
        // Reinicio a false para la proxima introducción de datos
        datosCorrectos = false;
        // ------------------------------------------------------------------------------------------------------------------------------------
        
        
        // Solicito la parte imaginaria de a
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte imaginaria de a:");
                imag1 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Salto de linea
            }
        }
        
        // Reinicio a false para la proxima introducción de datos
        datosCorrectos = false;
        // Solicito la parte real de b
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte real de b:");
                real2 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Salto de linea
            }
        }
        
        // Reinicio a false para la proxima introducción de datos
        datosCorrectos = false;
        // Solicito la parte imaginaria de b
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte imaginaria de b:");
                imag2 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Limpia el buffer del scanner
            }
        }

        Complejo a = new Complejo(real1, imag1);
        Complejo b = new Complejo(real2, imag2);
        Complejo suma = a.sumar(b);

        System.out.println("Número complejo a: " + a);
        System.out.println("Número complejo b: " + b);
        System.out.println("Suma de a y b: " + suma);
    }
}