
package TEMA06_ArraysYStrings.enumerados;

/**
 *
 * @author Ruper
 */
public enum Color {
    INDEFINIDO ("indefinido"), //Separamos con comas
    ROJO ("rojo"),
    VERDE ("verde"),
    AZUL("azul");  //Cuando terminamos cerramos con ;

    //Campos tipo constante   
    private final String color; //Colores permitidos

    /**
     * Constructor. Al asignarle uno de los valores posibles a una variable del tipo enumerado el constructor asigna
    automáticamente valores de los campos
     */

    Color (String color) {
        this.color = color;
    } //Cierre del constructor

    //Métodos de la clase tipo Enum
    public String getColor() { return color; }
} //Cierre del enum