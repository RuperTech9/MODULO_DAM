
package tema3.actividades;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A00_Par_Impar {
    
    public static boolean esPar (int num){
        return num%2==0;
    }
    
    public static void main(String args[]){
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        numero = teclado.nextInt();
        
        if(esPar(numero)){
            System.out.println("El numero es PAR");
        }else{
            System.out.println("El numero es IMPAR");
        }
    }
    
}
