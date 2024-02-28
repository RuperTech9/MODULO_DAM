package tema2.tarea2;


import java.util.Scanner;

/**
 * Diseñar un programa estructurado en Java que a partir de los siguientes datos recogidos por el usuario obtenga el IMC de una persona:
 * nombre - apellidos - altura - peso.
 * La altura la introducirá el usuario en centimetros (que pasaremos a metros) y el peso en kilos. 
 * El programa calculará el IMC de una persona adulta y como resultado le dirá si tiene peso saludable o sobrepeso.
 * 
 * @author Alejandro Ruperez
 */

public class IMCpersona {
    // Variables constantes que definen los límites de clasificación del IMC
    public static final double LIMITE_BAJO_PESO = 18.50;
    public static final double LIMITE_NORMAL = 24.99;
    public static final double LIMITE_SOBREPESO = 29.99;
    
    /**
     * Muestra un mensaje de presentación del programa.
     */
    public static void presentacion(){
        System.out.println("*****************************************************");
        System.out.println("*** Programa para calcular el  IMC de una persona ***");
        System.out.println("*** Author: Alejandro Ruperez                     ***");
        System.out.println("*** Versión 1.0                                   ***");
        System.out.println("*****************************************************");
    }
    
    /**
     * Calcula el IMC de una persona a partir de su peso y altura.
     * @param peso Peso de la persona en kilogramos.
     * @param altura Altura de la persona en centímetros.
     * @return IMC calculado.
     */
    public static double calculoIMC(double peso, double altura) {
        double alturaMetros = altura/100;
        return peso / Math.pow( alturaMetros,  2);
    }
    
    /**
     * Muestra los datos resultantes y el nivel de peso de la persona. En vez de solo decir si el peso es saludable o no
     * vamos a clasificarlo según el IMC a través de operadores ternarios anidados.
     * @param imc IMC calculado.
     * @param nombre Nombre de la persona.
     * @param apellidos Apellidos de la persona.
     */
    public static void mostrarDatos(double imc, String nombre, String apellidos){
        String resultado = imc < LIMITE_BAJO_PESO ? "un peso BAJO" :
                           imc < LIMITE_NORMAL ? "un peso NORMAL" :
                           imc < LIMITE_SOBREPESO ? "SOBREPESO" : "OBESIDAD";

        System.out.printf("\nResultado para %s %s:", nombre, apellidos);
        System.out.printf("\nIMC: %.2f",imc);
        System.out.printf("\nTienes %s.",resultado);
    }
    
    /**
     * Muestra una tabla de clasificación de IMC para referencia.
     */
    public static void clasificacion(){
        System.out.println("\n\n**************************************");
        System.out.println("***     IMC          NIVEL DE PESO ***");
        System.out.println("***     ---          ------------- ***");
        System.out.println("*** Menos de 18.5      Bajo peso   ***");
        System.out.println("***  18.5 – 24.9         Normal    ***");
        System.out.println("***  25.0 – 29.9       Sobrepeso   ***");
        System.out.println("***  30.0 o más        Obesidad    ***");
        System.out.println("**************************************");
    }

    
    public static void main (String args[] ){
        String nombre;
        String apellidos;
        int altura;
        double peso;
        
        presentacion();
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("\nIntroduce tu nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Introduce tus apellidos: ");
        apellidos = teclado.nextLine();
        
        System.out.println("Introduce tu estatura en centimetros: ");
        altura = teclado.nextInt();
        
        System.out.println("Introduce tu peso en kilogramos: ");
        peso = teclado.nextDouble();
        
        mostrarDatos((calculoIMC(peso, altura)), nombre, apellidos);
        
        clasificacion();
    }
    
}