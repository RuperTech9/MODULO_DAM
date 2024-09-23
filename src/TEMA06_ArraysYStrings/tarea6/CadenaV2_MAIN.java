
package TEMA06_ArraysYStrings.tarea6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CadenaV2_MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres:");
        String texto = sc.nextLine();
        CadenaV2 cadena1 = new CadenaV2(texto);
        cadena1.mostrarMenu();
    } // FIN MAIN
} // FIN CLASE