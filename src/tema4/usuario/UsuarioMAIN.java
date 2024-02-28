
package tema4.usuario;

/**
 *
 * @author alumno
 */
public class UsuarioMAIN {
    public static void main(String []args){
        Usuario user1 = new Usuario("","","",0,true);
        
        user1.setNombre("Alex");
        user1.setEmail("alex@gmail.com");
        user1.setCiudad("Madrid");
        user1.setMovil(666555444);
        
        System.out.println(user1.getNombre());
        System.out.println(user1.getEmail());
        System.out.println(user1.getCiudad());
        System.out.println(user1.getMovil());
        
        if(user1.getMayorEdad()){
            System.out.println(user1.getNombre()+" es mayor de edad");
        }else{
            System.out.println(user1.getNombre()+" es menor de edad");
        }
    } 
}
