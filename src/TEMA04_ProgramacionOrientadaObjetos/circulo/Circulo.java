
package TEMA04_ProgramacionOrientadaObjetos.circulo;

/**
 *
 * @author alumno
 */
public class Circulo {
    //ATRIBUTOS
    private double radio = 2;
    private static final double PI = 3.141592;
    
    //CONSTRUCTOR VACIO
    public Circulo(){}
    
    //CONSTRUCTOR
    public Circulo(double radio){
        this.radio=radio;
    }
    
    //SET
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    //GET
    public double getRadio(){
        return radio;
    }
    
    //METODOS
    public void calcularSuperficie(){
        double area = PI*(this.radio*this.radio);
        System.out.println("El area es: "+area);
    }
}
