
package tema3.ordenacion;

/**
 *
 * @author Ruper
 */
public class Burbuja {
    
    public static int [] burbujaSimple(int [] numerosArray){
        boolean intercambio=true;
        int temp;
        for(int i=numerosArray.length-1;i>0&&intercambio;i--){
            intercambio=false;
            for(int j=0;j<i;j++){
                if(numerosArray[j]>numerosArray[j+1]){
                    temp=numerosArray[j];
                    numerosArray[j]=numerosArray[j+1];
                    numerosArray[j+1]=temp;
                    intercambio = true;
                }
            }         
        }
        return numerosArray;
    }
    
    public static int [] burbujaSimpleDesc(int [] numerosArray){
        boolean intercambio=true;
        int temp;
        for(int i=numerosArray.length-1;i>0&&intercambio;i--){
            intercambio=false;
            for(int j=0;j<i;j++){
                if(numerosArray[j]<numerosArray[j+1]){
                    temp=numerosArray[j];
                    numerosArray[j]=numerosArray[j+1];
                    numerosArray[j+1]=temp;
                    intercambio = true;
                }
            }         
        }
        return numerosArray;
    }
    
    public static int [] burbujaSimple2(int [] numerosArray){
        boolean intercambio=true;
        int temp;
        int i=0;
        int j=numerosArray.length-1;
        
        while (i < j && intercambio) {
            intercambio = false;
            for (int k = i; k < j; k++) {
                if (numerosArray[k] > numerosArray[k + 1]) {
                    temp = numerosArray[k];
                    numerosArray[k] = numerosArray[k + 1];
                    numerosArray[k + 1] = temp;
                    intercambio = true;
                }
            }
            j--;

            if (intercambio) {
                intercambio = false;
                for (int k = j; k > i; k--) {
                    if (numerosArray[k] < numerosArray[k - 1]) {
                        temp = numerosArray[k];
                        numerosArray[k] = numerosArray[k - 1];
                        numerosArray[k - 1] = temp;
                        intercambio = true;
                    }
                }
                i++;
            }
        
        }
        
        return numerosArray;
    }
    
    public static void imprimirArray(int[] array, int longitud){
        System.out.println("El resultado del array es: ");
        for(int i=0;i<longitud;i++){
            System.out.print(array[i]+", ");
        }
    }
    
    public static void main(String [] args){
        int [] array = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};
        int [] array2 = {10, 1, 5, 40, 12, 34, 48, 12, 11, 9};
        int longitud=array.length;
        int longitud2=array2.length;
        
        burbujaSimple(array);
        imprimirArray(array, longitud);
        System.out.println("");
        burbujaSimpleDesc(array2);
        imprimirArray(array2, longitud);
        System.out.println("");
        burbujaSimple2(array2);
        imprimirArray(array2, longitud);
    }
}
