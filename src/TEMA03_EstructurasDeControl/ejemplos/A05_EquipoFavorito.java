
package TEMA03_EstructurasDeControl.ejemplos;

import java.util.Scanner;

/**
 * Crear una aplicación que al introducir los datos de una persona 
 * (nombre y apellidos, junto con la edad) le diga si es joven o Adulto. 
 * Además, le preguntará si es del real Madrid o del Atlético de Madrid y mostrará un mensaje según el equipo escogido:
 * Atlético de Madrid: "va primero en la liga 2020-21"
 * Real Madrid: "Está haciendo una mala temporada"
 * Otro equipo: "no está a la altura del Atlético de Madrid"
 * 
 * @author Ruper
 */
public class A05_EquipoFavorito {
    
    
    public static void equipoFavorito(String equipo){
        switch (equipo) {
            case "ATLETICO":
                System.out.println("El "+equipo+ " va primero en la liga 2020-21");
                break;
            case "REAL MADRID":
                System.out.println("El "+equipo+ " está haciendo una mala temporada");   
                break;
            default:
                System.out.println("El "+equipo+ " no está a la altura del Atlético de Madrid");
                break;
        }
        
    }
    public static void main (String args[] ){
        String nombre;
        String apellidos;
        int edad;
        String equipo;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduzca sus apellidos: ");
        apellidos = teclado.nextLine();
        System.out.println("Introduzca su edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca su equipo favorito: ");
        equipo = teclado.nextLine().toUpperCase();
        
        System.out.println(nombre+" "+apellidos+" de "+edad+" años.");
        equipoFavorito(equipo);
        
    }
    
}
