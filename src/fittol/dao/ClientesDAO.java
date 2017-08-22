package fittol.dao;

import fittol.modelo.ClientesVO;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class ClientesDAO extends ConexionDB {

    private ArrayList<ClientesVO> allMembersObj;
    private ClientesVO socioObj;
    private CallableStatement cs;
    private PreparedStatement ps;
    private ResultSet rs;
    
    private final String readSocioAsistencia = "select cte_nombre, cte_appaterno, cte_apmaterno, cte_foto "
            + "from fittol_db.clientes "
            + "where cte_id like ?";
    private final String readMsgSocioAsistencia = "select registrarAsistenciaFN_2(?) from dual";
    private final String insertSocioAsistencia = "{call registrarAsistenciaSP(?)}";
    private final String createSocio = "{call createSociosSP(?,?,?,?,?,?,?)}";
    private final String createIDSocio = "select max(cte_id) from fittol_db.clientes";
    private final String isValidID = "select cte_status from fittol_db.clientes where cte_id = ?";
    private final String readSocioNvaM = "select cte_foto, cte_nombre, cte_appaterno,cte_apmaterno, cte_fechainscripcion "
            + "from clientes "
            + "where cte_id like ?";
    
    private final String allMembersInfo = "select cte_id, cte_nombre, cte_appaterno, cte_apmaterno "
            + "from clientes "
            + "where upper(cte_id) like '%?%' "
            + "or upper(cte_nombre) like '%?%' "
            + "or upper(cte_appaterno) like '%?%' "
            + "or upper(cte_apmaterno) like '%?%'";
    
    
    public int generarIdSocio () throws Exception{
        int idSocio = 0;
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(createIDSocio);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                idSocio = rs.getInt(1) + 1;
            }
            
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return idSocio;
    }
    
    public void guardarSocio(ClientesVO cteObj) throws Exception {
        try {
            this.conectar();
            cs = this.conexion.prepareCall(createSocio);
            cs.setString(1, cteObj.getCteNombre());
            cs.setString(2, cteObj.getCteApPaterno());
            cs.setString(3, cteObj.getCteApMaterno());
            cs.setDate(4, new java.sql.Date(cteObj.getCteFechaNac().getTime()));
            cs.setString(5, cteObj.getCteSexo());
            cs.setString(6, cteObj.getCteTelefono());
            cs.setBinaryStream(7,
                    new FileInputStream(cteObj.getCteFotoCarga()),
                    (int) cteObj.getCteFotoCarga().length());
            cs.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
    
    public ClientesVO datosAsistencia(String noSocio) throws Exception {
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(readSocioAsistencia);
            ps.setString(1, noSocio);
            rs = ps.executeQuery();

            if (rs.next()) {
                InputStream stream = rs.getBinaryStream("cte_foto");
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                int a1 = stream.read();
                while (a1 >= 0) {
                    output.write((char) a1);
                    a1 = stream.read();
                }
                Image imagen = Toolkit.getDefaultToolkit().createImage(output.toByteArray());
                output.close();
                Icon ic = new ImageIcon(imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                socioObj = new ClientesVO(rs.getString(1), rs.getString(2),
                        rs.getString(3), ic);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return socioObj;
    }
    
    public String msgSocioAsistencia(String noSocio) throws Exception {
        String msgBD = "";
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(readMsgSocioAsistencia);
            ps.setString(1, noSocio);
            rs = ps.executeQuery();

            if (rs.next()) {
                msgBD = rs.getString(1);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return msgBD;
    }
    
    public int validarIdCliente(String numSocio) throws Exception {
        int valido = 0;
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(isValidID);
            ps.setString(1, numSocio);
            rs = ps.executeQuery();

            if (rs.next()) {
                valido = 1;
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return valido;
    }
 
    public ClientesVO datosSocioNuevaM(String noSocio) throws Exception {
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(readSocioNvaM);
            ps.setString(1, noSocio);
            rs = ps.executeQuery();

            if (rs.next()) {
                InputStream stream = rs.getBinaryStream("cte_foto");
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                int a1 = stream.read();
                while (a1 >= 0) {
                    output.write((char) a1);
                    a1 = stream.read();
                }
                Image imagen = Toolkit.getDefaultToolkit().createImage(output.toByteArray());
                output.close();
                Icon ic = new ImageIcon(imagen.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                socioObj = new ClientesVO(rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getDate(5), ic);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return socioObj;
    }

    public void insertAsistenciaSocio(String cteID) throws Exception {
        try {
            this.conectar();
            cs = this.conexion.prepareCall(insertSocioAsistencia);
            cs.setString(1, cteID);
            cs.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
    
    public ArrayList<ClientesVO> readClientes(String searchWord) throws Exception {
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(allMembersInfo);
            ps.setString(0, searchWord);
            ps.setString(1, searchWord);
            ps.setString(2, searchWord);
            ps.setString(3, searchWord);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {
                allMembersObj = new ArrayList<>();
                
                socioObj = new ClientesVO(rs.getString("CTE_ID"),
                        rs.getString("CTE_NOMBRE"),
                        rs.getString("CTE_APPATERNO"),
                        rs.getString("CTE_APMATERNO"));
                
                allMembersObj.add(socioObj);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return allMembersObj;
    }
    
}

