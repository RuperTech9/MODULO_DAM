
package TEMA04_ProgramacionOrientadaObjetos.individuo;

import javax.swing.JOptionPane;

/**
 * 
 * @author alumno
 */
public class IndividuoMAIN {
    public static void main(String[] args){
        // Creación de fechas de nacimiento
        Fecha fechaNacimiento1 = new Fecha(1, 1, 1989);
        Fecha fechaNacimiento2 = new Fecha(12, 5, 1995);
        Fecha fechaNacimiento3 = new Fecha(23, 7, 1999);
        Fecha fechaNacimiento4 = new Fecha(15, 3, 2000);
        Fecha fechaNacimiento5 = new Fecha(6, 10, 2003);
        
        //Creación de individuos
        Individuo individuo1 = new Individuo(JOptionPane.showInputDialog("Introduce el dni del usuario"),JOptionPane.showInputDialog("Introduce el nombre del usuario"),fechaNacimiento1);
        Individuo individuo2 = new Individuo("475223344W","David",fechaNacimiento2);
        Individuo individuo3 = new Individuo("475223344W","Yassin",fechaNacimiento3);
        Individuo individuo4 = new Individuo("475223344W","Marcos",fechaNacimiento4);
        
        //Individuo con el metodo constructor
        Individuo individuo5 = new Individuo("47539048W", "Manuel",fechaNacimiento5,1.90);
        
        //Calcular la poblacion con el getPoblacion. no hace falta inicializar a 0
        System.out.println("Poblacion actual: "+Individuo.getPoblacion()+" personas");
        
        //Añadimos la altura con set
        individuo1.setAltura(1.93);
        
        //Edad
        individuo1.setEdad(Individuo.getAñoActual() - fechaNacimiento1.getAño());// he agregado un método estático getAñoActual() a la clase Individuo, que necesitarás para calcular la edad correctamente, ya que añoActual es un atributo estático:
        //Dia Siguiente
        fechaNacimiento1.diaSiguiente();
        System.out.println("El día siguiente es: " + fechaNacimiento1.getDia() + "/" + fechaNacimiento1.getMes() + "/" + fechaNacimiento1.getAño());
        
        //Metodo saludar al individuo
        individuo1.saludar();
        individuo5.saludar();
        
        //Metodo subir altura
        individuo5.incrementarAltura();
        individuo5.incrementarAltura();
        System.out.println("He crecido. Mi nueva altura es: "+individuo5.getAltura()+" metros");
        
        
        //EMPLEADOS
        System.out.println("------------------");
        Empleado Alejandro = new Empleado();
        Alejandro.setNombre("Alex");
        Alejandro.setSueldo(40000);
        Empleado Lucia = new Empleado();
        Lucia.mostrarDatos();
        
        Alejandro.subirSueldo(3.1);
        System.out.println("El nuevo sueldo de "+Alejandro.getNombre()+" es: "+Alejandro.getSueldo());
    }
    
}

