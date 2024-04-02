
package tema10.tarea;

import java.time.LocalDate;

/**
 *
 * @author Ruper
 */
public class Test {
    public static void main(String[] args){
        // Objeto EmpleadosEmpresa
        EmpleadosEmpresa empresa = new EmpleadosEmpresa();
       
        // EMPLEADO 1
        LocalDate fechaNacimientoJuan = LocalDate.parse("1960-01-01");
        LocalDate fechaIngresoJuan = LocalDate.parse("1980-05-24");
        empresa.empleados.add(new Empleado("Juan", "Torres", fechaNacimientoJuan, fechaIngresoJuan, "Jefe", 60000.0));
        
        // EMPLEADO 2
        LocalDate fechaNacimientoSara = LocalDate.parse("1980-05-02");
        LocalDate fechaIngresoSara = LocalDate.parse("1999-06-03");
        empresa.empleados.add(new Empleado("Sara", "Gonzalez", fechaNacimientoSara, fechaIngresoSara, "Secretaria", 25000.0));
        
        // EMPLEADO 3
        LocalDate fechaNacimientoElena = LocalDate.parse("1990-09-03");
        LocalDate fechaIngresoElena = LocalDate.parse("2010-11-02");
        empresa.empleados.add(new Empleado("Elena", "Sanchez", fechaNacimientoElena, fechaIngresoElena, "TecnicoFP", 30000.0));
        
        // EMPLEADO 4
        LocalDate fechaNacimientoPepe = LocalDate.parse("1991-10-04");
        LocalDate fechaIngresoPepe = LocalDate.parse("2015-10-01");
        empresa.empleados.add(new Empleado("Pepe", "Uriel", fechaNacimientoPepe, fechaIngresoPepe, "Administrativo", 24000.0));
    
        empresa.mostrarMenu();
    } // FIN MAIN
}
