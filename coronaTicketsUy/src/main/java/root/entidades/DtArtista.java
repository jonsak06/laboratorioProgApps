/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.entidades;
import root.datatypes.DtUsuario;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author tecnologo
 */

public class DtArtista extends DtUsuario
{
    private String linkWeb;
    private String biografia;
    private String descripcion;

    public DtArtista(String linkWeb, String biografia, String descripcion, Long id, String nombre, String apellido, String correo, String nickname, String imagen, Date fechaNacimiento) {
        super(id, nombre, apellido, correo, nickname, imagen, fechaNacimiento);
        this.linkWeb = linkWeb;
        this.biografia = biografia;
        this.descripcion = descripcion;
    }
    
    public DtArtista(){}

    public String getLinkWeb() {
        return linkWeb;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
