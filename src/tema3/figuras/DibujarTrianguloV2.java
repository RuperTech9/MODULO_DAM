/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.figuras;

/**
 *
 * @author alumno
 */
public class DibujarTrianguloV2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 10; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println("");
            
        }
        for(int i = 0; i <= 10; i++){
        System.out.print(" *");
        }
        System.out.println("");
        
        for(int i = 10; i >0; i--){
            for(int j = 10; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }    
    }  
}
