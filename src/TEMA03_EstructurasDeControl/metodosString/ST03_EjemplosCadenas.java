
package TEMA03_EstructurasDeControl.metodosString;

/**
 *
 * @author Ruper
 */
public class ST03_EjemplosCadenas {
    public static void main(String[] args){
	String cad1= "CICLO DAM";
	String cad2= "ciclo dam";
		
	System.out.print("La primera cadena es: "+cad1+" y la segunda cadena es: "+cad2+"\n"); //se pone al final otra \n para que haga retorno de carro
		
	System.out.printf("La primera cadena es: %s y la segunda cadena es: %s",cad1,cad2); //Escribir sin saltar, el %s es donde va el dato
		
	System.out.printf("\nLa longitud de la cadena1:%d caracteres",cad1.length()); //dice la longitud de la cadena, %d es la variable
		
	System.out.printf("\nConcatenacion: %s",cad1.concat(cad2)); //concatenar 
		
	//Comparar cadenas
	System.out.printf("\nLa cadena1 es %b a la cadena2",cad1.equals(cad2)); //%b es variable equals, %d es numerica y %s caracter
	System.out.printf("\nLa cadena1 es %b a la cadena2 ignorando mayusculas",cad1.equalsIgnoreCase(cad2)); //igual q arriba pero ignorando mayusculas
		
	System.out.printf("\nLa cadena1 es %d a la cadena2",cad1.compareTo(cad2)); //compareTo
	System.out.printf("\nLa cadena1 es %d a la cadena2 ignorando mayusculas",cad1.compareToIgnoreCase(cad2));
	
	//Pasar a mayusculas y minusculas
	System.out.printf("\nEn minusculas es %s", cad1.toLowerCase());
	System.out.printf("\nEn mayusculas es %s", cad2.toUpperCase());
	
	//Obtener cadenas 
	System.out.printf("\nSubcadena es %s", cad1.substring(0,5)); //empieza en el 0 más los caracteres q tenga: ciclo tiene 5 
    }
}