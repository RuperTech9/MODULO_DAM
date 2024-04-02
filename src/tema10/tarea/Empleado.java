
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
    
    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {    
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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
        return nombre +
           " " + apellidos +
           "    FECHA NACIMIENTO: " + fechaNacimiento +
           "    FECHA INGRESO: " + fechaIngreso +
           "    PUESTO: " + puesto +
           "    SALARIO: " + salario;
    }
}
