/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.Serializable;
import java.sql.Date;
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
    
    @Column(name = "NOMBRE_PAQ")
    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;           
    }
    
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
        int i = this.espectaculos.size();
        this.espectaculos.add(i+1, e);
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
