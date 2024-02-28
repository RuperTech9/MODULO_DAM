
package tema4.numerosNaturales;

/**
 *
 * @author alumno
 */
public class NumerosNaturales {
    private int inicial, maximo;
    
    public NumerosNaturales(){
        this.inicial=0;
    }
    
    public void setInicial(int inicial){
        this.inicial=inicial;
    }
    
    public void setMaximo(int maximo){
        this.maximo=maximo;
    }
    
    public int getInicial(){ 
        return inicial;
    }
    
    public int getMaximo(){
        return maximo;
    }
    
    public void reiniciar(){
       this.inicial=0;
       this.maximo=0;
    }
    
    public void imprimirRango(){
        for (int i=this.inicial;i<=this.maximo;i++){
            System.out.print(i+" ");
        }
    }
    public void imprimirRangoInverso(){
        for (int i=this.maximo;i>=this.inicial;i--){
            System.out.print(i+" ");
        }
    }
}
