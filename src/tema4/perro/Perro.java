
package tema4.perro;

/**
 *
 * @author alumno
 */
public class Perro {
    String nombre;
    String raza;
    Boolean pulgas;  
    
    public Perro () {
	this.nombre = "";
	this.raza = "";
        this.pulgas = true;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public void setPulgas(boolean pulgas){
        this.pulgas=pulgas;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public boolean getPulgas(){
        return pulgas;
    }
  
}
