
package TEMA04_ProgramacionOrientadaObjetos.pajaro;

/**
 *
 * @author alumno
 */
public class Pajaro {
    public String nombre;
    public int posX, posY;
    
    public Pajaro(){};//Metodo constructor 1//Metodo constructor 1
    
    public Pajaro (String nombre, int posX, int posY){//Metodo constructor 1
        this.nombre=nombre;
        this.posX=posX;
        this.posY=posY;
    }
    
    double volar (int posX, int posY){
        double desplazamiento= Math.sqrt (Math.pow((posX-this.posX),2) + Math.pow((posY-this.posY),2));
        this.posX=posX;
        this.posY=posY;
        return desplazamiento;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setposX(int posX){
        this.posX=posX;
    }
    public void setposY(int posY){
        this.posY=posY;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }
}
