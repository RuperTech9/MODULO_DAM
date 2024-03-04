package examen2Evaluacion;

import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class NumeroNoNegativoException extends Exception {
    public NumeroNoNegativoException(String message) {
        super(message);
    }
}

class NumeroNoPositivoException extends Exception {
    public NumeroNoPositivoException(String message) {
        super(message);
    }
}

class Par {
    int negativo;
    int positivo;

    public Par(int negativo, int positivo) throws NumeroNoNegativoException, NumeroNoPositivoException {
        if (negativo >= 0) {
            throw new NumeroNoNegativoException("El número debe ser negativo.");
        }
        if (positivo <= 0) {
            throw new NumeroNoPositivoException("El número debe ser positivo.");
        }
        this.negativo = negativo;
        this.positivo = positivo;
    }
    
    public int sumar() {
        return negativo + positivo;
    }
}

class SumaDeNumerosNegativos {
    Par[] pares = new Par[5];
    Scanner scanner = new Scanner(System.in);
    boolean valoresIntroducidos = false;

    public void introducirValores() {
        int negativo, positivo;
        for (int i = 0; i < pares.length; ) {
            try {
                System.out.print("Introduce un número negativo: ");
                negativo = scanner.nextInt();
                System.out.print("Introduce un número positivo: ");
                positivo = scanner.nextInt();
                pares[i] = new Par(negativo, positivo);
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next(); // Descartar entrada incorrecta
            } catch (NumeroNoNegativoException | NumeroNoPositivoException e) {
                System.out.println(e.getMessage());
            }
        }
        valoresIntroducidos = true;
    }
    
    public double calcularMedia() {
        if (!valoresIntroducidos) {
            System.out.println("Primero debes introducir los valores.");
            return 0; // Return 0 if values are not introduced yet
        }
        int sum = 0;
        for (Par par : pares) {
            sum += par.sumar();
        }
        return (double) sum / pares.length;
    }

    public int calcularSuma() {
        if (!valoresIntroducidos) {
            System.out.println("Primero debes introducir los valores.");
            return 0; // Return 0 if values are not introduced yet
        }
        int sum = 0;
        for (Par par : pares) {
            sum += par.sumar();
        }
        return sum;
    }

    public void mostrarArrayOrdenado() {
        if (!valoresIntroducidos) {
            System.out.println("Primero debes introducir los valores.");
            return; // Do not proceed if values are not introduced yet
        }
        Arrays.sort(pares, new Comparator<Par>() {
            @Override
            public int compare(Par p1, Par p2) {
                return Integer.compare(p1.sumar(), p2.sumar());
            }
        });
        for (Par par : pares) {
            System.out.println("(" + par.negativo + ", " + par.positivo + ")");
        }
    }

    public static void main(String[] args) {
        SumaDeNumerosNegativos programa = new SumaDeNumerosNegativos();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\\n1- Introducir valores Array.");
            System.out.println("2- Calcular la media.");
            System.out.println("3- Calcular la suma.");
            System.out.println("4- Mostrar el Array ordenado de menor a mayor.");
            System.out.println("5- Salir.");
            System.out.print("Elige una opción: ");
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número entre 1 y 5.");
                scanner.next(); // Descartar entrada incorrecta
                continue;
            }
            switch (opcion) {
                case 1:
                    programa.introducirValores();
                    break;
                case 2:
                    System.out.println("La media es: " + programa.calcularMedia());
                    break;
                case 3:
                    System.out.println("La suma es: " + programa.calcularSuma());
                    break;
                case 4:
                    programa.mostrarArrayOrdenado();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce un número entre 1 y 5.");
                    break;
            }
        } while (opcion != 5);
    }
}


/*
La línea de código Arrays.sort(pares, new Comparator<Par>() { inicia una llamada al método sort de la clase Arrays en Java, que se utiliza para ordenar un array.

El método sort puede tomar un array y un Comparator como argumentos. El Comparator es una interfaz que define un método de comparación que sort usará para determinar el orden de los elementos del array.

La creación de new Comparator<Par>() { está creando una clase anónima que implementa la interfaz Comparator para la clase Par. Dentro de las llaves {}, se define el método compare, que es el método que debe implementarse cuando se usa la interfaz Comparator.

El método compare toma dos objetos del tipo especificado (Par en este caso) y devuelve un entero. La devolución de este entero determina cómo se ordenan los dos objetos:

Un número negativo si el primer objeto debe ir antes que el segundo.
Cero si se consideran iguales en términos de orden.
Un número positivo si el primer objeto debe ir después del segundo.
En el contexto de tu código, este Comparator está comparando dos objetos Par basándose en la suma de sus valores negativo y positivo (a través del método sumar() de la clase Par). Esto significa que el array pares se ordenará en función de la suma de los números negativos y positivos de cada objeto Par.
*/