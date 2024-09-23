
package TEMA06_ArraysYStrings.tarea6;

/**
 *
 * @author Ruper
 */
public class NotasAlumnos_MAIN {
    public static void main(String[] args) {
        NotasAlumnos listado = new NotasAlumnos();
        
        listado.añadirAlumno("Juan",6);
        listado.añadirAlumno("Pepe",3);
        listado.añadirAlumno("Sara",8);
        listado.añadirAlumno("Alejandro",9);
        
        listado.mostrarMenu();
    } // FIN MAIN
} // FIN CLASE
