
package TEMA05_Herencia.tarea5;

/**
 *
 * @author Ruper
 */
public class Profesor extends Persona { // subclase Profesor que hereda todas las propiedades y métodos de Persona
    // ATRIBUTOS
    private String cuentaBancaria;
    private double nomina;

    // CONSTRUCTOR
    public Profesor(String nombreCompleto, Fecha fechaNacimiento, String dniTexto, String cuentaBancaria, double nomina) throws Exception { // 5 parámetros: 3(Persona)+2(Profesor)
        super(nombreCompleto, fechaNacimiento, dniTexto); // llama al constructor de la clase Persona y le pasa los parámetros suyos.
        this.cuentaBancaria = cuentaBancaria;
        this.nomina = nomina;
    }

    // GETTERS: acceder a valores
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
    public double getNomina() {
        return nomina;
    }
    
    // SETTERS: establecer valores
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    // METODO toString
    @Override // sobrescribo el método toString de la clase padre Persona
    public String toString() {
        return "Profesor: " + getNombreCompleto() + "\nFecha de Nacimiento: " + getFechaNacimiento() + "\nDNI: " + getDNI() + "\nCuenta Bancaria: " + cuentaBancaria + "\nNómina: " + nomina;
    }
}