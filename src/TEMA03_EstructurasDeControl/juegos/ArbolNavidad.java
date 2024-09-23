
package TEMA03_EstructurasDeControl.juegos;

/**
 *
 * @author Ruper
 */
public class ArbolNavidad {
    public static void main(String [] args){
        int altura = 6;
        
        for (int i = 1; i <= altura; i++){ // cada nivel de la copa
            for(int j=1; j<=altura-i; j++){ // espacios en blanco para alinear correctamente las estrellas. El número de espacios disminuye a medida que i aumenta.
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1;j++){ // El número de estrellas en cada nivel es 2*i - 1, lo que crea la forma triangular del árbol.
                System.out.print("*");
            }
            System.out.println(""); // siguiente nivel de la copa.
        }
        int alturaTronco = (int) Math.ceil((double)altura/3); // altura del tronco = un tercio de la altura del árbol, redondeando hacia arriba
        for (int i = 1; i <= alturaTronco; i++){ // cada nivel del tronco
            for(int j=1;j<=((2* altura -1)-((2*5-1)/3))/2;j++){ // calcula los espacios en blanco de manera que el tronco esté centrado debajo del árbol.
                System.out.print(" ");
            }
            for(int j=1;j<=((2*5-1)/3);j++){ // El número de estrellas del tronco se calcula como un tercio del ancho del árbol en su base.
                System.out.print("*");
            }
            System.out.println(""); // siguiente nivel del tronco.
        }
    } 
}
