
package TEMA06_ArraysYStrings.enumerados;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class ColorMAIN {
    public static void main(String[] args) {
        String colorComoStringElegidoUsuario = "";
        Color colorUsuario = Color.INDEFINIDO;

        Color coloresPermitidos[] = {Color.ROJO, Color.VERDE, Color.AZUL};

        System.out.println("Comenzamos");
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca el color de la casa: ");
        colorComoStringElegidoUsuario = scan.nextLine();

        System.out.println("¿Qué nos devuelve toString para un tipo enumerado? "+Color.ROJO.toString());

        System.out.println("¿Podemos comparar un String con un enum? No ");
        // +(Color.ROJO==colorComoStringElegidoUsuario) no podemos usarlo

        if (colorComoStringElegidoUsuario.equalsIgnoreCase("rojo")) {colorUsuario = Color.ROJO;}

        if (colorUsuario == Color.ROJO) {
            System.out.println("El color elegido es válido");
        }
        else {
            System.out.println("Usted no ha elegido el rojo, ese es el único color permitido");
        }
        
    }
}
