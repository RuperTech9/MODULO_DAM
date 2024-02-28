
package tema3.ejemplos;

import java.util.Scanner;

/**
 * Crear un array con los nombres de tres alumnos de clase, y además, se guardarán sus notas del examen de programación. 
 * La nota será un valor entre 0 y 10 con dos posiciones decimales introducidos por teclado. 
 * El programa mostrará las notas de cada alumno redondeadas, y además indicará:
 * Media de clase.
 * Nº de alumnos suspensos
 * Nº de aprobados
 * El alumno con mayor nota
 * 
 * @author Ruper
 */
public class A06_NotasRedondeadas {
    public static void main(String args [] ){
        Scanner teclado = new Scanner(System.in);
        String [] alumnos = new String[3];
        double [] notas = new double[3];
        double [] notasRedondeadas = new double[3];  
        
        for(int i = 0; i<3; i++){
            System.out.println("Introduzca el nombre del alumno "+(i+1));
            alumnos[i] = teclado.nextLine();
            
            do {
                System.out.println("Introduzca la nota de " + alumnos[i] + " (entre 0 y 10):");
                notas[i] = teclado.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);

            teclado.nextLine();
            
            notasRedondeadas[i] = redondearNota(notas[i]);
        }
        System.out.println("");
        mostrarRedondeo(alumnos, notasRedondeadas);
        System.out.printf("\nMedia de clase: %.2f\n", mediaClase(notasRedondeadas));
        System.out.println("Número de alumnos suspensos: " + contarSuspensos(notasRedondeadas));
        System.out.println("Número de aprobados: " + contarAprobados(notasRedondeadas));
        mayorNota(alumnos, notasRedondeadas);
        
    }//FIN MAIN
    
    public static void mostrarRedondeo(String[] alumnos, double[] notasRedondeadas) {
        for (int i = 0; i < 3; i++) {
            System.out.println(alumnos[i] + ": " + (int) notasRedondeadas[i]);
        }
    } 
    
    public static double redondearNota(double nota){
        if (nota >= 4 && nota< 5) {
                return 4;
            } else {
                return Math.round(nota); // Redondeo matemático estándar.
        }
    }

    public static double mediaClase (double notasRedondeadas[]){
        double suma = 0;
        for(int i = 0; i<notasRedondeadas.length; i++){
            suma += notasRedondeadas[i];
        }
        return suma/notasRedondeadas.length;
    }
    
    public static int contarSuspensos (double notasRedondeadas[]){
        int suspensos = 0;
        for(int i = 0; i<notasRedondeadas.length; i++){
            if(notasRedondeadas[i]<5){
                suspensos++;
            }
        }
        return suspensos;
    }
    
    public static int contarAprobados (double notasRedondeadas[]){
        int aprobados = 0;
        for(int i = 0; i<notasRedondeadas.length; i++){
            if(notasRedondeadas[i]>=5){
                aprobados++;
            }
        }
        return aprobados;
    }
    
    public static void mayorNota(String[] alumnos, double[] notasRedondeadas) {
    double maxNota = 0;
    String alumnoConMaxNota = "";
        for (int i = 0; i < notasRedondeadas.length; i++) {
            if (notasRedondeadas[i] > maxNota) {//compara la nota actual (notasRedondeadas[i]) con la nota más alta encontrada hasta el momento (maxNota)
                maxNota = notasRedondeadas[i];//Si la nota actual es mayor que maxNota, se actualiza maxNota con el valor de esta nota
                alumnoConMaxNota = alumnos[i];//alumnoConMaxNota con el nombre del alumno correspondiente (alumnos[i]).
                
            }
        }
        System.out.println("Alumno con mayor nota: " + alumnoConMaxNota + " - " + maxNota);
    }
    
}
