
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaNumero {
    
    private static int intentos;
    private static int num_secreto;
    private static Scanner teclado = new Scanner(System.in);
    
    public static void menu(){
        System.out.println("*****************************************************");
        System.out.println("*** ADIVINA EL NUMERO                             ***");
        System.out.println("*** Author: Alejandro Ruperez                     ***");
        System.out.println("*** Versión 1.0                                   ***");
        System.out.println("*****************************************************");
    }
    
    public static void pideIntentos(){
        System.out.println("Escribe el numero de intentos: ");
        intentos = teclado.nextInt();
    }
    
    public static void pideRango(){
        System.out.println("Introduce el rango de los números");
        int ale1;
        int ale2;
        do{
            System.out.println("Introduce el primer número del rango");
            ale1 = teclado.nextInt();
            System.out.println("Introduce el segundo número del rango");
            ale2 = teclado.nextInt();
            if (ale1>ale2){
                System.out.println("El primer numero no puede ser mayor que el segundo");
            }
        }while(ale2 <= ale1);
        num_secreto = ale1 + (int)(Math.random() * ((ale2 - ale1) + 1));
    }
    
    private static void juegoAdivina() {
        int num_ingresado;
        System.out.print("Adivina: ");
        num_ingresado = teclado.nextInt();
        int intentosRestantes = intentos;

        while (num_secreto != num_ingresado && intentosRestantes > 1) {
            if (num_secreto > num_ingresado) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("Muy alto");
            }
            intentosRestantes--;
            System.out.print("Le quedan " + intentosRestantes + " intentos: ");
            num_ingresado = teclado.nextInt();
        }

        if (num_secreto == num_ingresado) {
            System.out.println("Exacto! Usted adivino en " + (intentos - intentosRestantes) + " intentos.");
        } else {
            System.out.println("El número era: " + num_secreto);
        }
    }
    
    public static void main(String[] args) {
        char continua;
        do {
            menu();
            pideIntentos();
            pideRango();
            juegoAdivina();
            System.out.print("¿Desea volver a intentarlo? (S/N): ");
            continua = teclado.next().charAt(0);
        } while (continua != 'N' && continua != 'n');
    }
    
    
}
