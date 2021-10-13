package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Datos {

    public static String rut;
    public static String clave;

    public static void buscarClientes() throws SQLException {
        ConnectionDb.conectar();
        Statement sta = ConnectionDb.conn.createStatement();
        String consulta = "SELECT `RutUsuario`, `ClaveUsuario` FROM `usuarios`";
        ResultSet rs = sta.executeQuery(consulta);
        //rs.next();
        while (rs.next()) {
            rut = rs.getString("RutUsuario");
            clave = rs.getString("ClaveUsuario");
            System.out.println("El rut es: " + rut);
            System.out.println("La clave es: " + clave);
        }

        rs.close();
        sta.close();
        ConnectionDb.cerrar();

    }
}
