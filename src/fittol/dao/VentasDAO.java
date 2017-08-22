package fittol.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class VentasDAO extends ConexionDB {

    private CallableStatement cs;
    private ResultSet rs;
    
    private final String insertVentaSocio = "{call ventaMembresiaSP(?,?,?)}";
    
    public void membresiaSocioIndividual(String cteID, String memID, String empID) throws Exception {
        try {
            this.conectar();
            cs = this.conexion.prepareCall(insertVentaSocio);
            cs.setString(1, cteID);
            cs.setString(2, memID);
            cs.setString(3, empID);
            cs.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }
    
}
