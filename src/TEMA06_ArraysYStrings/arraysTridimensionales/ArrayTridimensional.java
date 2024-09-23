
package TEMA06_ArraysYStrings.arraysTridimensionales;

/**
 *
 * @author alumno
 */
public class ArrayTridimensional {
    public static void main(String[] args){
        int [][][] array1 = {{{1,-9,3},{2,7,5}}, // 2x3
            {{-45,5,6,75},{88}},{{29,30}}}; // x3 irregular
        
        for (int[][] arr1:array1){
            for(int[] a: arr1){
                for(int finalArray1:a){
                    System.out.print(finalArray1+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("Elemento 0-0-0:"+array1[0][0][0]);
    }   
}
