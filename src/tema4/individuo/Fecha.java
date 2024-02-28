
package tema4.individuo;

/**
 *
 * @author alumno
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    //CONSTRUCTORES
    public Fecha(){}
    
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    //SETTERS
    public void setDia(int dia){
        this.dia=dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAño(int año){
        this.año=año;
    }
    // GETTERS
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
    
    //METODOS
    public boolean fechaCorrecta(){
         boolean diaCorrecto, mesCorrecto, añoCorrecto;
         añoCorrecto = año > 0;
         mesCorrecto = mes >= 1 && mes <=12;
         
         switch(mes){
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            case 6:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            case 9:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:// Para todos los otros meses
            diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
    
    public boolean esBisiesto(){
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    
    public void diaSiguiente(){
        dia++;
        // Si el día pasa del máximo del mes actual, resetear a 1 y aumentar el mes
        if(!fechaCorrecta()){
            dia = 1;
            mes++;
            if(!fechaCorrecta()){    
                mes = 1;
                año++;
            }
        } 
    }
    // metodo para mostrar la fecha
    @Override
    public String toString() {// Para mostrar Array
        StringBuilder fespañol = new StringBuilder(); // StringBuilder con override aunque String valdría.
        if(dia<10){
            fespañol.append("0");
        }
        fespañol.append(dia);
        fespañol.append("-");
        if(mes<10){
            fespañol.append("0");
        }
        fespañol.append(mes);
        fespañol.append("-");
        fespañol.append(año);
            
            
        return fespañol.toString();
    }// FIn metodo
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Fecha nueva = new Fecha(this.dia,this.mes,this.año);
        return (Object)nueva;
    }
}