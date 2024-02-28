
package tema3.ejemplos;

/**
 *
 * @author Ruper
 */
public class A11_NotasEnArray {
    public static void main(String[] args) {
        // Generar 25 notas aleatorias entre 1 y 10 y almacenarlas en un array
        double[] notas = new double[25];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (double) (Math.random() * 10);
            System.out.printf("%.2f\n" ,notas[i]);
        }
        
        // Inicializar las variables para la nota más alta y la más baja
        double notaMasAlta = notas[0];
        double notaMasBaja = notas[0];
        
        // Recorrer el array para encontrar la nota más alta y la más baja
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
            if (notas[i] < notaMasBaja) {
                notaMasBaja = notas[i];
            }
        }
        
        // Mostrar los resultados
        System.out.printf("La nota más alta es: %.2f", notaMasAlta);
        System.out.printf("\nLa nota más baja es: %.2f", notaMasBaja);
    }//FIN MAIN
    
}
