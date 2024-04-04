
package tema11.escritura;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class prueba1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        File fichero1 = new File(".\\src\\tema11\\escritura\\prueba1.txt");
        
        //Compruebo que el directorio existe
        if(!fichero1.exists()){
            System.out.println("El archivo no existe!!!");
            System.out.println("¿Quiere crear un nuevo fichero? Pulse Y.");
            String respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("Y")){
                System.out.println("Nombre del nuevo fichero: ");
                String nombreFichero = sc.nextLine();
                
                File ficheroUser = new File(".\\src\\tema11\\escritura\\" + nombreFichero);
                
                ficheroUser.createNewFile();//Crea el fichero
                ficheroUser.getAbsoluteFile();//Pilla la ruta donde se guarda el fichero
                System.out.println("El archivo se ha creado correctamente.");
            } else{
                System.out.println("El programa se cerrará");
            }//Fin if-else
        }
        
    }//Fin main
}//Fin class
