
package tema3.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E02_CalificacionNota_SWITCH {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        String resultado=null;
        
        System.out.println("Escriba la nota: ");
        nota = teclado.nextInt();
        
        switch (nota) {
            case 0,1,2,3,4: resultado="INSUFICIENTE";
            break;
            case 5: resultado="SUFICIENTE";
            break;
            case 6: resultado="BIEN";
            break;
            case 7,8: resultado="NOTABLE";
            break;
            case 9,10: resultado="SOBRESALIENTE";
            break;
            default: resultado="No esta en el rango de notas";
        }
        
        System.out.println("El resultado es: "+resultado);
    }

    
}