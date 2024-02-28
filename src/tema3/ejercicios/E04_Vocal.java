
package tema3.ejercicios;

/**
 * Crea un programa que gener de forma aleatoria letras minúsculas y analice si es vocal o consonante.
 * Utiliza la condición switch y la función matemática Math.random
 * 
 * @author Ruper
 */
public class E04_Vocal {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 25
        // Convertir ese número a una letra minúscula (a=0, b=1, ..., z=25)
        char letra = (char) (Math.random() * 26 +'a');
        
        System.out.println("Letra generada: " + letra);

        // Determinar si la letra es una vocal o una consonante
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La letra es una vocal.");
                break;
            default:
                System.out.println("La letra es una consonante.");
        }//Fin del Switch
    }//Fin del Main
}//Fin clase
