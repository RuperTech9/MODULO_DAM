package tema6.cadenas;



/**
 *
 * @author alumno
 */
public class CadenasExcepcion {
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
        
        // ---------------------------------------------------------
        // EXCEPCIONES
        // ---------------------------------------------------------
        String numero = "1234.567g";
        try{// gestionar la posible excepcion NumberFormatException
            double numero1 = Double.parseDouble(numero);
        }catch (NumberFormatException e)
        {
            System.out.println("Introduce el valor correcto");
        }    
            
        double numero1 = Double.parseDouble(numero);
        System.out.println("numero1: "+numero1);
        
        String numero2 = String.valueOf(numero1);
        
        
        float numero4 = Float.parseFloat(numero);
        System.out.println("numero Float: "+numero4);
        numero2 = Float.toString(numero4);
    }
    
}