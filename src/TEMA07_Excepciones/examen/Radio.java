
package TEMA07_Excepciones.examen;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class Radio {
    private Emisora[] emisoras;
    private int cantidadEmisoras;
    private String bandaActual;

    public Radio() {
        // Inicializa el array con un tamaño inicial.
        emisoras = new Emisora[10];
        cantidadEmisoras = 0;
        bandaActual = "FM";
    }

    public class Emisora {
        private String nombre;
        private double frecuencia;
        private String banda;

        public Emisora(String nombre, double frecuencia, String banda) {
            this.nombre = nombre;
            this.frecuencia = frecuencia;
            this.banda = banda;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setFrecuencia(double frecuencia) {
            this.frecuencia = frecuencia;
        }

        public void setBanda(String banda) {
            this.banda = banda;
        }

        public String getNombre() {
            return nombre;
        }

        public double getFrecuencia() {
            return frecuencia;
        }

        public String getBanda() {
            return banda;
        }
        @Override
        public String toString() {
            return nombre + " - " + frecuencia + " MHz (" + banda + ")";
        }
    }

    public void añadirEmisora(String nombre, double frecuencia, String banda) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre de la emisora no puede estar vacío.");
            return;
        }
        if (frecuencia <= 0) {
            System.out.println("La frecuencia debe ser un valor positivo.");
            return;
        }
        // Expandir el array si se alcanza el límite de capacidad.
        if (cantidadEmisoras >= emisoras.length) {
            Emisora[] emisorasTemp = new Emisora[cantidadEmisoras + 1];
            System.arraycopy(emisoras, 0, emisorasTemp, 0, emisoras.length);
            emisoras = emisorasTemp;
        }
        emisoras[cantidadEmisoras++] = new Emisora(nombre, frecuencia, banda);
    }

    public void eliminarEmisora(String nombre) {
        for (int i = 0; i < cantidadEmisoras; i++) {
            if (emisoras[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < cantidadEmisoras - 1; j++) {
                    emisoras[j] = emisoras[j + 1];
                }
                emisoras[--cantidadEmisoras] = null;
                return;
            }
        }
        System.out.println("Emisora no encontrada.");
    }

    public void cambiarBanda(String banda) {
        this.bandaActual = banda;
        System.out.println("Cambiado a banda " + banda + ".");
    }

    public void mostrarEmisoras() {
        for (int i = 0; i < cantidadEmisoras; i++) {
            if (emisoras[i].getBanda().equalsIgnoreCase(bandaActual)) {
                System.out.println(emisoras[i]);
            }
        }
    }
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------ RADIO " + bandaActual + " ------");
            System.out.println("\nMenu:");
            System.out.println("1 - Mostrar emisoras");
            System.out.println("2 - Cambiar a banda AM");
            System.out.println("3 - Cambiar a banda FM");
            System.out.println("4 - Añadir emisora");
            System.out.println("5 - Eliminar emisora");
            System.out.println("6 - Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Emisoras: ");
                    mostrarEmisoras();
                    break;
                case 2:
                    cambiarBanda("AM");
                    break;
                case 3:
                    cambiarBanda("FM");
                    break;
                case 4:
                    System.out.print("Nombre de la emisora: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Frecuencia: ");
                    double frecuencia = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer nuevamente
                    System.out.print("Banda (AM/FM): ");
                    String banda = scanner.nextLine();
                    añadirEmisora(nombre, frecuencia, banda);
                    break;
                case 5:
                    System.out.print("Nombre de la emisora a eliminar: ");
                    nombre = scanner.nextLine();
                    eliminarEmisora(nombre);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.mostrarMenu();
    }
}
