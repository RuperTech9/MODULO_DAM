
package examen2Evaluacion;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class SumaNumerosNegativos {
    Pares [] par = new Pares[5];
    Scanner sc = new Scanner(System.in);
    boolean valoresIntroducidos = false;
    
    // METODOS
    public void introducirValores(){
        int negativo, positivo;
        for (int i = 0; i < par.length; i++) {
            try{
                System.out.print("Introduce un número negativo: ");
                negativo = sc.nextInt();
                System.out.print("Introduce un número positivo: ");
                positivo = sc.nextInt();
                par[i] = new Pares(negativo, positivo);
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                sc.next(); // Descartar entrada incorrecta
            } catch (NumeroNoNegativoException | NumeroNoPositivoException e) {
                System.out.println(e.getMessage());
            }  
        }
        valoresIntroducidos = true;
    }
    
    public double calcularMedia(){
        if(!valoresIntroducidos){
            System.out.println("Primero debes introducir los valores.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < par.length; i++) {
            suma += par[i].sumar(); // El array par contiene objetos de tipo Pares, por lo que para acceder al método sumar() necesitas especificar el índice del objeto al que deseas llamar.
        }
        return (double) suma/par.length;
    }
    
    public int calcularSuma(){
        if(!valoresIntroducidos){
            System.out.println("Primero debes introducir los valores.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < par.length; i++) {
            suma += par[i].sumar(); // El array par contiene objetos de tipo Pares, por lo que para acceder al método sumar() necesitas especificar el índice del objeto al que deseas llamar.
        }
        return suma;
    }
    
    public void mostrarArrayOrdenado() {
        int[] numeros = new int[par.length * 2];
        for (int i = 0, j = 0; i < par.length; i++) {
            numeros[j++] = par[i].getNegativo();
            numeros[j++] = par[i].getPositivo();
        }
        Arrays.sort(numeros);
        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(numeros));
    }
    
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n1- Introducir valores Array.");
            System.out.println("2- Calcular la media.");
            System.out.println("3- Calcular la suma.");
            System.out.println("4- Mostrar el Array ordenado de menor a mayor.");
            System.out.println("5- Salir.");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entre 1 y 5.");
                sc.next(); // Descartar entrada incorrecta
                continue;
            }
            switch (opcion) {
                case 1:
                    introducirValores();
                    break;
                case 2:
                    calcularMedia();
                    System.out.println("La media es: " + calcularMedia());
                    break;
                case 3:
                    calcularSuma();
                    System.out.println("La suma es: " + calcularSuma());
                    break;
                case 4:
                    mostrarArrayOrdenado();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número entre 1 y 5.");
                    break;
            }
        } while (opcion != 5);
    }
}
    

