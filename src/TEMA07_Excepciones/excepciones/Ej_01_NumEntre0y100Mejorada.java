package TEMA07_Excepciones.excepciones;




import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Ejercicio resuelto sobre manejo de excepciones. El programa solicita que el
 * usuario introduzca por teclado un numero entre 0 y 100, debiendo gestionarse
 * la entrada por medio de excepciones.
 * 
 * @author david
 */

public class Ej_01_NumEntre0y100Mejorada {
         
         public static void main(String[] args) {
                  int numero = -1;
                  int intentos = 0;
                  //String linea;
                  
                  Scanner teclado = new Scanner(System.in);
                  
                  //Ejecuta el programa hasta que el usuario introduzca un numero entre 0 y 100.
                  do {
                           try {
                                    System.out.print("Introduzca un numero entre 0 y 100: ");
                                    numero = teclado.nextInt();
                           } catch (NumberFormatException e1) {
                                    //Exception por introducir numero fuera del rango
                                    System.out.println("Debe introducir un numero entre 0 y 100");
                                    
                           } catch (InputMismatchException e2) {  //InputMismatchException copiado de la pantalla
                                    //Excepcion por introducir un caracter que no sea un numero
                                    System.out.println("Debe introducir un numero entero");
                                    //para arreglar el bucle a�adimos un next()
                                    teclado.next();

                           }finally {
                                    //Cuenta los intentos
                                    intentos++;
                           }
                  } while (numero < 0 || numero > 100);
                  
                  System.out.println("El n�mero introducido es: " + numero);
                  System.out.println("N�mero de intentos: " + intentos);
         }//Fin main
         
}//Fin class
