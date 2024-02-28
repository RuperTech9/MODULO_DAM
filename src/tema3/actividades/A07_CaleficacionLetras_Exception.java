
package tema3.actividades;

import java.io.IOException;


/**
 *
 * @author alumno
 */
public class A07_CaleficacionLetras_Exception {
    public static void main(String[] args) throws IOException {
        int nota = 0;
        char calificacion;
        boolean noValida;
        
        System.out.println("Ingrese las calificaciones con las letras I, F, B, N, S (en mayúsculas o minúsculas):");
        calificacion  = (char) System.in.read();
        
        calificacion  = Character.toUpperCase(calificacion);
        
        System.out.println(calificacion);
        
        switch (calificacion) {
            case 'I':
                nota=4;
                break;
            case 'F':
                nota=4;
                break;
            case 'B':
                nota=4;
                break;
            case 'N':
                nota=4;
                break;
            case 'S':
                nota=4;
                break;
        }
        
        System.out.println("La nota es: "+nota);
 
    }
    
}