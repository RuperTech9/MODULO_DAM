
package TEMA02_Elementos.ejercicios;

import java.util.Scanner;

/**
 * Crear una aplicación que al introducir los datos de una persona (nombre y apellidos junto con la edad) le diga si es joven o Adulto. 
 * Joven menor de 18 y adulto cuando a partir de los 18 años.
 * @author Ruper
 */
public class E10_FuncionMayorEdad {
    public static String mayorEdad(int edad){     
        if (edad<18){
            return "Joven.";
        }else{
            return "Adulto.";
        }
    }
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce tus apellidos: ");
        String apellidos = teclado.nextLine();
        
        System.out.print("Introduzca su edad: ");
        int edad = teclado.nextInt();
        
        String mayoria = mayorEdad(edad);
        
        System.out.printf("%s %s, eres %s\n", nombre, apellidos, mayoria);
        
    }
}
