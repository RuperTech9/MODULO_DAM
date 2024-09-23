
package TEMA06_ArraysYStrings.arraysBidimensionales;

/**
 *
 * @author Ruper
 */
import java.util.Scanner;

public class MaquinaBebidas {
    static final String[] nombres = {
        "Coca-Cola", "Zumo de naranja", "Zumo de piña", "Agua mineral con gas", 
        "Agua mineral sin gas", "Sándwich vegetal", "Sándwich de pollo", 
        "Cookies de chocolate", "Croissant", "Napolitana"
    };
    // Array bidimensional para precios y cantidades: [][0] para precios, [][1] para cantidades.
    static final double[][] infoProductos = new double[nombres.length][2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarProductos();
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mostrarProductosYPrecios();
                    break;
                case 2:
                    mostrarProductosYCantidades();
                    break;
                case 3:
                    comprarProducto(scanner);
                    break;
                case 4:
                    reponerProducto(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void inicializarProductos() {
        double[] precios = {1.00, 0.75, 0.70, 0.60, 0.60, 2.10, 2.30, 0.35, 0.80, 1.25};
        for (int i = 0; i < nombres.length; i++) {
            infoProductos[i][0] = precios[i]; // Precio
            infoProductos[i][1] = 5; // Cantidad inicial
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1- Mostrar los productos y sus precios.");
        System.out.println("2- Mostrar productos y cantidades que quedan.");
        System.out.println("3- Comprar un producto.");
        System.out.println("4- Reponer un producto.");
        System.out.println("5- Salir.");
        System.out.print("Elige una opción: ");
    }

    private static void mostrarProductosYPrecios() {
        System.out.println("\nProductos y precios:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%s - %.2f€\n", nombres[i], infoProductos[i][0]);
        }
    }

    private static void mostrarProductosYCantidades() {
        System.out.println("\nProductos y cantidades:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%s - %.0f unidades\n", nombres[i], infoProductos[i][1]);
        }
    }

    private static void comprarProducto(Scanner scanner) {
        System.out.println("\nElige un producto para comprar (introduce el número del producto):");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%d. %s - %.2f€ (%.0f unidades disponibles)\n", i + 1, nombres[i], infoProductos[i][0], infoProductos[i][1]);
        }
        int eleccion = scanner.nextInt() - 1;
        if (eleccion >= 0 && eleccion < nombres.length && infoProductos[eleccion][1] > 0) {
            infoProductos[eleccion][1]--;
            System.out.println("Has comprado un(a) " + nombres[eleccion]);
        } else {
            System.out.println("Elección no válida o producto agotado.");
        }
    }

    private static void reponerProducto(Scanner scanner) {
        System.out.println("\nElige un producto para reponer (introduce el número del producto):");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println( (i + 1)+ nombres[i]);
        }
        int eleccion = scanner.nextInt() - 1;
        if (eleccion >= 0 && eleccion < nombres.length) {
            infoProductos[eleccion][1]++; // Incrementa en uno la cantidad del producto seleccionado.
            System.out.println("Se ha repuesto un(a) " + nombres[eleccion]);
        } else {
            System.out.println("Elección no válida.");
        }
    }  
}
