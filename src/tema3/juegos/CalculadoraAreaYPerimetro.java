
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class CalculadoraAreaYPerimetro {
    
    static final double Pi = 3.14159;
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int radio=15;
        
        double area = Pi* (radio*radio);
        double perimetro = 2 * Pi * radio;
        
        System.out.println("Area= "+area+" Perimetro= "+perimetro);
    }
}
