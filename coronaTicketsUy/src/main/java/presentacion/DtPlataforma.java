/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author tecnologo
 */
public class DtPlataforma {
    private Long id;
    private String url;
    private String nombre;
    private String descripcion;

    public DtPlataforma(Long id, String url, String nombre, String descripcion) {
        this.id = id;
        this.url = url;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}
