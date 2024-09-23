
package TEMA10_Colecciones.ejemplosArrayList;

import java.time.LocalDate;

/**
 *
 * @author Ruper
 */
public class A03_Empleado {
    String nombre;
    String apellidos;
    LocalDate FechaDeNacimiento;
    LocalDate FechaDeIngreso;
    String puesto;
    Double salario;

    public A03_Empleado(String nombre, String apellidos, LocalDate FechaDeNacimiento, LocalDate FechaDeIngreso, String puesto, Double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.FechaDeIngreso = FechaDeIngreso;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public LocalDate getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public String getPuesto() {
        return puesto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaDeNacimiento(LocalDate FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public void setFechaDeIngreso(LocalDate FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Nombre: ");
        sb.append(nombre);
        sb.append(" || Apellidos: ");
        sb.append(apellidos);
        sb.append(" || Fecha Nacimiento: ");
        sb.append(FechaDeNacimiento);
        sb.append(" || Fecha de Ingreso: ");
        sb.append(FechaDeIngreso);
        sb.append(" || Puesto: ");
        sb.append(puesto);
        sb.append(" || Salario: ");
        sb.append(salario);
        
        // Devolvemos el valor
        return sb.toString();
    }
}
