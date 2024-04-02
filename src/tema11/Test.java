
package tema11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException{
        // Definicion del array list de tipo String
        ArrayList<String> alumnos = new ArrayList<>();
        // Instanciar el fichero donde se encuentran los datos
        File fichero = new File(".\\src\\tema11\\alumnos.txt");
        Scanner sc = null;
        
        
        try{
            System.out.println("Leer contenido del fichero");
            sc = new Scanner(fichero);
            // Obtener los datos
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
                alumnos.add(linea);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e1){
            e1.printStackTrace();
        }finally{
            sc.close();
        }
        
        System.out.println("Alumnos de 1ºDAM: " + alumnos.size());
        Iterator<String> iterator = alumnos.iterator();
        System.out.println("");
        
        while (iterator.hasNext()) { // Mientras haya más elementos en la lista...
            String alumnosDAM = iterator.next(); // Recorro la Lista de Empleados.
            System.out.println(alumnosDAM);
        }
        
    }
}
