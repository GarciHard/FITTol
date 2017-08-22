package fittol.dao;

import fittol.modelo.EmpleadosVO;
import fittol.modelo.UsuariosVO;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class EmpleadosDAO extends ConexionDB {

    private EmpleadosVO empObj;
    private PreparedStatement ps;
    private ResultSet rs;
    
    private final String empInfo = "select e.emp_id, e.emp_nombre, e.emp_appaterno, e.emp_foto "
            + "from fittol_db.empleados e "
            + "join fittol_db.usuarios u "
            + "on e.emp_id = u.emp_id "
            + "where lower(usr_usuario) like ? "
            + "and lower(usr_passwd) like ?";
    
    public EmpleadosVO empInfoObj(UsuariosVO usrObj) throws Exception {
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(empInfo);
            ps.setString(1, usrObj.getUsrUsuario());
            ps.setString(2, usrObj.getUsrPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                InputStream stream = rs.getBinaryStream("EMP_FOTO");
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                int a1 = stream.read();
                while (a1 >= 0) {
                    output.write((char) a1);
                    a1 = stream.read();
                }
                Image imagen = Toolkit.getDefaultToolkit().createImage(output.toByteArray());
                output.close();

                empObj = new EmpleadosVO(rs.getString("EMP_ID"), rs.getString("EMP_NOMBRE"),
                        rs.getString("EMP_APPATERNO"), imagen);
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("errorDaoEmp: " + e);
        } finally {
            this.cerrar();
        }
        return empObj;
    }
    
}
