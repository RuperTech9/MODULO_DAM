
package TEMA03_EstructurasDeControl.metodosString;

/**
 *
 * @author Ruper
 */
public class ST04_ObtenerX {
    static final double PI = 3.1415926536; //PI es Constante
    static int x;  //Variable de la clase Ejemplo03
	
    static int obtener_X(int x){
	int valorAntiguo = x;
	return valorAntiguo;
    }
	
    public static void main(String[] args){
	int y = 5;
	char c1 = 'a';
	char c2 = 65;
	boolean encontrado = true;
		
	String mensaje1="Mi primera cadena de caracteres:";
	String mensaje2="Bienvenido a JAVA";
	System.out.println(mensaje1+y);
	System.out.println(mensaje1+x);
	System.out.println(mensaje1+obtener_X(4));
	System.out.println(mensaje1+PI);
		
	System.out.println("La variable y de tipo entero es:"+y);
	System.out.println("La variable c1 es de tipo char y su valor es: "+c1+" la variable c2"+c2);
	System.out.println("La variable de tipo boolean encontrado tiene un valor de:"+encontrado);
	System.out.println(mensaje2+"---"+mensaje1);
    }
}