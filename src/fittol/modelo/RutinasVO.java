package fittol.modelo;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class RutinasVO {

    private String rutId;
    private String rutTipo;
    private String rutDescripcion;

    public RutinasVO(String rutId, String rutTipo, String rutDescripcion) {
        this.rutId = rutId;
        this.rutTipo = rutTipo;
        this.rutDescripcion = rutDescripcion;
    }

    public String getRutId() {
        return rutId;
    }

    public void setRutId(String rutId) {
        this.rutId = rutId;
    }

    public String getRutTipo() {
        return rutTipo;
    }

    public void setRutTipo(String rutTipo) {
        this.rutTipo = rutTipo;
    }

    public String getRutDescripcion() {
        return rutDescripcion;
    }

    public void setRutDescripcion(String rutDescripcion) {
        this.rutDescripcion = rutDescripcion;
    }
    
}
