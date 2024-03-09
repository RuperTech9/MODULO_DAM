package examen2Evaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ComplejoConExcepcionesV2 {
    private double real; // Parte real del número complejo
    private double imag; // Parte imaginaria del número complejo

    // Constructor que inicializa a cero
    public ComplejoConExcepcionesV2() {
        this.real = 0;
        this.imag = 0;
    }
    
    // Constructor con parámetros
    public ComplejoConExcepcionesV2(double real, double imag) {
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
    public ComplejoConExcepcionesV2 sumar(ComplejoConExcepcionesV2 b) {
        ComplejoConExcepcionesV2 resultado = new ComplejoConExcepcionesV2(
            this.real + b.real,
            this.imag + b.imag
        );
        return resultado;
    }

    // Método modificado para permitir múltiples intentos de introducción de datos
    public void introducirValores() {
        Scanner sc = new Scanner(System.in);

        double real1 = 0, imag1 = 0, real2 = 0, imag2 = 0;
        boolean datosCorrectos = false;

        // Solicitar la parte real de c1
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte real de c1:");
                real1 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Limpia el buffer del scanner
            }
        }

        // Reiniciar la bandera para la próxima entrada
        datosCorrectos = false;

        // Solicitar la parte imaginaria de c1
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte imaginaria de c1:");
                imag1 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Limpia el buffer del scanner
            }
        }

        // Reiniciar la bandera para la próxima entrada
        datosCorrectos = false;

        // Solicitar la parte real de c2
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte real de c2:");
                real2 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Limpia el buffer del scanner
            }
        }

        // Reiniciar la bandera para la próxima entrada
        datosCorrectos = false;

        // Solicitar la parte imaginaria de c2
        while (!datosCorrectos) {
            try {
                System.out.println("Introduce la parte imaginaria de c2:");
                imag2 = sc.nextDouble();
                datosCorrectos = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Limpia el buffer del scanner
            }
        }

        ComplejoConExcepcionesV2 a = new ComplejoConExcepcionesV2(real1, imag1);
        ComplejoConExcepcionesV2 b = new ComplejoConExcepcionesV2(real2, imag2);
        ComplejoConExcepcionesV2 suma = a.sumar(b);

        System.out.println("Número complejo a: " + a);
        System.out.println("Número complejo b: " + b);
        System.out.println("Suma de a y b: " + suma);
    }
}