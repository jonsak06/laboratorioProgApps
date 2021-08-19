/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author julio
 */
@Entity
public class Plataforma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "URL")
    private String url;
    
    public String getUrl(){
        return this.url;
    }
    
    public void setUrl(String url){
        this.url = url;           
    }
  
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;           
    }
    
    @OneToMany(mappedBy = "plataforma")
    private List<Espectaculo> espectaculos;
    public List<Espectaculo> getEspectaculos(){
        return this.espectaculos;
    }
    public void addEspectaculo(Espectaculo e){
        int i = this.espectaculos.size();
        this.espectaculos.add(i+1, e);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Plataforma)) {
            return false;
        }
        Plataforma other = (Plataforma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Plataforma[ id=" + id + " ]";
    }
    
}