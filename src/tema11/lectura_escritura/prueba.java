
package tema11.lectura_escritura;

import java.io.*;


/**
 *
 * @author alumno
 */
public class prueba {
    public static void main(String[] args){
        File fichero = new File(".\\src\\tema11\\lectura_escritura\\prueba.txt");
        
        if(fichero.exists()){
            System.out.println("NOMBRE DEL FICHERO: " + fichero.getName());
            System.out.println("RUTA: " + fichero.getPath());
            System.out.println("RUTA ABSOLUTA: " + fichero.getAbsolutePath());
            System.out.println("SE PUEDE LEER: " + fichero.canRead());
            System.out.println("SE PUEDE ESCRIBIR: " + fichero.canWrite());
            System.out.println("TAMAÑO DEL FICHERO: " + fichero.length());
        }
        // fichero.delete(); Para borrar el fichero
    }
}
