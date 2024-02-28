
package tema3.juegos;

/**
 *
 * @author Ruper
 */
public class Pruebas {
    public static void main(String [] args){
        int altura = 6;
        String simbolo = "*";
        
        for (int i = 1; i <= altura; i++){
            for(int j=1; j<=altura-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int alturaTronco = (int) Math.ceil((double)altura/3);
        for (int i = 1; i <= alturaTronco; i++){
            for(int j=1;j<=((2* altura -1)-((2*5-1)/3))/2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*5-1)/3);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
