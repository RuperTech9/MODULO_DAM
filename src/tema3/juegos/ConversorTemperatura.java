
package tema3.juegos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nConversor de Temperatura");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("5. Fahrenheit a Kelvin");
            System.out.println("6. Kelvin a Fahrenheit");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    convertirCelsiusAFahrenheit(teclado);
                    break;
                case 2:
                    convertirFahrenheitACelsius(teclado);
                    break;
                case 3:
                    convertirCelsiusAKelvin(teclado);
                    break;
                case 4:
                    convertirKelvinACelsius(teclado);
                    break;
                case 5:
                    convertirFahrenheitAKelvin(teclado);
                    break;
                case 6:
                    convertirKelvinAFahrenheit(teclado);
                    break;
                case 7:
                    System.out.println("Saliendo del conversor...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);

    }

    public static void convertirCelsiusAFahrenheit(Scanner teclado) {
        System.out.print("Introduce la temperatura en Celsius: ");
        double celsius = teclado.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }

    public static void convertirFahrenheitACelsius(Scanner teclado) {
        System.out.print("Introduce la temperatura en Fahrenheit: ");
        double fahrenheit = teclado.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperatura en Celsius: " + celsius);
    }

    public static void convertirCelsiusAKelvin(Scanner teclado) {
        System.out.print("Introduce la temperatura en Celsius: ");
        double celsius = teclado.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("Temperatura en Kelvin: " + kelvin);
    }

    public static void convertirKelvinACelsius(Scanner teclado) {
        System.out.print("Introduce la temperatura en Kelvin: ");
        double kelvin = teclado.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("Temperatura en Celsius: " + celsius);
    }

    public static void convertirFahrenheitAKelvin(Scanner teclado) {
        System.out.print("Introduce la temperatura en Fahrenheit: ");
        double fahrenheit = teclado.nextDouble();
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("Temperatura en Kelvin: " + kelvin);
    }

    public static void convertirKelvinAFahrenheit(Scanner teclado) {
        System.out.print("Introduce la temperatura en Kelvin: ");
        double kelvin = teclado.nextDouble();
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
}

