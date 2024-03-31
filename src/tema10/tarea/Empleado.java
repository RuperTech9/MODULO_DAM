
package tema10.tarea;

import java.time.LocalDate;

/**
 *
 * @author Ruper
 */
public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private String puesto;
    private Double salario;
    
    // CONSTRUCTOR
    public Empleado(String nombre, String apellidos, LocalDate fechaNacimiento, LocalDate fechaIngreso, String puesto, Double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    // GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public String getPuesto() {
        return puesto;
    }
    public Double getSalario() {
        return salario;
    }
    
    // SETTERS para poder cambiar los valores de un empleado una vez creado.
    public void setFechaDeIngreso(LocalDate FechaDeIngreso) {
        this.fechaIngreso = FechaDeIngreso;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    // METODO toString
    @Override
    public String toString() {
        return "Nombre: " + nombre +
           " || Apellidos: " + apellidos +
           " || Fecha Nacimiento: " + fechaNacimiento +
           " || Fecha de Ingreso: " + fechaIngreso +
           " || Puesto: " + puesto +
           " || Salario: " + salario;
    }
}
