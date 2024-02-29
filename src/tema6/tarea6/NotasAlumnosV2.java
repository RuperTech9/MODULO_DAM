package tema6.tarea6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruper
 */
public class NotasAlumnosV2 {
    // ATRIBUTOS
    private static final int NUM_ALUMNOS = 10; // Constante
    private String[] nombres; // Array nombres
    private int[] notas; // Array notas
    private int numAlumnos; // Variable para contar los alumnos añadidos

    // CONSTRUCTOR
    public NotasAlumnosV2() {
        nombres = new String[NUM_ALUMNOS]; // Inicializo Array nombres
        notas = new int[NUM_ALUMNOS]; // Inicializo Array notas
        numAlumnos = 0; // Contador xa los alumnos agregados
    } // FIN CONSTRUCTOR
    
    // METODOS PRIVADOS
    // METODO para ordenar los alumnos por nombre (Burbuja)
    private void ordenarAlumnosPorNombre() {
        for (int i = 0; i < numAlumnos - 1; i++) { // desde el primer alumno hasta el penúltimo. "- 1" xk no es necesario comparar el último con el siguiente
            for (int j = 0; j < numAlumnos - i - 1; j++) { //-1 xk estamos comparando la posicion - i no es necesario volver a compararlos en las siguientes pasadas
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) { // Compara los nombres de los alumnos y los intercambia si es necesario para ordenar alfabéticamente
                    intercambiar(j, j + 1); // Llama al método para intercambiar los nombres y notas de los alumnos
                } // FIN IF
            } //FIN FOR INTERNO
        } // FIN FOR EXTERNO
    } // FIN METODO
    
    // METODO para ordenar los alumnos por nota de programación (Burbuja)
    private void ordenarAlumnosPorNota() {
        for (int i = 0; i < numAlumnos - 1; i++) {
            for (int j = 0; j < numAlumnos - i - 1; j++) {
                if (notas[j] < notas[j + 1]) { // Compara las notas de los alumnos y las intercambia si es necesario para ordenar de mayor a menor
                    intercambiar(j, j + 1); // Llama al método para intercambiar los nombres y notas de los alumnos
                } // FIN IF
            } //FIN FOR INTERNO
        } // FIN FOR EXTERNO
    } // FIN METODO
    
    // METODO para intercambiar los datos de dos alumnos y no repetir la misma lógica, así no reutilizo código.
    private void intercambiar(int i, int j) {
        // Intercambia los nombres de los alumnos
        String tempNombre = nombres[i];
        nombres[i] = nombres[j];
        nombres[j] = tempNombre;

        // Intercambia las notas de programación de los alumnos
        int tempNota = notas[i];
        notas[i] = notas[j];
        notas[j] = tempNota;
    } // FIN METODO
    
    // METODO para obtener una nota válida del usuario
    private int obtenerNotaValida() {
        while (true) {
            String entradaNota = JOptionPane.showInputDialog(null, "Introduce la nota de programación del alumno nuevo (0-10):");
            try {
                int nota = Integer.parseInt(entradaNota);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 10.");
                } // FIN IF
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida. Introduce un número entero.");
            } // FIN TRY-CATCH
        } // FIN WHILE
    } // FIN METODO
    
    // METODOS PUBLICOS
    // METODO para agregar un nuevo alumno
    public void añadirAlumno(String nombre, int nota) {
         if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del alumno no puede estar vacío.");
            return;
        } // FIN IF
        if (nota < 0 || nota > 10) { // Asumiendo que la nota es de 0 a 10
            JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 10.");
            return;
        } // FIN IF
        if (numAlumnos >= nombres.length) {
            // Ampliar arrays si se alcanza el límite actual
            String[] nombresTemp = new String[numAlumnos + 1]; // Crear un array temporal con un espacio adicional
            int[] notasTemp = new int[numAlumnos + 1];
        
            // Copiar los elementos del array original al temporal
            System.arraycopy(nombres, 0, nombresTemp, 0, nombres.length);
            System.arraycopy(notas, 0, notasTemp, 0, notas.length);
        
            // Asignar los arrays temporales a los originales
            nombres = nombresTemp;
            notas = notasTemp;
        }
    
        // Agregar el nuevo alumno y su nota al final del array
        nombres[numAlumnos] = nombre;
        notas[numAlumnos] = nota;
        numAlumnos++; // Incrementar el contador de alumnos
    } // FIN METODO
    
    // METODO para mostrar los alumnos ordenados alfabéticamente (de menor a mayor)
    public void mostrarAlumnosOrdenNombre() {
        ordenarAlumnosPorNombre(); // Llama al método para ordenar los alumnos por nombre
        StringBuilder mensaje = new StringBuilder("Lista de alumnos ordenados alfabéticamente:\n");
        for (int i = 0; i < numAlumnos; i++) {
            mensaje.append(nombres[i]).append(": ").append(notas[i]).append("\n"); // Construye el mensaje con los nombres y notas de los alumnos
        } // FIN FOR
        JOptionPane.showMessageDialog(null, mensaje.toString()); // Muestra el mensaje con los alumnos ordenados alfabéticamente
    } // FIN METODO
    
    // METODO para mostrar los alumnos por nota de programación (de mayor a menor)
    public void mostrarAlumnosOrdenNota() {
        ordenarAlumnosPorNota(); // Llama al método para ordenar los alumnos por nota de programación
        StringBuilder mensaje = new StringBuilder("Lista de alumnos ordenados por nota de programación (mayor a menor):\n");
        for (int i = 0; i < numAlumnos; i++) {
            mensaje.append(nombres[i]).append(": ").append(notas[i]).append("\n"); // Construye el mensaje con los nombres y notas de los alumnos
        } // FIN FOR
        JOptionPane.showMessageDialog(null, mensaje.toString()); // Muestra el mensaje con los alumnos ordenados por nota de programación
    } // FIN METODO
    
    public void mostrarMenu(){
        String menu = "Opciones:\n"
                + "1. Listado de alumnos ordenados alfabéticamente\n"
                + "2. Listado de alumnos por nota de programación\n"
                + "3. Añadir un nuevo alumno\n"
                + "4. Salir";
        
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(null, menu); 
            opcion = Integer.parseInt(entrada); // Convertimos a entero (int) xa almacenar en la variable opcion
            switch (opcion) {
                case 1:
                    mostrarAlumnosOrdenNombre();
                    break;
                case 2:
                    mostrarAlumnosOrdenNota();
                    break;
                case 3:
                    String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno nuevo:");
                    if (nombre == null || nombre.trim().isEmpty()) { // trim(elimina espacios principio-final) por si introduzco espacio y Empty si la cadena está vacia
                        JOptionPane.showMessageDialog(null, "No se ha ingresado un nombre válido.");
                        break;
                    } // FIN IF
                    int nota = obtenerNotaValida();
                    if (nota >= 0) { // Si la nota es válida, añado el alumno
                        añadirAlumno(nombre, nota);
                    } // FIN IF
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Has salido...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            } // FIN SWITCH
        } while (opcion != 4); // FIN DO-WHILE
    } // FIN METODO
} // FIN CLASE

/*
Este método primero verifica si hay espacio disponible en los arrays nombres y notas para añadir un nuevo alumno. Si el número de alumnos actual (numAlumnos) es igual o mayor al tamaño del array (nombres.length), significa que los arrays están llenos y es necesario ampliarlos.

Para ampliar los arrays, se crea un nuevo array temporal (nombresTemp y notasTemp) con un tamaño mayor que el original (en este caso, se ha elegido aumentar en 1 el tamaño, pero podrías aumentarlo en un número mayor para reducir el número de veces que necesitas ampliar el array). Luego, se copian los elementos del array original al array temporal usando System.arraycopy. Después, se asignan los arrays temporales a las variables originales (nombres y notas), efectivamente reemplazando los arrays originales con versiones más grandes que incluyen espacio para el nuevo alumno. Finalmente, se añade el nuevo alumno y su nota al final del array ampliado.

Este enfoque permite que tu programa maneje dinámicamente un número variable de alumnos, ajustándose automáticamente para acomodar nuevos alumnos a medida que se añaden.
*/