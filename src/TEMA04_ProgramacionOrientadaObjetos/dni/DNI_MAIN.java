
package TEMA04_ProgramacionOrientadaObjetos.dni;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class DNI_MAIN {
    public static void main(String [] args) throws Exception {
        
        DNI alex = new DNI();
        alex.establecer("47529040T");
        System.out.println("El NIF es: "+alex.obtenerNIF());
        
        DNI sara = new DNI();
        sara.establecer(47529040);
        String NIF = sara.obtenerNIF();
        System.out.println("La letra del DNI es: "+ NIF);
        
        
        DNI juan = new DNI();
        String DNIsinLetra = JOptionPane.showInputDialog("Introduca su DNI sin letra:");
        int DNIsinLetra2 = Integer.parseInt(DNIsinLetra);
        juan.establecer(DNIsinLetra2);
        System.out.println("El NIF con la letra es: "+ juan.obtenerNIF());
        
        DNI david = new DNI();
        String DNIconLetra = JOptionPane.showInputDialog("Introduca el DNI con letra:");
        david.establecer(DNIconLetra);
        System.out.println("El NIF con la letra es: "+ david.obtenerNIF());
        
        
        
        
    }
}
