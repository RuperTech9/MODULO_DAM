
package tema4.numerosNaturales;

/**
 *
 * @author alumno
 */
public class MainNumerosNaturales {
    public static void main(String[] args){
        NumerosNaturales numeros = new NumerosNaturales();
        numeros.setInicial(0);
        numeros.setMaximo(100);
        
        
        numeros.imprimirRango();
        System.out.println("");
        numeros.imprimirRangoInverso();
    }
}
