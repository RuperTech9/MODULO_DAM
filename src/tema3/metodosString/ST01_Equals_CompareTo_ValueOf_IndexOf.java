
package tema3.metodosString;

/**
 *
 * @author alumno
 */
public class ST01_Equals_CompareTo_ValueOf_IndexOf {
    public static void main(String [] args){
        String texto = "Hola Mundo";
        System.out.println("La longitud es: "+texto.length());
        
        //Cadenas de caracteres comienzan a contar desde cero hasta longitud-1
        System.out.println("La letra 2 es: "+texto.charAt(1));
        
        //Obtener parte de la cadena
        char buffer[]= new char[5];
        texto.getChars(5, 9, buffer, 0);
        System.out.println("El buffer copiado es: "+buffer);
        
        //COMPARACIONES EQUALS
        String nombre1= "Juan";
        String nombre2= "Ana";
 
        if(nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
        //COMPARACIONES CompareTo
        //Devuelve 0 si ambas son iguales
        //Devuelve valor negativo si el String es menor
        //Devuelve valor positivo si el String es mayor
        if(nombre1.compareTo(nombre2) == 0){
            System.out.println("Son iguales");
        }else if (nombre1.compareTo(nombre2) < 0){
            System.out.println("Nombre1 seria menor que Nombre2");
        }else{
            System.out.println("Nombre2 seria menor que Nombre1");
        }
        //CONVERSION DE VARIABLES A STRING
        System.out.println(String.valueOf(Math.PI) );
        //BUSCAR CONTENIDO
        String texto2 = " palabra1 palabra2 palabra2"; //Cadena donde se va a buscar
        String busqueda = "palabra2"; //Lo que se quiere buscar
        int contador = 0; //contador de ocurrencias
        
        while(texto2.indexOf(busqueda)> -1){
            texto2 = texto2.substring(texto2.indexOf(busqueda)+busqueda.length(), texto2.length());
            contador++;
        }//FIN DEL WHILE
        System.out.println("El contador es: "+contador);
        
        int Index = texto2.indexOf(busqueda);
        System.out.println(Index);
    }
}
