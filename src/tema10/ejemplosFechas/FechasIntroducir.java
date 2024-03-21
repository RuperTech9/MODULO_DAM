/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10.ejemplosFechas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class FechasIntroducir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar hoy = Calendar.getInstance();
        
        // Solicitar y verificar la fecha actual ingresada por el usuario
        System.out.println("Ingrese la fecha actual en el formato YYYY-MM-DD:");
        String fechaActualString = sc.nextLine();
        try {
            LocalDate fechaActual = LocalDate.parse(fechaActualString);
            System.out.println("Fecha actual ingresada: " + fechaActual);
            if (fechaActual.isEqual(LocalDate.now())) {
                System.out.println("La fecha actual es correcta.");
            } else {
                System.out.println("La fecha actual no es correcta.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("La fecha actual ingresada no es válida.");
        }
        
        // Solicitar y verificar la fecha de nacimiento ingresada por el usuario
        System.out.println("\nIngrese su fecha de nacimiento en el formato YYYY-MM-DD:");
        String fechaNacimientoString = sc.nextLine();
        try {
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);
            System.out.println("Fecha de nacimiento ingresada: " + fechaNacimiento);
            System.out.println("Formato Java.Time: " + fechaNacimiento);
        } catch (DateTimeParseException e) {
            System.out.println("La fecha de nacimiento ingresada no es válida.");
        }
    }
}