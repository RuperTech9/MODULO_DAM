
package tema6.tarea6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruper
 */
public class Cadena_MAIN {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Introduce una cadena de caracteres:");
        Cadena cadena1 = new Cadena(texto);
        cadena1.mostrarMenu();
    } // FIN MAIN
} // FIN CLASE
