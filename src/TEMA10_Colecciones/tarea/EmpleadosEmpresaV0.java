
package TEMA10_Colecciones.tarea;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Comparator;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */


public class EmpleadosEmpresaV0 {
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    private static void añadirEmpleado() {
        System.out.println("Introduce el nombre del empleado:");
        String nombre = scanner.nextLine();
        if (nombre.isEmpty()) return;
        
        System.out.println("Introduce los apellidos del empleado:");
        String apellidos = scanner.nextLine();
        if (apellidos.isEmpty()) return;
        
        LocalDate fechaNacimiento = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            System.out.println("Introduce la fecha de nacimiento del empleado (DD/MM/YYYY):");
            String strFechaNacimiento = scanner.nextLine();
            try {
                fechaNacimiento = LocalDate.parse(strFechaNacimiento, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("ERROR. Introduce el formato correcto DD/MM/YYYY.");
            }
        } while (fechaNacimiento == null);
        
        LocalDate fechaIngreso = null;
        do {
            System.out.println("Introduce la fecha de ingreso del empleado (DD/MM/YYYY):");
            String strFechaIngreso = scanner.nextLine();
            try {
                fechaIngreso = LocalDate.parse(strFechaIngreso, formatter);
                if (fechaIngreso.isBefore(fechaNacimiento)) {
                    System.out.println("La fecha de ingreso no puede ser anterior a la fecha de nacimiento. Por favor, introduce una fecha válida.");
                    fechaIngreso = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("ERROR. Introduce el formato correcto DD/MM/YYYY.");
            }
        } while (fechaIngreso == null);
        
        System.out.println("Introduce el puesto del empleado:");
        String puesto = scanner.nextLine();
        
        double salario = 0;
        do {
            System.out.println("Introduce el salario del empleado:");
            try {
                salario = Double.parseDouble(scanner.nextLine());
                if (salario <= 0) {
                    System.out.println("El salario debe ser mayor que 0. Intentalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Se esperaba un número para el salario. Intentalo de nuevo.");
            }
        } while (salario <= 0);
        
        empleados.add(new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));
        System.out.println("El empleado " + nombre + " ha sido añadido a la lista.");
    }
    private static void eliminarEmpleado() {
        System.out.println("Introduce el nombre del empleado a eliminar:");
        String nombre = scanner.nextLine();
        if (nombre.isEmpty()) return;

        System.out.println("Introduce el apellido del empleado a eliminar:");
        String apellido = scanner.nextLine();
        if (apellido.isEmpty()) return;

        boolean encontrado = false;
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El empleado " + nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("No se encontró ningún empleado con ese nombre.");
        }
    }

    private static void buscarEmpleado() {
        System.out.println("Introduce el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el apellido del empleado:");
        String apellido = scanner.nextLine();

        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) {
                System.out.println(empleado.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún empleado con ese nombre.");
        }
    }

    private static void ordenadosPorAntigüedad() {
        empleados.sort(Comparator.comparing(Empleado::getFechaIngreso));
        System.out.println("EMPLEADOS ORDENADOS POR ANTIGÜEDAD:\n");
        int contador = 1;
        for (Empleado empleado : empleados) {
            System.out.println(contador + "- " + empleado.toString());
            contador++;
        }
    }

    private static void ordenadosPorSalario() {
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario).reversed());
        System.out.println("EMPLEADOS ORDENADOS POR SALARIO:\n");
        int contador = 1;
        for (Empleado empleado : empleados) {
            System.out.println(contador + "- " + empleado.toString());
            contador++;
        }
    }

    private static void ordenadosPorApellido() {
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
        
        Iterator<Empleado> itApellido = empleados.iterator();
        String ordenApellidos = "EMPLEADOS ORDENADOS POR APELLIDO:\n\n";
        int contador = 1; // Para numerar los empleados.
        while (itApellido.hasNext()) {
            Empleado empleado = itApellido.next();
            ordenApellidos += contador + "- " + empleado.toString() + "\n";
            contador++; // Para el siguiente empleado.
        }
    }

    private static void calcularGastoTotal() {
        double gastoTotal = 0;
        for (Empleado empleado : empleados) {
            gastoTotal += empleado.getSalario();
        }
        System.out.println("\nEl gasto total en salarios de los empleados es: " + gastoTotal);
    }
    
    public static void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n               GESTIÓN DE EMPLEADOS" +
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
                               "\nSelecciona una opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
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
                        mostrarSubMenuOrdenamiento();
                        break;
                    case 5:
                        calcularGastoTotal();
                        break;
                    // Continuar con los otros casos
                    case 6:
                        System.out.println("\nSaliendo...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nOpción no válida. Introduce un número entre 1 y 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. Entrada no válida, inténtalo de nuevo.");
            }
        } while (opcion != 6);
    }
    // Método para mostrar el submenú de ordenamiento
    private static void mostrarSubMenuOrdenamiento() {
        String opcionOrdenamiento;
        do {
            System.out.println("Elige una opción:\n" +
                               "a) Por antigüedad\n" +
                               "b) Por salario\n" +
                               "c) Por apellido\n" +
                               "s) Volver al menú principal");
            opcionOrdenamiento = scanner.nextLine().toLowerCase();

            switch (opcionOrdenamiento) {
                case "a":
                    ordenadosPorAntigüedad();
                    break;
                case "b":
                    ordenadosPorSalario();
                    break;
                case "c":
                    ordenadosPorApellido();
                    break;
                case "s":
                    break;
                default:
                    System.out.println("Opción no válida. Introduce 'a', 'b', 'c' o 's' para volver.");
            }
        } while (!opcionOrdenamiento.equals("s"));  // Repetir hasta que se seleccione 's' para salir
    }
    public static void main(String[] args) {
        mostrarMenu();
    }
}
