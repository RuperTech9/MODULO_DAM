
package tema2.ejemplos;

import java.util.Scanner;

/**
 * BASCULA DE SUPERMERCADO
 * El usuario introduce el precio, nombre de producto, peso
 * Devuelve el total de lo que el usuario tiene que pagar
 * Recogerá lo que el usuario da y devolvera lo que el propietario tiene que devolver
 * @author ruper
 */

public class A00_BasculaSuper {
    public static void main(String[] args){
	Scanner teclado = new Scanner(System.in);
        double precio;
        String nombre;
        double peso;
        double totalPagar;
        double pago;
        double cambio;
        
        System.out.print("Introduce el precio: ");
	precio = teclado.nextDouble();
        teclado.nextLine();
        
        System.out.print("Introduce el nombre del producto: ");
	nombre = teclado.nextLine();
		
	System.out.print("Introduce el peso: ");
	peso = teclado.nextDouble();
        totalPagar = precio * peso;
        
        System.out.println("El total a pagar es: "+(double)Math.round(totalPagar*100d)/100d);
       
        System.out.print("¿Cuanto dinero me vas a dar?: ");
	pago = teclado.nextDouble();
        cambio = pago - totalPagar;
        
        if (pago<totalPagar){
            while (pago<totalPagar){
                System.out.print("Dinero es insuficiente, vuelve a pagar: ");
                pago = teclado.nextDouble();
                cambio = pago - totalPagar;
                System.out.print("Gracias, sus vueltas son: " +(double)Math.round(cambio*100d)/100d+ " Euros");
            }
        }else{
            System.out.print("Gracias, sus vueltas son: " +(double)Math.round(cambio*100d)/100d + " Euros");
        }
    }
        
}
