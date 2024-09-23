package TEMA12_GestionBBDDRelacionales.ejemplos;


import java.sql.*;


/**
 *
 * @author alumno
 */
public class BBDD_Profesor {
    public static void main(String[] args) {
        //Datos conexion a MYSQL    Conexión segura con SSL
        String url = "jdbc:mysql://192.168.80.110:3306/TIENDA?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
        String user = "juan";
        String password = "Juan.1234";
        
        try{
        //1º: Crear conexión
            Connection miConexion = DriverManager.getConnection(url, user, password);
            if(miConexion!=null){
                System.out.println("Conexion establecida!");
            }//Fin if
            
        //2º: Crear objeto Statment
            Statement miStatement = miConexion.createStatement();
                 
        //3ºPaso: Ejecutar SQL
            String consulta1 = "SELECT * FROM cliente";
            //Guardo el resultado de la consulta
            ResultSet miResultSet = miStatement.executeQuery(consulta1);
                           
            
        //4ºPaso: Recorrer el ResultSet para ver los resultados
            System.out.println("\nDATOS TABLA PROFESOR:");
            while(miResultSet.next()){
                System.out.println(
                        miResultSet.getInt("c_cliente") + " " + 
                        miResultSet.getString("nombre")+ " " + 
                        miResultSet.getDouble("deuda")+ " " + 
                        miResultSet.getInt("telefono")+ " " + 
                        miResultSet.getDate("fecha_a"));
            }
        }catch(SQLException e1){
            System.out.println("Error: "+e1.getMessage());
        }           
    }//Fin main        
}//Fin class