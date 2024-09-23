
package TEMA11_LecturaYEscritura.tarea;

/**
 *
 * @author Ruper
 */
public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public boolean esPar() {
        return valor % 2 == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
