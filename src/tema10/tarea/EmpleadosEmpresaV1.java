
package tema10.tarea;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Ruper
 */
public class EmpleadosEmpresaV1 {
    static ArrayList<Empleado> empleados = new ArrayList<>();
    
    private static void añadirEmpleado() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado:");
        String apellidos = JOptionPane.showInputDialog("Introduce los apellidos del empleado:");
        String strFechaNacimiento = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del empleado (YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(strFechaNacimiento);
        String strFechaIngreso = JOptionPane.showInputDialog("Introduce la fecha de ingreso del empleado (YYYY-MM-DD):");
        LocalDate fechaIngreso = LocalDate.parse(strFechaIngreso);
        String puesto = JOptionPane.showInputDialog("Introduce el puesto del empleado:");
        String strSalario = JOptionPane.showInputDialog("Introduce el salario del empleado:");
        double salario = Double.parseDouble(strSalario);

        empleados.add(new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));
        JOptionPane.showMessageDialog(null, nombre + " ha sido añadido a la lista.");
    }
    
    private static void eliminarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado a eliminar:");
    
        // Iterar sobre la lista de empleados y eliminar el empleado con el nombre especificado
        boolean encontrado = false;
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, nombre + " ha sido eliminado de la lista.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún empleado con el nombre especificado.");
        }
    }

    private static void buscarEmpleado() {
         String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado a buscar:");
    
        // Iterar sobre la lista de empleados y mostrar los datos del empleado con el nombre especificado
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, empleado.toString());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún empleado con el nombre especificado.");
        }
    }

    private static void imprimirEmpleadosOrdenadosPorAntigüedad() {
        // Ordenar la lista de empleados por fecha de ingreso
        empleados.sort(Comparator.comparing(Empleado::getFechaIngreso));
        // Imprimir los empleados ordenados
        StringBuilder sb = new StringBuilder();
        for (Empleado empleado : empleados) {
            sb.append(empleado.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Empleados Ordenados por Antigüedad", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void imprimirEmpleadosOrdenadosPorSalario() {
        // Ordenar la lista de empleados por salario (de mayor a menor)
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario).reversed());
        // Imprimir los empleados ordenados
        StringBuilder sb = new StringBuilder();
        for (Empleado empleado : empleados) {
            sb.append(empleado.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Empleados Ordenados por Salario", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void imprimirEmpleadosOrdenadosPorApellido() {
        // Ordenar la lista de empleados por apellido
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
        // Imprimir los empleados ordenados
        StringBuilder sb = new StringBuilder();
        for (Empleado empleado : empleados) {
            sb.append(empleado.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Empleados Ordenados por Apellido", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calcularGastoTotal() {
        // Calcular el gasto total sumando los salarios de todos los empleados
        double gastoTotal = 0;
        for (Empleado empleado : empleados) {
            gastoTotal += empleado.getSalario();
        }
        JOptionPane.showMessageDialog(null, "El gasto total en salarios de los empleados es: " + gastoTotal, "Gasto Total", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        int opcion;
        do {
            String menu = "GESTIÓN DE EMPLEADOS\n" +
                    "--------------------\n" +
                    "1- Añadir Empleado\n" +
                    "2- Eliminar Empleado\n" +
                    "3- Buscar Empleado\n" +
                    "4- Imprimir empleados ordenados por:\n" +
                    "   a) Por antigüedad\n" +
                    "   b) Por salario\n" +
                    "   c) Por apellido\n" +
                    "5- Calcular gasto total de los empleados\n" +
                    "6- Salir\n" +
                    "Elija una opción:";
            String strOpcion = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(strOpcion);

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
                    String subMenu = "Elige una opción (a, b, c):\na) Por antigüedad\nb) Por salario\nc) Por apellido";
                    String opcionOrdenamiento = JOptionPane.showInputDialog(null, subMenu, "Ordenamiento", JOptionPane.QUESTION_MESSAGE);
                    if (opcionOrdenamiento != null && !opcionOrdenamiento.isEmpty()) {
                        switch (opcionOrdenamiento.charAt(0)) {
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
                                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    }
                    break;
                case 5:
                    calcularGastoTotal();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo...", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            } // FIN SWITCH
        } while (opcion != 6); // FIN DO-WHILE
    } // FIN METODO
    
    public static void main(String[] args){
        // objeto A03_EmpleadosEmpresa
        EmpleadosEmpresaV1 empresa = new EmpleadosEmpresaV1();
       
        // Agregar empleados por defecto
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