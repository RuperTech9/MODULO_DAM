
package tema7.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Biblioteca {
    private String[][] catalogo = new String[10][2]; // Primera dimensión número total de libros. Segunda dimensión atributos de cada libro: título y autor.
    private int contadorLibros = 0;

    /*public void añadirLibro(String titulo, String autor) {
        if (contadorLibros < catalogo.length) {
            catalogo[contadorLibros][0] = titulo;
            catalogo[contadorLibros][1] = autor;
            contadorLibros++;
            System.out.println("Libro añadido al catálogo: " + titulo + ", " + autor);
        } else {
            System.out.println("El catálogo está lleno.");
        }
    }*/
    public void añadirLibro(String titulo, String autor) {
        if (contadorLibros >= catalogo.length) {
            // Crear un nuevo array temporal con un tamaño mayor al actual
            String[][] catalogoTemp = new String[catalogo.length + 1][2]; // Aumenta el tamaño
            // Copiar el contenido del array actual al nuevo array
            for (int i = 0; i < catalogo.length; i++) {
                catalogoTemp[i][0] = catalogo[i][0];
                catalogoTemp[i][1] = catalogo[i][1];
            }
            // Asignar el nuevo array expandido al array original
            catalogo = catalogoTemp;
            }

        // Añadir el nuevo libro al array y aumentar el contador
        catalogo[contadorLibros][0] = titulo;
        catalogo[contadorLibros][1] = autor;
        contadorLibros++;
        System.out.println("Libro añadido al catálogo: " + titulo + ", " + autor);
    }

    public void eliminarLibro(String titulo) {
        for (int i = 0; i < contadorLibros; i++) {
            if (catalogo[i][0].equalsIgnoreCase(titulo)) {
                System.arraycopy(catalogo, i + 1, catalogo, i, contadorLibros - i - 1);
                contadorLibros--;
                System.out.println("Libro eliminado: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

    public void buscarLibroPorTitulo(String titulo) {
        for (int i = 0; i < contadorLibros; i++) {
            if (catalogo[i][0].equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: " + titulo + ", Autor: " + catalogo[i][1]);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

    public void buscarLibroPorAutor(String autor) {
        boolean encontrado = false;
        for (int i = 0; i < contadorLibros; i++) {
            if (catalogo[i][1].equalsIgnoreCase(autor)) {
                System.out.println("Libro encontrado: " + catalogo[i][0] + ", Autor: " + autor);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor: " + autor);
        }
    }

    public void mostrarCatalogo() {
        if (contadorLibros == 0) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println("Libro: " + catalogo[i][0] + ", Autor: " + catalogo[i][1]);
        }
    }
    
    // Método para mostrar el menú y manejar la entrada del usuario
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\nSistema de Gestión de Biblioteca");
                System.out.println("1. Añadir nuevos libros al catálogo.");
                System.out.println("2. Eliminar libros del catálogo.");
                System.out.println("3. Buscar libros por título y por autor.");
                System.out.println("4. Mostrar todos los libros del catálogo.");
                System.out.println("5. Salir.");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese autor del libro: ");
                        String autor = scanner.nextLine();
                        añadirLibro(titulo, autor); // Suponiendo que este método solo necesita título y autor
                        break;
                    case 2:
                        System.out.print("Ingrese título del libro a eliminar: ");
                        titulo = scanner.nextLine();
                        eliminarLibro(titulo);
                        break;
                    case 3:
                        System.out.println("¿Buscar por 1. Título o 2. Autor?");
                        int busqueda = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        if (busqueda == 1) {
                            System.out.print("Ingrese título del libro: ");
                            titulo = scanner.nextLine();
                            buscarLibroPorTitulo(titulo);
                        } else if (busqueda == 2) {
                            System.out.print("Ingrese autor del libro: ");
                            autor = scanner.nextLine();
                            buscarLibroPorAutor(autor);
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    case 4:
                        mostrarCatalogo();
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
        Biblioteca sistema = new Biblioteca();
        sistema.mostrarMenu();
    }
}