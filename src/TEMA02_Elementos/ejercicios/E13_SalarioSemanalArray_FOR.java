
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
public class E13_SalarioSemanalArray_FOR {
    public static double calcularSalarioBruto(double horas){
        return (horas <=40)? (horas*23.25):(((horas-40)*50)+(40*23.25));
    }
    
    public static double calcularIRPF(double salarioBruto){
        return salarioBruto*0.15;
    }
    
    public static double calcularSeguridadSocial(double salarioBruto){
        return salarioBruto*0.047;
    }
    
    public static double calcularSalarioNeto(double salarioBruto, double irpf, double seguridadSocial){
        return salarioBruto - irpf - seguridadSocial;
    }
    
    
    public static void main(String args []){
        Scanner teclado =  new Scanner(System.in);
        
        double[] salarios = new double[4];
        double salarioTotalDelMes = 0.0;
        
        for (int i = 0; i < 4 ; i++){
            System.out.print("Escribe las horas que has trabajado en la semana " + (i+1) + ": ");
            double horas = teclado.nextDouble();
        
            double salarioBruto = calcularSalarioBruto(horas);
            double irpf = calcularIRPF(salarioBruto);
            double seguridadSocial = calcularSeguridadSocial(salarioBruto);
            double salarioNeto = calcularSalarioNeto(salarioBruto, irpf, seguridadSocial);
            
            salarios[i] = salarioNeto;
            salarioTotalDelMes += salarioNeto;

            System.out.printf("\nSalario Bruto: %.2f€", salarioBruto);
            System.out.printf("\nIRPF: %.2f€", irpf);
            System.out.printf("\nSeguridad Social: %.2f€", seguridadSocial);
            System.out.printf("\nAl trabajar %.2f horas tu salario es: %.2f€\n\n", horas, salarioNeto);
        }
        System.out.println("Resumen de 4 semanas:");
        for(int i = 0; i < salarios.length; i++){
            System.out.printf("Salario de la semana %d: %.2f€\n", i+1, salarios[i]);
        }
        System.out.printf("\nSalario total del mes: %.2f€", salarioTotalDelMes);
    }
}
