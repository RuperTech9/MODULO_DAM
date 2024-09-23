
package TEMA04_ProgramacionOrientadaObjetos.individuo;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class FechaMAIN2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        
        // Solicitamos los datos por teclado
        System.out.println("Introducción de Fecha");
        System.out.print("dia: ");
        dia = teclado.nextInt();
        System.out.print("mes: ");
        mes = teclado.nextInt();
        System.out.print("año: ");
        año = teclado.nextInt();
        
        // Se crea un objeto de tipo Fecha con el parametro constructor
        Fecha fecha1 = new Fecha(dia,mes,año);
        Fecha fecha2 = new Fecha();
        
        // Comruebo si la fecha es correcta
        if(fecha1.fechaCorrecta()){
            System.out.println("Fecha introducida:" + fecha1);
            
        }else{
            System.out.println("Fecha incorrecta");
        }
    
        fecha2 = fecha1;
        System.out.println("Fecha segunda: "+ fecha2);
        fecha1.setDia(15);
        
        System.out.println("Fecha inicial: "+ fecha1);
        System.out.println("Fecha segunda: "+ fecha2); // No estoy copiando estoy apuntando
        
        fecha2 = (Fecha) fecha1.clone();
        System.out.println("Fecha segunda (clonada): " + fecha2);
        fecha1.setDia(15);

        System.out.println("Fecha inicial: " + fecha1);
        System.out.println("Fecha segunda (clonada): " + fecha2); // Ahora es una copia
    
    }
}
