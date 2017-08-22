package fittol.modelo;

import java.awt.Image;
import java.io.File;
import java.util.Date;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class EmpleadosVO {

    private String empId;
    private String empNombre;
    private String empApPaterno;
    private String empApMaterno;
    private String empCalle;
    private int empNumExt;
    private String empColonia;
    private String empMunicipio;
    private String empEstado;
    private String empTelefono;
    private File empFotoCargar;
    private Image empFotoLeer;
    private Date empFechaInicio;
    private String carId;

    public EmpleadosVO(String empId, String empNombre, String empApPaterno, Image empFotoLeer) {
        this.empId = empId;
        this.empNombre = empNombre;
        this.empApPaterno = empApPaterno;
        this.empFotoLeer = empFotoLeer;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpApPaterno() {
        return empApPaterno;
    }

    public void setEmpApPaterno(String empApPaterno) {
        this.empApPaterno = empApPaterno;
    }

    public String getEmpApMaterno() {
        return empApMaterno;
    }

    public void setEmpApMaterno(String empApMaterno) {
        this.empApMaterno = empApMaterno;
    }

    public String getEmpCalle() {
        return empCalle;
    }

    public void setEmpCalle(String empCalle) {
        this.empCalle = empCalle;
    }

    public int getEmpNumExt() {
        return empNumExt;
    }

    public void setEmpNumExt(int empNumExt) {
        this.empNumExt = empNumExt;
    }

    public String getEmpColonia() {
        return empColonia;
    }

    public void setEmpColonia(String empColonia) {
        this.empColonia = empColonia;
    }

    public String getEmpMunicipio() {
        return empMunicipio;
    }

    public void setEmpMunicipio(String empMunicipio) {
        this.empMunicipio = empMunicipio;
    }

    public String getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(String empEstado) {
        this.empEstado = empEstado;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public File getEmpFotoCargar() {
        return empFotoCargar;
    }

    public void setEmpFotoCargar(File empFotoCargar) {
        this.empFotoCargar = empFotoCargar;
    }

    public Image getEmpFotoLeer() {
        return empFotoLeer;
    }

    public void setEmpFotoLeer(Image empFotoLeer) {
        this.empFotoLeer = empFotoLeer;
    }

    public Date getEmpFechaInicio() {
        return empFechaInicio;
    }

    public void setEmpFechaInicio(Date empFechaInicio) {
        this.empFechaInicio = empFechaInicio;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    
    
}
