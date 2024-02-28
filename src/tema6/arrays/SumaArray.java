
package tema6.arrays;

/**
 *
 * @author alumno
 */
public class SumaArray {
    public static void main(String[] args){  
        int[] n = new int[5]; // Crear el array resrvando memoria
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        n[3] = 4;
        n[4] = 5;
            
        int suma = sumaArray(n);
        System.out.println("La suma es: "+ suma);   
    }
    
    static int sumaArray(int[] j) {
        int suma = 0;
        for(int i = 0; i < j.length; i++) {
            suma += j[i];
        }
        return suma;
    } 
}
