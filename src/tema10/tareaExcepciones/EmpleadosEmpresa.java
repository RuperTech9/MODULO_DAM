
package tema10.tareaExcepciones;

import java.time.LocalDate;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;

/**
 *
 * @author Ruper
 */
public class EmpleadosEmpresa {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Empleado> empleados = new ArrayList<>(); // ArrayList de Objetos
    
    private static void añadirEmpleado() {
        // NOMBRE
        System.out.print("Introduce el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        // APELLIDOS
        System.out.print("Introduce los apellidos del empleado: ");
        String apellidos = sc.nextLine();
        
        // FECHA DE NACIMIENTO
        LocalDate fechaNacimiento = null; // Inicializo variable
        do {
            System.out.print("Introduce la fecha de nacimiento del empleado (YYYY-MM-DD): ");
            try {
                fechaNacimiento = LocalDate.parse(sc.nextLine());
                break; // Salgo si la fecha es correcta
            } catch (DateTimeParseException e) {
                System.out.println("Error. Introduce el formato correcto YYYY-MM-DD.");
            } // FIN TRY-CATCH
        } while (fechaNacimiento == null); // FIN DO-WHILE
        
        // FECHA DE INGRESO
        LocalDate fechaIngreso = null; // Inicializo variable
        do {
            System.out.print("Introduce la fecha de ingreso del empleado (YYYY-MM-DD): ");
            try {
                fechaIngreso = LocalDate.parse(sc.nextLine());
                break; // Salgo si la fecha es correcta
            } catch (DateTimeParseException e) {
                System.out.println("Error. Introduce el formato correcto YYYY-MM-DD.");
            } // FIN TRY-CATCH
        } while (fechaIngreso == null); // FIN DO-WHILE
        
        // PUESTO
        System.out.print("Introduce el puesto del empleado: ");
        String puesto = sc.nextLine();
        
        // SALARIO
        double salario = 0; // Inicializo variable.
        do {
            System.out.print("Introduce el salario del empleado: ");
            try {
                salario = sc.nextDouble();
                if (salario > 0) {
                    break; // Salgo si el salario es correcto y positivo.
                } else {
                    System.out.println("El salario debe ser mayor que 0. Intentalo de nuevo.");
                } // FIN IF
            } catch (InputMismatchException e) {
                System.out.println("Error. Se esperaba un número para el salario. Intentalo de nuevo.");
                sc.nextLine(); // Importante: consume la entrada errónea para evitar un bucle infinito.
            } // FIN TRY-CATCH
        } while (true); // FIN DO-WHILE
        
        empleados.add(new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));
        System.out.println(nombre + " ha sido añadido a la lista.\n");
 
    }
    
    // METODO que elimina un empleado por nombre usando ITERATOR
    private static void eliminarEmpleado() {
        System.out.print("Introduce el nombre del empleado a eliminar: ");
        String nombre = sc.nextLine();
        
        boolean encontrado = false; // Inicializo variable.
        // ITERATOR Objeto que me permite recorrer una colección (en este caso, una lista)
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) { // Mientras haya más elementos en la lista...
            Empleado empleado = iterator.next(); // Recorro la Lista de Empleados.
            if (empleado.getNombre().equalsIgnoreCase(nombre)) { // Compruebo si el nombre coincide.
                iterator.remove(); // Elimino el empleado.
                encontrado = true;
                break;
            } // FIN IF
        }
        if (encontrado) {
            System.out.println(nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("No se encontró ningún empleado con ese nombre.");
        } // FIN IF
    }
    
    // METODO que busca un empleado por nombre
    private static void buscarEmpleado() {
        System.out.print("Introduce el nombre del empleado a buscar: ");
        String nombre = sc.nextLine();
    
        boolean encontrado = false; // Inicializo variable.
        for (Empleado empleado : empleados) { // Recorro la lista de empleados
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(empleado); // Muestro los datos del empleado con el nombre especificado.
                encontrado = true;
                break;
            } // FIN IF
        } // FIN FOR
        if (!encontrado) {
            System.out.println("No se encontró ningún empleado con ese nombre.");
        } // FIN IF
    }
    
    // METODO que ordena la lista de empleados por fecha de ingreso usando COMPARATOR
    private static void imprimirEmpleadosOrdenadosPorAntigüedad() {
        // COMPARATOR Ofrece flexibilidad para ordenar objetos según múltiples criterios y en diferentes órdenes, no limitándose al orden natural de los objetos.
        empleados.sort(Comparator.comparing(Empleado::getFechaIngreso)); // El Comparator le dice al método sort cómo comparar los objetos Empleado entre sí (es decir, por su fecha de ingreso).
        
        // Imprimo los empleados ya ordenados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + "- " + empleados.get(i));
        } // FIN FOR
    }
    
    // METODO que ordena la lista de empleados por salario (de mayor a menor)usando COMPARATOR
    private static void imprimirEmpleadosOrdenadosPorSalario() {
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario).reversed());
        
        // Imprimo los empleados ya ordenados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + "- " + empleados.get(i));
        } // FIN FOR
    }
    
    // METODO que ordena la lista de empleados por apellido usando COMPARATOR
    private static void imprimirEmpleadosOrdenadosPorApellido() {
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
    
        // Imprimo los empleados ordenados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + "- " + empleados.get(i));
        } // FIN FOR
    }
    
    // METODO para calcular el gasto total sumando los salarios de todos los empleados
    private static void calcularGastoTotal() {
        double gastoTotal = 0; // Inicializo variable.

        for (Empleado empleado : empleados) {
            gastoTotal += empleado.getSalario(); // Sumo el salario del empleado actual al total.
        } // FIN FOR
        System.out.println("El gasto total en salarios de los empleados es: " + gastoTotal);
    }
    
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        String menu = "\nGESTIÓN DE EMPLEADOS" +
                      "--------------------" +
                      "\nOpciones:" +
                      "\n1- Añadir Empleado" +
                      "\n2- Eliminar Empleado" +
                      "\n3- Buscar Empleado" +
                      "\n4- Imprimir empleados ordenados por:" +
                      "\n   a) Por antigüedad" +
                      "\n   b) Por salario" +
                      "\n   c) Por apellido" +
                      "\n5- Calcular gasto total de los empleados" +
                      "\n6- Salir";
        
        int opcion = 0;
        do {
            System.out.println(menu);
            System.out.print("Selecciona una opción: ");
            while (true) {
                try {
                    opcion = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("ERROR. Introduce un número válido.");
                    sc.next();
                    System.out.print("Selecciona una opción: ");
                }
            }
            try {
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
                        sc.nextLine(); // Consumir el salto de línea pendiente después de nextInt()
                        System.out.print("Elige una opción (a, b o c): ");
                        char opcionOrdenamiento = sc.nextLine().charAt(0);
                        switch (opcionOrdenamiento) {
                            case 'a':
                                System.out.println("\nOrdenados por Antiguedad");
                                imprimirEmpleadosOrdenadosPorAntigüedad();
                                break;
                            case 'b':
                                System.out.println("\nOrdenados por Salario");
                                imprimirEmpleadosOrdenadosPorSalario();
                                break;
                            case 'c':
                                System.out.println("\nOrdenados por Apellido");
                                imprimirEmpleadosOrdenadosPorApellido();
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                        break;
                    case 5:
                        calcularGastoTotal();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Introduce un número entre 1 y 6.");
                        break;
                } // FIN SWITCH
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, por favor intenta nuevamente.");
                sc.nextLine(); // Descarta la entrada incorrecta para evitar bucles infinitos
            }
        } while (opcion != 6); // FIN DO-WHILE
    } // FIN METODO
    
    public static void main(String[] args){
        // Objeto EmpleadosEmpresa
        EmpleadosEmpresa empresa = new EmpleadosEmpresa();
       
        // Empleados por defecto
        LocalDate fechaNacimientoJuan = LocalDate.parse("1960-01-01");
        LocalDate fechaIngresoJuan = LocalDate.parse("1980-05-24");
        empresa.empleados.add(new Empleado("Juan", "Torres", fechaNacimientoJuan, fechaIngresoJuan, "Jefe", 60000.0));
        
        LocalDate fechaNacimientoSara = LocalDate.parse("1980-05-02");
        LocalDate fechaIngresoSara = LocalDate.parse("1999-06-03");
        empresa.empleados.add(new Empleado("Sara", "Gonzalez", fechaNacimientoSara, fechaIngresoSara, "Secretaria", 25000.0));
        
        LocalDate fechaNacimientoElena = LocalDate.parse("1990-09-03");
        LocalDate fechaIngresoElena = LocalDate.parse("2010-11-02");
        empresa.empleados.add(new Empleado("Elena", "Sanchez", fechaNacimientoElena, fechaIngresoElena, "TecnicoFP", 30000.0));
        
        LocalDate fechaNacimientoPepe = LocalDate.parse("1991-10-04");
        LocalDate fechaIngresoPepe = LocalDate.parse("2015-10-01");
        empresa.empleados.add(new Empleado("Pepe", "Uriel", fechaNacimientoPepe, fechaIngresoPepe, "Administrativo", 24000.0));
    
        empresa.mostrarMenu();
    }
}