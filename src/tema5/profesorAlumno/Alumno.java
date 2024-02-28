
package tema5.profesorAlumno;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    // ATRIBUTOS
    public int NIA;
    
    // CONSTRUCTORES
    public Alumno(){}
    public Alumno(String nombre, String apellido, int edad, int NIA){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.NIA=NIA;
        
    }
   
    // SET
    public void setNIA(int NIA) {
        this.NIA = NIA;
    }
    
    // GET
    public int getNIA() {
        return NIA;
    }
    
    // MÉTODOS PROPIOS
    public void imprimirCabecera() {
        System.out.println("Datos del Alumno:");
        System.out.println("|   ALUMNO  |EDAD|  NIA |");
    }

    public void imprimirAlumno() {
        System.out.println("Nombre: " + Alumno.super.getNombre());
        System.out.println("Apellido: " + Alumno.super.getApellido());
        System.out.println("Edad: " + Alumno.super.getEdad());
        System.out.println("NIA: " + Alumno.this.NIA);
    }
    
    @Override
    public String toString(){
        return "Informacion del alumno:\n"+"Nombre y Apellido: "+super.getNombre()+" "+super.getApellido()+"\nEdad: "+super.getEdad()+"\nNIA: "+NIA;
    }
}// FIN SUBCLASE ALUMNO
