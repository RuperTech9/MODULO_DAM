
package tema4.individuo;

/**
 *
 * @author Ruper
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    
    //Metodos constructores
    public Empleado(){}
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        sueldo=salario;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSueldo(double salario){
        sueldo=salario;
    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public double getSueldo(){
        return sueldo;
    }
    
    //METODOS
    public void subirSueldo(double porcentaje){
        System.out.println("Ha subido un total de : " + sueldo * porcentaje);
        sueldo = sueldo + (sueldo*porcentaje/100);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+", sueldo: "+sueldo);
    }
}
