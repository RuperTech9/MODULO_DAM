
package tema4.pajaro;

/**
 *
 * @author alumno
 */
public class PajaroMAIN {
    public static void main(String [] args){
        Pajaro aguila = new Pajaro("Real",50,50);
        Pajaro loro = new Pajaro("Azul",10,10);
        double distancia = aguila.volar(10,10);
        
        loro = null;
        System.gc();
        
        
        System.out.println("El desplazamiento del aguila "+aguila.getNombre()+" ha sido "+distancia);
        
        Pajaro paloma = new Pajaro();
        paloma.setNombre("Helen");
        paloma.setposX(5);
        paloma.setposY(1);
        
        
        double distancia2 = aguila.volar(paloma.getPosX(),paloma.getPosY());
        System.out.println("El desplazamiento del aguila "+aguila.getNombre()+" para cazar a la paloma ha sido "+distancia2);
        
    }
}
