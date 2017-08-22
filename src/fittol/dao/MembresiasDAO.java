package fittol.dao;

import fittol.modelo.MembresiasVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class MembresiasDAO extends ConexionDB {

    private MembresiasVO membresiasObj;
    private ArrayList<MembresiasVO> membresiasArrObj;
    private PreparedStatement ps;
    private ResultSet rs;

    private final String readMembresias = "select mem_id, mem_nombre, mem_duracion, mem_costo "
            + "from fittol_db.membresias";
    private final String readMembresiasInfo = "select mem_id, mem_nombre, mem_duracion, mem_costo "
            + "from fittol_db.membresias "
            + "where mem_nombre like ?";
    
    public ArrayList<MembresiasVO> membresiasInfoArr() throws Exception {
        membresiasArrObj = new ArrayList<>();
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(readMembresias);
            rs = ps.executeQuery();

            while (rs.next()) {
                membresiasObj = new MembresiasVO(rs.getString(1), rs.getString(2),
                        rs.getInt(3), rs.getInt(4));

                membresiasArrObj.add(membresiasObj);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return membresiasArrObj;
    }

    public ArrayList<MembresiasVO> membresiasInfo(String readMemNombre) throws Exception {
        membresiasArrObj = new ArrayList<>();
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(readMembresiasInfo);
            ps.setString(1, readMemNombre);
            rs = ps.executeQuery();

            while (rs.next()) {
                membresiasObj = new MembresiasVO(rs.getString(1), rs.getString(2),
                        rs.getInt(3), rs.getInt(4));

                membresiasArrObj.add(membresiasObj);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return membresiasArrObj;
    }
    

}
