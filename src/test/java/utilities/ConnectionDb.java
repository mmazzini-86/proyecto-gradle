package utilities;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDb {


    public static String connection = "jdbc:mysql://127.0.0.1/clientes";
    public static String user = "root";
    public static String pass = "";
    public static Connection conn = null;



    public static void conectar () throws SQLException {
        conn = DriverManager.getConnection(connection, user, pass);
        System.out.println("Conexion OK");
    }
    public static void cerrar () throws SQLException {
        if (conn != null)
        {
            conn.close();
            System.out.println("conexion cerrada");
        }
    }


}
