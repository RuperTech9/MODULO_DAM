
package tema2.ejercicios;

import java.util.Scanner;

/**
 * Pregunta a cada usuario su equipo favorito de futbol de Madrid, pudiendo ser el ATLETICO (mejor equipo de Madrid) o el REAL MADRID (equipo con más ligas). 
 * Se le presentará por pantalla un mensaje según el equipo introducido.
 * nota: para este ejercicio el usuario es indiferente si introduce el nombre con letras mayúsculas o minúsculas.
 * @author Ruper
 */
public class E11_EquipoFavorito {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu equipo de fútbol favorito en Madrid? ");
        System.out.println("1. ATLETICO");
        System.out.println("2. REAL MADRID");
        System.out.print("Introduce tu elección (ATLETICO o REAL MADRID): ");
        
        String favorito;
        favorito = teclado.nextLine().toUpperCase();
        
        switch(favorito){
        case "ATLETICO": 
            System.out.print("¡El ATLETICO es el mejor equipo de Madrid!");
            break;
        case "REAL MADRID": 
            System.out.println("¡El REAL MADRID es el equipo con más ligas!");
            break;
        
        default: 
            System.out.println("No has seleccionado un equipo válido.");
        }  
    }
}
