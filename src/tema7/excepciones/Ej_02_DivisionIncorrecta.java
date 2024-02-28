package tema7.excepciones;



/**
 * Intentamos dividir un numero entre 0 y da ERROR exception
 * @author david
 */

public class Ej_02_DivisionIncorrecta {
         //Constante con valor 5
         static final int CONSTANTE = 5;
         
         public static void main(String[] args) {
                  int c, d;
                  c = 0;
                  d = CONSTANTE /c;
                  System.out.println("Division: "+d);
                  
         }//Fin main
         
}//Fin class
