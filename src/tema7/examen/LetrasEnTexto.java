
package tema7.examen;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class LetrasEnTexto {
    public static void main(String[] args) {
      Scanner lector1=new Scanner(System.in);
      Scanner lector2=new Scanner(System.in);
      System.out.println("introduce un texto:");
      String txt = lector1.nextLine();
      System.out.println("introduce una letra:");
      String ch = lector2.next();
      int len = txt.length();
      int cont=0;
      for (int i=0;i<len;i++){
          if (txt.charAt(i)==ch.charAt(0)){
              cont++;
          }
      }
    System.out.println("La letra "+ch.charAt(0)+" aparece "+cont+" veces");
    lector1.close();
    lector2.close();
    }
}

/*
Escribe un programa que pida al usuario que introduzca un texto y una letra. Después el programa tiene que calcular y presentar por pantalla, cuantas veces aparece la letra en el texto.

Pista: Un string es un array de caracteres. Para acceder a un elemento del string, usa la función chartAt(posición). Por ejemplo. Si el string es “Hola Mundo”, con la sentencia text.charAt(3), recuperamos el carácter ‘a’. 
Recuerda que las posiciones empiezan en 0
*/

/*
public class LetraEnTexto_v2 {

    public static void main(String[] args) {
      Scanner lector1=new Scanner(System.in);
      Scanner lector2=new Scanner(System.in);
      System.out.println("introduce un texto:");
      String txt = lector1.nextLine();
      System.out.println("introduce una letra:");
      String ch = lector2.next();
      
      int len = txt.length();
      int cont=0;
      char letra=ch.charAt(0);
      char c;
      for (int i=0;i<len;i++){
          c=txt.charAt(i);
          if (c==letra){
              cont++;
          }
      }
    System.out.println("La letra "+ letra +" aparece "+cont+" veces");
    lector1.close(); lector2.close();
    }
}
*/