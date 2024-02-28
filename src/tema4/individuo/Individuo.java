
package tema4.individuo;

/**
 * Calcular la población cada vez que se añade un individuo
 * añadir altura y calcular edad con el año actual
 * añade un cm a la altura
 * @author alumno
 */
public class Individuo {
    private String dni, nombre;
    private Fecha fechaNacimiento;
    private static int poblacion;
    private static int añoActual = 2024;
    private int edad;
    private double altura;
    

//CONSTRUCTOR VACIO
    public Individuo(){
        this.fechaNacimiento = new Fecha(); //Inicializo con un objeto fecha por defecto
    }
    //CONSTRUCTOR 1
    public Individuo (String dni, String nombre, Fecha fechaNacimiento){
        super(); //Primera linea del metodo constructor que invoque a la clase superior que comparta el mismo tipo de parametrización
        this.dni=dni;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.edad = añoActual - fechaNacimiento.getAño();
        poblacion++;//Se asume que partira de valor 0
    }
    //CONSTRUCTOR 2
    public Individuo (String dni, String nombre, Fecha fechaNacimiento, double altura){  
        this.dni=dni;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.altura=altura;
        this.edad = añoActual - fechaNacimiento.getAño();
        poblacion++;
    }


    //SETTERS
    public void setDni(String dni){
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
        this.edad = añoActual - fechaNacimiento.getAño();
    }
    public static void setPoblacion(int poblacion){ //Creamos con static
        Individuo.poblacion=poblacion; // no ponemos this, ponemos Individuo (el objeto)
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }    
    //GETTERS
    public String getDNI(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public Fecha getFechaNacimiento(){
        return fechaNacimiento;
    }
    public static int getPoblacion(){
        return poblacion;
    }
    public double getAltura(){
        return altura;
    }
    public int getEdad(){
        return edad;
    }
    public static int getAñoActual() {
        return añoActual;
    }
    //Metodos que no devuelven ningún valor por eso no son SET ni GET
    public void incrementarAltura(){
        altura = altura + 0.01;
    }
    public void saludar(){
        System.out.println("Hola mi nombre es "+nombre);
        System.out.println("Encantado de saludarte. Tengo "+edad+" años y mido "+altura+" metros");
    }
    
}//FIN CLASE
