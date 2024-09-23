
package TEMA03_EstructurasDeControl.juegos;

/**
 *
 * @author Ruper
 */
public class GeneradorFraseAleatoria {
    public static void main(String[] args) {
        String[] frasesMotivacionales = {
            "El único modo de hacer un gran trabajo es amar lo que haces. - Steve Jobs",
            "La oportunidad no llega, se crea. - Chris Grosser",
            "No esperes. El tiempo nunca será justo. - Napoleon Hill",
            "Siempre parece imposible hasta que se hace. - Nelson Mandela",
            "No hay sustituto para el trabajo duro. - Thomas Edison",
            "La vida es lo que pasa mientras estás ocupado haciendo otros planes. - John Lennon",
            "No importa qué tan lento vayas mientras no te detengas. - Confucio",
            "La persistencia puede cambiar el fracaso en un extraordinario logro. - Matt Biondi",
            "La mejor forma de predecir el futuro es crearlo. - Peter Drucker",
            "La vida es un 10% lo que me ocurre y 90% cómo reacciono a ello. - Charles R. Swindoll"
        };

        int indiceAleatorio = (int) (Math.random() * frasesMotivacionales.length);

        System.out.println("Frase del día:");
        System.out.println(frasesMotivacionales[indiceAleatorio]);
    }
}