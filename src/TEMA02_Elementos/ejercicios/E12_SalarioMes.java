
package TEMA02_Elementos.ejercicios;

import java.util.Scanner;

/**
 * Crear una pequeña aplicación Java que permita calcular el salario semanal de un trabajador.
 * Se tendrá en cuenta que la hora ordinaria se le paga a 23.25€/hora, y que las horas extraordinarias se le pagan a 50€/hora. 
 * Se considera que su jornada laboral normal es de 40 horas/semana, por lo que las horas trabajadas que superen dicha cantidad, 
 * serán consideradas horas extraordinarias.
 * Se le aplicará una reducción de un 15% de IRPF y un 4,70% de seguridad social al salario final.
 * Aclaraciones: 
 * 1- El trabajador introducirá el número de horas trabajadas.
 * 2- Se mostrará el IRPF obtenido, su cuota a la seguridad social y el salario obtenido al finalizar la semana.
 * Nota: En Estados Unidos se cobra por semana.
 * b) Ampliarlo para guardar lo que gana un trabajador durante 4 semanas, en un array.
 * @author Ruper
 */
public class E12_SalarioMes {
    public static double dinero(double num1){
        double salario = (num1 <=40)? (num1*23.25):(((num1-40)*50)+(40*23.25));
        double descuento = salario * (19.7/100);
        salario = salario - descuento;
        return salario;
    }
    
    public static void main(String args []){
        Scanner teclado =  new Scanner(System.in);
        System.out.print("Escribe las horas que has trabajado este mes: ");
        double horas = teclado.nextDouble();
        
        double salario = dinero(horas);
        
        System.out.printf("Al trabajar %.2f horas tu salario es: %.2f",horas, salario);
        
    }
}
