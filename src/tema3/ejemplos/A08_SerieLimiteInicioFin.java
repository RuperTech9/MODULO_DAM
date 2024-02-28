
package tema3.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A08_SerieLimiteInicioFin {
    public static void main(String args [] ){
        // Forma 1: Usando un bucle for
        serieFor();
        // Forma 2: Usando un bucle while
        int i = 0;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 3;
        }
        System.out.println();
        // Forma 3: Usando un bucle do-while
        i = 0;
        do {
            System.out.print(i + " ");
            i += 3;
        } while (i <= 100);
        System.out.println();
        
        
        // Parte b)
        sumaSerie(50,100);

        // Parte c)
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de la serie:");
        int numeroSerie2 = teclado.nextInt();
        System.out.println("Ingrese el límite inicial:");
        int limiteInicial = teclado.nextInt();
        System.out.println("Ingrese el límite final:");
        int limiteFinal = teclado.nextInt();

        mostrarSerieYSuma(numeroSerie2,limiteInicial, limiteFinal);
       
    }
    
    public static void serieFor(){
        for (int i = 0; i <=100; i+=3){
            System.out.print(i);
            if (i <= 96){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    // Parte b) - Procedimiento para sumar la serie
    public static void sumaSerie(int principio, int fin) {
        int suma = 0;
        for (int i = principio; i <= fin; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nSuma de la serie entre "+principio+ " y "+fin+ ": "+suma);
    }

    // Parte c) - Función para mostrar la serie y su suma
    public static int mostrarSerieYSuma(int numeroSerie2, int limiteInicial, int limiteFinal) {
        int suma = 0;
        for (int i = limiteInicial; i <= limiteFinal; i += numeroSerie2) {
            System.out.print(i + " ");
            suma += i;
        }
        return suma;
    }     
    
}
