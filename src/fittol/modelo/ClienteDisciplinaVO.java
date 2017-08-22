package fittol.modelo;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class ClienteDisciplinaVO {

    private String cteId;
    private String rutId;
    private String dieId;

    public ClienteDisciplinaVO(String cteId, String rutId, String dieId) {
        this.cteId = cteId;
        this.rutId = rutId;
        this.dieId = dieId;
    }

    public String getCteId() {
        return cteId;
    }

    public void setCteId(String cteId) {
        this.cteId = cteId;
    }

    public String getRutId() {
        return rutId;
    }

    public void setRutId(String rutId) {
        this.rutId = rutId;
    }

    public String getDieId() {
        return dieId;
    }

    public void setDieId(String dieId) {
        this.dieId = dieId;
    }
    
}
