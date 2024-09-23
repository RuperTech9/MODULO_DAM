
package TEMA04_ProgramacionOrientadaObjetos.radioDigital;

/**
 *
 * @author alumno
 */
public class RadioDigital {
    private String nombre;
    private double frecuencia;
    
    
    //CONSTRUCTOR
    public RadioDigital(){}
    
    //CONSTRUCTOR 2
    public RadioDigital (String nombre, double frecuencia){
        this.frecuencia = frecuencia;
        this.nombre=nombre;
    }
    
    //SET
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setFrecuencia(double frecuencia) {
        this.frecuencia=frecuencia;
    }

    //GET
    public String getNombre(){
        return nombre;
    }
    public double getFrecuencia(){
        return frecuencia;
    }
    
    //METODOS
    
    @Override
    public String toString() {
        return nombre + " - " + frecuencia + " MHz";
    } 
}