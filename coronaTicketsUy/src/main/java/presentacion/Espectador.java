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
public class Espectador extends Usuario {

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
    
    @Column(name = "CANT_CANJEABLES")
    private int canjeables;

    public void setCanjeables(int canjeables) {
        this.canjeables = canjeables;
    }

    public int getCanjeables() {
        return canjeables;
    }

    public Espectador(int canjeables, String nombre, String apellido, String correo, String nickname, String imagen, Date fechaNacimiento) {
        super(nombre, apellido, correo, nickname, imagen, fechaNacimiento);
        this.canjeables = canjeables;
    }
    
    @OneToMany(mappedBy = "espectador")
    private List<Registro> registros;
    public List<Registro> getRegistros() {
        return registros;
    }
    public void addRegistro(Registro r){
        int i = this.registros.size();
        this.registros.add(i+1,r);
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
        if (!(object instanceof Espectador)) {
            return false;
        }
        Espectador other = (Espectador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Espectador[ id=" + id + " ]";
    }
    
}