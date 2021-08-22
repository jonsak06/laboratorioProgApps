/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author tecnologo
 */
public class DtEspectaculo {
    private Long id;
    private String nombre;
    private String descripcion;
    private int duracion;
    private int cantidadMaximaEspectadores;
    private int cantidadMinimaEspectadores;
    private String url;
    private float costo;
    private Date fechaDeRegistro;

    public DtEspectaculo(Long id, String nombre, String descripcion, int duracion, int cantidadMaximaEspectadores, int cantidadMinimaEspectadores, String url, float costo, Date fechaDeRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.cantidadMaximaEspectadores = cantidadMaximaEspectadores;
        this.cantidadMinimaEspectadores = cantidadMinimaEspectadores;
        this.url = url;
        this.costo = costo;
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCantidadMaximaEspectadores() {
        return cantidadMaximaEspectadores;
    }

    public int getCantidadMinimaEspectadores() {
        return cantidadMinimaEspectadores;
    }

    public String getUrl() {
        return url;
    }

    public float getCosto() {
        return costo;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }
    
}
