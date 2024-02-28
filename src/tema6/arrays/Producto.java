
package tema6.arrays;

/**
 *
 * @author alumno
 */
public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + precio + " Euros) - " + cantidad + " unidades disponibles";
    }
}

