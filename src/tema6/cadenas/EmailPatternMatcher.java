package tema6.cadenas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author david
 */
public class EmailPatternMatcher {

          public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    String email;
                    System.out.print("Introduce email: ");
                    email = sc.nextLine();
                    Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                    Matcher mat = pat.matcher(email);
                    if (mat.find()) {
                              System.out.println("Correo V�lido");
                    } else {
                              System.out.println("Correo No V�lido");
                    }
          }
}
