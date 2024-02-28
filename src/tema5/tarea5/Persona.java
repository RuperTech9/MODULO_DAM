
package tema5.tarea5;

/**
 *
 * @author Ruper
 */
public class Persona {
    // ATRIBUTOS
    private String nombreCompleto;
    private Fecha fechaNacimiento; // instancia de la clase Fecha
    private final DNI dni; // instancia de la clase DNI

    // CONSTRUCTOR
    public Persona(String nombreCompleto, Fecha fechaNacimiento, String dniTexto) throws Exception {// dniTexto lo pasaremos al método establecer de la clase DNI
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = new DNI();
        this.dni.establecer(dniTexto);// paso el parámetro dniTexto para que se valide y se establezca el número y letra del DNI, si no es válido saldrá una excepción.
    }
    
    // GETTERS: acceder a valores
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getDNI() {
        return dni.obtenerNIF(); // número del DNI más la letra
    }
    
    // SETTERS: establecer valores
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setDNI(String dniTexto) throws Exception { // lanza una excepción si el DNI no es válido.
        this.dni.establecer(dniTexto);
    }
}