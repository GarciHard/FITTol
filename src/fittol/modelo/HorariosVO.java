package fittol.modelo;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class HorariosVO {
    
    private String horId;
    private String horLunes;
    private String horMartes;
    private String horMiercoles;
    private String horJueves;
    private String horViernes;
    private String horSabados;

    public HorariosVO(String horId, String horLunes, String horMartes, String horMiercoles, String horJueves, String horViernes, String horSabados) {
        this.horId = horId;
        this.horLunes = horLunes;
        this.horMartes = horMartes;
        this.horMiercoles = horMiercoles;
        this.horJueves = horJueves;
        this.horViernes = horViernes;
        this.horSabados = horSabados;
    }

    public String getHorId() {
        return horId;
    }

    public void setHorId(String horId) {
        this.horId = horId;
    }

    public String getHorLunes() {
        return horLunes;
    }

    public void setHorLunes(String horLunes) {
        this.horLunes = horLunes;
    }

    public String getHorMartes() {
        return horMartes;
    }

    public void setHorMartes(String horMartes) {
        this.horMartes = horMartes;
    }

    public String getHorMiercoles() {
        return horMiercoles;
    }

    public void setHorMiercoles(String horMiercoles) {
        this.horMiercoles = horMiercoles;
    }

    public String getHorJueves() {
        return horJueves;
    }

    public void setHorJueves(String horJueves) {
        this.horJueves = horJueves;
    }

    public String getHorViernes() {
        return horViernes;
    }

    public void setHorViernes(String horViernes) {
        this.horViernes = horViernes;
    }

    public String getHorSabados() {
        return horSabados;
    }

    public void setHorSabados(String horSabados) {
        this.horSabados = horSabados;
    }
    
}
