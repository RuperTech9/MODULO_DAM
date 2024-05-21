
package tema11.tarea;

/**
 *
 * @author Ruper
 */
public class Jugador {
    int dorsal;
    String dni;
    String nombre;
    JugadorPosicion posicion;
    String estatura;
        

    public Jugador(int dorsal, String dni, String nombre, JugadorPosicion posicion, String estatura) {
        this.dorsal = dorsal;
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public JugadorPosicion getPosicion() {
        return posicion;
    }

    public void setPosicion(JugadorPosicion posicion) {
        this.posicion = posicion;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Jugador{" + "dorsal=" + dorsal + ", dni=" + dni + ", nombre=" + nombre + ", posicion=" + posicion + ", estatura=" + estatura + '}';
    }
    
    
}
