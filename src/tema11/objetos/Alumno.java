
package tema11.objetos;


/**
 *
 * @author alumno
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    int numero;
    
    // CONSTRUCTOR
    public Alumno(String nombre, String apellido, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }
    
    public Alumno(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + '}';
    }
}
