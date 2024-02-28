package tema6.cadenas;

/**
 *
 * @author david
 */
public class CadenasComparar {
          public static void main(String[] args){
                    
                    //Comparar Cadenas
                    String cadena1 = "Programacion";
                    String cadena2 = "programacion";
                    //compareTo devuelve 0 si son iguales.    
                    //-(num) si cadena 1 es menor. 
                    //+(num) si cadena 1 es mayor.
                    System.out.println(cadena1.compareTo(cadena2));
                    System.out.println(cadena1.equalsIgnoreCase(cadena2));
                    
                    //Mayusculas y minusculas
                    String cadena3 = "Hola me llamo David";
                    //Todo en minusculas
                    System.out.println(cadena3.toLowerCase());
                    //Todo en mayusculas
                    System.out.println(cadena3.toUpperCase());
                    
                    
                   //Varias apariciones de una cadena dentro de otra
                    String cad1 = "Hola me llamo David";
                    String cad2 = "David";
                    String cad3 = "gato";

                    // Buscar la posici�n de la subcadena "me" en cadena3
                    int posicion1 = cadena3.indexOf(cad1);
                    System.out.println("La subcadena \"" + cad1 + "\" comienza en la posici�n: " + posicion1);

                    // Buscar la posici�n de la subcadena "David" en cadena3, empezando desde la posici�n 7
                    int posicion2 = cadena3.indexOf(cad2, 7);
                    System.out.println("La subcadena \"" + cad2 + "\" comienza en la posici�n (empezando desde la posici�n 7): " + posicion2);

                    
                    //Ver si la cadena Contiene una cadena
                    if (cad1.contains(cad2)) {
                              System.out.println("La cadena \"" + cad1 + "\" contiene la subcadena \"" + cad2 + "\"");
                    } else {
                              System.out.println("La cadena \"" + cad1 + "\" no contiene la subcadena \"" + cad2 + "\"");
                    }
                    if (cad1.contains(cad3)) {
                              System.out.println("La cadena \"" + cad1 + "\" contiene la subcadena \"" + cad3 + "\"");
                    } else {
                              System.out.println("La cadena \"" + cad1 + "\" no contiene la subcadena \"" + cad3 + "\"");
                    }
                    
                    
                    //la Cadena Empieza o Acaba por
                    //cad1.endsWith(cad2)   o   cad1.startsWith(cad2)
                    if (cad1.startsWith(cad2)) {
                              System.out.println("La cadena \"" + cad1 + "\" comienza con \"" + cad2 + "\"");
                    } else {
                              System.out.println("La cadena \"" + cad1 + "\" no comienza con \"" + cad2 + "\"");
                    }
                    
                    //Reemplazar partes de la cadena
                    String resultadoCadena = cad1.replace(cad2, cad3);
                    System.out.println("Cadena original: " + cad1);
                    System.out.println("Cadena modificada: " + resultadoCadena);

                    
                    //Eliminar espacios en blanco al principio y al final de la cadena
                    String cad4 = "   Hola tengo 3 gatos    ";

                    String resultadoCad4 = cad4.trim();

                    System.out.println("Cadena original: \"" + cad4 + "\"");
                    System.out.println("Cadena despu�s de trim: \"" + resultadoCad4 + "\"");

                    
                    //ValueOf se utiliza para obtener la representaci�n en cadena de un objeto. 
                    int numero = 42;
                    String cadena = String.valueOf(numero); //convertir el valor numerico a una cadena

                    System.out.println("N�mero como cadena: " + cadena);

                    //Ejemplo para dato booleano
                    boolean esVerdadero = true;
                    String cadenaBooleana = String.valueOf(esVerdadero);

                    System.out.println("Booleano como cadena: " + cadenaBooleana);

                    
                    //Cadena Vacia o LL
                    //EMPTY O BLANK
                    String cadena5 = "   ";
                    String cadena6 = "Hola";
                    String cadena7 = "";

                    // Ejemplo de isBlank()
                    System.out.println("�La cadena1 est� en blanco? " + cadena5.isBlank());
                    System.out.println("�La cadena2 est� en blanco? " + cadena6.isBlank());
                    System.out.println("�La cadena3 est� en blanco? " + cadena7.isBlank());

                    // Ejemplo de isEmpty()
                    System.out.println("�La cadena1 est� vac�a? " + cadena5.isEmpty());
                    System.out.println("�La cadena2 est� vac�a? " + cadena6.isEmpty());
                    System.out.println("�La cadena3 est� vac�a? " + cadena7.isEmpty());

                    
          }
          
}
