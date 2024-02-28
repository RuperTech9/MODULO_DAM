
package tema2.ejercicios;


/**
 *
 * @author ruper
 */
public class E01_FuncionSuma {
    //Codigo de la funcion
    //Se debe de poner STATIC para poderla utilizar en el main
    public static int sumar (int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args){
	
        int variable1 = sumar(2,3);
        System.out.println("La suma de dos numeros es: " +variable1);
        for (int i=1; i>4; i++){
            System.out.printf("%d", i);
        }
        
    }
}