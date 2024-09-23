
package TEMA11_LecturaYEscritura.objetos;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
Crea una aplicación que gestiona un club donde se identifican a los socios por un apodo personal y unico. 
De cada socio, además del apodo, se guarda el nombre y su fecha de ingreo en el club. 
Utiliza un mapa donde las claves serán los apodos y los valores , objetos de la clase Socio.
Los datos se guardarán en un fichero llamado club.txt, de donde se leerá el mapa al arrancar 
y donde se volverá a guardar actualizado al salir. Las operaciones se mostrarán en un menú que tendrá las siguientes opciones:
1. Alta Socio
2. Baja socio
3. Modificacion socio
4. Listar socios por apodo
5. Listar socios por antiguedad
6. Listar los socios con alta anterior a un año determinado
7. salir
 * 
 * @author Ruper
 */
public class SociosClub {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Socio> socios = new TreeMap<>();
    static String rutaClub = ".\\src\\tema11\\objetos\\club.txt";
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        leerSociosDesdeFichero();
        int opcion = 0;
        do {     
            try {
            String menu = "\n               SOCIOS CLUB" +
                          "\n---------------------------------------------------------" +
                          "\n1- Alta Socio" +
                          "\n2- Baja Socio" +
                          "\n3- Modificación Socio" +
                          "\n4- Listar socios por apodo" +
                          "\n5- Listar socios por antigüedad" +
                          "\n6- Listar socios con alta anterior a un año determinado" +
                          "\n7- Salir" +
                          "\n---------------------------------------------------------" +
                          "\nSelecciona una opción: ";
            
            System.out.print(menu);
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea
            
                switch (opcion) {
                    case 1:
                        altaSocio();
                        break;
                    case 2:
                        bajaSocio();
                        break;
                    case 3:
                        modificarSocio();
                        break;
                    case 4:
                        listarSociosPorApodo();
                        break;
                    case 5:
                        listarSociosPorAntiguedad();
                        break;
                    case 6:
                        listarSociosAnterioresA();
                        break;
                    case 7:
                        System.out.println("\nSaliendo...");
                        break;
                    default:
                        System.err.println("\nOpción no válida. Introduce un número entre 1 y 7.");
                        break;
                } // FIN SWITCH
            } catch (InputMismatchException e) {
                System.err.println("ERROR. Entrada no válida, inténtalo de nuevo.");
                sc.nextLine(); // Salto de línea
            } // FIN TRY-CATCH
        } while (opcion != 7); // FIN DO-WHILE
        guardarSociosEnFichero();
    } // FIN METODO
    
    private static void altaSocio() {
        System.out.print("Apodo del socio: ");
        String apodo = sc.nextLine();
        System.out.print("Nombre del socio: ");
        String nombre = sc.nextLine();
        LocalDate fechaAlta = obtenerFecha("Introduce la fecha de alta del socio (DD/MM/YYYY): ");
        Socio nuevoSocio = new Socio(apodo, nombre, fechaAlta);
        socios.put(apodo, nuevoSocio);
        System.out.println("Socio añadido correctamente.");
    }

    private static void bajaSocio() {
        System.out.print("Apodo del socio a eliminar: ");
        String apodo = sc.nextLine();
        if (socios.containsKey(apodo)) {
            socios.remove(apodo);
            System.out.println("Socio eliminado correctamente.");
        } else {
            System.out.println("El socio con el apodo '" + apodo + "' no existe.");
        }
    }

    private static void modificarSocio() {
        System.out.print("Apodo del socio a modificar: ");
        String apodo = sc.nextLine();
        if (socios.containsKey(apodo)) {
            Socio socio = socios.get(apodo);
            System.out.print("Nuevo nombre del socio: ");
            String nuevoNombre = sc.nextLine();
            socio.setNombre(nuevoNombre);
            System.out.println("Socio modificado correctamente.");
        } else {
            System.out.println("El socio con el apodo '" + apodo + "' no existe.");
        }
    }

    private static void listarSociosPorApodo() {
        System.out.println("Socios ordenados por apodo:");
        socios.values().forEach(System.out::println);
    }

    private static void listarSociosPorAntiguedad() {
        System.out.println("Socios ordenados por antigüedad:");
        Comparator<Socio> comparador = Comparator.comparing(Socio::getFechaAlta);
        socios.values().stream()
                .sorted(comparador.reversed())
                .forEach(System.out::println);
    }

    private static void listarSociosAnterioresA() {
        LocalDate fechaLimite = obtenerFecha("Introduce la fecha límite (DD/MM/YYYY): ");
        System.out.println("Socios con alta anterior a " + fechaLimite + ":");
        socios.values().stream()
                .filter(s -> s.getFechaAlta().isBefore(fechaLimite))
                .forEach(System.out::println);
    }

    private static LocalDate obtenerFecha(String mensaje) {
        LocalDate fecha = null;
        do {
            try {
                System.out.print(mensaje);
                String strFecha = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fecha = LocalDate.parse(strFecha, formatter);
            } catch (DateTimeParseException e) {
                System.err.println("ERROR: Formato de fecha incorrecto. Inténtalo de nuevo.");
            }
        } while (fecha == null);
        return fecha;
    }
    
    private static void leerSociosDesdeFichero() {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaClub))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("::");
                String apodo = datos[0];
                String nombre = datos[1];
                LocalDate fechaAlta = LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Socio socio = new Socio(apodo, nombre, fechaAlta);
                socios.put(apodo, socio);
            }
            System.out.println("Socios cargados correctamente desde el fichero.");
        } catch (IOException | DateTimeParseException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Error al cargar los socios desde el fichero: " + e.getMessage());
        }
    }

    private static void guardarSociosEnFichero() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaClub))) {
            for (Socio socio : socios.values()) {
                pw.println(socio.getApodo() + "::" + socio.getNombre() + "::" +
                        socio.getFechaAlta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
            System.out.println("Socios guardados correctamente en el fichero.");
        } catch (IOException e) {
            System.err.println("Error al guardar los socios en el fichero: " + e.getMessage());
        }
    }
}
