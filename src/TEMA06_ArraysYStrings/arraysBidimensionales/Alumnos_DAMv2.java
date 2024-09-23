
package TEMA06_ArraysYStrings.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumnos_DAMv2 {
    private static final int MAX_ALUMNOS = 30;
    private static final String[][] asignaturas = new String[MAX_ALUMNOS][];
    private static final String[] alumnos = new String[MAX_ALUMNOS];
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDatos();
        int opcion;
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    mostrarAsignaturasMatriculadasInverso();
                    break;
                case 2:
                    buscarAsignaturasAlumno();
                    break;
                case 3:
                    mostrarAsignaturasAlumnosRepetidores(); 
                    break;
                case 4:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4); // FIN DO-WHILE
    } // FIN MAIN

    private static void inicializarDatos() {
        // Juan Torres se matricula de todas las asignaturas
        asignaturas[0] = new String[]{"PROG", "BBDD", "SYS", "ED", "LM", "FOL"};
        alumnos[0] = "Juan Torres";
        // Sara Gonzalez tiene FOL convalidada
        asignaturas[1] = new String[]{"PROG", "BBDD", "SYS", "ED", "LM"};
        alumnos[1] = "Sara Gonzalez";
        // Pepe Gomez solo se matricula de Programación y bases de datos
        asignaturas[2] = new String[]{"PROG", "BBDD"};
        alumnos[2] = "Pepe Gomez";
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1- Asignaturas matriculadas por los alumnos, por orden de menor a mayor.");
        System.out.println("2- Asignaturas de un alumno concreto.");
        System.out.println("3- Asignaturas de los alumnos repetidores.");
        System.out.println("4- Salir.");
        System.out.print("Selecciona una opción: ");
    }

    // Método para mostrar las asignaturas matriculadas por los alumnos.
    // Itera sobre el array de alumnos y, si el alumno no es null (indicando que hay un alumno registrado en esa posición),
    // imprime el nombre del alumno seguido de la lista de asignaturas a las que está matriculado.
    private static void mostrarAsignaturasMatriculadas() {
        for (int i = 0; i < alumnos.length; i++) { // Recorre el array de alumnos.
            if (alumnos[i] != null) { // Verifica si hay un alumno en la posición actual.
                System.out.println(alumnos[i] + ":");
                for (String asignatura : asignaturas[i]) { // Recorre el array de asignaturas del alumno actual.
                    System.out.println("\t" + asignatura); // Imprime cada asignatura
                }// FIN FOR
            } // FIN IF
        } // FIN FOR
    } // FIN METODO
    
    // Método para mostrar las asignaturas en orden inverso (BURBUJA)
    private static void mostrarAsignaturasMatriculadasInverso() {
        // Ordenar alumnos y asignaturas por número de asignaturas de forma ascendente
        for (int i = 0; i < alumnos.length - 1; i++) { // Bucle para controlar el número de pasadas.
            for (int j = 0; j < alumnos.length - i - 1; j++) { // Bucle para comparar elementos adyacentes.
                // Verifica si el alumno actual y el siguiente no son nulos y si el actual tiene más asignaturas que el siguiente.
                if (asignaturas[j] != null && asignaturas[j + 1] != null && asignaturas[j].length > asignaturas[j + 1].length) {
                    // Intercambiar alumnos para ordenarlos según el número de asignaturas.
                    String tempAlumno = alumnos[j]; // Almacena temporalmente el alumno actual.
                    alumnos[j] = alumnos[j + 1]; // Asigna el alumno siguiente al actual.
                    alumnos[j + 1] = tempAlumno; // Asigna el alumno temporal (anterior actual) al siguiente.
                
                    // Intercambiar asignaturas correspondientes a los alumnos intercambiados.
                    String[] tempAsignaturas = asignaturas[j]; // Almacena temporalmente las asignaturas del alumno actual.
                    asignaturas[j] = asignaturas[j + 1]; // Asigna las asignaturas del alumno siguiente al actual.
                    asignaturas[j + 1] = tempAsignaturas; // Asigna las asignaturas temporales (anterior actual) al siguiente.
                } // FIN IF
            } // FIN FOR
        } // FIN FOR
    
        // Ahora imprimir los alumnos y sus asignaturas en el orden ascendente
        for (int i = 0; i < alumnos.length; i++) { // Recorre el array de alumnos ya ordenado.
            if (alumnos[i] != null) { // Verifica si hay un alumno en la posición actual.
                System.out.println(alumnos[i] + ":"); // Imprime alumno.
                for (String asignatura : asignaturas[i]) { // Recorre el array de asignaturas del alumno actual.
                    System.out.println("\t" + asignatura); // Imprime asignatura.
                } // FIN FOR
            } // FIN IF
        } // FIN FOR
    } // FIN METODO
    // --------------------------------------------------------
    public static int [] burbujaSimple(int [] numerosArray){
        boolean intercambio=true;
        int temp;
        for(int i=numerosArray.length-1;i>0&&intercambio;i--){
            intercambio=false;
            for(int j=0;j<i;j++){
                if(numerosArray[j]>numerosArray[j+1]){
                    temp=numerosArray[j];
                    numerosArray[j]=numerosArray[j+1];
                    numerosArray[j+1]=temp;
                    intercambio = true;
                } // FIN IF
            } // FIN FOR        
        } // FIN FOR
        return numerosArray;
    }
    // -------------------------------------------------------
    
   
    // Método para buscar y mostrar las asignaturas matriculadas por un alumno específico.
    // Solicita al usuario introducir el nombre del alumno y busca ese nombre en el array de alumnos.
    // Si encuentra al alumno, imprime las asignaturas a las que está matriculado.
    private static void buscarAsignaturasAlumno() {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = teclado.nextLine();
        
        for (int i = 0; i < alumnos.length; i++) { // Recorre el array de alumnos buscando el nombre introducido.
            if (alumnos[i] != null && alumnos[i].equalsIgnoreCase(nombre)) { // Comprueba si el nombre del alumno en la posición actual coincide con el introducido, ignorando mayúsculas/minúsculas.
                System.out.println("Asignaturas de " + nombre + ":");
                for (String asignatura : asignaturas[i]) { // Imprime las asignaturas del alumno encontrado.
                    System.out.println("\t" + asignatura);
                } // FIN FOR
                return;
            } // FIN IF
        } // FIN FOR
        System.out.println("Alumno no encontrado."); // Si el alumno no se encuentra, imprime un mensaje indicándolo.
    }
    
    private static boolean tieneFOLConvalidada(String[] asignaturas) {
        for (String asignatura : asignaturas) {
            if (asignatura.equals("FOL")) {
                return false;
            } // FIN IF
        } // FIN FOR
        return true; // Si tiene 5 asignaturas y no está FOL, entonces tiene FOL convalidada.
    } // FIN METODO
    
    // Método para determinar si un alumno está matriculado en todas las asignaturas posibles.
    // Retorna true si el alumno tiene 6 asignaturas o tiene 5 con FOL convalidada.
    private static boolean esNuevo(String[] asignaturas) {
        if (asignaturas.length == 6) {
            return true;
        } else if (asignaturas.length == 5 && tieneFOLConvalidada(asignaturas)) {
            return true;
        } // FIN IF
        return false;
    } // FIN METODO
    
    // Método para mostrar las asignaturas de los alumnos identificados como repetidores.
    // Un alumno se considera repetidor si no está matriculado en todas las asignaturas posibles, excepto si tiene FOL convalidada.
    private static void mostrarAsignaturasAlumnosRepetidores() {
        for (int i = 0; i < alumnos.length; i++) { // Recorre el array de alumnos
            if (alumnos[i] != null && !esNuevo(asignaturas[i])) { // Comprueba si el alumno no está matriculado en todas las asignaturas y no cumple con ser considerado nuevo.
                System.out.println("Alumno repetidor: " + alumnos[i]); // Imprime el nombre del alumno repetidor.
                for (String asignatura : asignaturas[i]) { //Imprime sus asignaturas.
                    System.out.println("\t" + asignatura);
                } // FIN FOR
            } // FIN IF
        } // FIN FOR
    } // FIN METODO
}