package fittol.modelo;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class UsuariosVO {

    private String empId;
    private String usrUsuario;
    private String usrPassword;

    public UsuariosVO(String empId, String usrUsuario, String usrPassword) {
        this.empId = empId;
        this.usrUsuario = usrUsuario;
        this.usrPassword = usrPassword;
    }

    public UsuariosVO(String usrUsuario, String usrPassword) {
        this.usrUsuario = usrUsuario;
        this.usrPassword = usrPassword;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getUsrUsuario() {
        return usrUsuario;
    }

    public void setUsrUsuario(String usrUsuario) {
        this.usrUsuario = usrUsuario;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }
        
}
