
package tema2.actividades;

import java.util.Scanner;

/**
 * VALOR ABSOLUTO
 * El usuario introduce un numero y tiene que devolver el valor absoluto
 * 
 * @author ruper
 */
public class A01_ValorAbsoluto {
    public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
        double numero;
        //double absoluto;
        
        System.out.print("Introduce un número: ");
	numero = teclado.nextDouble();
        
        //absoluto = (numero<0)? numero:numero;
        if (numero<0){
            numero = numero *(-1);
            System.out.print("El numero absoluto es "+numero);
        }else{
            System.out.print("El numero absoluto es "+numero);
        }   
    }
}