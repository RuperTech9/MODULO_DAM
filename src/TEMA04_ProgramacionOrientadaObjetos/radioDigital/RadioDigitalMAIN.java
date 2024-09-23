
package TEMA04_ProgramacionOrientadaObjetos.radioDigital;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class RadioDigitalMAIN {
    public static void main(String[] args) {

        RadioDigital[] emisora = new RadioDigital[6];
      
        emisora[0] = new RadioDigital("EuropaFM",90.9);
        emisora[1] = new RadioDigital("RadioOle",92.4);
        emisora[2] = new RadioDigital("Los40",93.9);
        emisora[3] = new RadioDigital("Cadena100",99.5);
        emisora[4] = new RadioDigital("RockFM",101.7);
        emisora[5] = new RadioDigital("Radio MARCA",103.5);
        
        int emisoraFavorita = 4;
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Emisora actual: " + emisora[emisoraFavorita]);
            
            Menu menu = new Menu();
            menu.menu();
            
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    if (emisoraFavorita < emisora.length - 1) {
                    emisoraFavorita++;
                    } else {
                    emisoraFavorita = 0; // Volver al principio del array
}
                    break;
                case 2:
                    emisoraFavorita = (emisoraFavorita - 1 + emisora.length) % emisora.length;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");                    
            }                 
                
        } while (opcion != 3);
    }
}
    
    
    
            
    
    
    

