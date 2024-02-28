
package tema5.alumnoProfesor;

import tema5.alumnoProfesor.Profesor.especialidad;

/**
 *
 * @author alumno
 */
public class HerenciaMAIN {
    public static void main(String [] args){
        Alumno alumno1 = new Alumno("Juan","Torres",24,11111111);
        System.out.println("Nombre: "+alumno1.nombre+" Apellido: "+alumno1.apellido+" Edad: "+alumno1.edad+" NIA: "+alumno1.NIA);
        
        alumno1.imprimirCabecera();
        alumno1.imprimirAlumno();
        
        Profesor profesor1 = new Profesor("Jaime","Torres",40,especialidad.INFORMATICA);
        
        profesor1.imprimirCabecera();
        profesor1.imprimirProfesor();
        
        System.out.println(profesor1.toString());
        
    }
    
}
