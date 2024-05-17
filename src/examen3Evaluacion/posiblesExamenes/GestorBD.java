
package examen3Evaluacion.posiblesExamenes;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class GestorBD {
    private static final String URL = "jdbc:sqlite:estudiantes.db";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL)) {
            if (conn != null) {
                crearTabla(conn);
                insertarRegistros(conn);
                mostrarRegistros(conn);
                actualizarEdad(conn);
                eliminarEstudiante(conn);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void crearTabla(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS Estudiantes ("
                + "ID INTEGER PRIMARY KEY,"
                + "Nombre TEXT NOT NULL,"
                + "Edad INTEGER NOT NULL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void insertarRegistros(Connection conn) {
        String sql = "INSERT INTO Estudiantes (Nombre, Edad) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "Juan");
            pstmt.setInt(2, 20);
            pstmt.executeUpdate();
            pstmt.setString(1, "Ana");
            pstmt.setInt(2, 22);
            pstmt.executeUpdate();
            pstmt.setString(1, "Luis");
            pstmt.setInt(2, 21);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mostrarRegistros(Connection conn) {
        String sql = "SELECT * FROM Estudiantes";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("ID") + "\t" +
                        rs.getString("Nombre") + "\t" +
                        rs.getInt("Edad"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void actualizarEdad(Connection conn) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del estudiante a actualizar: ");
        int id = scanner.nextInt();
        System.out.print("Introduce la nueva edad: ");
        int edad = scanner.nextInt();

        String sql = "UPDATE Estudiantes SET Edad = ? WHERE ID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, edad);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Edad actualizada correctamente.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void eliminarEstudiante(Connection conn) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del estudiante a eliminar: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM Estudiantes WHERE ID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Estudiante eliminado correctamente.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}