
package tema4.punto;

/**
 *
 * @author alumno
 */
public class Punto {
    private int x,y;
    private static final double PI = 3.1415;   // se puede usar sin crearla en el constructor
    
    public Punto(int x, int y){
        this.y=y;
        this.x=x;
    }//Fin metodo constructor 1º
    
    public Punto(){
        this.x=0;
        this.y=0;
    }//Fin metodo constructor 2º
    
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
