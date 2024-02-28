
package tema2.ejemplos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class A06_DiasDelMesAnio {
    public static void main(String[] args) {
        int anho, mes;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese un año: ");
        anho = sc.nextInt();
        System.out.printf("Ingrese un mes: ");
        mes = sc.nextInt();
        
        if (mes == 1) {
            System.out.println("Enero, tiene 31 días.");
	}
            if (mes == 2 && ((anho % 4 == 0 && anho % 100 != 0) || anho % 400 == 0)){
		System.out.println("Febrero, tiene 29 días.");
            }
		if (mes == 2 && ((anho % 4 != 0 || anho % 100 == 0) && anho % 400 != 0)){
                    System.out.println("Febrero, tiene 28 días.");
		}
                    if (mes == 3){
			System.out.println("Marzo, tiene 31 días.");
                    }
			if (mes == 4){
                            System.out.println("Abril, tiene 30 días..");
                        }
                            if (mes == 5){
				System.out.println("Mayo, tiene 31 días.");
                            }
				if (mes == 6){
                                    System.out.println("Junio, tiene 30 días.");
				}
                                    if (mes == 7){
					System.out.println("Julio, tiene 31 días.");
                                    }
					if (mes == 8){
                                            System.out.println("Agosto, tiene 31 días.");
					}
                                            if (mes == 9){
						System.out.println("Septiembre, tiene 30 días.");
                                            }
						if (mes == 10){
                                                    System.out.println("Octubre, tiene 31 días.");
						}
                                                    if (mes == 11){
							System.out.println("Noviembre, tiene 30 días.");
                                                    }
							if (mes == 12){
                                                            System.out.println("Diciembre, tiene 31 días.");
							}				
    }
}
    

