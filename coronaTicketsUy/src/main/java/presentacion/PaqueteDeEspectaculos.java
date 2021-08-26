/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author julio
 */
@Entity
public class PaqueteDeEspectaculos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public PaqueteDeEspectaculos(String nombre, String descripcion, float descuento, int fid, int fim, int fiy, int ffd, int ffm, int ffy, int fad, int fam, int fay){
        this.setNombre(nombre);
        this.setDescrp(descripcion);
        java.sql.Date finicio = new java.sql.Date(fiy-1899,fim-12,fid-31);
        this.setFechaInicio(finicio);
        java.sql.Date ffin = new java.sql.Date(ffy-1899,ffm-12,ffd-31);
        this.setFechaFin(ffin);
        java.sql.Date falta = new java.sql.Date(fay-1899,fam-12,fad-31);
        this.setFechaAlta(falta);
        this.espectaculos = new ArrayList<Espectaculo>();
    }

    public PaqueteDeEspectaculos(String nombre, String descripcion, Date fechaInicio, Date fechaAlta, Date fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaAlta = fechaAlta;
        this.fechaFin = fechaFin;
    }
    
    
    
    public PaqueteDeEspectaculos(){this.espectaculos = new ArrayList<Espectaculo>();}
    
    @Column(name = "NOMBRE_PAQ")
    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;           
    }
    
    @Lob
    @Column(name = "DESCR_PAQ")
    private String descripcion;
    public String getDescrp(){
        return this.descripcion;
    }
    public void setDescrp(String desc){
        this.descripcion = desc;
    }
    
//    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_INICIO_PAQ")
    private Date fechaInicio;
    public Date getFechaInicio(){
        return this.fechaInicio;
    }
    public void setFechaInicio(Date f){
        this.fechaInicio = f;
    }
    
    @Column
    private Date fechaAlta;
    public Date getFechaAlta(){
        return this.fechaAlta;
    }
    public void setFechaAlta(Date f){
        this.fechaAlta = f;
    }
    
//    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_FIN_PAQ")
    private Date fechaFin;
    public Date getFechaFin(){
        return this.fechaFin;
    }
    public void setFechaFin(Date f){
        this.fechaFin = f;
    }
    
    @Column(name = "DESCUENTO")
    private float descuento;
    public float getDescuento(){
        return this.descuento;
    }
    public void setDescuento(float d){
        this.descuento = d;
    }
    
    @ManyToMany
    private List<Espectaculo> espectaculos;
    public List<Espectaculo> getEspectaculos(){
        return this.espectaculos;
    }
    public void addEspectaculo(Espectaculo e){
        this.espectaculos.add(e);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaqueteDeEspectaculos)) {
            return false;
        }
        PaqueteDeEspectaculos other = (PaqueteDeEspectaculos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.PaqueteDeEspectaculos[ id=" + id + " ]";
    }
    
    public DtPaqueteDeEspectaculos getMyDt()
    {
        DtPaqueteDeEspectaculos dt = new DtPaqueteDeEspectaculos(this.id, this.nombre, this.descripcion, this.fechaInicio, this.fechaFin, this.descuento);
        return dt;
    }
}
