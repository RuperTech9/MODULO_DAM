package examen2Evaluzacion_EXCEPCIONES;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SumaNumerosNegativosV2 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int [] [] inicializarArray(){
        int [][] numeros;
        numeros = new int [2][];
        numeros [0] = new int [5];
        numeros [1] = new int [5];
        return numeros;
    }
    
    
    
    static int [] introducirNegativos (int[] negativos){
        boolean repetir;
        int indice = 0;
        do{
            try{
                repetir = false;
                if(indice < negativos.length){
                    System.out.println("Introduce un numero negativo: ");
                    int num = sc.nextInt();
                    if(num<0){
                        negativos[indice] = num;
                        indice++;
                    }else{
                        throw new IllegalArgumentException("Numero no negativo.");
                    }
                }else{
                    break;
                }
                
            }catch (InputMismatchException e1){
                System.out.println("Error. debe introducir un numero entero.");
                sc.nextLine();
                repetir = true;
            }catch (IllegalArgumentException e2){
                System.out.println("Error: " + e2.getMessage());
                repetir = true;
            }
        }while(repetir || indice < negativos.length);
        return negativos;
    }
    
    static int [] introducirPositivos (int[] positivos){
        boolean repetir;
        int indice = 0;
        do{
            try{
                repetir = false;
                if(indice < positivos.length){
                    System.out.println("Introduce un numero positivos: ");
                    int num = sc.nextInt();
                    if(num<0){
                        positivos[indice] = num;
                        indice++;
                    }else{
                        throw new IllegalArgumentException("Numero no positivos.");
                    }
                }else{
                    break;
                }
            }catch (InputMismatchException e1){
                System.out.println("Error. debe introducir un numero entero.");
                sc.nextLine();
                repetir = true;
            }catch (IllegalArgumentException e2){
                System.out.println("Error: " + e2.getMessage());
                repetir = true;
            }
        }while(repetir || indice < positivos.length);
        return positivos;
    }
    
    static int sumarArray(int[] sumandos){
        int suma  = 0;
        for (int i = 0; i < sumandos.length; i++) {
            suma = sumandos[i]; 
        }
        return suma;
    }
    
    static void menu(int[][] numeros){
        int opcion  = 1;
        boolean salir = false;
        
        do{
            System.out.println("Opciones:\n1. Introducir valores.\n2.Media del array de positivos, el array de negativos y ambos arrays.\n3.Suma del array de positivos, el array de negativos y ambos arrays.\n4.Ordenar el Array.\0.Salir");
            try{
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        introducirNegativos(numeros[0]);
                        introducirPositivos(numeros[1]);
                        break;
                
                    case 2:
                        System.out.println("Media del array de negativos: " + (double) sumarArray(numeros[0]) / numeros[0].length);
                        System.out.println("Media del array de positivos: "+ (double) sumarArray(numeros[1]) / numeros[1].length);
                        System.out.println("Media de ambos arrays: " + (double) (sumarArray(numeros[0]) + sumarArray(numeros[1]))/(numeros[0].length + numeros[1].length));
                        break;
                    case 3:
                        System.out.println("Suma del array de negativos: " + sumarArray(numeros[0]));
                        System.out.println("Suma del array de positivos: "+ sumarArray(numeros[1]));
                        System.out.println("Suma de ambos arrays: " + (sumarArray(numeros[0]) + sumarArray(numeros[1])));
                    case 4:
                        Arrays.sort(numeros[0]);
                        Arrays.sort(numeros[1]);
                        System.out.println("Array bidimensional de num positivos y negativos" + Arrays.deepToString(numeros));
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        salir = true;
                        break;
                    default:
                        throw new IllegalArgumentException ("opcion no disponible");
            }
                
            }catch(InputMismatchException e1){
                System.out.println("Error debe introducir un numero entero");
                sc.nextLine();
            }catch(IllegalArgumentException e2){
                System.out.println("Error: "+ e2.getMessage());
            }catch (Exception e3){
                System.out.println("Error: "+ e3.toString());
                sc.nextLine();
            }// FIN TRY CATCH
        }while (!salir);
    }
    
    public static void main(String [] args){
        
    }
}
