
package TEMA04_ProgramacionOrientadaObjetos.rectangulo;

/**
 *
 * @author alumno
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    //CONSTRUCTOR VACIO
    Rectangulo(){}
    
    //CONSTRUCTOR
    Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    
    //SETTERS
    public void setBase(double base){
        this.base=base;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    //GETTERS
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    //AREA
    public void getArea(){
        double area=base*altura;
        System.out.println("El area del rectangulo es: "+area);
    }
    //PERIMETRO
    public void getPerimetro(){
        double perimetro= 2 * (base+altura);
        System.out.println("El area del rectangulo es: "+perimetro);
    }
    
    
    
    //el this no hay argumento con el mismo nombre de variable
    //mismo nombre de argumento qeu de atributo
    
}
