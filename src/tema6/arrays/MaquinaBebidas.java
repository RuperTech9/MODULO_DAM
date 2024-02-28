
package tema6.arrays;

/**
 *
 * @author Ruper
 */
import java.util.Scanner;

public class MaquinaBebidas {
    static final int MAX_PRODUCTOS = 10;
    static String[] nombres = {"Coca-Cola", "Zumo de naranja", "Zumo de piña", "Agua mineral con gas", "Agua mineral sin gas",
            "Sándwich vegetal", "Sándwich de pollo", "Cookies de chocolate", "Croissant", "Napolitana"};
    static double[] precios = {1.00, 0.75, 0.70, 0.60, 0.60, 2.10, 2.30, 0.35, 0.80, 1.25};
    static int[] cantidades = new int[MAX_PRODUCTOS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inicializarCantidades();
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
                    break;
            }
        } while (opcion != 5);
    }

    private static void inicializarCantidades() {
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            cantidades[i] = 5; // Inicializa cada producto con 5 unidades.
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
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            System.out.printf("%s - %.2f€\n", nombres[i], precios[i]);
        }
    }

    private static void mostrarProductosYCantidades() {
        System.out.println("\nProductos y cantidades:");
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            System.out.printf("%s - %d unidades\n", nombres[i], cantidades[i]);
        }
    }

    private static void comprarProducto(Scanner scanner) {
        System.out.println("\nElige un producto para comprar (introduce el número del producto):");
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            System.out.printf("%d. %s - %.2f€ (%d unidades disponibles)\n", i + 1, nombres[i], precios[i], cantidades[i]);
        }
        int eleccion = scanner.nextInt() - 1;
        if (eleccion >= 0 && eleccion < MAX_PRODUCTOS && cantidades[eleccion] > 0) {
            cantidades[eleccion]--;
            System.out.println("Has comprado un(a) " + nombres[eleccion]);
        } else {
            System.out.println("Elección no válida o producto agotado.");
        }
    }

    private static void reponerProducto(Scanner scanner) {
        System.out.println("\nElige un producto para reponer (introduce el número del producto):");
        for (int i = 0; i < MAX_PRODUCTOS; i++) {
            System.out.println( (i + 1)+ nombres[i]);
        }
        int eleccion = scanner.nextInt() - 1;
        if (eleccion >= 0 && eleccion < MAX_PRODUCTOS) {
            cantidades[eleccion]++;
            System.out.println("Se ha repuesto un(a) " + nombres[eleccion]);
        } else {
            System.out.println("Elección no válida.");
        }
    }
}
