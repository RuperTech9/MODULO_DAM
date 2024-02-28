
package tema2.ejercicios;

import java.util.Scanner;

/**
 * Crear un tipo enumerado llamado Planetas que contenga los 8 planetas del Sistema Solar. 
 * Muestra el texto relativo al nombre del primer planeta, intenta
 * mostrar la posición que ocupan en ese listado (método ordinal()) 
 * e intenta mostrar también el número de planetas existentes con .values()  sacarás el array de componentes que tiene, 
 * y a dicho array le podrás aplicar la propiedad .length para mostrar el tamaño de dicho array).
 * @author Ruper
 */
public class E14_Planetas_ARRAY {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        String[] planetas = new String[8];
        
        planetas[0]="MERCURIO";
        planetas[1]="VENUS";
        planetas[2]="TIERRA";
        planetas[3]="MARTE";
        planetas[4]="JUPITER";
        planetas[5]="SATURNO";
        planetas[6]="URANO";
        planetas[7]="NEPTUNO";
        
      
        System.out.print("\nIntroduce una posición (del 1 al 8) para conocer el planeta: ");
        int posicion = teclado.nextInt();

        // Validación de la entrada
        while (posicion < 1 || posicion > 8) {
            System.out.println("\nPosición inválida. Introduce una posición del 1 al 8: ");
            posicion = teclado.nextInt();
        }

        // Mostrar el nombre del planeta correspondiente a esa posición
        System.out.println("\nEl planeta número " + posicion + " es: " + planetas[posicion - 1]);
        
        System.out.println("Número total de planetas: " + planetas.length);
    }
    
}


/*
enum Planetas {
        MERCURIO,
        VENUS,
        TIERRA,
        MARTE,
        JUPITER,
        SATURNO,
        URANO,
        NEPTUNO;
    }

    public static void main(String[] args) {
        // Mostrar el nombre del primer planeta
        System.out.println("Nombre del primer planeta: " + Planetas.MERCURIO);
        
        // Mostrar la posición que ocupa en el listado
        System.out.println("Posición de " + Planetas.MERCURIO + ": " + Planetas.MERCURIO.ordinal());
        
        // Mostrar el número total de planetas
        System.out.println("Número total de planetas: " + Planetas.values().length);
    }
*/