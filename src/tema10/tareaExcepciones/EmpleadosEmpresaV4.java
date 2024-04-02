
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
public class EmpleadosEmpresaV4 {
    static ArrayList<Empleado> empleados = new ArrayList<>(); // ArrayList de Objetos
    
    private static void añadirEmpleado() {
        // NOMBRE Y APELLIDOS
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado:");
        if (nombre == null) return; // Salgo del método si presiono cancelar
        String apellidos = JOptionPane.showInputDialog("Introduce los apellidos del empleado:");
        if (apellidos == null) return;
        
        // FECHA DE NACIMIENTO
        LocalDate fechaNacimiento = null; // Inicializo variable
        do {
            String strFechaNacimiento = JOptionPane.showInputDialog("Introduce la fecha de nacimiento del empleado (YYYY-MM-DD):");
            if (strFechaNacimiento == null) return; // Sale del método si se presiona cancelar
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
            if (strFechaIngreso == null) return;
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
    
    // METODO que elimina un empleado por nombre
    private static void eliminarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado a eliminar:");
        if (nombre == null) return; // Salgo del método si presiono cancelar
        String apellido = JOptionPane.showInputDialog("Introduce el apellido del empleado a eliminar:");
        if (apellido == null) return;
        
        boolean encontrado = false; // Inicializo variable.
        
        // ITERATOR Me permite recorrer una colección y modificarla (en este caso, una lista "empleados").
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) { // Mientras haya más elementos en la lista...
            Empleado empleado = iterator.next(); // Recorro la Lista de Empleados.
            if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) { // Compruebo si el nombre y el apellido coinciden.
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
    } // FIN METODO
    
    // METODO que busca un empleado por nombre
    private static void buscarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Introduce el apellido del empleado:");
    
        boolean encontrado = false; // Inicializo variable.
        
        // Imprimo los empleados.
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) { // Mientras haya más elementos en la lista...
            Empleado empleado = iterator.next(); // Recorro la Lista de Empleados.
            if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) {
                JOptionPane.showMessageDialog(null, empleado.toString()); // Muestro los datos del empleado con el nombre especificado.
                encontrado = true;
                break;
            } // FIN IF
        } // FIN WHILE
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún empleado con ese nombre.");
        } // FIN IF
    } // FIN METODO
    
    // METODO que ordena la lista de empleados por fecha de ingreso
    private static void ordenadosPorAntigüedad() {
        // COMPARATOR Flexibilidad para ordenar objetos según múltiples criterios y en diferentes órdenes, no limitándose al orden natural de los objetos.
        empleados.sort(Comparator.comparing(Empleado::getFechaIngreso)); // El Comparator le dice al método sort que compare los objetos Empleado entre sí por su fecha de ingreso.
        
        // Imprimo los empleados ya ordenados.
        Iterator<Empleado> itAntiguos = empleados.iterator();
        String ordenAntiguos = "Empleados ordenados por antigüedad:\n\n";
        int contador = 1; // Variable para enumerar los empleados
        while (itAntiguos.hasNext()) {
            Empleado empleado = itAntiguos.next();
            ordenAntiguos += contador + "- " + empleado.toString() + "\n";
            contador++; // Incremento el contador para el siguiente empleado
        }
        JOptionPane.showMessageDialog(null, ordenAntiguos);
    } // FIN METODO
    
    // METODO que ordena la lista de empleados por salario (de mayor a menor)
    private static void ordenadosPorSalario() {
        empleados.sort(Comparator.comparingDouble(Empleado::getSalario).reversed());
        
        // Imprimo los empleados ya ordenados
        Iterator<Empleado> itSalario = empleados.iterator();
        String ordenSalario = "Empleados ordenados por salario:\n\n";
        int contador = 1; // Variable para enumerar los empleados
        while (itSalario.hasNext()) {
            Empleado empleado = itSalario.next();
            ordenSalario += contador + "- " + empleado.toString() + "\n";
            contador++; // Incremento el contador para el siguiente empleado
        }
        JOptionPane.showMessageDialog(null, ordenSalario);
    } // FIN METODO
    
    // METODO que ordena la lista de empleados por apellido
    private static void ordenadosPorApellido() {
        empleados.sort(Comparator.comparing(Empleado::getApellidos));
    
        // Imprimo los empleados ya ordenados
        Iterator<Empleado> itApellido = empleados.iterator();
        String ordenApellidos = "Empleados ordenados por salario:\n\n";
        int contador = 1; // Variable para enumerar los empleados
        while (itApellido.hasNext()) {
            Empleado empleado = itApellido.next();
            ordenApellidos += contador + "- " + empleado.toString() + "\n";
            contador++; // Incremento el contador para el siguiente empleado
        }
        JOptionPane.showMessageDialog(null, ordenApellidos);
    } // FIN METODO
    
    // METODO para calcular el gasto total sumando los salarios de todos los empleados
    private static void calcularGastoTotal() {
        double gastoTotal = 0; // Inicializo variable.

        for (Empleado empleado : empleados) {
            gastoTotal += empleado.getSalario(); // Sumo el salario del empleado actual al total.
        } // FIN FOR
        JOptionPane.showMessageDialog(null, "\nEl gasto total en salarios de los empleados es: " + gastoTotal);
        
        /* CON ITERATOR
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            gastoTotal += empleado.getSalario();
        }
        JOptionPane.showMessageDialog(null, "El gasto total en salarios de los empleados es: " + gastoTotal);
        */
    } // FIN METODO
    
    
    // METODO para mostrar el menú
    public void mostrarMenu() {
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
        
        int opcion = 0;
        do {     
            try {
                String strOpcion = JOptionPane.showInputDialog(menu);
                
                // Para cerrar el programa si el usuario pulsa cancelar en el diálogo inicial
                if (strOpcion == null) {
                    JOptionPane.showMessageDialog(null, "\nSaliendo...");
                    System.exit(0); 
                }
                
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
                        do {
                            String subMenu = "Elige una opción:\n" +
                                            "a) Por antigüedad\n" +
                                            "b) Por salario\n" +
                                            "c) Por apellido\n" +
                                            "S) Volver al menú principal";
                            String opcionOrdenamiento = JOptionPane.showInputDialog(subMenu);
                            
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
                                    JOptionPane.showMessageDialog(null, "Opción no válida. Introduce una opción válida o 's' para volver.");
                                    continue; // Continúa el bucle si no elijo una opción válida.
                            } // FIN SWITCH
                            break; // Opción válida salgo del bucle.
                        } while (true); // FIN DO-WHILE
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
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null, "ERROR. Entrada no válida, inténtalo de nuevo.");
            } // FIN TRY-CATCH
        } while (opcion != 6); // FIN DO-WHILE
    } // FIN METODO
    
    public static void main(String[] args){
        // Objeto EmpleadosEmpresa
        EmpleadosEmpresaV4 empresa = new EmpleadosEmpresaV4();
       
        // EMPLEADO 1
        LocalDate fechaNacimientoJuan = LocalDate.parse("1960-01-01");
        LocalDate fechaIngresoJuan = LocalDate.parse("1980-05-24");
        empresa.empleados.add(new Empleado("Juan", "Torres", fechaNacimientoJuan, fechaIngresoJuan, "Jefe", 60000.0));
        
        // EMPLEADO 2
        LocalDate fechaNacimientoSara = LocalDate.parse("1980-05-02");
        LocalDate fechaIngresoSara = LocalDate.parse("1999-06-03");
        empresa.empleados.add(new Empleado("Sara", "Gonzalez", fechaNacimientoSara, fechaIngresoSara, "Secretaria", 25000.0));
        
        // EMPLEADO 3
        LocalDate fechaNacimientoElena = LocalDate.parse("1990-09-03");
        LocalDate fechaIngresoElena = LocalDate.parse("2010-11-02");
        empresa.empleados.add(new Empleado("Elena", "Sanchez", fechaNacimientoElena, fechaIngresoElena, "TecnicoFP", 30000.0));
        
        // EMPLEADO 4
        LocalDate fechaNacimientoPepe = LocalDate.parse("1991-10-04");
        LocalDate fechaIngresoPepe = LocalDate.parse("2015-10-01");
        empresa.empleados.add(new Empleado("Pepe", "Uriel", fechaNacimientoPepe, fechaIngresoPepe, "Administrativo", 24000.0));
    
        empresa.mostrarMenu();
    } // FIN MAIN
} // FIN CLASE