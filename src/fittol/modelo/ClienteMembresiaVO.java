package fittol.modelo;

import java.util.Date;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class ClienteMembresiaVO {

    private String cteMemId;
    private String cteId;
    private String memId;
    private Date cteMemFechaIni;
    private Date cteMemFechaFin;

    public ClienteMembresiaVO(String cteMemId, String cteId, String memId, Date cteMemFechaIni, Date cteMemFechaFin) {
        this.cteMemId = cteMemId;
        this.cteId = cteId;
        this.memId = memId;
        this.cteMemFechaIni = cteMemFechaIni;
        this.cteMemFechaFin = cteMemFechaFin;
    }

    public String getCteMemId() {
        return cteMemId;
    }

    public void setCteMemId(String cteMemId) {
        this.cteMemId = cteMemId;
    }

    public String getCteId() {
        return cteId;
    }

    public void setCteId(String cteId) {
        this.cteId = cteId;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public Date getCteMemFechaIni() {
        return cteMemFechaIni;
    }

    public void setCteMemFechaIni(Date cteMemFechaIni) {
        this.cteMemFechaIni = cteMemFechaIni;
    }

    public Date getCteMemFechaFin() {
        return cteMemFechaFin;
    }

    public void setCteMemFechaFin(Date cteMemFechaFin) {
        this.cteMemFechaFin = cteMemFechaFin;
    }
    
}
