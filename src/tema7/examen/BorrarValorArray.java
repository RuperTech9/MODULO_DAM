
package tema7.examen;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class BorrarValorArray {
    public static void main(String[] args) {
        int[] numeros={1,5,9,3,45,23,45,12,87,9,6,5};
        Scanner lector1 = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres borrar: ");
        int num = lector1.nextInt();
        System.out.println("Elemento a borrar: "+num);
        System.out.print("Array inicial: ");
        printArray (numeros);
        int ocurrencias = 0;
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]==num){
                ocurrencias++;
                for (int j=i;j<numeros.length-1;j++){
                    numeros[j]=numeros[j+1];
                }
            }
        }
        int[] numerosFinal;
        int le = numeros.length-ocurrencias;
        numerosFinal = new int[le];
        for (int i=0;i<le;i++){
            numerosFinal[i]=numeros[i];
        }
        System.out.print("Array final  : ");
        printArray (numerosFinal);
        lector1.close();
    }
    private static void printArray(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" - ");
        }
        System.out.print("\n");
    }
}

/*
Escribe un programa que busque un valor dentro de un array de integers y borre todas sus ocurrencias, reduciendo la dimensión del array. 
Es decir, no vale con poner cero en el lugar donde encontremos el valor.
El array de integers estará hardcodeado.
El valor a buscar y borrar debe ser introducido por el usuario.
El programa debe mostrar por pantalla el valor borrado, el array inicial y el array final.
*/