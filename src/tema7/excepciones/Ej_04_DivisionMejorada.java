package tema7.excepciones;



import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * El programa lee dos numeros por teclado y realiza la division
 * Se lee por Scanner
 * Debe gestionar la entrada de datos por medio de excepciones
 * 
 *  Se divide en DIVIDENDO Y DIVISOR ya que el divisor no puede ser 0 
 *  Se crea una Excepcion para el divisor cuando es 0
 * 
 * @author david
 */

public class Ej_04_DivisionMejorada {
         
         public static void main(String[] args) {
                  int dividendo = 0;
                  int divisor = 0;
                  double resultado = 0.0;
                  
                  boolean operacion = false;
                  int intentos = 0;

                  Scanner teclado = new Scanner(System.in);

                  //DIVIDENDO
                  //con un while, mientras la operacion sea false se ejecuta 
                  while(operacion == false){
                           try{ //Parte sensible a excepciones
                                    System.out.print("Introduzca el dividendo: ");
                                    dividendo = teclado.nextInt();
                                    operacion = true;
                           } catch (InputMismatchException e1){
                                    //Excepcion por introducir un caracter que no sea un numero
                                    System.out.println("Debe introducir un numero entero");
                                    operacion = false;
                                    //para arreglar el bucle a�adimos un next()
                                    teclado.next();
                           }finally {
                                    intentos++;
                           }//Fin try-catch
                  }//Fin 1� while
                  
                  
                  //DIVISOR
                  operacion = false; 
                  while (operacion == false) {
                           try { //Parte sensible a excepciones
                                    System.out.print("Introduzca el divisor: ");
                                    divisor = teclado.nextInt();
                                    if (divisor == 0){
                                             throw new ArithmeticException(); //Creo la excepcion 
                                    } else{
                                             resultado = (double) dividendo / (double) divisor;
                                             operacion = true;
                                    }//Fin if-else
                                    
                           } catch (InputMismatchException e1) {
                                    //Excepcion por introducir un caracter que no sea un numero
                                    System.out.println("Debe introducir un numero entero");
                                    operacion = false;
                                    //para arreglar el bucle a�adimos un next()
                                    teclado.next();
                           } catch (ArithmeticException e2){ //Excepcion que hemos creado nosotros
                                    System.out.println("No se puede divir por 0");
                                    operacion = false;
                           } finally {
                                    intentos++;
                           }//Fin try-catch
                  }//Fin 1� while
                  

                  //Imprimir solo dos decimales
                  System.out.printf("La division es correcta y el resultado es: %.2f\n", resultado);
                  System.out.println("N�mero de intentos: " + intentos);
                  
                  //Cerrar teclado
                  teclado.close();
                  
         }//Fin main
         
}//Fin class
