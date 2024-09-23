package TEMA06_ArraysYStrings.arraysBidimensionales;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class ComidaSemanaV2 {
         
    public static void main(String[] args){
        //Array para imprimir los dias de la semana
        String[] dias = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};

        //Array Bidimensioanal Irregular 
        String[][] comidas = {
            {"Tostadas", "Estofado", "Ensalada"},
            {"Cereales", "Potaje", "Sopa"},
            {"Galletas", "Hamburguesa", ""},  //SE LE PONE " " PORQUE ES UN VALOR VACIO (null)
            {"Zumo", "Cachopo", ""},
            {"Tostadas", "Empanada", "Salmon"},
            {"Tarta", "Macarrones", "Calamares"},
            {"Cereales", "Tortilla", "Pizza"}
        };
                  
                  
        //Reutilizamos el menu de opciones
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
                    System.out.print("Seleccione el dia que quiera consultar: ");
                    String diaConsultado = teclado.nextLine(); 
                    for (int i = 0; i < dias.length; i++) {
                        if (diaConsultado.equalsIgnoreCase(dias[i])) {
                            System.out.println("Aqu� tiene el men� del " + dias[i] + ": ");
                            System.out.println("Desayuno: " + comidas[i][0]);
                            System.out.println("Comida: " + comidas[i][1]);
                            System.out.println("Cena: "+ comidas[i][2]);
                            break;
                        }
                    }//Fin 1 for
                    System.out.println();
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
    public static void encontrarComida(String[][] comidas, String[] dias, String buscarComida) {
        boolean encontrada = false;
        for (int i = 0; i < comidas.length; i++) {
                           if (buscarComida.equalsIgnoreCase(comidas[i][1])) {
                                    encontrada = true;
                                    System.out.println("Ha comido: " + buscarComida + " el " + dias[i]);
                           }
                                   
                  }//Fin 1 for
                  if (!encontrada) {
                           System.out.println("Esta semana no ha comido " + buscarComida);
                  }//Fin if
         }//Fin encontrarComida

         //Metodo para calcular y mostrar los d�as sin cenar
         public static void diasSinCenar(String[][] comidas, String[] dias) {
                  int suma = 0;
                  for (int i = 0; i < dias.length-1; i++) {
                           if (comidas[i][2].equalsIgnoreCase("")) {
                                    suma += 1;
                                    System.out.println("El " + dias[i] + " no ha cenado.");
                           }
                  }//Fin 1 for
                  System.out.println("Total de d�as sin cenar: " + suma);
         }
         
}//Fin Class
