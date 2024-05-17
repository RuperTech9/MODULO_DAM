
package examen3Evaluacion;


import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Comparator;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Ruper
 */
public class Empresa {
    // ArrayList de Objetos
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String rutaEmpleados = ".\\src\\examen3Evaluacion\\ficheros\\empleados.txt";
    static String rutaEmpleadosAntiguos = ".\\src\\examen3Evaluacion\\ficheros\\empleadosAntiguos.txt";
    
    
    // METODO para añadir un empleado.
    private static void añadirEmpleado() {
        // NOMBRE Y APELLIDOS
        System.out.println("Introduce el nombre del empleado:");
        String nombre = sc.nextLine();
        if (nombre == null) return; // Salgo del método si presiono cancelar
        System.out.println("Introduce los apellidos del empleado:");
        String apellidos = sc.nextLine();
        if (apellidos == null) return;
        
        // FECHA DE NACIMIENTO
        LocalDate fechaNacimiento = null; // Inicializo variable
        do {
            System.out.println("Introduce la fecha de nacimiento del empleado (DD/MM/YYYY):");
            String strFechaNacimiento = sc.nextLine();
            if (strFechaNacimiento == null) return; // Sale del método si se presiona cancelar
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Cambio el formato de la fecha.
                fechaNacimiento = LocalDate.parse(strFechaNacimiento, formatter);
                break; // Salgo si la fecha es correcta
            } catch (DateTimeParseException e) {
                System.err.println("ERROR. Introduce el formato correcto DD/MM/YYYY.");
            } // FIN TRY-CATCH
        } while (fechaNacimiento == null); // FIN DO-WHILE
        
        // FECHA DE INGRESO
        LocalDate fechaIngreso = null; // Inicializo variable
        do {
            System.out.println("Introduce la fecha de ingreso del empleado (DD/MM/YYYY):");
            String strFechaIngreso = sc.nextLine();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Cambio el formato de la fecha.
                fechaIngreso = LocalDate.parse(strFechaIngreso, formatter);
                if (fechaIngreso != null && fechaNacimiento != null && fechaIngreso.isBefore(fechaNacimiento)) { // Verifico que la fecha de ingreso no sea anterior a la fecha de nacimiento
                    System.out.println("La fecha de ingreso no puede ser anterior a la fecha de nacimiento. Por favor, introduce una fecha válida.");
                    fechaIngreso = null; // Restablezco la fechaIngreso para repetir el bucle
                } else {
                    break; // Salgo si la fecha es correcta
                }
            } catch (DateTimeParseException e) {
                System.err.println("ERROR. Introduce el formato correcto DD/MM/YYYY.");
            } // FIN TRY-CATCH
        } while (fechaIngreso == null); // FIN DO-WHILE
        
        // PUESTO
        System.out.println("Introduce el puesto del empleado:");
        String puesto = sc.nextLine();
        
        // SALARIO
        double salario = 0; // Inicializo variable.
        do {
            System.out.println("Introduce el salario del empleado:");
            String strSalario = sc.nextLine();
            try {
                salario = Double.parseDouble(strSalario);
                if (salario > 0) {
                    break; // Salgo si el salario es correcto y positivo.
                } else {
                    System.err.println("El salario debe ser mayor que 0. Intentalo de nuevo.");
                } // FIN IF
            } catch (InputMismatchException e) {
                System.err.println("ERROR. Se esperaba un número para el salario. Intentalo de nuevo.");
            } // FIN TRY-CATCH
        } while (true); // FIN DO-WHILE
        
        empleados.add(new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));                                                       
        System.out.println("\nEl empleado " + nombre + " ha sido añadido a la lista.");
    }
    
    // METODO que elimina un empleado por nombre y apellidos
    private static void eliminarEmpleado() {
        System.out.println("Introduce el nombre del empleado a eliminar:");
        String nombre = sc.nextLine();
        if (nombre == null) return; // Salgo del método si presiono cancelar
        System.out.println("Introduce el apellido del empleado a eliminar:");
        String apellido = sc.nextLine();
        if (apellido == null) return;
        
        boolean encontrado = false; // Inicializo variable.
        
        // ITERATOR Me permite recorrer una colección y modificarla (en este caso, una lista "empleados").
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) { // Mientras haya más elementos en la lista...
            Empleado empleado = iterator.next(); // Recorro la Lista de Empleados.
            if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) { // Compruebo si el nombre y el apellido coinciden.
                
                // Guardar al empleado en empleadosAntiguos.txt llamando al método
                guardarEmpleadoEnAntiguos(empleado);
                
                iterator.remove(); // Elimino el empleado.
                encontrado = true;
                break;
            } // FIN IF
        }
        if (encontrado) {
            System.out.println("\nEl empleado " + nombre + " ha sido eliminado de la lista.");
        } else {
            System.err.println("\nNo se encontró ningún empleado con ese nombre.");
        } // FIN IF
    } // FIN METODO
    
    // METODO que busca un empleado por nombre y apellidos
    private static void buscarEmpleado() {
        System.out.println("Introduce el nombre del empleado:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el apellido del empleado:");
        String apellido = sc.nextLine();
    
        boolean encontrado = false; // Inicializo variable.
        
        // Imprimo los empleados.
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) { // Mientras haya más elementos en la lista...
            Empleado empleado = iterator.next(); // Recorro la Lista de Empleados.
            if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) {
                System.out.println(empleado.toString()); // Muestro los datos del empleado con el nombre especificado.
                encontrado = true;
                // El bucle continuará hasta el final de la lista de empleados por si hay 2 usuarios con el mismo nombre y apellidos.
            } // FIN IF
        } // FIN WHILE
        if (!encontrado) {
            System.err.println("No se encontró ningún empleado con ese nombre.");
        } // FIN IF
    } // FIN METODO
    
    // METODO que ordena la lista de empleados por fecha de ingreso
    private static void ordenadosPorAntigüedad() {
        // COMPARATOR Flexibilidad para ordenar objetos según múltiples criterios y en diferentes órdenes, no limitándose al orden natural de los objetos.
        empleados.sort(Comparator.comparing(Empleado::getFechaIngreso)); // El Comparator le dice al método sort que compare los objetos Empleado entre sí por su fecha de ingreso.
        
        // Imprimo los empleados ya ordenados.
        Iterator<Empleado> itAntiguos = empleados.iterator();
        String ordenAntiguos = "EMPLEADOS ORDENADOS POR ANTIGÜEDAD:\n\n";
        int contador = 1; // Para numerar los empleados.
        while (itAntiguos.hasNext()) {
            Empleado empleado = itAntiguos.next();
            ordenAntiguos += contador + "- " + empleado.toString() + "\n";
            contador++; // Para el siguiente empleado.
        }
        System.out.println(ordenAntiguos);
    } // FIN METODO
    
    // METODO que ordena la lista de empleados por salario (de mayor a menor)
    private static void ordenadosPorSalario() {
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario).reversed());
        
        // Imprimo los empleados ya ordenados
        Iterator<Empleado> itSalario = empleados.iterator();
        String ordenSalario = "EMPLEADOS ORDENADOS POR SALARIO:\n\n";
        int contador = 1; // Para numerar los empleados.
        while (itSalario.hasNext()) {
            Empleado empleado = itSalario.next();
            ordenSalario += contador + "- " + empleado.toString() + "\n";
            contador++; // Para el siguiente empleado.
        }
        System.out.println(ordenSalario);
    } // FIN METODO
    
    // METODO que ordena la lista de empleados por apellido
    private static void ordenadosPorApellido() {
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
    
        // Imprimo los empleados ya ordenados
        Iterator<Empleado> itApellido = empleados.iterator();
        String ordenApellidos = "EMPLEADOS ORDENADOS POR APELLIDO:\n\n";
        int contador = 1; // Para numerar los empleados.
        while (itApellido.hasNext()) {
            Empleado empleado = itApellido.next();
            ordenApellidos += contador + "- " + empleado.toString() + "\n";
            contador++; // Para el siguiente empleado.
        }
        System.out.println(ordenApellidos);
    } // FIN METODO
    
    // METODO para calcular el gasto total sumando los salarios de todos los empleados.
    private static void calcularGastoTotal() {
        double gastoTotal = 0; // Inicializo variable.

        for (Empleado empleado : empleados) {
            gastoTotal += empleado.getSalario(); // Sumo el salario del empleado actual al total.
        } // FIN FOR
        System.out.println("\nEl gasto total en salarios de los empleados es: " + gastoTotal);
        
        /* CON ITERATOR
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            gastoTotal += empleado.getSalario();
        }
        */
    } // FIN METODO
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        leerEmpleadosDesdeFichero();
        int opcion = 0;
        do {     
            try {
            String menu = "\n               GESTIÓN DE EMPLEADOS" +
                          "\n---------------------------------------------------------" +
                          "\n1- Añadir Empleado" +
                          "\n2- Eliminar Empleado" +
                          "\n3- Buscar Empleado" +
                          "\n4- Imprimir empleados ordenados por:" +
                          "\n   a) Por antigüedad" +
                          "\n   b) Por salario" +
                          "\n   c) Por apellido" +
                          "\n5- Calcular gasto total de los empleados" +
                          "\n6- Salir" +
                          "\n---------------------------------------------------------" +
                          "\nSelecciona una opción: ";
            
            System.out.print(menu);
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea
            
                switch (opcion) {
                    case 1:
                        añadirEmpleado();
                        break;
                    case 2:
                        eliminarEmpleado();
                        break;
                    case 3:
                        buscarEmpleado();
                        break;
                    case 4:
                        String opcionOrdenamiento;
                        do {
                            String subMenu = "Elige una opción:\n" +
                                            "a) Por antigüedad\n" +
                                            "b) Por salario\n" +
                                            "c) Por apellido\n" +
                                            "s) Volver al menú principal";
                            System.out.println(subMenu);
                            opcionOrdenamiento = sc.nextLine();
                            
                            // Si presiono cancelar o elijo 's', rompo el bucle y vuelvo al menú principal.
                            if (opcionOrdenamiento == null || opcionOrdenamiento.equalsIgnoreCase("s")) {
                                break;
                            } // FIN IF
                            switch (opcionOrdenamiento.toLowerCase()) {
                                case "a":
                                    ordenadosPorAntigüedad();
                                    break;
                                case "b":
                                    ordenadosPorSalario();
                                    break;
                                case "c":
                                    ordenadosPorApellido();
                                    break;
                                default:
                                    System.err.println("Opción no válida. Introduce 'a', 'b', 'c' o 's' para volver.");
                            } // FIN SWITCH
                            
                        } while (true); // FIN DO-WHILE
                        break;
                    case 5:
                        calcularGastoTotal();
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
        ordenarFicheroPorApellido();
        guardarEmpleadosEnFichero();
    } // FIN METODO
    
    
    // PERSISTENCIA DE DATOS
    // METODO para leer los datos de empleados.txt
    private static void leerEmpleadosDesdeFichero() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rutaEmpleados));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("::");
                String apellidos = datos[0];
                String nombre = datos[1];
                LocalDate fechaNacimiento = LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate fechaIngreso = LocalDate.parse(datos[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String puesto = datos[4];
                double salario = Double.parseDouble(datos[5]);
                
                empleados.add(new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + rutaEmpleados + " no se encontró.");
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
            fw = new FileWriter(rutaEmpleados);
            pw = new PrintWriter(fw);
            // Escribo los empleados en el archivo
            for (Empleado empleado : empleados) {
                pw.println(empleado.getApellidos() + "::" +
                         empleado.getNombre() + "::" +
                         empleado.getFechaNacimiento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "::" +
                         empleado.getFechaIngreso().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "::" +
                         empleado.getPuesto() + "::" +
                         empleado.getSalario());
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + rutaEmpleados + " no se encontró.");
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
    private static void guardarEmpleadoEnAntiguos(Empleado empleado) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(rutaEmpleadosAntiguos, true); // agrego nuevos empleados al final del archivo sin eliminar la información existente
            pw = new PrintWriter(fw); 
            // Escribo los datos del empleado en el archivo empleadosAntiguos.txt
            pw.println(empleado.getNombre() + "::" + 
                    empleado.getApellidos() + "::" + 
                    empleado.getFechaNacimiento() + "::" + 
                    empleado.getFechaIngreso() + "::" + 
                    LocalDate.now()); // La fecha de finalización es la fecha actual
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + rutaEmpleados + " no se encontró.");
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
    
    //METODO para ordenar empleados.txt por apellidos
    private static void ordenarFicheroPorApellido() {
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
    } // FIN METODO
    
} // FIN CLASE