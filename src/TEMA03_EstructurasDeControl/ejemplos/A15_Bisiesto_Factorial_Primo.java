
package TEMA03_EstructurasDeControl.ejemplos;

import java.util.Scanner;

/**
 * Determinar si un año es bisiesto.
 * Factorial de un numero.
 * Si es primo o no.
 * Salir del programa.
 * 
 * @author Ruper
 */


public class A15_Bisiesto_Factorial_Primo {
    
    public static void menu(){
        System.out.println("*****************************************************");
        System.out.println("*** 1- BISIESTO                                   ***");
        System.out.println("*** 2- FACTORIAL                                  ***");
        System.out.println("*** 3- PRIMO                                      ***");
        System.out.println("*** 4- SALIR                                      ***");
        System.out.println("*****************************************************");
    }
    
    public static boolean esBisiesto(int anio){
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int calcularFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
    
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
            menu();
            System.out.println("Introduzca una opcion: ");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduce un año: ");
                    int anio = teclado.nextInt();
                    if (esBisiesto(anio)) {
                    //Si el año es divisible por 4 y no por 100, o si es divisible por 400, entonces es un año bisiesto.
                        System.out.println(anio + " SI es un año bisiesto.");
                    } else {
                        System.out.println(anio + " NO es un año bisiesto.");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca un numero: ");
                    int factor = teclado.nextInt();
                    System.out.println("El factorial de "+factor+" es: "+calcularFactorial(factor));
                    break;
                case 3:
                    System.out.println("Introduzca un numero: ");
                    int num1 = teclado.nextInt();
                    if (esPrimo(num1)) {
                        System.out.println("Es primo");
                    }else{
                        System.out.println("No es primo");
                    }
                    break;
                case 4:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion != 4);

    }

    // Aquí van los métodos menu, esBisiesto, calcularFactorial, esPrimo...
}