package fittol.modelo;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class MembresiasVO {

    private String memId;
    private String memNombre;
    private int memDuracion;
    private int memCosto;

    public MembresiasVO(String memId, String memNombre, int memDuracion, int memCosto) {
        this.memId = memId;
        this.memNombre = memNombre;
        this.memDuracion = memDuracion;
        this.memCosto = memCosto;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemNombre() {
        return memNombre;
    }

    public void setMemNombre(String memNombre) {
        this.memNombre = memNombre;
    }

    public int getMemDuracion() {
        return memDuracion;
    }

    public void setMemDuracion(int memDuracion) {
        this.memDuracion = memDuracion;
    }

    public int getMemCosto() {
        return memCosto;
    }

    public void setMemCosto(int memCosto) {
        this.memCosto = memCosto;
    }
    
}
