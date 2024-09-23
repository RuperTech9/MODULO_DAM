
package TEMA04_ProgramacionOrientadaObjetos.tarea4;

/**
 *
 * @author Ruper
 */
import java.util.Scanner;

public class Radio {
    private static class Emisora {//Emisora individual
        // ATRIBUTOS PRIVADOS EMISORA
        private String nombre;
        private double frecuencia;
        
        // CONSTRUCTOR VACIO
        Emisora(){}
        // CONSTRUCTOR EMISORA
        Emisora(String nombre, double frecuencia) {
            this.nombre = nombre;
            this.frecuencia = frecuencia;
        }
        // SETTERS
        public void setNombre(String nombre) {
            this.nombre=nombre;
        }
        public void setFrecuencia(double frecuencia) {
            this.frecuencia=frecuencia;
        }
        // GETTERS
        public String getNombre(){
            return nombre;
        }
        public double getFrecuencia(){
            return frecuencia;
        }
        // Metodo público para mostrar array
        @Override
        public String toString() {
            return nombre + " - " + frecuencia + " MHz";
        }// Fin metodo
    }//FIN CLASE EMISORA
    
    // ATRIBUTOS PRIVADOS RADIO
    private final Emisora[] emisora; // array de objetos del tipo Emisora
    private int emisoraFavorita;
    
    // CONSTRUCTOR RADIO
    public Radio() {// Clase con conjunto de emisoras (usando la clase Emisora)
        emisora = new Emisora[6];// La variable emisora es accesible desde cualquier método dentro de la clase Radio
        
            emisora[0] = new Emisora("EuropaFM",90.9);
            emisora[1] = new Emisora("RadioOle",92.4);
            emisora[2] = new Emisora("Los40",93.9);
            emisora[3] = new Emisora("Cadena100",99.5);
            emisora[4] = new Emisora("RockFM",101.7);
            emisora[5] = new Emisora("Radio MARCA",103.5);
                 
        emisoraFavorita = 4; // marco RockFM como emisora favorita
    }
    
    // METODOS PRIVADOS
    
    // Metodo para subir frecuencia
    private void subirFrecuencia() {
        if (emisoraFavorita < emisora.length - 1) { // -1 para no salirnos del rango
            emisoraFavorita++;
        } else {
            emisoraFavorita = 0; // Ir al principio
        }//FIN IF
    }// Fin metodo
    
    // Metodo para bajar frecuencia
    private void bajarFrecuencia() {
        if (emisoraFavorita > 0) {
            emisoraFavorita--;
        } else {
            emisoraFavorita = emisora.length - 1; // Ir al final
        }//FIN IF
    }// Fin metodo
 
    // METODOS PUBLICOS
    
    // Metodo que enciende la radio con la emisora favorita
    public void encenderRadio() { //
        System.out.println("Emisora favorita: " + emisora[emisoraFavorita]);
    }// Fin metodo
    
    // Metodo que muestra todas las emisoras
    public void mostrarEmisoras() {
        System.out.println("\nEMISORAS:");
        for (int i = 0; i < emisora.length; i++) {
            System.out.println(i + 1 + " - " + emisora[i]);
        }//FIN FOR
    }// Fin metodo

    // Metodo que muestra el menu con las distintas opciones
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int emisoraSiguiente = emisoraFavorita + 1;
        
        do {
            System.out.println("\n------ RADIO FM ------");
            System.out.println("Emisora actual: " + emisora[emisoraFavorita]);
            
            if(emisoraSiguiente>=emisora.length){
                emisoraSiguiente=0;// Reinicio a 0 si supera la longitud del array
            }// FIN IF
            
            System.out.println("Emisora siguiente: " + emisora[emisoraSiguiente]);
            
            System.out.println("\nMenu:");
            System.out.println("1 - Subir frecuencia");
            System.out.println("2 - Bajar frecuencia");
            System.out.println("3 - Mostrar todas las emisoras"); // Nueva opción
            System.out.println("4 - Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    subirFrecuencia();// METODO subirFrecuencia
                    emisoraSiguiente = emisoraFavorita + 1;
                    break;
                case 2:
                    bajarFrecuencia();// METODO bajarFrecuencia
                    emisoraSiguiente = emisoraFavorita + 1;
                    break;
                case 3:
                    mostrarEmisoras(); // METODO mostrarEmisoras
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Opción no válida.");
            }// FIN SWITCH
        } while (opcion != 4);//FIN DO-WHILE
    }// Fin metodo
}//FIN CLASE RADIO
