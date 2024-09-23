package TEMA06_ArraysYStrings.cadenas;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author david
 */
public class CadenasPatternMatcher {
          public static void main(String[] args){
                    
                    Scanner sc = new Scanner(System.in);
                    String cadena;

                    //1. Comprobar si el String cadena contiene exactamente el patr�n (matches) ?abc?
                    cadena = sc.nextLine();
                    Pattern pat1 = Pattern.compile("abc");
                    Matcher mat1 = pat1.matcher(cadena);
                    if (mat1.matches()) {
                              System.out.println("Ejemplo 1: SI");
                    } else {
                              System.out.println("Ejemplo 1: NO");
                    }

                    //2. Comprobar si el String cadena contiene ?abc?
                    cadena = sc.nextLine();
                    Pattern pat2 = Pattern.compile(".*abc.*");
                    Matcher mat2 = pat2.matcher(cadena);
                    if (mat2.matches()) {
                              System.out.println("Ejemplo 2: SI");
                    } else {
                              System.out.println("Ejemplo 2: NO");
                    }

                    //2 Tambi�n lo podemos escribir usando el m�todo find
                    Pattern pat = Pattern.compile("abc");
                    Matcher mat = pat.matcher(cadena);
                    if (mat.find()) {
                              System.out.println("V�lido");
                    } else {
                              System.out.println("No V�lido");
                    }
                    
                    //3. Comprobar si el String cadena empieza por ?abc?
                    cadena = sc.nextLine();
                    Pattern pat3 = Pattern.compile("^abc.*");
                    Matcher mat3 = pat3.matcher(cadena);
                    if (mat3.matches()) {
                              System.out.println("Ejemplo 3: V�lido");
                    } else {
                              System.out.println("Ejemplo 3: No V�lido");
                    }

                    //4. Comprobar si el String cadena empieza por ?abc? o ?Abc?
                    cadena = sc.nextLine();
                    Pattern pat4 = Pattern.compile("^[aA]bc.*");
                    Matcher mat4 = pat4.matcher(cadena);
                    if (mat4.matches()) {
                              System.out.println("Ejemplo 4: SI");
                    } else {
                              System.out.println("Ejemplo 4: NO");
                    }

                    //5. Comprobar si el String cadena est� formado por un m�nimo 
                              //de 5 letras may�sculas o min�sculas y un m�ximo de 10.
                    cadena = sc.nextLine();
                    Pattern pat5 = Pattern.compile("[a-zA-Z]{5,10}");
                    Matcher mat5 = pat5.matcher(cadena);
                    if (mat5.matches()) {
                              System.out.println("Ejemplo 5: SI");
                    } else {
                              System.out.println("Ejemplo 5: NO");
                    }

                    //6. Comprobar si el String cadena no empieza por un d�gito
                    cadena = sc.nextLine();
                    Pattern pat6 = Pattern.compile("^[^\\d].*");
                    Matcher mat6 = pat6.matcher(cadena);
                    if (mat6.matches()) {
                              System.out.println("Ejemplo 6: SI");
                    } else {
                              System.out.println("Ejemplo 6: NO");
                    }

                    //7. Comprobar si el String cadena no acaba con un d�gito
                    cadena = sc.nextLine();
                    Pattern pat7 = Pattern.compile(".*[^\\d]$");
                    Matcher mat7 = pat7.matcher(cadena);
                    if (mat7.matches()) {
                              System.out.println("Ejemplo 7: SI");
                    } else {
                              System.out.println("Ejemplo 7: NO");
                    }

                    //8. Comprobar si el String cadena solo contienen los caracteres a � b
                    cadena = sc.nextLine();
                    Pattern pat8 = Pattern.compile("(a|b)+");
                    Matcher mat8 = pat8.matcher(cadena);
                    if (mat8.matches()) {
                              System.out.println("Ejemplo 8: SI");
                    } else {
                              System.out.println("Ejemplo 8: NO");
                    }

                    //9. Comprobar si el String cadena contiene un 1 y ese 1 no est� seguido por un 2
                    cadena = sc.nextLine();
                    Pattern pat9 = Pattern.compile(".*1(?!2).*");
                    Matcher mat9 = pat9.matcher(cadena);
                    if (mat9.matches()) {
                              System.out.println("Ejemplo 9: SI");
                    } else {
                              System.out.println("Ejemplo 9: NO");
                    }

                    
          }
}
