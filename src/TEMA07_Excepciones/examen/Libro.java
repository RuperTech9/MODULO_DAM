
package TEMA07_Excepciones.examen;

/**
 *
 * @author Ruper
 */
class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String ISBN;

    public Libro(String titulo, String autor, int añoPublicacion, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.ISBN = ISBN;
    }

    // Getters y setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }
    public String getISBN() { return ISBN; }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + añoPublicacion + ", ISBN: " + ISBN;
    }
}

    
