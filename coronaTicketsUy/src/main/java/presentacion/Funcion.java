/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author julio
 */
@Entity
public class Funcion implements Serializable {

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
    
    @Column(name = "NOMBRE_FUNC")
    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;           
    }
    
    @Column(name = "HORA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp horaInicio;
    public Timestamp getHoraInicio(){
        return this.horaInicio;
    }
    public void setHoraInicio(Timestamp h){
        this.horaInicio = h;
    }

    @Column(name="FECHA_REG")
    @Temporal(TemporalType.DATE)
    private Date fechaDeRegistro;
    public Date getFechaRegistro(){
        return this.fechaDeRegistro;
    }
    public void setFechaRegistro(Date f){
        this.fechaDeRegistro = f;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA")
    private Date fecha;
    public Date getFecha(){
        return this.fecha;
    }
    public void setFecha(Date f){
        this.fecha = f;
    }
    
    @Column(name = "ESPECTACULO")
    private Espectaculo espectaculo;
    public Espectaculo getEspectaculo(){
        return this.espectaculo;
    }
    public void setEspectaculo(Espectaculo e){
        this.espectaculo = e;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @OneToMany(mappedBy = "funcion")
    private List<Registro> registros;
    public List<Registro> getRegistros(){
        return this.registros;
    }
    public void addRegistro(Registro r){
        int i = this.registros.size();
        this.registros.add(i+1,r);
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcion)) {
            return false;
        }
        Funcion other = (Funcion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Funcion[ id=" + id + " ]";
    }
    
}
