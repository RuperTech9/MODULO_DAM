
package tema7.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase VueloReservas manejará un array de Vuelo y proporcionará métodos para interactuar con este array, 
 * incluyendo añadir vuelos y gestionar reservas.
 * 
 * @author Ruper
 */
public class VueloReservasExcepciones {
    private Vuelo[] vuelos;
    private int contadorVuelos;

    public VueloReservasExcepciones() {
        vuelos = new Vuelo[3]; // Tamaño inicial, podría expandirse según necesidad
        contadorVuelos = 0;
    }

    public void añadirVuelo(Vuelo vuelo) {
        // Comprobar si el array está lleno
        if (contadorVuelos >= vuelos.length) {
            // Expandir el array para acomodar más vuelos
            Vuelo[] vuelosTemp = new Vuelo[vuelos.length + 1]; // Aumenta el tamaño
            System.arraycopy(vuelos, 0, vuelosTemp, 0, vuelos.length);
            vuelos = vuelosTemp; // Asignar el nuevo array expandido al array original
        }
    
        // Añadir el nuevo vuelo al array y aumentar el contador
        vuelos[contadorVuelos++] = vuelo;
        System.out.println("Vuelo añadido exitosamente.");
    }

    public void mostrarInformacionVuelos() {
        for (int i = 0; i < contadorVuelos; i++) {
            System.out.println(vuelos[i]);
        }
    }

    public Vuelo buscarVueloPorCodigo(String codigo) {
        for (int i = 0; i < contadorVuelos; i++) {
            if (vuelos[i].getCodigoVuelo().equalsIgnoreCase(codigo)) {
                return vuelos[i];
            }
        }
        return null;
    }

    public void realizarReserva(String codigo) {
        Vuelo vuelo = buscarVueloPorCodigo(codigo);
        if (vuelo != null) {
            vuelo.reservarAsiento();
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("Vuelo no encontrado.");
        }
    }

    public void cancelarReserva(String codigo) {
        Vuelo vuelo = buscarVueloPorCodigo(codigo);
        if (vuelo != null) {
            vuelo.cancelarReserva();
            System.out.println("Reserva cancelada con éxito.");
        } else {
            System.out.println("Vuelo no encontrado.");
        }
    }

    // Método para mostrar el menú y manejar la entrada del usuario
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\nSistema de Reservas de Vuelos");
                System.out.println("1. Añadir Vuelo");
                System.out.println("2. Realizar Reserva");
                System.out.println("3. Cancelar Reserva");
                System.out.println("4. Mostrar Información de Vuelos");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1:
                        // Asumiendo que el código para añadir un vuelo ya maneja adecuadamente los errores internos
                        System.out.print("Ingrese código de vuelo: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese destino: ");
                        String destino = scanner.nextLine();
                        System.out.print("Ingrese capacidad: ");
                        int capacidad = scanner.nextInt();
                        añadirVuelo(new Vuelo(codigo, destino, capacidad));
                        break;
                    case 2:
                        System.out.print("Ingrese código de vuelo para realizar reserva: ");
                        codigo = scanner.nextLine();
                        realizarReserva(codigo);
                        break;
                    case 3:
                        System.out.print("Ingrese código de vuelo para cancelar reserva: ");
                        codigo = scanner.nextLine();
                        cancelarReserva(codigo);
                        break;
                    case 4:
                        mostrarInformacionVuelos();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número.");
                scanner.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        VueloReservasExcepciones sistema = new VueloReservasExcepciones();
        sistema.mostrarMenu();
    }
}