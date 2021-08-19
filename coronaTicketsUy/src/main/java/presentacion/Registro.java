/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

/**
 *
 * @author julio
 */
@Entity
public class Registro implements Serializable {

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
    
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA")
    private java.sql.Date fecha;
    public java.sql.Date getFecha(){
        return this.fecha;
    }
    public void setFecha(java.sql.Date f){
        this.fecha = f;
    }

    @Column (name = "COSTO_REG")
    private float costo;
    public float getCosto(){
        return this.costo;
    }
    public void setCosto(float c){
        this.costo = c;
    }
    
    @Column(name = "ESTADO_REGISTRO")
    @Enumerated(value = EnumType.STRING)
    private EstadoRegistro estado;
    public EstadoRegistro getEstado(){
        return this.estado;
    }
    public void setEstado(EstadoRegistro e){
        this.estado = e;
    }
    
    @Column(name = "FUNCION")
    private Funcion funcion;
    public Funcion getFuncion(){
        return this.funcion;
    }
    public void setFuncion(Funcion f){
        this.funcion =f;
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
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Registro[ id=" + id + " ]";
    }
    
}
