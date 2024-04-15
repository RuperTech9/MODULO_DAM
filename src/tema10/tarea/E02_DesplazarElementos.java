
package tema10.tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class E02_DesplazarElementos {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> numeros = new ArrayList<>();
        
    public static void desplazarDerecha(ArrayList<Integer> lista) {
        try {
            if (!lista.isEmpty()) {
                Integer ultimo = lista.get(lista.size() - 1); // Obtener el último elemento de la lista
                lista.add(0, ultimo); // Agregar el último elemento al principio de la lista
                lista.remove(lista.size() - 1); // Eliminar el último elemento de la lista original
            } else  {
                System.err.println("ERROR: No hay elementos en la lista.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("ERROR: Índice fuera de los límites del ArrayList.");
        }
      /*Iterator<Integer> iterator = lista.iterator();
        Integer ultimo = null;
        while (iterator.hasNext()) {
            Integer elemento = iterator.next();
            if (ultimo != null) {
                iterator.remove(); // Eliminar el elemento actual
                lista.add(0, ultimo); // Agregar el último elemento al principio
            }
            ultimo = elemento;
        }
        if (ultimo != null) {
            // Agrega el último elemento al principio de la lista
            lista.add(0, ultimo);
        }*/
    }
    
    public static void desplazarIzquierda(ArrayList<Integer> lista) {
        try {
            if (!lista.isEmpty()) {
                Integer primero = lista.get(0);
                lista.remove(0); // Eliminar el primer elemento
                lista.add(primero); // Agregar el primer elemento al final de la lista
            } else  {
                System.err.println("ERROR: No hay elementos en la lista.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("ERROR: Índice fuera de los límites del ArrayList.");
        }      
      /*Iterator<Integer> iterator = lista.iterator();
        iterator.next(); // Avanzar al siguiente elemento
        iterator.remove(); // Eliminar el primer elemento
        lista.add(primero); // Agregar el primer elemento al final de la lista*/
    }

    public static void introducirNumeros()  {
        int numero;
        do {
            try {
                System.out.println("Introduce un número (-1 para finalizar):");
                numero = sc.nextInt();
                if (numero == -1) {
                    break;
                }
                numeros.add(numero);
            } catch (Exception e){
                System.err.println("ERROR: Introduce un número válido.");
                sc.next(); // Salto de línea
            }
        } while (true);
    }
    
    public static void eliminarNumero(ArrayList<Integer> lista, int numero) {
        if (lista.contains(numero)) {
            lista.removeIf(n -> n == numero);
            System.out.println("Número " + numero + " eliminado de la lista.");
        } else {
            System.out.println("El número " + numero + " no está presente en la lista.");
        }
        System.out.println(lista);
    }
    
    public static void ordenarAscendente(ArrayList<Integer> lista) {
        Collections.sort(lista);
        System.out.println("Array ordenado de forma ascendente: " + lista);
    }

    public static void ordenarDescendente(ArrayList<Integer> lista) {
        Collections.sort(lista, Comparator.reverseOrder());
        System.out.println("Array ordenado de forma descendente: " + lista);
    }
    
    public static void mostrarMenu() {
        boolean salir = false;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Introducir números");
            System.out.println("2. Desplazar elementos una posición a la derecha");
            System.out.println("3. Desplazar elementos una posición a la izquierda");
            System.out.println("4. Ordenar números de forma ascendente");
            System.out.println("5. Ordenar números de forma descendente");
            System.out.println("6. Eliminar número");
            System.out.println("7. Salir\n");
            
            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        introducirNumeros();
                        break;
                    case 2:
                        desplazarDerecha(numeros);
                        System.out.println("Array después del desplazamiento a la derecha:");
                        for (Integer num : numeros) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;
                    case 3:
                        desplazarIzquierda(numeros);
                        System.out.println("Array después del desplazamiento a la izquierda:");
                        for (Integer num : numeros) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;
                    case 4:
                        ordenarAscendente(numeros);
                        break;
                    case 5:
                        ordenarDescendente(numeros);
                        break;
                    case 6:
                        System.out.println("LISTA");
                        System.out.println(numeros);
                        System.out.println("Introduce el número que deseas eliminar:");
                        int numeroEliminar = sc.nextInt();
                        eliminarNumero(numeros, numeroEliminar);
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.err.println("Opción no válida.");
                }
            } catch (InputMismatchException e){
                System.err.println("ERROR: Introduce una opción válida.");
                sc.nextLine(); // Limpiar el buffer de entrada
            }
        } while (!salir);
        System.out.println("Fin del programa.");
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}