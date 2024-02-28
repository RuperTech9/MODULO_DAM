
package tema5.alumnoProfesor;

/**
 *
 * @author alumno
 */
public class Persona {
    
    //Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    //Metodos Constructores
    public Persona(){}
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
}
