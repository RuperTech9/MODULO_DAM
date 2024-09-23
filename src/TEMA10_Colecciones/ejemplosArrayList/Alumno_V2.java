
package TEMA10_Colecciones.ejemplosArrayList;

/**
 * para ordenar un Comparator y para recorrer un iterator
 * @author Ruper
 */
public class Alumno_V2 {
    // Atributos
    private String nombre;
    private String apellidos;
    private int numero;
    
    // Constructores
    public Alumno_V2() {
    }
    
    public Alumno_V2(String nombre, String apellidos, int numero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero = numero;
    }
    
    // Métodos SET y GET
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero: ");
        sb.append(numero);
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nApellidos: ");
        sb.append(apellidos);
        
        // Devolvemos el valor
        return sb.toString();
    }
}