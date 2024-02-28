
package tema6.arrays;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProductoMAIN {
    static Producto[][] productos = {
        {new Producto("cocacola", 1.00, 5), new Producto("zumo de naranja", 0.75, 5), new Producto("zumo de piña", 0.70, 5), new Producto("agua mineral con gas", 0.60, 5), new Producto("agua mineral sin gas", 0.60, 5)},
        {new Producto("vegetal", 2.10, 5), new Producto("de pollo", 2.30, 5)},
        {new Producto("cookies de chocolate", 0.35, 5), new Producto("croissant", 0.80, 5), new Producto("napolitana", 1.25, 5)}
    };
    
    static Producto[] Bebidas = {new Producto("cocacola", 1.00, 5), new Producto("zumo de naranja", 0.75, 5), new Producto("zumo de piña", 0.70, 5), new Producto("agua mineral con gas", 0.60, 5), new Producto("agua mineral sin gas", 0.60, 5)};
    static Producto[] Sandwiches = {new Producto("vegetal", 2.10, 5), new Producto("de pollo", 2.30, 5)};
    static Producto[] Dulces = {new Producto("cookies de chocolate", 0.35, 5), new Producto("croissant", 0.80, 5), new Producto("napolitana", 1.25, 5)};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        for (Producto[] categoria : productos) {
            for (Producto p : categoria) {
                System.out.println(p);
            }
        }
        /*
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
            // Llamada implícita a productos[i][j].toString()
            System.out.println(productos[i][j]);
            }
        }
        */
    } 

    private static void mostrarProductosYCantidades() {
        for (Producto[] categoria : productos) {
            for (Producto p : categoria) {
                System.out.println(p);
            }
        }
        /*
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
            // Llamada implícita a productos[i][j].toString()
            System.out.println(productos[i][j]);
            }
        }
        */
    }

    private static void comprarProducto(Scanner scanner) {
        System.out.println("Seleccione la categoría: 1- Bebidas, 2- Sándwiches, 3- Dulces");
        int categoria = scanner.nextInt() - 1; // Resta 1 para ajustar al índice base-0 de los arrays en Java.
        
        // Verifica si la categoría seleccionada es válida (dentro del rango de índices del array 'productos').
        if (categoria >= 0 && categoria < productos.length) {
            System.out.println("Seleccione el producto:");
            
            // Muestra todos los productos dentro de la categoría seleccionada.
            for (int i = 0; i < productos[categoria].length; i++) {
                System.out.println((i + 1) + ". " + productos[categoria][i].nombre + " - " + productos[categoria][i].precio + "€ (" + productos[categoria][i].cantidad + " disponibles)");
            }
            int seleccion = scanner.nextInt() - 1; // Nuevamente, ajusta al índice base-0.
            
            // Verifica si el producto seleccionado es válido y si hay unidades disponibles para comprar.
            if (seleccion >= 0 && seleccion < productos[categoria].length && productos[categoria][seleccion].cantidad > 0) {
                productos[categoria][seleccion].cantidad--;
                System.out.println("Has comprado un(a) " + productos[categoria][seleccion].nombre);
            } else {
                System.out.println("Selección no válida o producto agotado.");
            }
        } else {
            System.out.println("Categoría inválida.");
        }
    }

    private static void reponerProducto(Scanner scanner) {
        System.out.println("Seleccione la categoría para reponer: 1- Bebidas, 2- Sándwiches, 3- Dulces");
        int categoria = scanner.nextInt() - 1;
        if (categoria >= 0 && categoria < productos.length) {
            System.out.println("Seleccione el producto a reponer:");
            for (int i = 0; i < productos[categoria].length; i++) {
                System.out.println((i + 1) + ". " + productos[categoria][i].nombre);
            }
            int seleccion = scanner.nextInt() - 1;
            if (seleccion >= 0 && seleccion < productos[categoria].length) {
                productos[categoria][seleccion].cantidad++;
                System.out.println("Se ha repuesto un(a) " + productos[categoria][seleccion].nombre);
            } else {
                System.out.println("Selección no válida.");
            }
        } else {
            System.out.println("Categoría inválida.");
        }
    }
}
    

