package fittol.modelo;

import java.util.Date;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class AsistenciaClientesVO {

    private String cteId;
    private Date asisCteFecha;
    private Date asisCteHora;

    public AsistenciaClientesVO(String cteId, Date asisCteFecha, Date asisCteHora) {
        this.cteId = cteId;
        this.asisCteFecha = asisCteFecha;
        this.asisCteHora = asisCteHora;
    }

    public String getCteId() {
        return cteId;
    }

    public void setCteId(String cteId) {
        this.cteId = cteId;
    }

    public Date getAsisCteFecha() {
        return asisCteFecha;
    }

    public void setAsisCteFecha(Date asisCteFecha) {
        this.asisCteFecha = asisCteFecha;
    }

    public Date getAsisCteHora() {
        return asisCteHora;
    }

    public void setAsisCteHora(Date asisCteHora) {
        this.asisCteHora = asisCteHora;
    }
    
}
