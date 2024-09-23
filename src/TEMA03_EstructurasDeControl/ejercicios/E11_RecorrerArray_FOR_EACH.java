
package TEMA03_EstructurasDeControl.ejercicios;


/**
 * Se utiliza para recorrer arrays
 * @author alumno
 */
public class E11_RecorrerArray_FOR_EACH {
    public static void main(String args[]){
        String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" , "Domingo"};
        
        /*for (String dia: semana){
            System.out.println(dia);
        }*/
        for (int i = 0; i<semana.length;i++){
            System.out.println(semana[i]);
        }
        
        
        System.out.println("");
        
        String[] anho = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mes: anho){
            System.out.println(mes);
        }
    }
}
