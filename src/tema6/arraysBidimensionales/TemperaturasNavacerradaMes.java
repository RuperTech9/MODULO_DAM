
package tema6.arraysBidimensionales;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class TemperaturasNavacerradaMes {

    public static void main(String[] args) {
        double[][] temperaturas = new double[12][]; // Creamos un array bidimensional para los meses

        // Definimos los días de cada mes
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        // Insertar temperaturas mínimas desde enero hasta el mes actual
        int mesActual = obtenerMesActual();
        for (int mes = 0; mes <= mesActual; mes++) {
            int dias = diasPorMes[mes];
            temperaturas[mes] = new double[dias]; // Creamos el array para el mes actual

            System.out.println("Ingresa las temperaturas mínimas para " + obtenerNombreMes(mes) + ":");
            for (int dia = 0; dia < dias; dia++) {
                System.out.print((dia + 1) + " " + obtenerNombreMes(mes) + ": ");
                double temperatura = scanner.nextDouble();
                temperaturas[mes][dia] = temperatura;
            }
        }

        // Cambiar el valor del 6 de enero a -3º
        cambiarTemperatura(temperaturas, 6, 0, -3);

        // Calcular la temperatura mínima durante el año 2021
        double temperaturaMinimaAnual = obtenerTemperaturaMinimaAnual(temperaturas);
        System.out.println("La temperatura mínima del año en Navacerrada fue: " + temperaturaMinimaAnual + "ºC");
    }

    // Método para obtener el nombre del mes en base al número
    public static String obtenerNombreMes(int numeroMes) {
        String[] nombres = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return nombres[numeroMes];
    }

    // Método para obtener el mes actual (0-11)
    public static int obtenerMesActual() {
        // Supongamos que el mes actual es marzo (índice 2) para fines de prueba
        return 1;
    }

    // Método para cambiar una temperatura específica
    public static void cambiarTemperatura(double[][] temperaturas, int dia, int mes, double nuevaTemperatura) {
        if (mes >= 0 && mes < temperaturas.length && dia >= 0 && dia < temperaturas[mes].length) {
            temperaturas[mes][dia] = nuevaTemperatura;
        }
    }

    // Método para obtener la temperatura mínima anual
    public static double obtenerTemperaturaMinimaAnual(double[][] temperaturas) {
        double temperaturaMinima = Double.MAX_VALUE; // Inicializamos con el valor máximo posible
        for (double[] mes : temperaturas) {
            if (mes != null) {
                for (double temperatura : mes) {
                    if (temperatura < temperaturaMinima) {
                        temperaturaMinima = temperatura;
                    }
                }
            }
        }
        return temperaturaMinima;
    }
}
