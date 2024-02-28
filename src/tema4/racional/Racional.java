
package tema4.racional;

/**
 *
 * @author alumno
 */
class Racional{
    private int numerador;
    private int denominador;
    
    public Racional(){}
    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = 1;
    }
    
    //SETTERS
    public void setNumerador(int numerador){
        this.numerador = numerador;
    }
    public void setDenominador(int denominador){
        this.denominador = denominador;
    }
    //GETTERS
    public int getNumerador(){
        return numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    
    //METODOS
    public void asignarDatos(int numerador, int denominador){
        this.numerador=numerador;
        if (denominador == 0){// el denominador no puede ser cero
            this.denominador = 1;
        }else{
            this.denominador = denominador;
        }
        
    }
    public void visualizarRacional(){
        System.out.println(this.numerador + "/" + this.denominador);
    }

    
}