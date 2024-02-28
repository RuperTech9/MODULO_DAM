
package tema4.usuario;

/**
 *
 * @author alumno
 */
public class Usuario {
    private String nombre,eMail,ciudad;
    private long movil;
    private boolean mayorEdad;
    
    public Usuario(String nombre, String eMail, String ciudad, long movil, boolean mayorEdad){
        this.nombre=nombre;
        this.eMail=eMail;
        this.ciudad=ciudad;
        this.movil=movil;
        this.mayorEdad=mayorEdad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEmail(String eMail){
        this.eMail=eMail;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    
    public void setMovil(long movil){
        this.movil=movil;
    }
    
    public void setMayorEdad(boolean mayorEdad){
        this.mayorEdad=mayorEdad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEmail(){
        return eMail;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public long getMovil(){
        return movil;
    }
    
    public boolean getMayorEdad(){
        return mayorEdad;
    }
    
}
