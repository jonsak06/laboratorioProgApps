/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author tecnologo
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "APELLIDO")
    private String apellido;
    
    @Column(name = "CORREO")
    private String correo;
    
    @Column(name = "NICKNAME")
    private String nickname;
    
    @Column(name = "IMAGEN")
    private String imagen;
    
    @Column(name = "FECHANACIMIENTO")
    private date fechaNacimiento;

    public Usuario(String nombre, String apellido, String correo, String nickname, String imagen, date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nickname = nickname;
        this.imagen = imagen;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFechaNacimiento(date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNickname() {
        return nickname;
    }

    public String getImagen() {
        return imagen;
    }

    public date getFechaNacimiento() {
        return fechaNacimiento;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presentacion.Usuario[ id=" + id + " ]";
    }
    
}
