
package tema5.tarea5;

import javax.swing.JOptionPane;
import java.awt.Component;


public class Main {
    private static Profesor[] profesores = new Profesor[6];
    private static Alumno[] alumnos = new Alumno[30];
    private static int contadorProfesores = 0;
    private static int contadorAlumnos = 0;
    private static Component frame = null; // Component: clase base, componentes de la interfaz gráfica (null: xa que no dependa de ningún componente)

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            try { // try-catch para manejar cualquier excepción que pueda ocurrir durante la ejecución de las operaciones del menú
                String opcion = JOptionPane.showInputDialog(frame, // se le pasa frame como argumento (componente padre)
                    "CURSO 23/24\n" +
                    "1) Introducir Profesor\n" +
                    "2) Introducir Alumno\n" +
                    "3) Imprimir profesores\n" +
                    "4) Imprimir alumnos\n" +
                    "5) Salir\n" +
                    "Elige una opción:");
                switch (opcion) {
                    case "1":
                        if(contadorProfesores < profesores.length) {
                            introducirProfesor();
                        } else {
                            JOptionPane.showMessageDialog(frame, "Has alcanzado el máximo de profesores", "LLENO", JOptionPane.ERROR_MESSAGE);
                        } // FIN IF
                        break;
                    case "2":
                        if(contadorAlumnos < alumnos.length) {
                            introducirAlumno();
                        } else {
                            JOptionPane.showMessageDialog(frame, "Has alcanzado el máximo de alumnos", "LLENO", JOptionPane.ERROR_MESSAGE);
                        } // FIN IF
                        break;
                    case "3":
                        imprimirProfesores();
                        break;
                    case "4":
                        imprimirAlumnos();
                        break;
                    case "5":
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(frame, "Opción no válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                } // FIN SWITCH
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "ERROR: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } // FIN TRY-CATCH
        } // FIN WHILE
    } // FIN CLASE
    
    // PROCEDIMIENTOS
    private static void introducirProfesor() throws Exception {
        String nombreProfesor = JOptionPane.showInputDialog(frame, "Introduce el nombre completo del profesor:");
        String dniProfesor = JOptionPane.showInputDialog(frame, "Introduce el DNI:");
        int diaNacimientoProfesor = Integer.parseInt(JOptionPane.showInputDialog(frame, "FECHA DE NACIMIENTO\nDIA:"));
        int mesNacimientoProfesor = Integer.parseInt(JOptionPane.showInputDialog(frame, "FECHA DE NACIMIENTO\nMES:"));
        int añoNacimientoProfesor = Integer.parseInt(JOptionPane.showInputDialog(frame, "FECHA DE NACIMIENTO\nAÑO:"));
        String cuentaBancaria = JOptionPane.showInputDialog(frame, "Introduce la cuenta bancaria:");
        double nomina = Double.parseDouble(JOptionPane.showInputDialog(frame, "Introduce la nómina:"));
        
        Fecha fechaNacimientoProfesor = new Fecha(diaNacimientoProfesor, mesNacimientoProfesor, añoNacimientoProfesor); // OBJETO que representa una fecha
        Profesor profesor = new Profesor(nombreProfesor, fechaNacimientoProfesor, dniProfesor, cuentaBancaria, nomina); // OBJETO que representa a un profesor con sus datos
        profesores[contadorProfesores] = profesor;
        contadorProfesores++;
        JOptionPane.showMessageDialog(frame, "Profesor introducido con éxito.", "Profesor Añadido", JOptionPane.INFORMATION_MESSAGE);
    } // FIN PROCEDIMIEMTO

    private static void introducirAlumno() throws Exception {
        String nombreAlumno = JOptionPane.showInputDialog(frame, "Introduce el nombre completo del alumno:");
        String dniAlumno = JOptionPane.showInputDialog(frame, "Introduce el DNI:");
        int diaNacimientoAlumno = Integer.parseInt(JOptionPane.showInputDialog(frame, "FECHA DE NACIMIENTO\nDIA:"));
        int mesNacimientoAlumno = Integer.parseInt(JOptionPane.showInputDialog(frame, "FECHA DE NACIMIENTO\nMES:"));
        int añoNacimientoAlumno = Integer.parseInt(JOptionPane.showInputDialog(frame, "FECHA DE NACIMIENTO\nAÑO:"));
        
        Fecha fechaNacimientoAlumno = new Fecha(diaNacimientoAlumno, mesNacimientoAlumno, añoNacimientoAlumno);
        Alumno alumno = new Alumno(nombreAlumno, fechaNacimientoAlumno, dniAlumno);
        alumnos[contadorAlumnos] = alumno;
        contadorAlumnos++;
        JOptionPane.showMessageDialog(frame, "Alumno introducido con éxito.", "Alumno Añadido", JOptionPane.INFORMATION_MESSAGE);
    } // FIN PROCEDIMIEMTO

    private static void imprimirProfesores() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] != null) {
                sb.append(profesores[i].toString()); // para añadir texto al final de una cadena
                sb.append("\n----------------------\n");
            } // FIN IF
        } // FIN FOR
        JOptionPane.showMessageDialog(frame, sb.toString(), "Lista de Profesores", JOptionPane.INFORMATION_MESSAGE);
    } // FIN PROCEDIMIENTO

    private static void imprimirAlumnos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString()); // para añadir texto al final de una cadena
                sb.append("\n----------------------\n");
            } // FIN IF
        } // FIN FOR
        JOptionPane.showMessageDialog(frame, sb.toString(), "Lista de Alumnos", JOptionPane.INFORMATION_MESSAGE);
    } // FIN PROCEDIMIENTO
} // FIN CLASE Main
