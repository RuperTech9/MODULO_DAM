
package tema6.arraysBidimensionales;

/**
 *
 * @author Ruper
 */
public class DietaSemanal {

    // Arrays para almacenar las comidas de cada día
    static String[][] comidas = new String[7][3]; // [días de la semana][tipo de comida (desayuno, comida, cena)]
    static String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    public static void inicializarComidas() {
        // Ejemplo de inicialización de comidas (desayuno, comida, cena) para cada día de la semana
        comidas[0] = new String[]{"Tostadas", "Pasta", "Ensalada"};
        comidas[1] = new String[]{"Cereal", "Pescado", "Sopa"};
        comidas[2] = new String[]{"Avena", "Pollo", "Verduras"};
        comidas[3] = new String[]{"Frutas", "Arroz", ""}; // Jueves no tiene cena
        comidas[4] = new String[]{"Yogurt", "Ensalada", "Pizza"};
        comidas[5] = new String[]{"Panqueques", "Hamburguesa", "Pasta"};
        comidas[6] = new String[]{"Huevos", "Sushi", "Helado"};
}

    public static void imprimirComidasDia(String dia) {
        int diaIndex = -1;
        for (int i = 0; i < diasSemana.length; i++) {
            if (diasSemana[i].equalsIgnoreCase(dia)) {
                diaIndex = i;
                break;
            }
        }

        if (diaIndex != -1) {
            System.out.println("Comidas del " + dia + ": Desayuno: " + comidas[diaIndex][0] + ", Comida: " + comidas[diaIndex][1] + ", Cena: " + comidas[diaIndex][2]);
        } else {
            System.out.println("Día de la semana no válido.");
        }
    }

    public static void buscarDiasPorComida(String comida) {
        System.out.println("Días que se comió " + comida + ":");
        for (int i = 0; i < comidas.length; i++) {
            for (int j = 0; j < comidas[i].length; j++) {
                if (comidas[i][j].equalsIgnoreCase(comida)) {
                    System.out.println(diasSemana[i]);
                    break; // Si la comida ya fue encontrada en ese día, no es necesario seguir buscando en ese día.
                }
            }
        }
    }
    
    public static void diasSinCena() {
        int contador = 0;
        System.out.println("Días sin cena:");
        for (int i = 0; i < comidas.length; i++) {
            if (comidas[i][2].isEmpty()) { // La cena está en la posición 2 del subarray
                System.out.println(diasSemana[i]);
                contador++;
            }
        }
        System.out.println("Total de días sin cena: " + contador);
    }

    public static void resumenComidaSemana() {
        System.out.println("Resumen de la semana:");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i] + ": Desayuno: " + comidas[i][0] + ", Comida: " + comidas[i][1] + ", Cena: " + comidas[i][2]);
        }
    }
}