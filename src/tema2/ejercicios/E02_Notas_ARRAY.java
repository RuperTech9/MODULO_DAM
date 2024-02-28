
package tema2.ejercicios;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class E02_Notas_ARRAY {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int [] array1; //declarar array
        array1 = new int[6]; //reserva en memoria
        int [] array2 = new int[6]; //Dos acciones en una sola
        String [] array3 = new String[6];
        teclado.nextLine();
        for (int i=0;i<6;i++){
            System.out.println("Introduzca la nota "+i);
            array1[i]= teclado.nextInt();
            System.out.println("Introduzca el nombre"+i);
            array3[i]= teclado.nextLine();
        }
        
        for (int i=0;i<6;i++){
            System.out.println("nota: "+array1[i]+" Modulo: "+array3[i]);
        }
        
        array1[0]=6;
        array1[1]=4;
        array1[2]=3;
        array1[3]=1;
        array1[4]=9;
        array1[5]=6;
    
    
        array3[0]="BBDD";
        array3[1]="PROG";
        array3[2]="SYS";
        array3[3]="LM";
        array3[4]="FOL";
        array3[5]="ENTORNOS";
    
    
        System.out.println("Posicion cero del array es: "+array1[0]);
    
        array2[2]=array1[0];
        System.out.println("Posicion 2 del array2 es: "+array2[2]);
    
        System.out.println("La tercera asignatura es: "+array3[2]+": "+array2[2]);
    
    
    
    }
}