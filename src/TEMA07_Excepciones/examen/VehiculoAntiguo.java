
package TEMA07_Excepciones.examen;

/**
 * Diseña una clase llamada Vehiculo que contenga los siguientes atributos: marca, modelo, año y color. 
 * Incluye un constructor que inicialice estos atributos y los siguientes métodos:
 * -  mostrarDatos(): Método que imprime por pantalla todos los datos del vehículo.
 * -  esAntiguo(): Método que devuelve true si el vehículo tiene más de 10 años.
 * Además, crea una clase TestVehiculo con el método main para instanciar dos objetos Vehiculo 
 * con datos introducidos por el usuario y mostrar sus datos y si son antiguos o no.
 * @author Ruper
 */
// Clase VehiculoAntiguo
public class VehiculoAntiguo {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String color;

    // Constructor
    public VehiculoAntiguo(String marca, String modelo, int ano, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + ano + ", Color: " + color);
    }

    public boolean esAntiguo() {
        return (2024 - ano) > 10; // Asumiendo que el año actual es 2024
    }
}

