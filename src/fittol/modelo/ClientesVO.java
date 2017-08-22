package fittol.modelo;

import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class ClientesVO {

    private String cteId;
    private String cteNombre;
    private String cteApPaterno;
    private String cteApMaterno;
    private Date cteFechaNac;
    private String cteSexo;
    private String cteTelefono;
    private Date cteFechaInscripcion;
    private File cteFotoCarga;
    private Icon cteFotoLeer;
    
    public ClientesVO(){}

    public ClientesVO(String cteId, String cteNombre, String cteApPaterno, String cteApMaterno) {
        this.cteId = cteId;
        this.cteNombre = cteNombre;
        this.cteApPaterno = cteApPaterno;
        this.cteApMaterno = cteApMaterno;
    }

    public ClientesVO(String cteNombre, String cteApPaterno, String cteApMaterno, Date cteFechaInscripcion, Icon cteFotoLeer) {
        this.cteNombre = cteNombre;
        this.cteApPaterno = cteApPaterno;
        this.cteApMaterno = cteApMaterno;
        this.cteFechaInscripcion = cteFechaInscripcion;
        this.cteFotoLeer = cteFotoLeer;
    }

    public ClientesVO(String cteNombre, String cteApPaterno, String cteApMaterno, Icon cteFotoLeer) {
        this.cteNombre = cteNombre;
        this.cteApPaterno = cteApPaterno;
        this.cteApMaterno = cteApMaterno;
        this.cteFotoLeer = cteFotoLeer;
    }
    
    public ClientesVO(String cteNombre, String cteApPaterno, String cteApMaterno, Date cteFechaNac, String cteSexo, String cteTelefono, File cteFotoCarga) {
        this.cteNombre = cteNombre;
        this.cteApPaterno = cteApPaterno;
        this.cteApMaterno = cteApMaterno;
        this.cteFechaNac = cteFechaNac;
        this.cteSexo = cteSexo;
        this.cteTelefono = cteTelefono;
        this.cteFotoCarga = cteFotoCarga;
    }
    
    public ClientesVO(String cteId, String cteNombre, String cteApPaterno, String cteApMaterno, Date cteFechaNac, String cteSexo, String cteTelefono, Date cteFechaInscripcion, File cteFotoCarga) {
        this.cteId = cteId;
        this.cteNombre = cteNombre;
        this.cteApPaterno = cteApPaterno;
        this.cteApMaterno = cteApMaterno;
        this.cteFechaNac = cteFechaNac;
        this.cteSexo = cteSexo;
        this.cteTelefono = cteTelefono;
        this.cteFechaInscripcion = cteFechaInscripcion;
        this.cteFotoCarga = cteFotoCarga;
    }

    public ClientesVO(String cteId, String cteNombre, String cteApPaterno, String cteApMaterno, Date cteFechaNac, String cteSexo, String cteTelefono, Date cteFechaInscripcion, Icon cteFotoLeer) {
        this.cteId = cteId;
        this.cteNombre = cteNombre;
        this.cteApPaterno = cteApPaterno;
        this.cteApMaterno = cteApMaterno;
        this.cteFechaNac = cteFechaNac;
        this.cteSexo = cteSexo;
        this.cteTelefono = cteTelefono;
        this.cteFechaInscripcion = cteFechaInscripcion;
        this.cteFotoLeer = cteFotoLeer;
    }
    
    public boolean regExp(String Cadena, String Expresion) {
        Pattern pat = Pattern.compile(Expresion);
        Matcher mat = pat.matcher(Cadena);
        return mat.matches();
    }

    public String regReplace(String Cadena, String ExpresionFind, String ExpresionReplace) {
        return Cadena.replaceAll(ExpresionFind, ExpresionReplace);
    }

    public String[] regSplit(String Cadena, String Expresion) {
        return Cadena.split(Expresion);
    }

    public String getCteId() {
        return cteId;
    }

    public void setCteId(String cteId) {
        this.cteId = cteId;
    }

    public String getCteNombre() {
        return cteNombre;
    }

    public void setCteNombre(String cteNombre) {
        this.cteNombre = cteNombre;
    }

    public String getCteApPaterno() {
        return cteApPaterno;
    }

    public void setCteApPaterno(String cteApPaterno) {
        this.cteApPaterno = cteApPaterno;
    }

    public String getCteApMaterno() {
        return cteApMaterno;
    }

    public void setCteApMaterno(String cteApMaterno) {
        this.cteApMaterno = cteApMaterno;
    }

    public Date getCteFechaNac() {
        return cteFechaNac;
    }

    public void setCteFechaNac(Date cteFechaNac) {
        this.cteFechaNac = cteFechaNac;
    }

    public String getCteSexo() {
        return cteSexo;
    }

    public void setCteSexo(String cteSexo) {
        this.cteSexo = cteSexo;
    }

    public String getCteTelefono() {
        return cteTelefono;
    }

    public void setCteTelefono(String cteTelefono) {
        this.cteTelefono = cteTelefono;
    }

    public Date getCteFechaInscripcion() {
        return cteFechaInscripcion;
    }

    public void setCteFechaInscripcion(Date cteFechaInscripcion) {
        this.cteFechaInscripcion = cteFechaInscripcion;
    }

    public File getCteFotoCarga() {
        return cteFotoCarga;
    }

    public void setCteFotoCarga(File cteFotoCarga) {
        this.cteFotoCarga = cteFotoCarga;
    }

    public Icon getCteFotoLeer() {
        return cteFotoLeer;
    }

    public void setCteFotoLeer(Icon cteFotoLeer) {
        this.cteFotoLeer = cteFotoLeer;
    }
    
}
