
package TEMA03_EstructurasDeControl.ejercicios;

/**
 *
 * @author alumno
 */
public class E05_BREAK {
    public static void main(String args []){
        int numero = 7;
        int contador = 0;
        int resultado;
        
        do{
            resultado = contador*numero;
            System.out.println(numero +" x "+contador+" = "+resultado);
            contador++;
            if (contador==7+1)
                break;
            
        } while(contador<=10);
    }    
}
