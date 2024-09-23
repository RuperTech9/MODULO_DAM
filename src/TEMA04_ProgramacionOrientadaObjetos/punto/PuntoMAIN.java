
package TEMA04_ProgramacionOrientadaObjetos.punto;

/**
 *
 * @author alumno
 */
public class PuntoMAIN {
    public static void main(String[] args){
        Punto punto1, punto2=new Punto()/*punto2 = Null*/, punto3 = new Punto();
        Punto punto4 = new Punto(3,4);
        punto1 = punto4;
        punto2.setX(1);
        punto2.setY(3);
        
        //Obtener valores del objeto
        int valorX, valorY;
        valorX = punto4.getX();
        valorY = punto4.getY();
        
        //Aplicar metodos propios
        double moduloP4 = punto4.modulo();
        double faseP4 = punto4.fase();
        
        System.out.println("Punto 4: valor de x "+valorX+" valor de y "+valorY);
        System.out.println("Modulo: "+moduloP4);
        System.out.println("Fase: "+punto4.fase());
        
        
        
    }
}
