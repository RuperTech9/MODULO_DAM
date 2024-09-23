
package TEMA03_EstructurasDeControl.juegos;

import java.util.Scanner;

/**
 * Escribe un programa que convierta segundos en horas, minutos y segundos. 
 * El usuario introducirá los segundos y el programa mostrará el equivalente en horas, minutos y segundos.
 * @author Ruper
 */
public class ConversorTiempo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce los segundos: ");
        int segundosTotales = teclado.nextInt();

        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        System.out.printf("Equivalente: %d horas, %d minutos y %d segundos", horas, minutos, segundos);

    }
    
}
