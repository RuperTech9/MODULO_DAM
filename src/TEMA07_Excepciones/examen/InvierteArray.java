
package TEMA07_Excepciones.examen;

/**
 *
 * @author Ruper
 */
public class InvierteArray {
    public static void main(String[] args) {
        int[] numeros = {7, 3, 4, 5, 9, 11};
        int longitud = numeros.length;
        
        // Imprimimos el array de partida
        System.out.println("Array inicial: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(numeros[i]);
            if (i < longitud - 1) { // Añadir guión solo entre elementos
                System.out.print(" - ");
            }
        }
        System.out.println("\n");
        
        // Array invertido: imprimiendo el array de atrás hacia adelante
        System.out.println("Array invertido: ");
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) { // Añadir guión solo entre elementos
                System.out.print(" - ");
            }
        }
        System.out.println("\n");
    }
    /*public static void main(String[] args) {
        int[] numeros ={7,3,4,5,9,11};
        int longitud = numeros.length;
        //imprimimos el array de partida
        System.out.println("Array inicial: ");
        for (int i=0; i<longitud;i++){
            System.out.print (numeros[i]+" - ");
        }
        System.out.println("\n");
        //Array invertido: imprimiento el array de atras a adelante
        System.out.println("Array invertido: ");
        for (int i=longitud-1; i>=0;i--){
            System.out.print (numeros[i]+" - ");
        }
        System.out.println("\n");
    }*/
}