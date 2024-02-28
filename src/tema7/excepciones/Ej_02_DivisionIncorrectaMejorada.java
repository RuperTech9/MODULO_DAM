package tema7.excepciones;



/**
 * Intentamos dividir un numero entre 0 y da ERROR exception
 * @author david
 */

public class Ej_02_DivisionIncorrectaMejorada {
         //Constante con valor 5
         static final int CONSTANTE = 5;
         
         //Metodo para mejorarlo con EXCEPTION
         public static int divide(int dividendo, int divisor){
                  //Si el divisor es 0, lanza la exception
                  if (divisor == 0)
                           throw new IllegalArgumentException ("Division incorrecta");
                  else
                           return (dividendo/divisor);
         }//Fin divide
         
         public static void main(String[] args) {
                  try {
                           int c, d;
                           c = 0;
                           d = divide(CONSTANTE,c);
                           //Imprimimos
                           System.out.println("Valor de la Division: " + d);
                           
                  }catch(IllegalArgumentException e3) {
                           //Se le pone e3 porq es una variable para luego poner un mensaje
                           //Para que coja el mensaje de la excepcion: "Division incorrecta"
                           e3.printStackTrace();
                           System.out.println("Error: " + e3.getMessage());
                  }//Fin try-catch
                          
           
         }//Fin main
         
}//Fin class
