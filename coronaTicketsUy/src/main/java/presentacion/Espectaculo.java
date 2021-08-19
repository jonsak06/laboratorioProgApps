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
public class Espectaculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOMBRE_ESP")
    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;           
    }
    
    @Column(name = "DESCR_ESP")
    private String descripcion;
    public String getDescrp(){
        return this.descripcion;
    }
    public void setDescrp(String desc){
        this.descripcion = desc;
    }
    
    @Column(name = "DURACION")
    private String duracion;
    public String getDuracion(){
        return this.duracion;
    }
    public void setDuracion(String dur){
        this.duracion = dur;
    }
    
    @Column(name = "MAX_ESPECT")
    private int cantidadMaximaEspectadores;
    public int getCantMaxEspectadores(){
        return this.cantidadMaximaEspectadores;
    }
    public void setCantMaxEspectadores(int cme){
        this.cantidadMaximaEspectadores = cme;
    }
   
    @Column(name = "MIN_ESPECT")
    private int cantidadMinimaEspectadores;
    public int getCantMinEspectadores(){
        return this.cantidadMinimaEspectadores;
    }
    public void setCantMinEspectadores(int cme){
        this.cantidadMinimaEspectadores = cme;
    }
    
    @Column(name = "URL")
    private String url;
    public String getURL(){
        return this.url;
    }
    public void setURL(String url){
        this.url = url;
    }
    
    @Column(name = "COSTO")
    private float costo;
    public float getCosto(){
        return this.costo;
    }
    public void setCosto(float c){
        this.costo = c;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_REG")
    private Date fechaDeRegistro;
    public Date getFechaRegistro(){
        return this.fechaDeRegistro;
    }
    public void setFechaRegistro(Date f){
        this.fechaDeRegistro = f;
    }
    
    @Column(name = "PLATAFORMA")
    private Plataforma plataforma;
    public Plataforma getPlataforma(){
    return this.plataforma;
    }
    public void setPlataforma(Plataforma p){
        this.plataforma = p;
    }
    
    @OneToMany(mappedBy = "espectaculo")
    private List<Funcion> funciones;
    public List<Funcion> getFunciones(){
        return this.funciones;
    }
    public void addFuncion(Funcion f){
    int i = this.funciones.size();
    this.funciones.add(i+1, f);
    }
    
    @ManyToMany
    private List<PaqueteDeEspectaculos> paquetes;
    public List<PaqueteDeEspectaculos> getPaquetes(){
        return this.paquetes;
    }
    public void addPaquete(PaqueteDeEspectaculos p){
        int i = this.paquetes.size();
        this.paquetes.add(i+1, p);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private Artista artista;
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
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
        if (!(object instanceof Espectaculo)) {
            return false;
        }
        Espectaculo other = (Espectaculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Espectaculo[ id=" + id + " ]";
    }
    
}