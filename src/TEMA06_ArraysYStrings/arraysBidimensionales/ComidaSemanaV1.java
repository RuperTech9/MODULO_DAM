package TEMA06_ArraysYStrings.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author david
 */

public class ComidaSemanaV1 {
          
    public static void main(String[] args){
        //Array para imprimir los dias de la semana
        String[] dias = {"Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo"};

        //Array Bidimensioanal Irregular 
        String [][] comidas = {
            {"Tostadas", "Estofado", "Ensalada"},
            {"Cereales", "Potaje", "Sopa"},
            {"Galletas", "Hamburguesa"},
            {"Zumo", "Cachopo"},
            {"Tostadas", "Empanada", "Salmon"},
            {"Tarta", "Macarrones", "Calamares"},
            {"Cereales", "Tortilla", "Pizza"}
        };
                   
        int opcion;
        //Menu dentro de un bucle para que se repita hasta que el usuario pulse "5"
        do {
            System.out.println("""
            *******************************************************************************************************************
            ****  1- Saber lo que he desayunado, comido y cenado un d�a de la semana. 
            ****  2- Buscar que d�as se ha realizado una comida concreta                          
            ****  3- Numero de d�as que no ha realizado cena y cuales.                               
            ****  4- Resumen comida semana.                                                                          
            ****  5- Salir.                                                                                                             
            ********************************************************************************************************************
            """);
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {
                case 1:
                    System.out.print("Seleccione el dia que quiera consultar (1-7): ");
                    int diaConsultado = teclado.nextInt();
                    if(diaConsultado >= 1 && diaConsultado <= 7){
                        System.out.println("Aqui tiene el menu del  "+dias[diaConsultado-1]+": ");
                        System.out.println("Desayuno: "+comidas[diaConsultado-1][0]);
                        System.out.println("Comida: "+comidas[diaConsultado-1][1]);
                        if (comidas[diaConsultado - 1].length > 2) {
                            System.out.println("Cena: " + comidas[diaConsultado - 1][2]);
                        } else {
                            System.out.println("Cena: No se ha cenado este d�a.");
                        }
                    } else {
                        System.out.println("N�mero de d�a inv�lido.");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Introduzca el nombre de la comida: ");
                    String buscarComida = teclado.nextLine();
                    encontrarComida(comidas, dias, buscarComida);
                    break;
                case 3:
                    diasSinCenar(comidas, dias);
                    break;
                case 4:
                                                 System.out.println("Menu de la semana:  ");
                                                 for (int i = 0; i < comidas.length; i++) {
                                                           System.out.print(dias[i] + ":   ");
                                                           for (int j = 0; j < comidas[i].length; j++) {
                                                                     System.out.print(comidas[i][j]);
                                                                     //Si no es el ultimo, imprime una coma ,
                                                                     if (j < comidas[i].length - 1) {
                                                                               System.out.print(", ");
                                                                     }//Fin if
                                                           }//Fin 2 for
                                                           System.out.println("");
                                                 }//Fin 1 for
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
         
         //Metodo para buscar una comida entre la semana y si la hay, indicar que d�as.
         public static void encontrarComida(String[][] comidas, String[]  dias, String buscarComida){
                   boolean encontrada=false;
                   for (int i = 0; i < comidas.length; i++) {
                             for (int j = 0; j < comidas[i].length; j++) {
                                       if(buscarComida.equalsIgnoreCase(comidas[i][j] ) )  {
                                                 encontrada = true;
                                                 System.out.println("Ha comido: "+buscarComida+" el "+dias[i]);
                                       }
                             }//Fin 2 for
                   }//Fin 1 for
                   if(!encontrada){
                             System.out.println("Esta semana no ha comido "+buscarComida);
                   }//Fin if
         }//Fin encontrarComida
         
         //Metodo para calcular y mostrar los d�as sin cenar
         public static void diasSinCenar(String[][] comidas, String[] dias){
                   int suma=0;
                   for (int i = 0; i < comidas.length; i++) {
                             if (comidas[i].length < 3) {
                                       suma += 1;
                                       System.out.println("El " + dias[i] + " no ha cenado.");
                             }
                   }//Fin 1 for
                   System.out.println("Total de d�as sin cenar: "+suma);
         }
         
}//Fin Class
