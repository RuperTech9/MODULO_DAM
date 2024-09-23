
package TEMA03_EstructurasDeControl.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E01_CalificacionNota_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        String resultado=null;
        int nota2;
        
        System.out.println("Escriba la nota: ");
        nota = teclado.nextInt();
        
        
        if (nota<5){
            resultado = "Insuficiente";
        }
        if (nota>=5 && nota<6){
            resultado = "Suficiente";
        }
        if (nota>=6 && nota<7){
            resultado = "Bien";
        }
        if (nota>=7 && nota<9){
            resultado = "Notable";
        }
        if (nota>=9){
            resultado = "Sobresaliente";
            
        }
        System.out.println("El resultado es: "+resultado);
    
    }
}