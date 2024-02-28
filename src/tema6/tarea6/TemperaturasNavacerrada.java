package tema6.tarea6;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruper
 */
public class TemperaturasNavacerrada {
    private static final int TOTAL_MESES = 12; // Constante para el número total de meses
    private static final int[] DIAS_POR_MES = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Constante para los días por cada mes
    private Temperaturas[][] temperaturasAnuales = new Temperaturas[TOTAL_MESES][]; // Matriz para almacenar las temperaturas de cada día de cada mes.
    
    // CONSTRUCTOR
    public TemperaturasNavacerrada() {
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

    // METODO para obtener el nombre de un mes a partir de su índice
    private String getNombreMes(int mes) {
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombresMeses[mes];
    } // FIN METODO
    
    // METODOS PUBLICOS
    // METODO para imprimir las temperaturas de un mes específico
    public void imprimirMes(int mes) {
        StringBuilder mesElegido = new StringBuilder("Mes de " + getNombreMes(mes) + ": ");
        double sumaMaximas = 0; // Variables para calcular el maximo y el minimo
        double sumaMinimas = 0;
        
        for (int dia = 0; dia < temperaturasAnuales[mes].length; dia++) {
            Temperaturas temp = temperaturasAnuales[mes][dia];
            sumaMaximas += temp.getMaxima();
            sumaMinimas += temp.getMinima();
            mesElegido.append(dia + 1).append(":").append(temp.toString()).append(", "); // .append al ser StringBuilder para añadir String.
        } // FIN FOR
        
        // Calculo la media y la muestro
        double mediaMaxima = sumaMaximas / temperaturasAnuales[mes].length;
        double mediaMinima = sumaMinimas / temperaturasAnuales[mes].length;
        mesElegido.append("\nTemperatura media máxima: ").append(String.format("%.2f",mediaMaxima)).append("º"); // .format de String para sacar 2 decimales.
        mesElegido.append("\nTemperatura media mínima: ").append(String.format("%.2f", mediaMinima)).append("º");
        JOptionPane.showMessageDialog(null, mesElegido.toString());
    } // FIN METODO
    
    // METODO para mostrar el menu
    public void mostrarMenu(){
        String menu = "TEMPERATURAS PUERTO DE NAVACERRADA"
                + "\n---------------------------------------------------------------"
                + "\nOpciones:\n1. Elegir mes\n2. Salir";
        int opcion;
        
        do {
            try {
                String opcionesMenu = JOptionPane.showInputDialog(null, menu);
                opcion = Integer.parseInt(opcionesMenu);

                if (opcion == 1) {
                    try {
                        // Solicitar al usuario que introduzca el número del mes
                        String mesElegido = JOptionPane.showInputDialog(null, "Introduce el número del mes (1-12):");
                        int mes = Integer.parseInt(mesElegido) - 1; // Convertir el mes elegido a int y ajustar para el índice del array (0-11).
                        if (mes >= 0 && mes < 12) { // Si es válido, mostrar las temperaturas.
                            imprimirMes(mes);
                        } else {
                            JOptionPane.showMessageDialog(null, "Opción no válida. Debe ser entre 1 y 12.");
                        } // FIN IF INTERNO
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, introduce un número."); // Mensaje si no es numero.
                    } // FIN TRY-CATCH INTERNO
                } else if (opcion != 2) {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elige 1 o 2.");
                } // FIN IF EXTERNO
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, introduce un número."); // Mensaje si no es numero.
                opcion = 0; // Reinicio la opción para que el bucle continue
            } // FIN TRY-CATCH EXTERNO
        } while (opcion != 2); // FIN DO-WHILE
    } // FIN METODO
} // FIN CLASE
