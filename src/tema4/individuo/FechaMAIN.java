
package tema4.individuo;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class FechaMAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Individuo[] individuos = new Individuo[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la fecha de nacimiento del individuo " + (i + 1) + " (formato: día mes año):");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int año = scanner.nextInt();

            Fecha fechaNacimiento = new Fecha(dia, mes, año);

            if (fechaNacimiento.fechaCorrecta()) {
                System.out.println("Fecha de nacimiento correcta.");
                
                fechaNacimiento.diaSiguiente();
                System.out.println("El día siguiente es: " + fechaNacimiento.getDia() + "/" + fechaNacimiento.getMes() + "/" + fechaNacimiento.getAño());

                // Supongamos que todos los individuos tienen nombre y DNI genéricos y una altura predefinida.
                individuos[i] = new Individuo("DNI" + i, "Individuo" + i, fechaNacimiento, 1.70);
                individuos[i].incrementarAltura(); // Aumentar 1 cm

                System.out.println("Edad: " + individuos[i].getEdad());
                System.out.println("Altura original: " + individuos[i].getAltura() + " metros");
                System.out.println("Altura con 1 cm más: " + (individuos[i].getAltura() + 0.01) + " metros");
            } else {
                System.out.println("Fecha de nacimiento incorrecta. Intente de nuevo.");
                i--; // Restar 1 a 'i' para pedir nuevamente los datos del individuo
            }
        }
    }
}
               
