
package tema5.profesorAlumno;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona{
    enum especialidad{INFORMATICA,ADMINISTRATIVO,FINANZAS};
    private especialidad e1;
    
    // CONSTRUCTOR
    public Profesor(){}
    
    public Profesor(String nombre, String apellido, int edad, especialidad e1) {
        Profesor.super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        this.e1 = e1;
    }
    
    // SET
    public void setEspecialidad(especialidad e1) {
        this.e1 = e1;
    }
    // GET
    public especialidad getEspecialidad() {
        return e1;
    }
    
    // MÉTODOS PROPIOS
    public void imprimirCabecera() {
        System.out.println("Datos del Profesor:");
    }

    public void imprimirProfesor() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido: " + super.getApellido());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Especialidad: " + this.e1);
    }
    
    @Override
    public String toString(){
        return "Informacion del Profesor:\n"+"Nombre y Apellido: "+super.getNombre()+" "+super.getApellido()+"\nEdad: "+super.getEdad()+"\nEspecialidad: "+e1;
    }
}
