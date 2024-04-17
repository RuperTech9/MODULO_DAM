
package tema11.objetos;

import java.time.LocalDate;

/**
 *
 * @author Ruper
 */
public class Socio {
    private String apodo;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio(String apodo, String nombre, LocalDate fechaAlta) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
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
    public String toString() {
        return "Apodo: " + apodo + ", Nombre: " + nombre + ", Fecha de alta: " + fechaAlta;
    }
}
