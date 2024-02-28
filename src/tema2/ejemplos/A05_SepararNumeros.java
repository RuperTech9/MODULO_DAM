
package tema2.ejemplos;

import java.util.Scanner;

/**
 * Diseña un programa Java que solicite un número de 5 dígitos del teclado, 
 * separe el número en sus dígitos individuales y los muestre por pantalla.
 * @author alumno
 */
public class A05_SepararNumeros {
    public static void main(String arg[]) {  
	Scanner sc = new Scanner(System.in);
 
	System.out.println("Introduzca un numero de cinco cifras.");
	int numero = sc.nextInt();
  
	System.out.printf("\n%d ",     numero/10000);						// Necesito utilizar los operadores de división y resto para "seleccionar" cada dígito.
	System.out.printf("\n%d ",    (numero%10000)/1000);					// %d indica el orden en el que se procesan los numeros.
	System.out.printf("\n%d ",   ((numero%10000)%1000)/100);
	System.out.printf("\n%d ",  (((numero%10000)%1000)%100)/10);
	System.out.printf("\n%d ", ((((numero%10000)%1000)%100)%10));
	} 
    
}
