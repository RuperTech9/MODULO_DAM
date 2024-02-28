
package tema7.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Vehiculo_MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[5]; // Array para 5 vehículos

        for (int i = 0; i < vehiculos.length; i++) {
            try {
                System.out.println("Introduce los datos del vehículo " + (i + 1) + ":");
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Año: ");
                
                int ano;
                try {
                    ano = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    // Manejar el caso donde el año no es un entero
                    System.out.println("El año debe ser un número entero. Por favor, reintenta.");
                    scanner.nextLine(); // Consumir el input incorrecto
                    i--; // Decrementar el índice para reintentar con el mismo vehículo
                    continue; // Continuar con la siguiente iteración del bucle
                }
                
                scanner.nextLine(); // Consumir el salto de línea después de leer un entero
                System.out.print("Color: ");
                String color = scanner.nextLine();

                vehiculos[i] = new Vehiculo(marca, modelo, ano, color);
            } catch (Exception e) {
                // Manejar cualquier otra excepción inesperada
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                break; // Salir del bucle en caso de error inesperado
            }
        }

        System.out.println("\nDatos de los vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) { // Verificar que el objeto Vehículo fue creado correctamente
                vehiculo.mostrarDatos();
                if (vehiculo.esAntiguo()) {
                    System.out.println("Este vehículo es antiguo.");
                } else {
                    System.out.println("Este vehículo no es antiguo.");
                }
            }
        }
    }
}
