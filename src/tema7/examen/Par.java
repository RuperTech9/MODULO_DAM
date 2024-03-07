package tema7.examen;


import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
class NumeroNoNegativoException extends Exception {
    public NumeroNoNegativoException(String message){
        super(message);
    }
}

class NumeroNoPositivoException extends Exception {
    public NumeroNoPositivoException(String message){
        super(message);
    }
}

class Par {
    private int negativo;
    private int positivo;
    
    public Par(int negativo, int positivo) throws NumeroNoNegativoException, NumeroNoPositivoException{
        if (negativo >=0) throw new NumeroNoNegativoException("El numero debe ser negativo");
        if (positivo <=0) throw new NumeroNoPositivoException("El numero debe ser positivo");
        this.negativo = negativo;
        this.positivo=positivo;
    }
    
    public int sumar(){
        return negativo + positivo;
    }    
    
    class SumaDeNumerosNegativos{
        Par [] pares = new Par [5];
        Scanner sc = new Scanner(System.in);
        
        public void introducirValores(){
            int negativo, positivo;
            for(int i=0; i<pares.length;i++){
                try{
                    System.out.println("Introduce un número negativo");
                    negativo = sc.nextInt();
                    System.out.println("Introduce un número positivo");
                    positivo = sc.nextInt();
                    pares[i] = new Par(negativo, positivo);
                    i++;
                }catch ( InputMismatchException e){
                    System.out.println("Por favor introduce un número");  
                    sc.next();
                }catch ( NumeroNoNegativoException |  NumeroNoPositivoException e){
                    System.out.println(e.getMessage());
                }
            }            
        }
        
        public double calcularMedia(){
            int suma = 0;
            for(Par par:pares){
                suma += par.sumar();
            }
            return (double) suma / pares.length;
        }
        
        public double calcularSuma(){
            int suma = 0;
            for(Par par:pares){
                suma += par.sumar();
            }
            return suma;
        }
        
        public void mostrarArrayOrdenado(){
            Arrays.sort(pares, new Comparator<Par>(){
                
                @Override
                public int compare(Par p1, Par p2){
                    return Integer.compare(p1.sumar(), p2.sumar());
                }
            });
            for (Par par:pares){
                System.out.println("(" + par.negativo + ", "+ par.positivo+ ")");
            }
        }
        public static void main(String[] args){
            SumaDeNumerosNegativos programa = new SumaDeNumerosNegativos();
            Scanner sc = new Scanner(System.in);
            int opcion = 0;
            do{
                System.out.println("1- Introducir valores Array");
                System.out.println("2- Calcular la media");
                System.out.println("3- Calcular la suma");
                System.out.println("4- Mostrar el Array ordenado de menor a mayor");
                System.out.println("5- Salir");
                System.out.println(" Introduce una opción");
            
                try{
                    opcion = sc.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Por favor introduce un numero entre 1 y 5");
                    sc.next();
                    continue;
                }
                switch (opcion){
                    case 1:
                        programa.introducirValores();
                        break;
                    case 2:
                        System.out.println("La media es: "+ programa.calcularMedia());
                        break;
                    case 3:
                        System.out.println("La suma es: "+ programa.calcularSuma());
                    break;
                case 4:
                    programa.mostrarArrayOrdenado();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no valida");
                }
            }while (opcion !=5);
        }
    }
}