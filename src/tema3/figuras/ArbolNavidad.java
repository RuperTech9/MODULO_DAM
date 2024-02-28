
package tema3.figuras;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ArbolNavidad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita los datos al usuario
        System.out.print("Introduce la altura de la copa del árbol: ");
        int altura = teclado.nextInt();
        System.out.print("Introduce el carácter de relleno: ");
        String simbolo = teclado.next();
        System.out.println("");
        arbolNavidad(simbolo, altura);
    }

    private static void arbolNavidad(String simbolo, int altura) {
        // Parte superior del árbol
        for (int i = 1; i <= altura; i++) {//Este bucle controla la altura de la copa del árbol
            for (int j = 1; j <= altura - i; j++) {//el número de espacios disminuye. Esto crea el efecto de que la copa del árbol se ensancha hacia abajo.
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {//Esto crea un efecto de pirámide donde cada nivel de la copa del árbol es más ancho que el anterior.
                System.out.print(simbolo);
            }

            System.out.println();
        }

        // Tronco del árbol
        int alturaTronco = (int) Math.ceil((double)altura/3);//Math.ceil para redondear hacia arriba después de convertir la altura a double para la división
        int anchoTronco = (2 * altura - 1) / 3;
        for (int i = 1; i <= alturaTronco; i++) {//Altura del tronco. 
            if (anchoTronco % 2 == 0) {
            anchoTronco++;
            }
            for (int j = 1; j <= ((2 * altura - 1) - anchoTronco) / 2; j++) { //Centramos el tronco
                System.out.print(" ");
            }
            for (int j = 1; j <= anchoTronco; j++) {//Ancho del tronco
                System.out.print(simbolo);
            }
            
            System.out.println();
        }
    }
}

