package fittol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class ConexionDB {
    
    protected Connection conexion;

    public Connection getConexion() {
        return conexion;
    }
    private final String driverJDBC = "oracle.jdbc.driver.OracleDriver";
    private final String urlDB = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String userDB = "fittol_db";
    private final String pwdDB = "fittolpwd";
    
    public void conectar() throws Exception {
        try {
            conexion = DriverManager.getConnection(urlDB, userDB, pwdDB);
            Class.forName(driverJDBC);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    public void cerrar() throws Exception {
        try {
            if (conexion != null) {
                if (!conexion.isClosed()) {
                    conexion.close();
                }
            }
        } catch (SQLException e) {
            throw e;
        }
    }
}
