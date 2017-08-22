package fittol.modelo;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class DietasVO {

    private String dieId;
    private String dieNombre;
    private String dieDescripcion;

    public DietasVO(String dieId, String dieNombre, String dieDescripcion) {
        this.dieId = dieId;
        this.dieNombre = dieNombre;
        this.dieDescripcion = dieDescripcion;
    }

    public String getDieId() {
        return dieId;
    }

    public void setDieId(String dieId) {
        this.dieId = dieId;
    }

    public String getDieNombre() {
        return dieNombre;
    }

    public void setDieNombre(String dieNombre) {
        this.dieNombre = dieNombre;
    }

    public String getDieDescripcion() {
        return dieDescripcion;
    }

    public void setDieDescripcion(String dieDescripcion) {
        this.dieDescripcion = dieDescripcion;
    }
    
}
