
package TEMA10_Colecciones.ejemplosArrayList;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Ruper
 */
public class A03_EmpleadosEmpresa {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<A03_Empleado> empleados = new ArrayList<>();
    
    private static void añadirEmpleado() {
        System.out.print("Introduce el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce los apellidos del empleado: ");
        String apellidos = sc.nextLine();
        System.out.print("Introduce la fecha de nacimiento del empleado (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
        System.out.print("Introduce la fecha de ingreso del empleado (YYYY-MM-DD): ");
        LocalDate fechaIngreso = LocalDate.parse(sc.nextLine());
        System.out.print("Introduce el puesto del empleado: ");
        String puesto = sc.nextLine();
        System.out.print("Introduce el salario del empleado: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea pendiente
    
        empleados.add(new A03_Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));
        System.out.println(nombre + " ha sido añadido a la lista.");
    }
    
    private static void eliminarEmpleado() {
        System.out.print("Introduce el nombre del empleado a eliminar: ");
        String nombre = sc.nextLine();
    
        // Iterar sobre la lista de empleados y eliminar el empleado con el nombre especificado
        boolean encontrado = false;
        Iterator<A03_Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            A03_Empleado empleado = iterator.next();
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println(nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("No se encontró ningún empleado con el nombre especificado.");
        }
    }

    private static void buscarEmpleado() {
        System.out.print("Introduce el nombre del empleado a buscar: ");
        String nombre = sc.nextLine();
    
        // Iterar sobre la lista de empleados y mostrar los datos del empleado con el nombre especificado
        boolean encontrado = false;
        for (A03_Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(empleado);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún empleado con el nombre especificado.");
        }
    }

    private static void imprimirEmpleadosOrdenadosPorAntigüedad() {
        // Ordenar la lista de empleados por fecha de ingreso
        empleados.sort(Comparator.comparing(A03_Empleado::getFechaDeIngreso));
        
        // Imprimir los empleados ordenados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + "- " + empleados.get(i));
        }
    }
    
    private static void imprimirEmpleadosOrdenadosPorSalario() {
        // Ordenar la lista de empleados por salario (de mayor a menor)
        empleados.sort(Comparator.comparingDouble(A03_Empleado::getSalario).reversed());
    
        // Imprimir los empleados ordenados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + "- " + empleados.get(i));
        }
    }

    private static void imprimirEmpleadosOrdenadosPorApellido() {
        // Ordenar la lista de empleados por apellido
        empleados.sort(Comparator.comparing(A03_Empleado::getApellidos));
    
        // Imprimir los empleados ordenados
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + "- " + empleados.get(i));
        }
    }

    private static void calcularGastoTotal() {
        // Calcular el gasto total sumando los salarios de todos los empleados
        double gastoTotal = empleados.stream().mapToDouble(A03_Empleado::getSalario).sum();
        System.out.println("El gasto total en salarios de los empleados es: " + gastoTotal);
    }
    
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nGESTIÓN DE EMPLEADOS");
            System.out.println("1- Añadir Empleado");
            System.out.println("2- Eliminar Empleado");
            System.out.println("3- Buscar Empleado");
            System.out.println("4- Imprimir empleados ordenados por:");
            System.out.println("   a) Por antigüedad");
            System.out.println("   b) Por salario");
            System.out.println("   c) Por apellido");
            System.out.println("5- Calcular gasto total de los empleados");
            System.out.println("6- Salir");
            System.out.print("Elija una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Salto de línea después de leer un número.

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
                    } // FIN SWITCH INTERNO
                    break;
                case 5:
                    calcularGastoTotal();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            } // FIN SWITCH
        } while (opcion != 6); // FIN DO-WHILE
    } // FIN METODO
    
    public static void main(String[] args){
        // objeto A03_EmpleadosEmpresa
        A03_EmpleadosEmpresa empresa = new A03_EmpleadosEmpresa();
       
        // Agregar empleados por defecto
        LocalDate fechaNacimientoJuan = LocalDate.parse("1960-01-01");
        LocalDate fechaIngresoJuan = LocalDate.parse("1980-05-24");
        empresa.empleados.add(new A03_Empleado("Juan", "Torres", fechaNacimientoJuan, fechaIngresoJuan, "Jefe", 60000.0));
        
        LocalDate fechaNacimientoSara = LocalDate.parse("1980-05-02");
        LocalDate fechaIngresoSara = LocalDate.parse("1999-06-03");
        empresa.empleados.add(new A03_Empleado("Sara", "Gonzalez", fechaNacimientoSara, fechaIngresoSara, "Secretaria", 25000.0));
        
        LocalDate fechaNacimientoElena = LocalDate.parse("1990-09-03");
        LocalDate fechaIngresoElena = LocalDate.parse("2010-11-02");
        empresa.empleados.add(new A03_Empleado("Elena", "Sanchez", fechaNacimientoElena, fechaIngresoElena, "TecnicoFP", 30000.0));
        
        LocalDate fechaNacimientoPepe = LocalDate.parse("1991-10-04");
        LocalDate fechaIngresoPepe = LocalDate.parse("2015-10-01");
        empresa.empleados.add(new A03_Empleado("Pepe", "Uriel", fechaNacimientoPepe, fechaIngresoPepe, "Administrativo", 24000.0));
    
        empresa.mostrarMenu();
    }
}
