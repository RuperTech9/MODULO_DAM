package TEMA06_ArraysYStrings.cadenas;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author alumno
 */
public class Cadenas {
    public static void main(String [] args){
        int i1 = 123;
        System.out.println("Numero: "+i1);// i1.toString()

        System.out.println(String.format("%3f",4.2f));
        
        String cadena1= "Programacion";
        String cadena2= "programacion";
        
        System.out.println(cadena1.compareTo(cadena2));
        System.out.println(cadena1.equals(cadena2));
        
        System.out.println(cadena1.compareToIgnoreCase(cadena2));
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        
        
        String numero = "1234.5678";
        double numero1 = Double.parseDouble(numero);
        System.out.println("numero1: "+numero1);
        
        String numero2 = String.valueOf(numero1);
        
        
        float numero4 = Float.parseFloat(numero);
        System.out.println("numero Float: "+numero4);
        numero2 = Float.toString(numero4);
        
        // [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9] es igual que [0-9]{1,8}
        Pattern p = Pattern.compile("([XY]?)([0-9]{1,8})([A-Za-z])"); // para definir un patron
        Matcher m = p.matcher("X123456789Z Y00110011M 999999T"); // para comprobar un patron
        
        if(m.matches())// Devuelve true si contiene la cadena
            System.out.println("Contiene el patron");
        else
            System.out.println("No contiene el patron");
        
        while(m.find()){
            System.out.println("Letra inicial (opcional): "+m.group(1));
            System.out.println("Número: "+m.group(2));
            System.out.println("Letra NIF: "+m.group(3));
        }
    }
    
}
