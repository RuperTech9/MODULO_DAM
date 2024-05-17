
package tema11.tarea;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class JugadorPlantilla {
    static Map<Integer, Jugador> plantilla = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    
    public void altaJugador(int dorsal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el DNI del jugador:");
        String dni = scanner.nextLine();
        System.out.println("Introduzca el nombre del jugador:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca la posición del jugador (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO):");
        Posicion posicion = Posicion.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Introduzca la estatura del jugador:");
        String estatura = scanner.nextLine();

        Jugador jugador = new Jugador(dorsal, dni, nombre, posicion, estatura);
        plantilla.put(dorsal, jugador);
    }

    public Jugador eliminarJugador(Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    public void mostrar(String posicion) {
        Posicion pos = Posicion.valueOf(posicion.toUpperCase());
        plantilla.values().stream()
                .filter(j -> j.posicion == pos)
                .forEach(j -> System.out.println(j.nombre));
    }

    public boolean editarJugador(Integer dorsal, String nuevoNombre, String nuevaEstatura) {
        Jugador jugador = plantilla.get(dorsal);
        if (jugador != null) {
            jugador.nombre = nuevoNombre;
            jugador.estatura = nuevaEstatura;
            return true;
        }
        return false;
    }
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        int opcion = 0;
        do {     
            try {
            String menu = "\n               JUGADORES PLANTILLA" +
                          "\n---------------------------------------------------------" +
                          "\n1- Alta Jugador" +
                          "\n2- Baja Jugador" +
                          "\n3- Mostrar Jugadores" +
                          "\n4- Editar Jugador" +
                          "\n5- Salir" +
                          "\n---------------------------------------------------------" +
                          "\nSelecciona una opción: ";
            
            System.out.print(menu);
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea
            
                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca el dorsal del jugador:");
                        int dorsal = sc.nextInt();
                        sc.nextLine();
                        altaJugador(dorsal);
                        break;
                    case 2:
                        System.out.println("Introduzca el dorsal del jugador a eliminar:");
                        int dorsalEliminar = sc.nextInt();
                        sc.nextLine();
                        eliminarJugador(dorsalEliminar);
                        break;
                    case 3:
                        System.out.println("Introduzca la posición para mostrar jugadores:");
                        String posicionMostrar = sc.nextLine();
                        mostrar(posicionMostrar);
                        break;
                    case 4:
                        System.out.println("Introduzca el dorsal del jugador a editar:");
                        int dorsalEditar = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduzca el nuevo nombre del jugador:");
                        String nuevoNombre = sc.nextLine();
                        System.out.println("Introduzca la nueva estatura del jugador:");
                        String nuevaEstatura = sc.nextLine();
                        editarJugador(dorsalEditar, nuevoNombre, nuevaEstatura);
                        break;
                    case 5:
                        System.out.println("\nSaliendo...");
                        break;
                    default:
                        System.err.println("\nOpción no válida. Introduce un número entre 1 y 5.");
                        break;
                } // FIN SWITCH
            } catch (InputMismatchException e) {
                System.err.println("ERROR. Entrada no válida, inténtalo de nuevo.");
                sc.nextLine(); // Salto de línea
            } // FIN TRY-CATCH
        } while (opcion != 5); // FIN DO-WHILE
    } // FIN METODO
}
