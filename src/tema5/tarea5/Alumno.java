
package tema5.tarea5;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Ruper
 */
public class Alumno extends Persona { //  subclase Alumno que hereda todas las propiedades y métodos de Persona
    // CONSTRUCTOR
    public Alumno(String nombreCompleto, Fecha fechaNacimiento, String dniTexto) throws Exception { // Parámetros de la clase padre Persona
        super(nombreCompleto, fechaNacimiento, dniTexto); //  Con super establezco el nombre, la fecha y el DNI xa el Alumno
    }
    
    // METODO para calcular la edad
    public int calcularEdad() {
        Calendar fechaActual = new GregorianCalendar(); // objeto para obtener el año, mes y día actuales
        int añoActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1; // +1 porque en Calendar, enero es 0
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
        
        int años = añoActual - getFechaNacimiento().getAño(); // diferencia en años entre el actual y el año de nacimiento del alumno.
        
        if (getFechaNacimiento().getMes() > mesActual || (getFechaNacimiento().getMes() == mesActual && getFechaNacimiento().getDia() > diaActual)) {
            años--; // mes actual menor que mes de nacimiento o mismo mes xo día actual menor que día de nacimiento, se resta uno, ya que no ha cumplido todavía los años
        }
        
        return años;
    }
    
    // METODO toString
    @Override // sobrescribo el método toString de la clase padre Persona
    public String toString() {
        return "Alumno: " + getNombreCompleto() + "\nFecha de Nacimiento: " + getFechaNacimiento() + "\nDNI: " + getDNI() + "\nEdad: " + calcularEdad();
    }
}