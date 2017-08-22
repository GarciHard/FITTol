package fittol.modelo;

import java.util.Date;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class VentasVO {

    private String venId;
    private Date venFecha;
    private String empId;
    private String cteMemId;
    private int venCantidad;
    private int venTotal;

    public VentasVO(String venId, Date venFecha, String empId, String cteMemId, int venCantidad, int venTotal) {
        this.venId = venId;
        this.venFecha = venFecha;
        this.empId = empId;
        this.cteMemId = cteMemId;
        this.venCantidad = venCantidad;
        this.venTotal = venTotal;
    }

    public String getVenId() {
        return venId;
    }

    public void setVenId(String venId) {
        this.venId = venId;
    }

    public Date getVenFecha() {
        return venFecha;
    }

    public void setVenFecha(Date venFecha) {
        this.venFecha = venFecha;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCteMemId() {
        return cteMemId;
    }

    public void setCteMemId(String cteMemId) {
        this.cteMemId = cteMemId;
    }

    public int getVenCantidad() {
        return venCantidad;
    }

    public void setVenCantidad(int venCantidad) {
        this.venCantidad = venCantidad;
    }

    public int getVenTotal() {
        return venTotal;
    }

    public void setVenTotal(int venTotal) {
        this.venTotal = venTotal;
    }
    
}
