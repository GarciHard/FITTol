package fittol.dao;

import fittol.modelo.UsuariosVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class UsuariosDAO extends ConexionDB {

    private PreparedStatement ps;
    private ResultSet rs;
    
    private final String empCargoActivo = "select empCargoActivo(?, ?) from dual";
    
    /**
     * Regresa un valor de tipo booleano después de realizar una prueba de 
     * conexión a la base de datos.<br>
     * true cuando la conexión a la BD sea exitosa<br>
     * false cuando exista error al realizar conexión<br>
     * @return true si la conexión a la BD es exitosa
     * @throws Exception
     */
    public boolean testConexion() throws Exception {
        boolean testCon;
        try {
            this.conectar();
            testCon = true;
        } catch (Exception e) {
            testCon = false;
            throw e;
        } finally {
            this.cerrar();
        }
        return testCon;
    }

    /**
     * Regresa un valor de tipo int, el cual va a representar el cargo de un
     * empleado para posteriormente brindarle acceso al sistema.<br>
     * @param usr Objeto de tipo UsuariosVO
     * @return numCargo - valor de tipo int que representa el cargo de un empleado.
     * @throws Exception 
     */
    public int getCargoEmpleado(UsuariosVO usr) throws Exception {
        int numCargo = 0;
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(empCargoActivo);
            ps.setString(1, usr.getUsrUsuario());
            ps.setString(2, usr.getUsrPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                numCargo = rs.getInt(1);
            }

            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return numCargo;
    }
    
}
