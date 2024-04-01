
package tema10.tareaExcepciones;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Comparator;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruper
 */
public class EmpleadosEmpresaV1 {
    static ArrayList<Empleado> empleados = new ArrayList<>(); // ArrayList de Objetos
    
    private static void añadirEmpleado() {
        // NOMBRE
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado:");

        // APELLIDOS
        String apellidos = JOptionPane.showInputDialog("Introduce los apellidos del empleado:");
        
        // FECHA DE NACIMIENTO
        LocalDate fechaNacimiento = null; // Inicializo variable
        do {
            String strFechaNacimiento = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del empleado (YYYY-MM-DD):");
            try {
                fechaNacimiento = LocalDate.parse(strFechaNacimiento);
                break; // Salgo si la fecha es correcta
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Error. Introduce el formato correcto YYYY-MM-DD.");
            } // FIN TRY-CATCH
        } while (fechaNacimiento == null); // FIN DO-WHILE
        
        // FECHA DE INGRESO
        LocalDate fechaIngreso = null; // Inicializo variable
        do {
            String strFechaIngreso = JOptionPane.showInputDialog("Introduce la fecha de ingreso del empleado (YYYY-MM-DD):");
            try {
                fechaIngreso = LocalDate.parse(strFechaIngreso);
                if (fechaIngreso != null && fechaNacimiento != null && fechaIngreso.isBefore(fechaNacimiento)) { // Verifico que la fecha de ingreso no sea anterior a la fecha de nacimiento
                    JOptionPane.showMessageDialog(null, "La fecha de ingreso no puede ser anterior a la fecha de nacimiento. Por favor, introduce una fecha válida.");
                    fechaIngreso = null; // Restablezco la fechaIngreso para repetir el bucle
                } else {
                    break; // Salgo si la fecha es correcta
                }
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Error. Introduce el formato correcto YYYY-MM-DD.");
            } // FIN TRY-CATCH
        } while (fechaIngreso == null); // FIN DO-WHILE
        
        // PUESTO
        String puesto = JOptionPane.showInputDialog(null, "Introduce el puesto del empleado:");
        
        // SALARIO
        double salario = 0; // Inicializo variable.
        do {
            String strSalario = JOptionPane.showInputDialog("Introduce el salario del empleado:");
            try {
                salario = Double.parseDouble(strSalario);
                if (salario > 0) {
                    break; // Salgo si el salario es correcto y positivo.
                } else {
                    JOptionPane.showMessageDialog(null, "El salario debe ser mayor que 0. Intentalo de nuevo.");
                } // FIN IF
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Error. Se esperaba un número para el salario. Intentalo de nuevo.");
            } // FIN TRY-CATCH
        } while (true); // FIN DO-WHILE
        
        empleados.add(new Empleado(nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario));
        JOptionPane.showMessageDialog(null, nombre + " ha sido añadido a la lista.");
 
    }
    
    // METODO que elimina un empleado por nombre usando ITERATOR
    private static void eliminarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado a eliminar:");
        
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
            JOptionPane.showMessageDialog(null, nombre + " ha sido eliminado de la lista.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún empleado con ese nombre.");
        } // FIN IF
    }
    
    // METODO que busca un empleado por nombre
    private static void buscarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado a buscar:");
    
        boolean encontrado = false; // Inicializo variable.
        for (Empleado empleado : empleados) { // Recorro la lista de empleados
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, empleado.toString()); // Muestro los datos del empleado con el nombre especificado.
                encontrado = true;
                break;
            } // FIN IF
        } // FIN FOR
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún empleado con ese nombre.");
        } // FIN IF
    }
    
    // METODO que ordena la lista de empleados por fecha de ingreso usando COMPARATOR
    private static void imprimirEmpleadosOrdenadosPorAntigüedad() {
        // COMPARATOR Ofrece flexibilidad para ordenar objetos según múltiples criterios y en diferentes órdenes, no limitándose al orden natural de los objetos.
        empleados.sort(Comparator.comparing(Empleado::getFechaIngreso)); // El Comparator le dice al método sort cómo comparar los objetos Empleado entre sí (es decir, por su fecha de ingreso).
        
        // Imprimo los empleados ya ordenados
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados ordenados por antigüedad:\n");

        // Añadir la información de cada empleado al StringBuilder
        for (int i = 0; i < empleados.size(); i++) {
            sb.append((i + 1) + "- " + empleados.get(i).toString() + "\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    // METODO que ordena la lista de empleados por salario (de mayor a menor)usando COMPARATOR
    private static void imprimirEmpleadosOrdenadosPorSalario() {
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario).reversed());
        
        // Imprimo los empleados ya ordenados
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados ordenados por salario:\n");

        // Añadir la información de cada empleado al StringBuilder
        for (int i = 0; i < empleados.size(); i++) {
            sb.append((i + 1) + "- " + empleados.get(i).toString() + "\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    // METODO que ordena la lista de empleados por apellido usando COMPARATOR
    private static void imprimirEmpleadosOrdenadosPorApellido() {
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
    
        // Imprimo los empleados ya ordenados
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados ordenados por apellido:\n");

        // Añadir la información de cada empleado al StringBuilder
        for (int i = 0; i < empleados.size(); i++) {
            sb.append((i + 1) + "- " + empleados.get(i).toString() + "\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    // METODO para calcular el gasto total sumando los salarios de todos los empleados
    private static void calcularGastoTotal() {
        double gastoTotal = 0; // Inicializo variable.

        for (Empleado empleado : empleados) {
            gastoTotal += empleado.getSalario(); // Sumo el salario del empleado actual al total.
        } // FIN FOR
        JOptionPane.showMessageDialog(null, "\nEl gasto total en salarios de los empleados es: " + gastoTotal);

    }
    
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
        String menu = "\nGESTIÓN DE EMPLEADOS" +
                      "\n--------------------" +
                      "\n1- Añadir Empleado" +
                      "\n2- Eliminar Empleado" +
                      "\n3- Buscar Empleado" +
                      "\n4- Imprimir empleados ordenados por:" +
                      "\n   a) Por antigüedad" +
                      "\n   b) Por salario" +
                      "\n   c) Por apellido" +
                      "\n5- Calcular gasto total de los empleados" +
                      "\n6- Salir" +
                      "\nSelecciona una opción: ";
        
        int opcion = 0;
        do {     
            try {
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
                        String subMenu = "Elige una opción:\n" +
                                          "a) Por antigüedad\n" +
                                          "b) Por salario\n" +
                                          "c) Por apellido";
                        String opcionOrdenamiento = JOptionPane.showInputDialog(subMenu);
                        if (opcionOrdenamiento != null) {
                            switch (opcionOrdenamiento.toLowerCase()) {
                                case "a":
                                    imprimirEmpleadosOrdenadosPorAntigüedad();
                                    break;
                                case "b":
                                    imprimirEmpleadosOrdenadosPorSalario();
                                    break;
                                case "c":
                                    imprimirEmpleadosOrdenadosPorApellido();
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                                    break;
                            }
                        }
                        break;
                    case 5:
                        calcularGastoTotal();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "\nSaliendo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "\nOpción no válida. Introduce un número entre 1 y 6.");
                        break;
                } // FIN SWITCH
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida, por favor intenta nuevamente.");
            }
        } while (opcion != 6); // FIN DO-WHILE
    } // FIN METODO
    
    public static void main(String[] args){
        // Objeto EmpleadosEmpresa
        EmpleadosEmpresaV1 empresa = new EmpleadosEmpresaV1();
       
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