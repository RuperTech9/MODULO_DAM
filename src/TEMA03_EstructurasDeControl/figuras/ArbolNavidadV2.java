
package TEMA03_EstructurasDeControl.figuras;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ArbolNavidadV2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int altura;
        String simbolo;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Imprimir figura del árbol de Navidad");
            System.out.println("2. Imprimir figura del árbol de Navidad invertido");
            System.out.println("3. Imprimir cuadrado");
            System.out.println("4. Salir");
            System.out.print("Introduce una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la altura de la copa del árbol: ");
                    altura = teclado.nextInt();
                    System.out.println("Introduce el carácter de relleno: ");
                    simbolo = teclado.next();
                    arbolNavidad(simbolo, altura);
                    break;
                case 2:
                    System.out.println("Introduce la altura de la copa del árbol invertido: ");
                    altura = teclado.nextInt();
                    System.out.println("Introduce el carácter de relleno: ");
                    simbolo = teclado.next();
                    arbolNavidadInvertido(simbolo, altura);
                    break;
                case 3:
                    System.out.println("Introduce la altura del rectángulo: ");
                    altura = teclado.nextInt();
                    System.out.println("Introduce el ancho del rectángulo: ");
                    int ancho = teclado.nextInt();
                    System.out.println("Introduce el carácter de relleno: ");
                    simbolo = teclado.next();
                    cuadrado(altura, ancho, simbolo);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce una opción válida.");
            }
        } while (opcion != 4);

        teclado.close();
    }

    private static void centrarFigura(String figura, int anchoPantalla) {
        int espaciosDelante = (anchoPantalla - figura.length()) / 2;//resto la longitud de la figura del ancho de la pantalla y divido el resultado por 2.
        for (int i = 0; i < espaciosDelante; i++) {
            System.out.print(" ");
        }
        System.out.println(figura);
    }

    /**
     * Dibuja un árbol de Navidad con una copa y un tronco centrados.
     * @param simbolo El carácter de relleno para el árbol.
     * @param altura La altura de la copa del árbol.
     */
    private static void arbolNavidad(String simbolo, int altura) {
        // Construye y centra la copa del árbol línea por línea
        for (int i = 1; i <= altura; i++) {
            String arbol = "";
            // Crea una línea de la copa del árbol con un efecto de pirámide
            for (int j = 1; j <= (2 * i - 1); j++) {
                arbol += simbolo;
            }
            centrarFigura(arbol, 80); // Centra la línea actual de la copa
        }

        // Calcula la altura y el ancho del tronco y lo centra
        int alturaTronco = (int) Math.ceil((double) altura / 3);
        int anchoTronco = (2 * altura - 1) / 3;
        String tronco = "";
        // Crea la línea del tronco con el ancho calculado
        for (int j = 1; j <= anchoTronco; j++) {
            tronco += simbolo;
        }
        // Imprime la altura del tronco, centrando cada línea
        for (int j = 1; j <= alturaTronco; j++) {
            centrarFigura(tronco, 80);
        }
    }
    
    private static void arbolNavidadInvertido(String simbolo, int altura) {
        
        // Calcula la altura y el ancho del tronco y lo centra
        int alturaTronco = (int) Math.ceil((double) altura / 3);
        int anchoTronco = (2 * altura - 1) / 3;
        String tronco = "";
        // Crea la línea del tronco con el ancho calculado
        for (int j = 1; j <= anchoTronco; j++) {
            tronco += simbolo;
        }
        // Imprime la altura del tronco, centrando cada línea
        for (int j = 1; j <= alturaTronco; j++) {
            centrarFigura(tronco, 80);
        }
        // Construye y centra la copa del árbol invertido línea por línea
        for (int i = altura; i >= 1; i--) {
            String nivel = "";
            // Crea una línea de la copa del árbol invertido
            for (int j = 1; j <= (2 * i - 1); j++) {
                nivel += simbolo;
            }
            centrarFigura(nivel, 80); // Centra la línea actual de la copa invertida
        }
        
    }
    
    private static void cuadrado(int altura, int base, String simbolo){
        //CUADRADO1
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                System.out.print(simbolo+" ");
            }
            System.out.println("");
        }
    }

    // Asegúrate de incluir aquí las definiciones de los métodos centrarFigura y arbolNavidad
}