package TEMA07_Excepciones.excepciones;



/**
 * Numero aleatorio entre 0 y 9 
 * 
 * @author david
 */
public class Ej_03_NumAleatorio {
         
         public static void main(String[] args) {
                  int i; //Entero que toma el numero aleatorio
                  boolean fueradelimite = true;
                  
                  //Numero de intentos 
                  String texto[] = {"uno", "dos", "tres", "cuatro", "cinco"};
                  
                  //Genera el numero aletaorio hasta que esta entre 1 y 5.
                  
                  while(fueradelimite){
                           try{
                                    //Generar un numero aleatorio entre 0 y 9 
                                    //(int) delante ya que round es double e i es int, pues transformamos a int
                                    i = ( int) Math.round(Math.random()*9);
                                    System.out.println("Valor de I: "+i);
                                    System.out.println(texto[i-1]);
                                    fueradelimite = false;
                                    //Tipo de excepcion (teoria pdf) y el nombre (e1)
                           }catch(ArrayIndexOutOfBoundsException e1){
                                    System.out.println("Fallo en el indice: "+e1.getMessage());
                                    
                           }//Fin try-catch
                  }//Fin while
                          
                          
         }//Fin main
         
}//Fin class

