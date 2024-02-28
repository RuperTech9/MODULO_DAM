
package tema5.tarea5;

/**
 *
 * @author alumno
 */
public class Fecha {
    // ATRIBUTOS
    private int dia;
    private int mes;
    private int año;
    
    //CONSTRUCTOR VACIO
    public Fecha(){}
    
    //CONSTRUCTOR CON PARAMETROS
    public Fecha(int dia, int mes, int año) throws Exception {
        if (fechaCorrecta(dia, mes, año)) { // Utiliza un método que valide la fecha antes de asignarla
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        } else {
            throw new Exception("Fecha inválida: " + dia + "-" + mes + "-" + año);
        }
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
    
    //METODO para saber si la fecha es correcta
    public boolean fechaCorrecta(int dia, int mes, int año){
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
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:// Para todos los otros meses
                diaCorrecto = mesCorrecto && (dia >= 1 && dia <= 31);
            break;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }
    
    // METODO para saber si el año es bisiesto
    public boolean esBisiesto(){
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    
    // METODO que aumenta un dia la fecha
    public void diaSiguiente(){
        dia++;
        // Si el día pasa del máximo del mes actual, resetear a 1 y aumentar el mes
        if(!fechaCorrecta(dia,mes,año)){
            dia = 1;
            mes++;
            if(!fechaCorrecta(dia,mes,año)){    
                mes = 1;
                año++;
            }
        } 
    }
    // METODO para mostrar la fecha
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
}