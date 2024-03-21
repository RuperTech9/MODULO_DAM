
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Ruper
 */
public class Alumno_V2_Listado {
    public static void main(String[] args) {
        // Creo el ArrayList con el tipo de dato objeto Alumnos
        ArrayList<Alumno_V2> alumnoDAM = new ArrayList<>();
        
        // Añado alumnos
        Alumno_V2 alumno1 = new Alumno_V2("Juan","Torres",1);
        alumnoDAM.add(alumno1); //Lo añadimos al ArrayList
                  
        Alumno_V2 alumno2 = new Alumno_V2("Sara", "Gonzalez", 2);
        alumnoDAM.add(alumno2); //Lo añadimos al ArrayList
                  
        Alumno_V2 alumno3 = new Alumno_V2("Elena","Esteban",3);
        alumnoDAM.add(alumno3); //Lo añadimos al ArrayList
                 
        Alumno_V2 alumno4 = new Alumno_V2("Pepe", "Blanco", 4);
        alumnoDAM.add(alumno4); //Lo añadimos al ArrayList
                  
        Alumno_V2 alumno5 = new Alumno_V2("Miguel", "Perez", 5);
        alumnoDAM.add(alumno5); //Lo añadimos al ArrayList
                  
        // Imprimir elementos, uso un ITERATOR
        // Cuantos alumnos hay con .size()
        System.out.println("Alumnos de 1º de DAM: "+alumnoDAM.size());
                  
        //Declaramos el ITERATOR
        Iterator<Alumno_V2> itAlumnos = alumnoDAM.iterator();
        System.out.println("numero   "+"nombre              "+"apellidos");
        System.out.println("------------------------------------------------------------------------------------");
        //Recorremos el ITERATOR con un while
        while(itAlumnos.hasNext()){ // Comprueba si quedan elementos en el ITERATOR
            Alumno_V2 alumnosTemp = itAlumnos.next();  // Se declara el objeto del ArrayList para ir asignando valores
            System.out.println(alumnosTemp.getNumero()+"         "+alumnosTemp.getNombre()+"              "+alumnosTemp.getApellidos());
        }//Fin while
                

        //Cuando tenemos objetos .sort no funciona, para ello aparte de un comparador sobreescribir un metodo en el cual le voy a indicar que campo comparar
        // metodo compare()
        // Ordenar utilizando Collections.sort() con Comparator
        Collections.sort(alumnoDAM, new Comparator<Alumno_V2>(){
            @Override
            public int compare(Alumno_V2 a1, Alumno_V2 a2){
                return a1.getNombre().compareTo(a2.getNombre());
            }// FIN COMPARE
        } // FIN ITERATOR
        );
                
        // Lista ordenada por Nombres
        System.out.println("Nombres Alumnos de 1º de DAM: " + alumnoDAM.size());
        itAlumnos = alumnoDAM.iterator();
        System.out.println("numero   "+"nombre              "+"apellidos");
        System.out.println("------------------------------------------------------------------------------------");
        //Recorremos el ITERATOR con un while
        while(itAlumnos.hasNext()){ // Comprueba si quedan elementos en el ITERATOR
            Alumno_V2 alumnosTemp = itAlumnos.next();  // Se declara el objeto del ArrayList para ir asignando valores
            System.out.println(alumnosTemp.getNumero()+"         "+alumnosTemp.getNombre()+"              "+alumnosTemp.getApellidos());
        }//Fin while

        // Lista ordenada por Apellidos
        Collections.sort(alumnoDAM, new Comparator<Alumno_V2>(){
            @Override
            public int compare(Alumno_V2 a1, Alumno_V2 a2){
                return a1.getApellidos().compareTo(a2.getApellidos());
            }// FIN COMPARE
        } // FIN ITERATOR
        );
        // FOREACH PARA IMPRIMIR
        for (Alumno_V2 alumnoTemp : alumnoDAM) {
            System.out.print(alumnoTemp.getApellidos()+ ", ");
            System.out.print(alumnoTemp.getNombre()+ ".\n");
            // añadir el numero con i  
        }        
    }//Fin main     
}//Fin class