package tema7.tarea7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class TemperaturasNavacerradaV2 {
    private static final int TOTAL_MESES = 12; // Constante para el número total de meses
    private static final int[] DIAS_POR_MES = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Constante para los días por cada mes
    private Temperaturas[][] temperaturasAnuales = new Temperaturas[TOTAL_MESES][]; // Matriz para almacenar las temperaturas de cada día de cada mes.
    
    // CONSTRUCTOR
    public TemperaturasNavacerradaV2() {
        inicializarDatos();
        cargarDatosEnero();
        cargarDatosFebrero();
    } // FIN CONSTRUCTOR
    
    // METODOS PRIVADOS
    // METODO para inicializar todos los meses con máxima y mínima {0, 0}
    private void inicializarDatos() {
        for (int mes = 0; mes < TOTAL_MESES; mes++) {
            temperaturasAnuales[mes] = new Temperaturas[DIAS_POR_MES[mes]];
            for (int dia = 0; dia < DIAS_POR_MES[mes]; dia++) {
                temperaturasAnuales[mes][dia] = new Temperaturas(0, 0);
            }
        }
    } // FIN METODO
    
    // METODO para cargar las temperaturas de Enero
    private void cargarDatosEnero() {
        int[][] datosEnero = {
            {10, 2}, {9, 2}, {12, 8}, {10, 8}, {9, 4}, {8, 3}, {9, -1}, {7, -3}, {7, 4}, {7, 4},
            {8, 1}, {7, 0}, {9, 2}, {10, 5}, {13, 10}, {14, 11}, {12, 10}, {13, 10}, {10, 4}, 
            {10, 1}, {11, 3}, {11, 1}, {16, 3}, {18, 6}, {18, 5}, {20, 6}, {18, 8}, {17, 5}, 
            {14, 6}, {13, 5}, {11, 4} // 31 días
        };
        
        for (int dia = 0; dia < DIAS_POR_MES[0]; dia++) { // Recorro y asigno - Posicion 0 Enero(31 días)
            temperaturasAnuales[0][dia] = new Temperaturas(datosEnero[dia][0], datosEnero[dia][1]);
        }
    } // FIN METODO
    
    // METODO para cargar las temperaturas de Febrero
    private void cargarDatosFebrero() {
        // Datos de temperaturas para enero
        int[][] datosFebrero = { // Temperaturas máximas y mínimas
            {5, 2}, {9, 1}, {12, 8}, {10, 8}, {9, 2}, {8, 3}, {9, -1}, {7, -3}, {7, 4}, {7, 4},
            {15, 4}, {5, 0}, {9, 2}, {10, 5}, {13, 10}, {14, 11}, {12, 10}, {13, 10}, {10, 4}, 
            {10, 1}, {11, 3}, {11, 1}, {16, 3}, {18, 6}, {18, 5}, {20, 6}, {18, 8}, {17, 5}, {14, 6} // 29 días
        };

        for (int dia = 0; dia < DIAS_POR_MES[1]; dia++) { // Recorro y asigno - Posicion 1 Febrero(29 días)
            temperaturasAnuales[1][dia] = new Temperaturas(datosFebrero[dia][0], datosFebrero[dia][1]);
        }
    } // FIN METODO

    // METODO para imprimir las temperaturas de un mes mostrando la máxima y mínima registradas
    private String getNombreMes(int mes) {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombresMeses[mes];
    } // FIN METODO
    
    // METODOS PUBLICOS
    // METODO para imprimir las temperaturas de un mes con la temperatura máxima y mínima registradas
    public void imprimirMes(int mes) {
        StringBuilder mesElegido = new StringBuilder("Mes de " + getNombreMes(mes) + ": ");
    
        // Verificar que el mes tiene al menos un día registrado para inicializar máxima y mínima
        if (temperaturasAnuales[mes].length > 0) {
            // Inicializar con los valores del primer día del mes
            int temperaturaMaxima = temperaturasAnuales[mes][0].getMaxima();
            int temperaturaMinima = temperaturasAnuales[mes][0].getMinima();
            
            for (int dia = 0; dia < temperaturasAnuales[mes].length; dia++) {
                Temperaturas temp = temperaturasAnuales[mes][dia];
            
                // Actualizar las temperaturas máxima y mínima si es necesario
                if (temp.getMaxima() > temperaturaMaxima) {
                    temperaturaMaxima = temp.getMaxima();
                }
                if (temp.getMinima() < temperaturaMinima) {
                    temperaturaMinima = temp.getMinima();
                }
            
                // Mostrar todas las temperaturas del mes
                mesElegido.append(dia + 1).append(":").append(temp.toString()).append(", ");
            }
        
            // Mostrar las temperaturas máxima y mínima registradas
            mesElegido.append("\nTemperatura máxima registrada: ").append(temperaturaMaxima).append("ºC");
            mesElegido.append("\nTemperatura mínima registrada: ").append(temperaturaMinima).append("ºC");
        } else {
            mesElegido.append("\nNo hay datos registrados para este mes.");
        }
        System.out.println(mesElegido.toString());
        //JOptionPane.showMessageDialog(null, mesElegido.toString());
    } // FIN METODO
    
    // Método para añadir o actualizar temperaturas para un día específico
    public void ingresarTemperatura(int mes, int dia, int maxima, int minima) {
        if (mes < 0 || mes >= TOTAL_MESES || dia < 1 || dia > DIAS_POR_MES[mes]) {
            System.out.println("Fecha no válida.");
            return;
        }
        // Ajuste para el índice del array (0 basado)
        temperaturasAnuales[mes][dia - 1] = new Temperaturas(maxima, minima);
        System.out.println("Temperatura actualizada para " + getNombreMes(mes) + " día " + dia + ": Maxima=" + maxima + " Minima=" + minima);
    }

    // Método para calcular y mostrar el promedio de temperaturas por mes
    public void mostrarPromediosMensuales() {
        for (int mes = 0; mes < TOTAL_MESES; mes++) {
            int sumaMax = 0, sumaMin = 0, diasValidos = 0;
            for (int dia = 0; dia < DIAS_POR_MES[mes]; dia++) {
                Temperaturas t = temperaturasAnuales[mes][dia];
                if (t.getMaxima() != 0 || t.getMinima() != 0) { // Consideramos días con temperaturas registradas
                    sumaMax += t.getMaxima();
                    sumaMin += t.getMinima();
                    diasValidos++;
                }
            }
            if (diasValidos > 0) {
                System.out.println(getNombreMes(mes) + " - Promedio Máxima: " + (sumaMax / diasValidos) + "º, Promedio Mínima: " + (sumaMin / diasValidos) + "º");
            } else {
                System.out.println(getNombreMes(mes) + " - Sin datos registrados.");
            }
        }
    }

    // Método para calcular y mostrar las temperaturas máxima y mínima absolutas del año
    public void mostrarTemperaturasExtremasAnuales() {
        int maxAbsoluta = Integer.MIN_VALUE, minAbsoluta = Integer.MAX_VALUE;
        for (int mes = 0; mes < TOTAL_MESES; mes++) {
            for (int dia = 0; dia < DIAS_POR_MES[mes]; dia++) {
                Temperaturas t = temperaturasAnuales[mes][dia];
                if (t.getMaxima() > maxAbsoluta) maxAbsoluta = t.getMaxima();
                if (t.getMinima() < minAbsoluta) minAbsoluta = t.getMinima();
            }
        }
        System.out.println("Temperatura máxima absoluta del año: " + maxAbsoluta + "º");
        System.out.println("Temperatura mínima absoluta del año: " + minAbsoluta + "º");
    }
    
    // METODO para mostrar el menu
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        String menu = "TEMPERATURAS PUERTO DE NAVACERRADA" +
                      "\n---------------------------------------------------------------" +
                      "\nOpciones:" +
                      "\n1. Elegir mes y mostrar temperaturas" +
                      "\n2. Ingresar nueva temperatura" +
                      "\n3. Mostrar promedios mensuales de temperaturas" +
                      "\n4. Mostrar temperaturas máxima y mínima del año" +
                      "\n5. Salir";
        int opcion = 0;

        do {
            System.out.println(menu);
            System.out.print("Selecciona una opción: ");
            while (true) {
                try {
                    opcion = scanner.nextInt();
                    break; // Sal del bucle si se recibe un entero
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce un número válido.");
                    scanner.next(); // Descarta la entrada incorrecta
                    System.out.print("Selecciona una opción: ");
                }
            }

            try {
                switch (opcion) {
                    case 1:
                        manejarOpcionElegirMes(scanner);
                        break;
                    case 2:
                        manejarOpcionIngresarTemperatura(scanner);
                        break;
                    case 3:
                        mostrarPromediosMensuales();
                        break;
                    case 4:
                        mostrarTemperaturasExtremasAnuales();
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, por favor intenta nuevamente.");
                scanner.nextLine(); // Descarta la entrada incorrecta para evitar bucles infinitos
            }
        } while (opcion != 5);
    }
    private void manejarOpcionElegirMes(Scanner scanner) {
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt() - 1;
        if (mes >= 0 && mes < 12) {
            imprimirMes(mes);
        } else {
            System.out.println("Opción no válida. Debe ser entre 1 y 12.");
        }
    }

    // Método para manejar la opción de ingresar temperatura, con manejo de excepciones para cada entrada
    private void manejarOpcionIngresarTemperatura(Scanner scanner) {
        int mes = -1, dia = -1, maxima = Integer.MIN_VALUE, minima = Integer.MAX_VALUE;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Introduce el número del mes para ingresar temperatura (1-12): ");
                mes = scanner.nextInt() - 1;
                System.out.print("Introduce el día del mes: ");
                dia = scanner.nextInt();
                System.out.print("Introduce la temperatura máxima: ");
                maxima = scanner.nextInt();
                System.out.print("Introduce la temperatura mínima: ");
                minima = scanner.nextInt();
                entradaValida = true; // Se establece como true si todas las entradas son válidas
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida, por favor introduce números enteros.");
                scanner.nextLine(); // Descarta la entrada incorrecta para evitar bucles infinitos
            }
        }

        if (mes >= 0 && mes < TOTAL_MESES && dia >= 1 && dia <= DIAS_POR_MES[mes]) {
            ingresarTemperatura(mes, dia, maxima, minima);
        } else {
            System.out.println("Fecha no válida.");
        }
    }
} // FIN CLASE

/*
 * Para encontrar la temperatura máxima y mínima registrada en un mes, puedes inicializar las variables de temperatura máxima y mínima con los valores de la primera entrada de temperaturas del mes correspondiente. 
 * Luego, comparas las temperaturas de cada día con estos valores para encontrar la máxima y mínima registrada. 
 */

/*
// METODO para mostrar el menu
    public void mostrarMenu() {
    String menu = "TEMPERATURAS PUERTO DE NAVACERRADA" +
                  "\n---------------------------------------------------------------" +
                  "\nOpciones:" +
                  "\n1. Elegir mes y mostrar temperaturas" +
                  "\n2. Ingresar nueva temperatura" +
                  "\n3. Mostrar promedios mensuales de temperaturas" +
                  "\n4. Mostrar temperaturas máxima y mínima del año" +
                  "\n5. Salir";
    int opcion;

    do {
        try {
            String opcionSeleccionada = JOptionPane.showInputDialog(null, menu);
            opcion = Integer.parseInt(opcionSeleccionada);

            switch (opcion) {
                case 1:
                    String mesElegido = JOptionPane.showInputDialog(null, "Introduce el número del mes (1-12):");
                    int mes = Integer.parseInt(mesElegido) - 1;
                    if (mes >= 0 && mes < 12) {
                        imprimirMes(mes);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción no válida. Debe ser entre 1 y 12.");
                    }
                    break;
                case 2:
                    mesElegido = JOptionPane.showInputDialog(null, "Introduce el número del mes para ingresar temperatura (1-12):");
                    String diaElegido = JOptionPane.showInputDialog(null, "Introduce el día del mes:");
                    String tempMaxima = JOptionPane.showInputDialog(null, "Introduce la temperatura máxima:");
                    String tempMinima = JOptionPane.showInputDialog(null, "Introduce la temperatura mínima:");
                    mes = Integer.parseInt(mesElegido) - 1;
                    int dia = Integer.parseInt(diaElegido);
                    int maxima = Integer.parseInt(tempMaxima);
                    int minima = Integer.parseInt(tempMinima);
                    ingresarTemperatura(mes, dia, maxima, minima);
                    break;
                case 3:
                    mostrarPromediosMensuales();
                    break;
                case 4:
                    mostrarTemperaturasExtremasAnuales();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, introduce un número válido.");
                opcion = 0; // Esto permite que el bucle continúe en caso de excepción
            }
        } while (opcion != 5);
    }
*/