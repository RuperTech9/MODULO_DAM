
package tema10.ejemplosArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Con arrayList
 * Listado de alumnos de DAM, del 1 al 30.
 * Con un menú para añadir alumno, borrar alumno, ver alumnos y salir.
 * 
 * @author david
 */
public class ListadoDAM_V5 {
          
    public static void main(String[] args) {
        ArrayList<String[]> alumnosDAM = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        // Inicialización con los nombres y apellidos proporcionados
        String[][] nombresApellidos = {
            {"Jorge", "González Fernández"}, {"Pablo", "Rodríguez Delgado"}, {"Ayoub", "Tachafine El Filali"},
            {"Eduardo", "Jiménez Linares"}, {"Marina Islandia", "Fernández Fuertes"}, {"Laura", "Moreno Navarro"},
            {"Alejandro Eleazar", "de los Ríos Rivas"}, {"Lucía", "Tapia García"}, {"Marcos", "Tapia García"},
            {"Álvaro", "Moreno Lumbreras"}, {"Alejandro", "Rupérez López"}, {"David", "Martín Pulgar"},
            {"Yassin Darrazi", "El Ouahabi"}, {"Marcos", "Romero Herrero"}, {"David", "Merchán Muñóz"},
            {"Pedro", "Jiménez Carrasco"}, {"Borja", "Ticona Manrique"}, {"Bryan", "Paucar Alvarado"},
            {"Germán", "Escudero Rodríguez"}, {"Francesco", "Fevoli Chacón"}, {"Manuel", "Parra Llansó"},
            {"Daniel Benjamín", "Bascopé Alarcón"}, {"Daniel", "López López"}, {"Chad", "Arzaga Flores"},
            {"Bilal Ben", "Moussa Chargui"}, {"Sergio", "Abril Muñóz"}, {"Bruno", "Linares Freire"},
            {"Imad El Makhloufi", "Ben Ali"}, {"Marcos Antonio", "Rodríguez Villaverde"},
            {"Jose Antonio", "Moreno Núñez"}
        };

        // Con un bucle for vamos añadiendo los alumnos
        for (String[] alumnos : nombresApellidos) {
            alumnosDAM.add(alumnos);
        }// Fin for

        boolean salir = false;

        do {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Borrar alumno");
            System.out.println("3. Ver listado de alumnos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                int opcion = teclado.nextInt();
                teclado.nextLine(); 
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del nuevo alumno: ");
                        String nombreNuevo = teclado.nextLine();
                        System.out.print("Ingrese el apellido del nuevo alumno: ");
                        String apellidoNuevo = teclado.nextLine();

                        String[] nuevoAlumno = {nombreNuevo, apellidoNuevo};
                        alumnosDAM.add(nuevoAlumno);
                        System.out.println("Alumno añadido correctamente.");
                        break;
                    case 2:
                        System.out.print("Ingrese el nombre del alumno a borrar: ");
                        String nombreBorrar = teclado.nextLine();
                        System.out.print("Ingrese el apellido del alumno a borrar: ");
                        String apellidoBorrar = teclado.nextLine();

                        boolean alumnoEncontrado = false;
                        for (int i = 0; i < alumnosDAM.size(); i++) {
                            if (alumnosDAM.get(i)[0].equals(nombreBorrar) && alumnosDAM.get(i)[1].equals(apellidoBorrar)) {
                                alumnosDAM.remove(i);
                                alumnoEncontrado = true;
                                System.out.println("Se ha borrado el alumno.");
                                break;
                            }//Fin if
                        }//Fin for
                        if (!alumnoEncontrado) {
                            System.out.println("No se encontró el alumno.");
                        }//Fin if
                        break;
                    case 3:
                        // Ordenar la lista de alumnos por apellido
                        Collections.sort(alumnosDAM, new Comparator<String[]>() {
                            @Override
                            public int compare(String[] alumno1, String[] alumno2) {
                                return alumno1[1].compareTo(alumno2[1]);
                            }
                        });//Fin ordenar la Lista

                        // Imprimir la lista de alumnos ordenada
                        System.out.println("\nListado de alumnos de DAM (ordenado por apellido):");
                        for (int i = 0; i < alumnosDAM.size(); i++) {
                            String[] alumno = alumnosDAM.get(i);
                            System.out.println((i + 1) + ". " + alumno[0] + " " + alumno[1]);
                        }//Fin for
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Saliendo...");
                        break;
                    default:
                        //Creamos la excepción 
                        throw new IllegalArgumentException("Opción no válida. Debe ser una opción disponible.");
                }//Fin switch
            } catch (InputMismatchException e1) {
                System.err.println("ERROR: Debe introducir un número.");
                teclado.nextLine(); 
            } catch(IllegalArgumentException e2) {  //Excepcion del default
                System.err.println("ERROR: "+e2.getMessage());
            } catch (Exception e3) {
                System.err.println("ERROR: " + e3.toString());
                teclado.nextLine();
            }//Fin try-catch

        } while (!salir); //Fin do-while

        teclado.close();
    }//Fin main
}//Fin clas 
