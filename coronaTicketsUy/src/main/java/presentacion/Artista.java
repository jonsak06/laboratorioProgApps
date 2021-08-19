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
public class Artista extends Usuario {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public Artista(String nombre, String apellido, String correo, String nickname, String imagen, Date fechaNacimiento, String descripcion, String link, String biografia) {
        super(nombre, apellido, correo, nickname, imagen, fechaNacimiento);
        this.setBiografia(biografia);
        this.setDescripcion(descripcion);
        this.setLinkWeb(link);
        
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @OneToMany(mappedBy = "artista")
    @Column(name="ESPECTACULOS_DE_ARTISTA")
    private List<Espectaculo> espectaculos;
    public List<Espectaculo> getEspectaculos() {
        return espectaculos;
    }
    public void addEspectaculo(Espectaculo e){
        int i = this.espectaculos.size();
        this.espectaculos.add(i+1,e);
    }
    
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getLinkWeb() {
        return linkWeb;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setLinkWeb(String linkWeb) {
        this.linkWeb = linkWeb;
    }
    
    @Column(name = "BIOGRAFIA")
    private String biografia;
    
    @Column(name = "LNK_WEB")
    private String linkWeb;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artista)) {
            return false;
        }
        Artista other = (Artista) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Artista[ id=" + id + " ]";
    }
    
}