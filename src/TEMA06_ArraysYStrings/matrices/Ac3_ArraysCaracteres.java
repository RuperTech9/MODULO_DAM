package TEMA06_ArraysYStrings.matrices;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ac3_ArraysCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //El usuario introduce cuantos alumnos hay
        //No puede tener 0 o negativo alumnos
        int numAlumnos = 0;
        do {
            System.out.println("Introduce el n�mero de alumnos en clase:");
            if (numAlumnos < 0) {
                System.out.println("Por favor, introduce un n�mero v�lido:");
                teclado.next();
            }//Fin if
            numAlumnos = teclado.nextInt();
        } while (numAlumnos < 0);

        //Creamos el array string nombresAlumnos
        String[] nombresAlumnos = new String[numAlumnos];
        teclado.nextLine(); // Limpiar el buffer despu�s de leer un entero

        //El usuario introduce los nombres de los alumnos
        System.out.println("Introduce los nombres de los alumnos (CTRL + Z para terminar):");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print(i+1+"� Alumno: ");
            nombresAlumnos[i] = teclado.nextLine();
        }//Fin 1� for

        //Declaramos la variable opcion
        char opcion;
        do {
            System.out.println("�Deseas ver los nombres introducidos? (s/n):");
            opcion = teclado.next().charAt(0);
        } while (opcion != 's' && opcion != 'n');

        if (opcion == 's') {
            System.out.println("Nombres introducidos:");
            for (String nombre : nombresAlumnos) {
                if (nombre != null) {
                    System.out.println(nombre);
                }//Fin 2� if
            }//Fin for
        } else {
        System.out.println("No se mostraron los nombres introducidos.");
        }//Fin 1� if
                    
                    
    }//Fin main

}//Fin class
