
package TEMA03_EstructurasDeControl.ejemplos;

import java.util.Scanner;

/**
 * Una aplicación que ofrezca al usuario la posibilidad de elegir en la conversión, 
 * de euros a pesetas, o de pesetas a euros, 
 * de forma que pueda darnos el cambio de una cantidad que se pedirá, acorde a la selección previa.
 * 
 * @author Ruper
 */
public class A04_Euroconversor {
    
    public static void presentacion(){
        System.out.println("*****************************************************");
        System.out.println("************* Conversor Moneda **********************");
        System.out.println("****** ¿Qué conversión deseas realizar? *************");
        System.out.println("************ 1. Euros a Pesetas *********************");
        System.out.println("************ 2. Pesetas a Euros *********************");
        System.out.println("************ 0.      SALIR      *********************");
        System.out.println("*****************************************************");
    }
    
    public static double convertirEuros (int cantidad){
        double resultado = cantidad * 166.386;
        return resultado;
    }
    
    public static double convertirPesetas(int cantidad){
        double resultado = cantidad / 166.386;
        return resultado;
    }
    
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int moneda;
        int cantidad;
        
        
        do{ 
            presentacion();
            moneda = teclado.nextInt();
            if(moneda == 0) {
                break;
            }
            switch (moneda) {
                case 1:
                    System.out.println("Introduzca cantidad en Euros: ");
                    cantidad = teclado.nextInt();
                    System.out.printf("Euros equivalen a %.2f Pesetas%n", convertirEuros (cantidad));
                    break;
                case 2:
                    System.out.println("Introduzca cantidad en pesetas: ");
                    cantidad = teclado.nextInt();
                    System.out.printf("Pesetas equivalen a %.2f Euros.%n", convertirPesetas (cantidad));
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1, 2 para la conversión o 0 para salir.");
                    break;
            }
        }while (moneda != 0);// Bucle infinito que sólo se detiene cuando introduzco 0.

        System.out.println("Gracias por usar el conversor de moneda.");
        
    }


}