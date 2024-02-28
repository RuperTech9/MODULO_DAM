
package tema6.arraysBidimensionales;

/**
 *
 * @author Ruper
 */
public class IdiomasAlumno {
    public static void main(String[] args) {
        // Declarar la matriz. 3 filas para los niveles y 4 columnas para los idiomas.
        int[][] alumnosPorNivelYIdioma = new int[3][4];
        
        // Asignar valores de ejemplo a cada elemento de la matriz.
        // Nivel básico
        alumnosPorNivelYIdioma[0][0] = 20; // Inglés
        alumnosPorNivelYIdioma[0][1] = 15; // Francés
        alumnosPorNivelYIdioma[0][2] = 10; // Alemán
        alumnosPorNivelYIdioma[0][3] = 5;  // Ruso
        
        // Nivel medio
        alumnosPorNivelYIdioma[1][0] = 18; // Inglés
        alumnosPorNivelYIdioma[1][1] = 12; // Francés
        alumnosPorNivelYIdioma[1][2] = 8;  // Alemán
        alumnosPorNivelYIdioma[1][3] = 4;  // Ruso
        
        // Nivel de perfeccionamiento
        alumnosPorNivelYIdioma[2][0] = 15; // Inglés
        alumnosPorNivelYIdioma[2][1] = 10; // Francés
        alumnosPorNivelYIdioma[2][2] = 5;  // Alemán
        alumnosPorNivelYIdioma[2][3] = 2;  // Ruso
        
        // Opcional: Mostrar los valores de la matriz.
        for (int i = 0; i < alumnosPorNivelYIdioma.length; i++) {
            for (int j = 0; j < alumnosPorNivelYIdioma[i].length; j++) {
                System.out.println("Nivel " + i + ", Idioma " + j + ": " + alumnosPorNivelYIdioma[i][j] + " alumnos");
            }
        }
    }
}
