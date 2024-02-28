
package tema3.ejercicios;

import java.util.Scanner;

/**
 * 
 * @author Ruper
 */
public class E03_PreguntasAciertos {
    public static void main(String[] args) {
        double num_preguntas;
        double num_aciertos;
        String resultado=null;
        float nota;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero de preguntas: ");
        num_preguntas = teclado.nextInt();
        
        System.out.println("Introduzca el numero de aciertos: ");
        num_aciertos = teclado.nextInt();
        nota = (float) ((num_aciertos * 10 / num_preguntas));
        
        if (num_aciertos<=num_preguntas){
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
            System.out.printf("El resultado del examen es: %.2f %s\n",nota, resultado);
        } else{
            System.out.println("Error");
        }
      
         
       

    }
}
    
    


