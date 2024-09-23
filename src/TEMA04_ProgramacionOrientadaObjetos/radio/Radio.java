
package TEMA04_ProgramacionOrientadaObjetos.radio;

/**
 * Crear un objeto Radio que tenga frecuencia entre 80 y 108,
 * el usuario introduce la frecuencia y puede subir o bajarla 0,5
 *  si la frecuencia máxima es superada se volvera a contar desde la frecuencia minima
 * también puede mostrar la frecuencia y salir
 * @author alumno
 */
public class Radio {
    private double frecuencia;
    private static final double  frecuenciaMinima = 80;
    private static final double  frecuenciaMaxima = 108;
    private static final double variacion = 0.5;
    
    //CONSTRUCTOR
    public Radio(){}
    
    //CONSTRUCTOR 2
    public Radio (double frecuencia){
        this.frecuencia = frecuencia;
    }
    
    //SET
    public void setFrecuencia(double frecuencia) {
        if (frecuencia >= frecuenciaMinima && frecuencia <= frecuenciaMaxima) {
            this.frecuencia = frecuencia;
        } else {
            this.frecuencia = frecuenciaMinima; // Valor por defecto si está fuera de rango
        }
    }

    //GET
    public double getFrecuencia(){
        return frecuencia;
    }
    
    //METODOS
    public void subirFrecuencia(){
        frecuencia = frecuencia + variacion;
        if(frecuencia>frecuenciaMaxima){
            frecuencia=frecuenciaMinima;
        }
    }
    public void bajarFrecuencia(){
        frecuencia = frecuencia - variacion;
        if(frecuencia<frecuenciaMinima){
            frecuencia=frecuenciaMaxima;
        }
    }
    
    public void mostrarDatos(){
        System.out.println("La frecuencia es: "+frecuencia);
    }  
}
