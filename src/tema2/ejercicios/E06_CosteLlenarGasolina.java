package tema2.ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que te indique lo que cuesta llenar un depósito de gasolina, donde el usuario introduce el precio de la gasolina y los litros a llenar. 
 * El resultado  deberá mostrar 3 decimales.
 * @author ruper
 */
public class E06_CosteLlenarGasolina {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        double litros;
        byte combustible = 0;
        double precioLitro = 0;
        double precioTotal;
        
        System.out.println("Introduzca cantidad de litros: ");
        litros = teclado.nextDouble();
        
        System.out.println("Introduzca el tipo de combustible (1-Diesel 2-Gasoil): ");
        combustible = teclado.nextByte();
        

        switch(combustible) {
        case 1:
            System.out.println("Diesel");
            precioLitro = 1.77;
            break;
        case 2:
            System.out.println("Gasoil");
            precioLitro = 1.88;
            break;

        default:
            System.out.println("Error no es un tipo de combustible");
        }
        
        precioTotal = precioLitro*litros;
        System.out.println("El precio total es: "+ (double)Math.round(precioTotal*1000d)/1000d);
    }
}

