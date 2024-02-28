
package tema6.arraysBidimensionales;

/**
 *
 * @author alumno
 */
public class Punto {
    int x=0;
    int y=0;
    
    public Punto(int x, int y){
        this.y=y;
        this.x=x;
    }//Fin metodo constructor 1º
    
    @Override
    public String toString(){
        return "[" +x+", "+y+"]";
        
    }
    
    public void setX(int x){
        this.x = x;
    }//Fin
    
    public void setY(int y){
        this.y = y;
    }//Fin
    
    public int getX(){
        return x;
    }//Fin
    
    public int getY(){
        return y;
    }//Fin metodos get y set
    
    public double modulo(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    
    public double fase(){
        double fase = (double)(this.y)/(this.x);
        return Math.atan(fase);
    }
    
}
