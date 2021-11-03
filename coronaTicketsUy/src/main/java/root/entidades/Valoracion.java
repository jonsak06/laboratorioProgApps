/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import root.datatypes.DtValoracion;

/**
 *
 * @author tecnologo
 */
@Entity
public class Valoracion implements Serializable {

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public Valoracion(Date fecha, int valor, Espectador espectador, Espectaculo espectaculo) {
        
        this.valor = valor;
        this.espectador = espectador;
        this.espectaculo = espectaculo;
    }

    

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valoracion)) {
            return false;
        }
        Valoracion other = (Valoracion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "root.entidades.Valoracion[ id=" + id + " ]";
    }
    
    
    @Column(name = "VALOR")
    int valor;


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @ManyToOne
    private Espectador espectador;
    public Espectador getEspectador() {
        return espectador;
    }
    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
    @ManyToOne
    private Espectaculo espectaculo;
    public Espectaculo getEspectaculo() {
        return espectaculo;
    }
    public void setEspectador(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }

    public Valoracion() {
    }
    
    public DtValoracion getMyDt()
    {
        DtValoracion dt = new DtValoracion(this.id, this.valor, this.espectador.getNickname(), this.espectaculo.getNombre());
        return dt;
    }
    
}
