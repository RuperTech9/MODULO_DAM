
package TEMA03_EstructurasDeControl.ejercicios;

/**
 * imprimir la tabla ASCi menos el caracter 26
 * @author Ruper
 */
public class E10_TablaASCI_FOR {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            if (i != 26) { // Excluir el carácter 26
                System.out.printf("%d: %c%n", i, (char) i);
            }
        }
        
        for (char a = 0; a < 128; a++) {
            if (a != 26) { // Excluir el carácter 26
                System.out.printf("%c: %d%n", a, (int) a);
            }
        }
    }
}






