
package tema11.tarea;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ruper
 */
public class Socio implements Comparable<Socio> {
    String dni;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public Socio(String dni) {
        this.dni = dni;
    }
    
    int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
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

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    
    @Override
    public boolean equals(Object ob){
        return dni.equals(((Socio) ob).dni);
    }
    
    @Override
    public int compareTo (Socio otro){
        return dni.compareTo(otro.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " NOMBRE: " + nombre + " ANTIGUEDAD: " + antiguedad() + "\n";
    }
}
