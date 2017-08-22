package fittol.modelo;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class CargosVO {
    
    private String carId;
    private String carNombre;
    private int carSalario;
    private String horId;

    public CargosVO(String carId, String carNombre, int carSalario, String horId) {
        this.carId = carId;
        this.carNombre = carNombre;
        this.carSalario = carSalario;
        this.horId = horId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarNombre() {
        return carNombre;
    }

    public void setCarNombre(String carNombre) {
        this.carNombre = carNombre;
    }

    public int getCarSalario() {
        return carSalario;
    }

    public void setCarSalario(int carSalario) {
        this.carSalario = carSalario;
    }

    public String getHorId() {
        return horId;
    }

    public void setHorId(String horId) {
        this.horId = horId;
    }
      
}
