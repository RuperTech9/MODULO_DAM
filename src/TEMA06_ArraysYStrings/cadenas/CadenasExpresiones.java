package TEMA06_ArraysYStrings.cadenas;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author david
 */

public class CadenasExpresiones {

         public static void main(String[] args) {
                  int i1 = 123;
                  System.out.println("Numero: "+i1); //i1.toString()
                  
                  //Formatos de Conversion
                  System.out.println(String .format("%3f", 4.2f));
                  System.out.println(String.format("El precio es: %.2f", 3.3f)) ;
                  
                  //boolean %b devuelve un true/false 
                  boolean b = true;
                  String d= String.format("Resultado:%b ", b);
                   System.out.println(d);
                   
                   //String 
                   String cad = "hola mundo";
                   String v= String.format("Resultado:%s", cad);
                    System.out.println(v);
                    
                    //Double Entero decimal =10
                    int i = 10;
                   String q = String.format("Resultado:%d", i);
                    System.out.println(q);
                    
                    //N�mero en notaci�n cient�fica Resultado: 1.050000E+01
                    double c = 10.5;
                   String d1= String.format("Resultado:%E", c);
                    System.out.println(d1);
                    
                  ////////////////////////////////////////////Fin formatos de Conversion////////////////////////////////////////////////
                  
                  //Comparar Cadenas
                  String cadena1 = "Programacion";
                  String cadena2="programacion";
                  //compareTo devuelve 0 si son iguales.    
                  //-(num) si cadena 1 es menor. 
                  //+(num) si cadena 1 es mayor.
                  System.out.println(cadena1.compareTo(cadena2));
                  System.out.println(cadena1.equalsIgnoreCase(cadena2));
                  
                  
                  //Pasar de STRING  a DOUBLE
                  String numero = "1234.5678";
                  double numero1 = Double.parseDouble(numero);
                  System.out.println("numero1: "+numero1);
                  
                  //Pasar de DOUBLE a STRING
                  String numero2 = String.valueOf(numero1);
                  
                  float numero4 = Float.parseFloat(numero);
                  System.out.println("numero Float: "+numero4);
                  numero2 = Float.toString(numero4);

                  
                  //Excepcion NumberFormatException
                  String numero5 = "1234.5678g";
                  try{  //Gestionar la posible excepcion NumberFormatException
                           double numero6 = Double.parseDouble(numero5);
                           System.out.println("numero double: "+numero6);
                           String numero7 = String.valueOf(numero6);

                  }catch (NumberFormatException e)
                  {
                            //Lo que se ejecutara si no se puede hacer la parte del try
                           System.out.println("Introduce el valor correcto");
                  }
                           
                  
                  //Expresiones Regulares 
                  //Si lo ponemos entre () tiene que ser el mismo orden y [] para que contenga eso sin el orden 
                  // {} indica la cantidad de veces q puede aparecer
                  //Poner [0-9]  [0-9]  [0-9]  [0-9]  [0-9]  [0-9]  [0-9]  [0-9]  = [0-9]  {7,8}
                  //([XY]?) indica que puede ser o no obligatorioSS
                  Pattern p = Pattern.compile("([XY]?)([0-9]{1,8})([A-Z])");     //Define un patron   
                  Matcher m = p.matcher("Y47529040T");      //Comprueba un patron

                  if (m.matches()) { // Devuelve true si contiene la cadena
                           System.out.println("Contiene el patron");
                  } else {
                           System.out.println("No contiene el patron");
                  }

                  m.reset(); // Reset matcher's position to the beginning

                  while (m.find()) {
                           System.out.println("Letra inicial(opcional): " + m.group(1));
                           System.out.println("Numeros: " + m.group(2));
                           System.out.println("Letra NIF: " + m.group(3));
                  }

                 
         }
         
}
