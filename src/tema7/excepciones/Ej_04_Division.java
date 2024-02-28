package tema7.excepciones;



import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * El programa lee dos numeros por teclado y realiza la division
 * Se lee por Scanner
 * Debe gestionar la entrada de datos por medio de excepciones
 * @author david
 */

public class Ej_04_Division {
         
         public static void main(String[] args) {
                  int dividendo = 0;
                  int divisor = 0;
                  double resultado = 0.0;
                  
                  boolean operacion = false;
                  int intentos = 0;

                  Scanner teclado = new Scanner(System.in);

                  //con un while, mientras la operacion sea false se ejecuta 
                  while(operacion == false){
                           try{ //Parte sensible a excepciones
                                    System.out.print("Introduzca el dividendo: ");
                                    dividendo = teclado.nextInt();
                                    System.out.print("Introduzca el divisor: ");
                                    divisor = teclado.nextInt();
                                    
                                    //Resultado (double) delante para cambiar a double dividendo/divisor
                                    resultado = (double) dividendo/divisor;
                                    //Se cumple pues operacion = true
                                    operacion = true;
                                    
                           } catch (InputMismatchException e1){
                                    //Excepcion por introducir un caracter que no sea un numero
                                    System.out.println("Debe introducir un numero entero");
                                    operacion = false;
                                    //para arreglar el bucle a�adimos un next()
                                    teclado.next();
                                    
                           } catch(ArithmeticException e1) {
                                    //Excepcion para dividir entre 0
                                    System.out.println("No se puede dividir por 0");
                                    operacion = false;
                                    
                           }finally {
                                    intentos++;
                           }//Fin try-catch
                           
                  }//Fin while

                  //Imprimir solo dos decimales
                  System.out.printf("La division es correcta y el resultado es: %.2f\n", resultado);
                  System.out.println("N�mero de intentos: " + intentos);
                  
                  //Cerrar teclado
                  teclado.close();
                  
         }//Fin main
         
}//Fin class
