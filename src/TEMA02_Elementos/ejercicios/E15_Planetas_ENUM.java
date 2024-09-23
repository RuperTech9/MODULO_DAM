
package TEMA02_Elementos.ejercicios;

/**
 *
 * @author alumno
 */
public class E15_Planetas_ENUM {
    enum Planetas {
        MERCURIO,
        VENUS,
        TIERRA,
        MARTE,
        JUPITER,
        SATURNO,
        URANO,
        NEPTUNO;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Posicion de " + Planetas.MERCURIO + ": " + (Planetas.MERCURIO.ordinal()+1));
        System.out.println("Posicion de " + Planetas.VENUS + ": " + (Planetas.VENUS.ordinal()+1));
        System.out.println("Posicion de " + Planetas.TIERRA + ": " + (Planetas.TIERRA.ordinal()+1));
        System.out.println("Posicion de " + Planetas.MARTE + ": " + (Planetas.MARTE.ordinal()+1)); 
        System.out.println("Posicion de " + Planetas.JUPITER + ": " + (Planetas.JUPITER.ordinal()+1));
        System.out.println("Posicion de " + Planetas.SATURNO + ": " + (Planetas.SATURNO.ordinal()+1));
        System.out.println("Posicion de " + Planetas.URANO + ": " + (Planetas.URANO.ordinal()+1));
        System.out.println("Posicion de " + Planetas.NEPTUNO + ": " + (Planetas.NEPTUNO.ordinal()+1));
        
        System.out.println("\nNumero total de planetas: " + Planetas.values().length);
    }
}
