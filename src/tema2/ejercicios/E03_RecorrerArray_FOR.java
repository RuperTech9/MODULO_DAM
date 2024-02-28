
package tema2.ejercicios;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E03_RecorrerArray_FOR {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int [] nota = new int[6]; //Dos acciones en una sola
        String [] modulo = new String[6];
        
        for (int i=0;i<6;i++){
            System.out.println("Nombre del modulo "+i);
            modulo[i]= teclado.nextLine();
            System.out.println("Nota "+i);
            nota[i]= teclado.nextInt();
            teclado.nextLine();
        }
        
        for (int i=0;i<6;i++){
            System.out.println("Modulo: "+modulo[i]+"\nNota: "+ nota[i]);
        }
    }
}
