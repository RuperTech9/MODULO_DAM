
package tema4.circulo;

/**
 *
 * @author alumno
 */
public class CirculoMAIN {
    public static void main(String [] args){
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);
        
        c1.calcularSuperficie();
        c2.calcularSuperficie();
    }
}
