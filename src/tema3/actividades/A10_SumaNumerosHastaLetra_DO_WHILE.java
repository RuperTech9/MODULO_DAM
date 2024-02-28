
package tema3.actividades;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A10_SumaNumerosHastaLetra_DO_WHILE {
    public static boolean esPar (int num){
        return num%2==0;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definir variables
        String texto;
        int numPares = 0;
        int numImpares = 0;
  
        int contador = 0;
        boolean estado = true;
        
        //Realizar el bucle
        do{
            System.out.println("Introduce números (escribe 's' o 'S' para salir):");
            texto = teclado.nextLine();
            
            if (texto.charAt(0) == 's' || texto.charAt(0) == 'S') {
                System.out.println("Salir");
                break;
            }else{
                int numero = Integer.parseInt(texto);
                contador = contador + numero;
            }
            
            if(esPar(texto.charAt(0))){
                numPares++;
            }else{
                numImpares++;
            }
            
        }while(estado);
        System.out.println("\nEl resultado es: "+contador);
        System.out.println("La suma total de numeros pares es: " + numPares);
        System.out.println("La suma total de numeros impares es: " + (numImpares -1));

    }//FIN MAIN
}