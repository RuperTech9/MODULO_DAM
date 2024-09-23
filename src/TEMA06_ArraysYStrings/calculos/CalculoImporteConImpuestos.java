
package TEMA06_ArraysYStrings.calculos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Crea un programa para el cálculo del importe final a partir del importe inicial y un porcentaje de impuestos. 
 * El importe inicial y el porcentaje de impuestos deben solicitarse al usuario. El programa debe mostrar 
 * el resultado ateniéndose a estas reglas: debe mostrarse el impuesto como resultado de calcular el 
 * importe inicial por el porcentaje dividido entre 100, con precisión de dos decimales y redondeo al entero más 
 * próximo o en caso de equidistancia, redondeo al entero mayor. 
 * Debe mostrarse el importe final como resultado de sumar el importe inicial con el impuesto, por tanto tendrá precisión de dos decimales.
 * 
 * @author Ruper
 */
public class CalculoImporteConImpuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el importe inicial
        System.out.print("Por favor introduzca el importe inicial: ");
        BigDecimal importeInicial = scanner.nextBigDecimal();

        // Solicitar al usuario el porcentaje de impuestos
        System.out.print("Por favor introduzca el porcentaje de impuestos: ");
        BigDecimal porcentajeImpuestos = scanner.nextBigDecimal();

        // Calcular el impuesto
        BigDecimal cien = new BigDecimal("100");
        BigDecimal impuesto = importeInicial.multiply(porcentajeImpuestos).divide(cien);
        
        // Redondear el impuesto al entero más próximo y en caso de equidistancia, al entero mayor
        BigDecimal impuestoRedondeado = impuesto.setScale(2, RoundingMode.HALF_UP);

        // Calcular el importe final
        BigDecimal importeFinal = importeInicial.add(impuestoRedondeado);

        // Mostrar el impuesto y el importe final con precisión de dos decimales
        System.out.println("El impuesto a pagar es: " + impuestoRedondeado);
        System.out.println("El importe final es: " + importeFinal.setScale(2, RoundingMode.HALF_UP));
    }
}