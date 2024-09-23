
package TEMA11_LecturaYEscritura.string;

/**
 *
 * @author alumno
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    
    // CONSTRUCTOR
    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + '}';
    }
}
