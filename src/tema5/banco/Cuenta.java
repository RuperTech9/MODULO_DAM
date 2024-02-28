
package tema5.banco;

/**
 *
 * @author Ruper
 */
public class Cuenta {
         //Atributos
         private String nombre;
         private String cuenta;
         private double saldo;
         private double tipoDeInteres;
         
         //Constructores
         public Cuenta(){}

         //A�adimos throws exception en el constructor
         public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception {
                  asignarNombre(nombre);
                  asignarCuenta(cuenta);
                  ingreso(saldo);
                  asignarTipoInteres(tipoDeInteres);
         }//Fin Constructor
         
         //Metodos propios 
         public void asignarNombre(String nombre) throws Exception{ 
                  //Aplicamos una excepcion para cuando el nombre este vacio
                  if(nombre.length()==0){
                           throw new Exception("Error: cadena vacia");
                  }
                  this.nombre = nombre;
         }
         
         public String obtenerNombre(){
                  return nombre;
         }

         public void asignarCuenta(String cuenta) throws Exception{
                  //Aplicamos una excepcion para cuando el nombre este vacio
                  if(cuenta.length()==0){
                           throw new Exception("Error: cuenta no v�lida");
                  }
                  this.cuenta = cuenta;
         }
         
         
         public String obtenerCuenta() {
                  return cuenta;
         }
         
         public double estado(){
                  return saldo;
         }
         
         public void ingreso(double cantidad) throws Exception{
                  if(cantidad<=0){
                           throw new Exception ("Cantidad negativa o cero");
                  }
                  saldo += cantidad;
         }
         
         public void reintegro(double cantidad) throws Exception{
                  if(saldo-cantidad < 0){
                           throw new Exception ("No dispone de saldo");
                  }
                  saldo -= cantidad;
         }
         
         public void asignarTipoInteres(double tipo) throws Exception{
                  if(tipo<0){
                           throw new Exception ("No puede ser interes negativo");
                  }
                  this.tipoDeInteres = tipo;
         }
         
         public double obtenerTipoInteres(){
                  return tipoDeInteres;
         }
         
         @Override
         public String toString(){
                  return "Informacion de la cuenta: \n"+"Titular: "+obtenerNombre()+"\nNumero Cuenta: "+obtenerCuenta()+"\nInteres: "+obtenerTipoInteres()+"Saldo: "+estado();
         }
         
}
