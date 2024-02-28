
package tema6.cadenas;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class CadenaMAIN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        String texto = scanner.nextLine();
        Cadena miCadena = new Cadena(texto);

        int opcion = 0;
        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Escribir cadena");
            System.out.println("2. Ver longitud de la cadena");
            System.out.println("3. Copiar cadena");
            System.out.println("4. Contar número de vocales");
            System.out.println("5. Verificar si contiene una vocal específica");
            System.out.println("6. Verificar si contiene una cadena específica");
            System.out.println("7. Convertir a mayúsculas");
            System.out.println("8. Eliminar vocales");
            System.out.println("9. Verificar si es palíndromo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    miCadena.escribirCadena();
                    break;
                case 2:
                    System.out.println("La longitud de la cadena es: " + miCadena.longitud());
                    break;
                case 3:
                    System.out.println("Copia de la cadena: " + miCadena.copiar());
                    break;
                case 4:
                    System.out.println("Número de vocales: " + miCadena.numeroVocales());
                    break;
                case 5:
                    System.out.print("Introduce una vocal para buscar: ");
                    char vocal = scanner.nextLine().charAt(0);
                    System.out.println("La cadena " + (miCadena.contieneVocal(vocal) ? "contiene" : "no contiene") + " la vocal " + vocal);
                    break;
                case 6:
                    System.out.print("Introduce una cadena para buscar: ");
                    String cadenaBusqueda = scanner.nextLine();
                    System.out.println("La cadena original " + (miCadena.contieneCadena(cadenaBusqueda) ? "contiene" : "no contiene") + " la cadena " + cadenaBusqueda);
                    break;
                case 7:
                    miCadena.convertirMayusculas();
                    System.out.println("La cadena en mayúsculas: ");
                    miCadena.escribirCadena();
                    break;
                case 8:
                    miCadena.eliminarVocales();
                    System.out.println("La cadena sin vocales: ");
                    miCadena.escribirCadena();
                    break;
                case 9:
                    System.out.println("La cadena " + (miCadena.esPalindromo() ? "es" : "no es") + " un palíndromo");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                    break;
            }
        } while (opcion != 0);

    }
}
