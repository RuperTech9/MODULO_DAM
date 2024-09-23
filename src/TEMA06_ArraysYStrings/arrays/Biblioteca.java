
package TEMA06_ArraysYStrings.arrays;

/**
 *
 * @author alumno
 */
public class Biblioteca {
         
    private String libro;
    private String autor;
         
    //Constructor
    public Biblioteca(String libro){
        this.libro = libro;
    }
         
    //Constructor
    public Biblioteca(String libro, String autor){
        this.libro = libro;
        this.autor = autor;
    }
     
    //GET Y SET
    public String getLibro(){
        return libro;
    }
    public String getAutor(){
        return autor;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
         
    //Metodo para sobreescribir un metodo ya creado
    @Override
    public String toString(){
        return (this.autor+", "+this.libro);
    }//Fin Override
         
}//Fin CLASS