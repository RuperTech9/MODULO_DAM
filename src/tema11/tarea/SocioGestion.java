
package tema11.tarea;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Ruper
 */
public class SocioGestion {
    static Scanner sc = new Scanner(System.in);
    static Set<Socio> socios = new TreeSet<>();
    static String rutaSocios = ".\\src\\tema11\\tarea\\socios.txt";
    static String rutaSociosAntiguos = ".\\src\\tema11\\tarea\\sociosAntiguos.txt";
    
    static boolean alta (Set<Socio> socios) {
        System.out.print("DNI: ");
        String dni;
        dni = sc.next();
        System.out.print("nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        // FECHA DE ALTA
        LocalDate fechaAlta = null; // Inicializo variable
        do {
            System.out.println("Introduce la fecha de alta del socio (DD/MM/YYYY):");
            String strFechaIngreso = sc.nextLine();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Cambio el formato de la fecha.
                fechaAlta = LocalDate.parse(strFechaIngreso, formatter);
                
            } catch (DateTimeParseException e) {
                System.err.println("ERROR. Introduce el formato correcto DD/MM/YYYY.");
            } // FIN TRY-CATCH
        } while (fechaAlta == null); // FIN DO-WHILE
        Socio nuevo = new Socio (dni, nombre, fechaAlta);
        if(socios.add(nuevo)) {
            guardarSocioEnArchivo(nuevo);
            return true;
        } else {
            return false;
        }
    }
    static void guardarSocioEnArchivo(Socio socio) {
        System.out.print("Introduce el nombre del archivo para este socio (sin .txt): ");
        String nombreArchivo = sc.next();
        File archivo = new File(".\\src\\tema11\\tarea\\" + nombreArchivo + ".txt");

        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            pw.println(socio.getDni() + "::" +
                       socio.getNombre() + "::" +
                       socio.getFechaAlta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("Socio guardado en archivo " + archivo.getName());
        } catch (IOException e) {
            System.err.println("ERROR al guardar el socio en el archivo.");
            e.printStackTrace();
        }
    }
    
    static boolean baja (Set<Socio> socios) {
        System.out.println("DNI del socio a eliminar: ");
        String dni = sc.next();
        Socio socioEliminado = null;
        for (Socio socio : socios) {
            if (socio.getDni().equals(dni)) {
                socioEliminado = socio;
                break;
            }
        }
        if (socioEliminado != null) {
            socios.remove(socioEliminado);
            guardarEmpleadoEnAntiguos(socioEliminado);
            return true;
        } else {
            return false;
        }
    }
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        leerEmpleadosDesdeFichero();
        int opcion = 0;
        do {     
            try {
            String menu = "\n               GESTIÓN DE SOCIOS" +
                          "\n---------------------------------------------------------" +
                          "\n1- Alta" +
                          "\n2- Baja" +
                          "\n3- Modificación" +
                          "\n4- Listado por dni" +
                          "\n5- Listado por antigüedad" +
                          "\n6- Salir" +
                          "\n---------------------------------------------------------" +
                          "\nSelecciona una opción: ";
            
            System.out.print(menu);
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea
            
                switch (opcion) {
                    case 1:
                        alta(socios);
                        break;
                    case 2:
                        baja(socios);
                        break;
                    case 3:
                        System.out.println("DNI del socio a modificar: ");
                        String dni = sc.next();
                        socios.remove(new Socio(dni));
                        alta(socios);
                        break;
                    case 4:
                        System.out.println(socios);
                        break;
                    case 5:
                        Comparator<Socio> c = new Comparator<>() {
                            @Override
                            public int compare(Socio o1, Socio o2) {
                                return o2.antiguedad() - o1.antiguedad();
                            }
                        };
                        Set<Socio> s = new TreeSet<>(c);
                        s.addAll(socios);
                        System.out.println(s);
                        break;
                    case 6:
                        System.out.println("\nSaliendo...");
                        break;
                    default:
                        System.err.println("\nOpción no válida. Introduce un número entre 1 y 6.");
                        break;
                } // FIN SWITCH
            } catch (InputMismatchException e) {
                System.err.println("ERROR. Entrada no válida, inténtalo de nuevo.");
                sc.nextLine(); // Salto de línea
            } // FIN TRY-CATCH
        } while (opcion != 6); // FIN DO-WHILE
        guardarEmpleadosEnFichero();
    } // FIN METODO
    
    // PERSISTENCIA DE DATOS
    // METODO para leer los datos de empleados.txt
    private static void leerEmpleadosDesdeFichero() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rutaSocios));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("::");
                String dni = datos[0];
                String nombre = datos[1];
                LocalDate fechaAlta = LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
                socios.add(new Socio(dni, nombre, fechaAlta));
            }
        } catch (IOException | DateTimeParseException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close(); // Cerrar BufferedReader
            } catch (IOException e2) {
                e2.printStackTrace();
            } // FIN TRY-CATCH INTERNO
        } // FIN TRY-CATCH-FINALLY
    } // FIN METODO
    
    // METODO para guardar los empleados en empleados.txt
    private static void guardarEmpleadosEnFichero() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(rutaSocios);
            pw = new PrintWriter(fw);
            // Escribo los empleados en el archivo
            for (Socio socio : socios) {
                pw.println(socio.getDni() + "::" +                     
                         socio.getNombre() + "::" +
                         socio.getFechaAlta().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null)
                    pw.close(); // Cerrar PrintWriter
                if (fw != null)
                    fw.close(); // Cerrar FileWriter
            } catch (IOException e2) {
                e2.printStackTrace();
            } // FIN TRY-CATCH INTERNO
        } // FIN TRY-CATCH-FINALLY
    } // FIN METODO
    
    // METODO para guardar los empleados eliminados en empleadosAntiguos.txt
    private static void guardarEmpleadoEnAntiguos(Socio socio) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(rutaSociosAntiguos, true); // agrego nuevos empleados al final del archivo sin eliminar la información existente
            pw = new PrintWriter(fw); 
            // Escribo los datos del empleado en el archivo empleadosAntiguos.txt
            pw.println(socio.getDni() + "::" + 
                    socio.getNombre() + "::" + 
                    socio.getFechaAlta() + "::" + 
                    LocalDate.now()); // La fecha de finalización es la fecha actual
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null)
                    pw.close(); // Cerrar PrintWriter
                if (fw != null)
                    fw.close(); // Cerrar FileWriter
            } catch (IOException e2) {
                e2.printStackTrace();
            } // FIN TRY-CATCH INTERNO
        } // FIN TRY-CATCH-FINALLY
    } // FIN METODO
}
