
package TEMA03_EstructurasDeControl.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class TablaMultiplicar {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        
        for(int i=0;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        
    }
}
