
package TEMA07_Excepciones.examen;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class PreguntaNota {
    public static void main(String[] args) {
            String [] estudiantes = {"Pedro","Ana","Roberto","Lucia","Maria"};
        double [] notas = {7.0,2.3,4.5,6.7,5.7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre de un estudiante: ");
        String estudiante=sc.nextLine();
        for (int i=0;i<5;i++){
            if(estudiantes[i].equals(estudiante)){
                System.out.println("Estudiante "+estudiante+" tiene una nota de "+notas[i]);
            }
        }
    }
}

/*
Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de estudiantes con sus respectivas notas. Estos datos estarían hardcodeados.

El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).

Usa dos arrays, uno para guardar los nombres de los estudiantes, y el otro para guardar las notas de los mismos. Ambos tendrán 5 elementos. Puedes guardar la información relacionada en ambos arrays con el mismo valor del índice. Es decir, si por ejemplo el estudiante Pedro está en la posición 2 del array de estudiantes, su nota estaría en la posición 2 del array de notas.

Para comparar el nombre del estudiante introducido por teclado con los nombres de los estudiantes en el array de estudiantes, puedes usar el método equals de la Clase String.
*/