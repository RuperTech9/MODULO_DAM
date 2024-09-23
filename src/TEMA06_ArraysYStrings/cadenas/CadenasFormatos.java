package TEMA06_ArraysYStrings.cadenas;

/**
 *
 * @author david
 */
public class CadenasFormatos {
          
          public static void main(String []args ){
                    
                  System.out.println(String.format ("%5d", 10));

                  //Cadena con varios especificadores de formato
                    String np = "Lavadora";
                    int u = 10;
                    float ppu = 302.4f;
                    float p = u * ppu;
                    String output = String.format("Producto: %s; Unidades: %d; Precio por unidad: %.2f ?; "
                            + "Total: % .2f ? ", np, u, ppu, p);
                    System.out.println(output);
                    
                    ///////////////
                    int i = 10;
                    int j = 20;
                    String d = String.format("%1$d multiplicado por %2$d (%1$dx%2$d) es %3$d",i,j,i*j);
                    System.out.println(d);

                    
          }
          
}
