
package Juegos;

import java.util.Scanner;

/**
 * Crear una aplicación capaz de crearte un árbol de navidad por pantalla, 
 * donde el usuario indicará el símbolo a rellenar y los datos necesarios para su impresión:
 * Altura de la copa
 * Símbolo de relleno
 *
 * @author Alejandro Ruperez
 */
public class ArbolNavidad {
    public static Scanner teclado = new Scanner(System.in,"ISO-8859-1");// Declaro el Scanner como estático para que sea accesible desde cualquier método de la clase.
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: // Árbol de Navidad
                    datosArbol();
                    break;
                case 2: // Salir
                    System.out.println("\nPROGRAMA FINALIZADO.");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, introduce una opción válida.");
            }
        } while (opcion != 2);
    }// FIN MAIN
    
    
    /**
     * Imprimo el menú del programa.
     */
    public static void menu(){
        System.out.println("\n****************************************************************");
        System.out.println("***   PROGRAMA PARA DIBUJAR LA FIGURA DE UN ARBOL DE NAVIDAD ***");
        System.out.println("***                                                          ***");
        System.out.println("***   1. Imprimir árbol de Navidad                           ***");
        System.out.println("***   2. Salir                                               ***");
        System.out.println("***                                                          ***");
        System.out.println("***   Author: Alejandro Rupérez                              ***");
        System.out.println("***   Versión 1.0                                            ***");
        System.out.println("****************************************************************");
        System.out.print("\nIntroduce una opción: ");
    }// FIN PROCEDIMIENTO
    
    /**
     * Solicito al usuario los datos para crear el árbol de Navidad.
     */
    public static void datosArbol() {
        System.out.print("\nIntroduce la altura de la copa del árbol: ");
        int altura = teclado.nextInt();
        System.out.print("Introduce el símbolo de relleno: ");
        String simbolo = teclado.next();
        System.out.println("");
        arbolNavidad(simbolo, altura);// Paso los datos recogidos al método arbolNavidad
    }// FIN PROCEDIMIENTO
    
    /**
     * Imprimo una figura centrada en un ancho de pantalla dado.
     * @param figura Cadena de caracteres a centrar.
     * @param anchoPantalla Donde se centra la figura.
     */
    private static void centrarFigura(String figura, int anchoPantalla) {
        int espaciosDelante = (anchoPantalla - figura.length()) / 2;
        for (int i = 0; i < espaciosDelante; i++) {
            System.out.print(" ");
        }// FIN FOR
        System.out.println(figura);
    }// FIN PROCEDIMIENTO

    /**
     * Dibuja un árbol de Navidad.
     * @param simbolo Relleno para el árbol.
     * @param altura Altura de la copa del árbol.
     */
    private static void arbolNavidad(String simbolo, int altura) {
        for (int i = 1; i <= altura; i++) {// Altura de la copa
            String arbol = "";// Inicializo como cadena vacía
            for (int j = 1; j <= (2 * i - 1); j++) {// Símbolo: donde cada nivel es más ancho que el anterior.
                arbol += simbolo;// Sumo y asigno
            }// FIN FOR INTERNO
            centrarFigura(arbol, 80); // Centro la línea actual de la copa
        }// FIN FOR EXTERNO
        
        
        // Calculo la altura y el ancho del tronco
        int alturaTronco = (int) Math.ceil((double) altura / 3);// Redondeo hacia arriba para no perder altura si la division da decimal.
        int anchoTronco = (2 * altura - 1) / 3;
        
        // Me aseguro de que el ancho del tronco sea impar para que este centrado.
        if (anchoTronco % 2 == 0) {
            anchoTronco++;
        }
        
        String tronco = "";// Inicializo como cadena vacía
        for (int j = 1; j <= anchoTronco; j++) {// Creo la línea del tronco con el ancho calculado
            tronco += simbolo;
        }// FIN FOR
        
        for (int j = 1; j <= alturaTronco; j++) {// Imprimo la altura del tronco y centro cada línea
            centrarFigura(tronco, 80);
        }// FIN FOR 
    }// FIN PROCEDIMIENTO
}// FIN CLASS