package tema4.radio;

import java.util.Scanner;

public class RadioMAIN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Radio radio = new Radio(80);
        int opcion;

        do {
            Menu menu = new Menu();
            menu.menu();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce una nueva frecuencia: ");
                    double frecuencia = teclado.nextDouble();
                    radio.setFrecuencia(frecuencia);
                    break;
                case 2:
                    radio.subirFrecuencia();
                    break;
                case 3:
                    radio.bajarFrecuencia();
                    break;
                case 4:
                    radio.mostrarDatos();
                    System.out.println("La frecuencia actual es: "+radio.getFrecuencia());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}
