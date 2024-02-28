package tema6.matrices;

import java.util.Scanner;

/**
 *
 * @author david
 */

public class Ac1_MatricesUnidimensionales {
          
          public static void main(String [] args){
                    //Declarar el array
                    String [] asignaturas = {"Programacion", "FOL", "Bases de Datos", "Lenguaje de Marcas", "Entornos de Desarrollo", "Sistemas Informaticos"};
                    double[] notas = new double[6];
                    
                    //Entrada de datos
                    Scanner teclado = new Scanner(System.in);
                    for (int i = 0; i < asignaturas.length; i++) {
                              //La nota tiene que estar entre 0-10 asi que hacer pedir nota hasta q nota esta entre 0 y 10
                              do {
                                        System.out.println("Introduce la nota de " + asignaturas[i] + ": ");
                                        notas[i] = teclado.nextDouble();
                              } while (notas[i] < 0 || notas[i] > 10);
                              teclado.nextLine();
                    }//Fin for

                    //Reutilizamos el menu de opciones
                    int opcion;
                    //Menu dentro de un bucle para que se repita hasta que el usuario pulse "5"
                    do {
                              System.out.println("""
                                                *******************************************************************************************************************
                                                ****  1- Media Obtenida. 
                                                ****  2- Numero de suspensos.                          
                                                ****  3- Mostrar suspensos.                               
                                                ****  4- Revisar suspensos                                                         
                                                ****  5- Salir.                                                                                                             
                                                ********************************************************************************************************************
                                                """);
                              opcion = teclado.nextInt();
                              teclado.nextLine();

                              switch (opcion) {
                                        case 1:
                                                  double media = mediaObtenida(notas);
                                                  //Devuelve solo 2 decimales
                                                  System.out.println(String.format("La media obtenida es %.2f", media));
                                                  System.out.println();
                                                  break;
                                        case 2:
                                                  System.out.print("Ha suspendido: "+numeroSuspensos(notas)+" asignaturas");
                                                  System.out.println("");
                                                  break;
                                        case 3:
                                                  mostrarSuspensos(asignaturas, notas);
                                                  System.out.println("");
                                                  break;
                                        case 4:
                                                  revisionSuspensos(asignaturas,  notas);
                                                  System.out.println("");
                                                  break;
                                        case 5:
                                                  System.out.println("Saliendo... ");
                                                  System.exit(0);
                                                  break;
                                        default:
                                                  System.out.println("Opci�n no v�lida. Por favor, seleccione una opci�n v�lida.");
                              }//Fin switch

                    } while (opcion != 5);
                   

                    
          }//Fin Main
          
          //Metodo auxiliar para sumar las notas
          static double sumaNotas(double[] notas) {
                    double suma = 0;
                    for (int i = 0; i < notas.length; i++) {
                              suma = suma + notas[i];
                    }
                    return suma;
          }//Fin sumaNotas

          //Metodo para sacar la media de las notas
          //Llamamos al metodo sumaNotas
          static double mediaObtenida(double[] j) {
                    double suma = sumaNotas(j);
                    double media = suma / j.length;
                    return media;
          }//Fin mediaObtenida

          
          //Metodo para calcular el numero de suspensos
          static int numeroSuspensos(double[] j){
                    int suspensos = 0;
                    for (int i = 0; i < j.length; i++) {
                              if(j[i] < 5) {
                                        suspensos += 1;
                              }//Fin 
                    }//Fin for
                    return suspensos;
          }//Fin numeroSuspensos
          
          //Metodo para mostrar suspensos 
          //void porq devuelve String
          static void mostrarSuspensos(String [] n, double[] j){
                    for (int i = 0; i < j.length; i++) {
                              if (j[i] < 5) {
                                        System.out.println("Ha suspendido: "+n[i]+" nota: "+j[i]);
                              }//Fin 
                    }//Fin for
          }//Fin mostrarSuspensos
          
          //Metodo para modificar el array si esta entre 4,55 y 4,99 
          //Si ha hecho los trabajos sera un 5
          static void revisionSuspensos (String [] n, double[] j){
                    for (int i = 0; i < j.length; i++) {
                              //Si la nota est� entre estos valores, pasa a ser un 5
                              if (j[i] < 5 && j[i] >= 4.5){
                                        //Preguntamso si ha realizado las tareas de dicha asignatura
                                        System.out.println("Ha realizado todas las tareas de "+n[i]+" ? (S/N)");
                                        Scanner scanner = new Scanner(System.in);
                                        String respuesta = scanner.nextLine();

                                        if (respuesta.equalsIgnoreCase("s")) {
                                                  j[i] = 5.0;
                                                  System.out.println("Su nota ahora es: "+j[i]);
                                                  }
                                          else {
                                                  System.out.println("No se realizaron modificaciones en las notas.");
                                        }//Fin 2� if - else
                              }//Fin 1� if
                    }//Fin for
          }//Fin revisionSuspensos
                  
}//Fin Class
