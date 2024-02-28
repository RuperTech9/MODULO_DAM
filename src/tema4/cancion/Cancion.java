
package tema4.cancion;

/**
 *
 * @author alumno
 */

//CLASE
public class Cancion {
    String nombre;
    int duracion;
    String genero;
    Double tamaño;
    
    public Cancion (String nombre, int duracion, String genero, Double tamaño){
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.tamaño = tamaño;
    }
    
    public static void main(String [] args){
        Cancion pista1 = new Cancion ("Intro", 32, "OUT", 23.0);
        System.out.println(pista1.nombre);
        System.out.println(pista1.duracion);
        System.out.println(pista1.genero);
        System.out.println(pista1.tamaño);
    }
      
}




