
package tema12.tarea;

/**
 *
 * @author Ruper
 */
public class TestEmpleados {
    public static void main(String[] args){
        // Objeto EmpleadosEmpresaV0
        EmpleadosEmpresa empresa = new EmpleadosEmpresa();
        empresa.cargarEmpleadosDB();
        empresa.mostrarMenu();
    } // FIN MAIN
}
