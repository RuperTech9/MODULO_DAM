
package tema5.banco;

/**
 *
 * @author Ruper
 */
public class CuentaMAIN {
    //A�adimos THROWS EXCEPTION 
    public static void main(String[] args) throws Exception {
        Cuenta cuenta01 = new Cuenta();
        Cuenta cuenta02 = new Cuenta("Sara Gonzalez", "ES5521000555555555555",900, 3);
                  
        cuenta01.asignarNombre("Juan Gomez");
        cuenta01.asignarCuenta("ES55210000333333333333");
        cuenta01.asignarTipoInteres(3.5);
        cuenta01.ingreso(3000);
                  
        System.out.println("Cuenta01 saldo: "+cuenta01.estado());
        System.out.println("Cuenta02 saldo: " + cuenta02.estado());

                  
        //Comprobamos que salta la Excepcion
        cuenta01.reintegro(2500);
        System.out.println("Cuenta01 saldo: "+cuenta01.estado());
        cuenta01.reintegro(250); //Cambiamos a 600 para que de error (el saldo insuficiente)
        System.out.println("Cuenta01 saldo: " + cuenta01.estado());
                  
        //con @Override
        System.out.println("--------------------");
        System.out.println(cuenta01.toString());
                  
    }
}