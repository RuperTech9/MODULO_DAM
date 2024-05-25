
package tema3.juegos;

import java.util.Scanner;

/**
 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre
 * comienzan sus frases con «Javalín, javalón», para después hacer una pausa más o menos
 * larga (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación
 * expresan el mensaje. Existe un dialecto que no comienza sus frases con la muletilla anterior,
 * sino que terminan con un silencio, más o menos prolongado y la coletilla «javalén, len, len».
 * Se pide diseñar un traductor que, en primer lugar nos diga si la frase introducida está escrita
 * en el idioma de Javalandia (en cualquiera de sus dos dialectos), y en caso afirmativo, nos
 * muestre solo el mensaje sin las muletillas.
 * 
 * Para ver si la frase está escrita en javalandés, miramos si empieza o termina por el prefijo o el sufijo de sus dialectos.
 * Para ello, usamos los métodos startsWith() y endsWith() de la clase String. Para extraer el mensaje, utilizamos 2 versiones
 * sobrecargadas de substring()
 * 
 * @author Ruper
 */
public class Javalandia {
    public static void main(String[] args) {
	final String prefijo = "Javalín, javalón"; //constantes con el comienzo y la terminación en javalandés
	final String sufijo = "javalén, len, len"; 
	Scanner sc = new Scanner(System.in);
	System.out.println("Escriba una frase: ");
	String entrada = sc.nextLine();	//texto de entrada al traductor
	boolean idiomaJavalandia = false;	//suponemos que la entrada no está en javalandés
		
	//vamos a comprobar si el texto de entrada empieza o termina con alguna muletilla
	if (entrada.startsWith(prefijo)) {
            idiomaJavalandia = true;		//si la frase comienza con PREFIJO el idioma es javalandés
            entrada = entrada.substring(prefijo.length());
            //quitamos el prefijo y nos quedamos con los caractéres de entrada a partir del siguiente al prefijo
			
	}else if (entrada.endsWith(sufijo)) {
            idiomaJavalandia = true;//si la frase comienza con SUFIJO el idioma es javalandés
            entrada = entrada.substring(0, entrada.length() - sufijo.length());
            //quitamos el SUFIJO. Nos interesa desde el primer carácter de la entrada (0) hasta el carácter antes del sufijo.
	}
	if (idiomaJavalandia) {
            entrada = entrada.strip(); //quitamos los espacios antes y después o ".trim()"
            System.out.println(entrada); //mostramos
	}else {
            System.out.println("No está escrito en el idioma de Javalandia");
	}
    }
}
