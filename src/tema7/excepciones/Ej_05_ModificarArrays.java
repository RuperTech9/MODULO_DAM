package tema7.excepciones;



import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej_05_ModificarArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        int posicion;
        String cadena;
        boolean repetir;
        
        double[] valores={9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, -105.2};
        // Parte 1ª
        System.out.println("CONTENIDO DEL ARRAY ORIGINAL:  ");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        // Parte 2ª
        do {
            repetir = false;
            try{
               System.out.println("\nIntroduce la posición del array a modificar: ");
                cadena = sc.nextLine();
                posicion = Integer.parseInt(cadena);
                System.out.println("Introduce el nuevo valor de la posicion "+posicion);
                n = sc.nextDouble();
                valores[posicion] = n; 
                
            }catch (InputMismatchException e){
                System.err.println("Valor no valido");
                repetir = true;
                sc.nextLine();
            }catch (NumberFormatException e){
                System.err.println("Valor no valido");
                repetir = true;
                sc.nextLine();
            }catch (Exception e){ // Nuevas Excepciones que aparezcan
                System.err.println(e.toString());
                repetir = true;
            }
        }while(repetir);

        // Parte 3ª Imprimir array modificado
        System.out.println("CONTENIDO DEL ARRAY MODIFICADO: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
    }
}