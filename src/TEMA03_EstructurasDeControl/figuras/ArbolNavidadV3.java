
package TEMA03_EstructurasDeControl.figuras;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ArbolNavidadV3 {
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: // Árbol de Navidad
                    solicitarDatosArbol(teclado);
                    break;
                case 2: // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce una opción válida.");
            }
        } while (opcion != 2);

    }

    public static void menu(){
        System.out.println("\nMenú:");
        System.out.println("1. Imprimir figura del árbol de Navidad");
        System.out.println("2. Salir");
        System.out.print("Introduce una opción: ");
    }
    
    public static void centrarFigura(String figura, int anchoPantalla) {
        int espaciosDelante = (anchoPantalla - figura.length()) / 2;//resto la longitud de la figura del ancho de la pantalla y divido el resultado por 2.
        for (int i = 0; i < espaciosDelante; i++) {
            System.out.print(" ");
        }
        System.out.println(figura);
    }
    
    public static void solicitarDatosArbol(Scanner teclado) {
        System.out.println("Introduce la altura de la copa del árbol: ");
        int altura = teclado.nextInt();
        System.out.println("Introduce el carácter de relleno: ");
        String simbolo = teclado.next();
        System.out.println("¿Deseas un árbol invertido? (Sí = 1, No = 0): ");
        int invertido = teclado.nextInt();
        if (invertido == 1) {
            arbolNavidadInvertido(simbolo, altura);
        } else {
            arbolNavidad(simbolo, altura);
        }
    }
    
    public static void arbolNavidad(String simbolo, int altura) {
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
    
    public static void arbolNavidadInvertido(String simbolo, int altura) {
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

}
