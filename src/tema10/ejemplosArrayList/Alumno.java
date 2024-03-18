
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruper
 */
public class Alumno {
    String nombre;
    List<Double> notas;

    // Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // Añade una nota al alumno
    public void añadirNota(double nota) {
        notas.add(nota);
    }

    // Obtiene el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Muestra las notas del alumno
    public String mostrarNotas() {
        return notas.toString();
    }
}
