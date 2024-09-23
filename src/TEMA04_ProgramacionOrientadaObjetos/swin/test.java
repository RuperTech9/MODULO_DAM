
package TEMA04_ProgramacionOrientadaObjetos.swin;

import javax.swing.JOptionPane; // Importar

/**
 *
 * @author alumno
 */
public class test {
    public static void main(String[] args){
        String usuario = JOptionPane.showInputDialog("Introduce el nombre del usuario");
        String edad = JOptionPane.showInputDialog("Introduzca su edad");
        System.out.println("Su nombre es: "+ usuario);
        int edad1 = Integer.parseInt(edad);
        System.out.println("Su edad es: "+ edad1);
    }
    
}
