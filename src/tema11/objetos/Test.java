
package tema11.objetos;

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
        ArrayList<Alumno> alumnosDAM = new ArrayList<>();
        // Instanciar el fichero donde se encuentran los datos
        File fichero = new File(".\\src\\tema11\\objetos\\alumnos2.txt");
        Scanner sc = null;
        
        
        try{
            System.out.println("Leer contenido del fichero");
            sc = new Scanner(fichero);
            // Obtener los datos
            while (sc.hasNextLine()) {
                String linea = sc.nextLine(); //sin el has ya que no comprueba. Obtiene una linea de 1 alumno
                String[] partes = linea.split("::"); //creo un arreglo de String llamado partes
                
                //Objeto clase Alumno con sus atributos
                Alumno alumno = new Alumno();
                
                alumno.setNumero(Integer.parseInt(partes[0]));
                alumno.setNombre(partes[1]);
                alumno.setApellido(partes[2]);
                
                //añadir el alumno a la lista
                alumnosDAM.add(alumno);
                /* SIN LLAMAR AL OBJETO
                String nombre = partes[0]; //nombre 
                String apellido = partes[1]; // apellido
                int numero = Integer.parseInt(partes[2]); // convertirlo a un valor entero
                // Objeto clase Alumno
                Alumno alumno = new Alumno(nombre, apellido, numero);
                alumnos.add(alumno);
                */
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e1){
            System.out.println("ERROR excepcional:");
            e1.printStackTrace();
        }finally{
            try{
                if (sc != null) {
                    sc.close();
                }
            } catch(Exception e2){
                System.out.println("ERROR al cerrar el fichero");
                e2.printStackTrace();
            }
            
        }
        
        System.out.println("Alumnos de 1ºDAM: " + alumnosDAM.size());
        
        
        Iterator<Alumno> itAlumnos = alumnosDAM.iterator();
        System.out.println(" Nº "+"NOMBRE "+" APELLIDOS");
        System.out.println("-------------------------");
        
        while (itAlumnos.hasNext()) { // Mientras haya más elementos en la lista...
            Alumno lista = itAlumnos.next(); // Recorro la Lista de Empleados.
            System.out.println("  "+ lista.getNumero()+" "+lista.getNombre()+" "+lista.getApellido());
        }
        
    }
}
