
package TEMA11_LecturaYEscritura.escritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class prueba1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        File fichero1 = new File(".\\src\\tema11\\escritura\\prueba1.txt");
        
        //Compruebo que el directorio existe.
        if(!fichero1.exists()){
            System.out.println("El archivo no existe!!!");
            System.out.print("¿Quiere crear un nuevo fichero? Pulse Y.");
            String respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("Y")){
                System.out.println("Nombre del nuevo fichero: ");
                String nombreFichero = sc.nextLine();
                
                File ficheroUser = new File(".\\src\\tema11\\escritura\\" + nombreFichero);
                
                //Posibles excepciones de espacio y permisos. InputException o OutputException
                try {
                    ficheroUser.createNewFile();//Crea el fichero
                    ficheroUser.getAbsoluteFile();//Pilla la ruta donde se guarda el fichero
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                System.out.println("El archivo se ha creado correctamente.");
            } else{
                System.out.println("El programa se cerrará");
            }//Fin if-else
        } // PRIMER IF CREACION DEL FICHERO
        else{
            try { //usaremos BufferedReader y BufferedWriter
                BufferedReader br = new BufferedReader(new FileReader(".\\src\\tema11\\escritura\\prueba1.txt")); //Lectura
                BufferedWriter bw = new BufferedWriter(new FileWriter(".\\src\\tema11\\escritura\\prueba1.txt")); //Escritura
                
                //Escribimos en el fichero
                bw.write("LINEA 1");
                System.out.println("ESCRIBA SU LINEA 1:");
                String escritura = sc.nextLine();
                bw.write(escritura);
                //Una nueva linea
                bw.newLine();
                bw.write("LINEA 2");
                System.out.println("ESCRIBA SU LINEA 2:");
                escritura = sc.nextLine();
                bw.write(escritura);
                
                bw.flush();; //Para guardar en el fichero         
                
            }catch(Exception e){
                
            }
        } 
    }//Fin main
}//Fin class
